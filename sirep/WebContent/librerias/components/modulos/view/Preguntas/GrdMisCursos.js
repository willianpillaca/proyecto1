Ext.define('librerias.components.modulos.view.Preguntas.GrdMisCursos', {
	extend : 'Ext.panel.Panel',
	alias : 'widget.listMisCursos',
	
	gridMisCursos:function(){
		var me=this;
		var itemsPerPage = 2;
		var store = Ext.create('Ext.data.Store', {
					  id:'misCursosStore'
					  ,autoLoad: false
					  ,fields : ['codCurso', 'nombre', 'id']			          
				      ,pageSize: itemsPerPage, // items per page
			          proxy  : {
			              type   : 'ajax',
			              url: 'findallcursosbyiddocente.app?idUsuario='+IDE_USUARIO,
			              reader : {
			                  type : 'json',
			                  root: 'data',
			                  totalProperty: 'total'
			              }
			          }
//			          ,autoLoad: true
			      });
		
					store.load({
						params:{
					              start:0,
					              limit: itemsPerPage
						}
					});
			 
			      Ext.create('Ext.grid.Panel', {
//			          title    : 'Mis Cursos',
			          header: false,
			          height   : 335,
			          width    : 470,
			          id: 'gridMisCursos',
			          renderTo : me.id+'_grid_mis_cursos',
			          store    : store,
			          dockedItems: [{
        	               xtype: 'pagingtoolbar',
        	               store: store,   // same store GridPanel is using
        	               dock: 'bottom',
        	               displayInfo: true
        	          }],
			          columns  : [
			              { text : 'Codigo', dataIndex : 'codCurso' },
			              { text : 'Curso', dataIndex : 'nombre', flex : 1 }
			              
			          ],
			          listeners: {
			        	    deselect: function(grid, record) {
			        	    	

			        	    },
			        	    select: function(grid, record) {			        	    	
			        	    	var id= record.get('id');
//			        	        me.gridTemasXCurso(id);
			        	    	Ext.getCmp('gridTemasPorCurso').store.load({
			        	    		   params:{idCurso: id}
			        	    		});
			        	    }
			        	}
			      });
		
	},
	
	gridTemasXCurso: function(){		
		var me=this;
		if(Ext.getCmp('gridTemasPorCurso')){
			console.log('existe->>>>');
			//Ext.getCmp('gridTemasPorCurso').store.load();
						
		}
		
		var itemsPerPage = 2;
		var storeTema = Ext.create('Ext.data.Store', {
					  id:'temasXCursoStore'
					  ,autoLoad: false
					  ,fields : ['idTema', 'idCurso', 'tema']			          
				      ,pageSize: itemsPerPage, // items per page
			          proxy  : {
			              type   : 'ajax',
			              url: 'listartemasxcurso.app',
			              reader : {
			                  type : 'json',
			                  root: 'data',
			                  totalProperty: 'total'
			              }
			          }
//			          ,autoLoad: true
			      });
		
					storeTema.load({
						params:{
					              start:0,
					              limit: itemsPerPage
						}
					});
				
					
			 
			      Ext.create('Ext.grid.Panel', {
			          header: false,
			          height: 335,
			          id: 'gridTemasPorCurso',
			          width    : 470,
			          renderTo : 'form_grid_temas',
			          store    : storeTema,
			          dockedItems: [
                    	{
                			xtype : 'toolbar',
                			dock : 'top',
                			id: 'menutemas',				
                			items : [
								{
									text : 'Nuevo Tema',
									iconCls : 'edit_curso_16',
									id:'btnNuevoTema',									
									handler : function() {
											var gridMisCursosXTema = Ext.getCmp('gridMisCursos');											
											var record = gridMisCursosXTema.getSelectionModel().getSelection()[0];											
											var data =record.data;
											var idCurso = data.id;																
											PreguntasManager.openNuevoTema({idGrid:'gridTemasPorCurso'}, idCurso);
									}
								},						
								{
									text : 'Ver Preguntas',
									iconCls : 'edit_curso_16',
									id:'btnPreguntasXTema',
									disabled:true,
									handler : function() {
										var gridTemasPorCurso = Ext.getCmp('gridTemasPorCurso');
										var recordTemas = gridTemasPorCurso.getSelectionModel().getSelection()[0];
										
										var gridMisCursos = Ext.getCmp('gridMisCursos');
										var recordCursos = gridMisCursos.getSelectionModel().getSelection()[0];										
										var dataTemas =recordTemas.data;										
										var dataCursos =recordCursos.data;										
										var codigoCurso = dataCursos.codCurso;										
										var nombreCurso = dataCursos.nombre;
										var idTema = dataTemas.idTema;
										var tema = dataTemas.tema
										PreguntasManager.openPreguntasXTema(codigoCurso, nombreCurso, idTema, tema);
									}
								}
			
								]
                    	},
			                        
                        //fin tolbar TOP
                        {
        	               xtype: 'pagingtoolbar',
        	               store: storeTema,   // same store GridPanel is using
        	               dock: 'bottom',
        	               displayInfo: true
        	           }],
			          columns  : [			              
			              { text : 'Tema', dataIndex : 'tema', flex : 1 }
			              
			          ],
			          listeners: {
			        	    deselect: function(grid, record) {
//			        	        var name = record.get('name');			        	    	
			        	    	console.log(record);			        	    	
			        	    	Ext.getCmp('btnPreguntasXTema').setDisabled(false);
			        	        // save new name
			        	    },
			        	    select: function(grid, record) {			        	
			        	    	//Ext.getCmp('gridTemasPorCursogrid').getStore().remove(record);
			        	    	Ext.getCmp('btnPreguntasXTema').setDisabled(false);			        	    	
			        	    }
			        	}
			      });
		
	},
	
	initComponent : function() {
		var me=this;
		this.border=false;
		this.layout='column';
		this.items=[
					{
					    columnWidth: 0.60,
//					    padding: '0 0 0 0',
					    border:false,	
					    items:[{
					    	border:false,
					    	bodyStyle:'background:#f5f5f5;',
					    	height: 340,
					        html: '<div class="panel panel-default" style="height:335px;">'+						            
									  '<div id="'+me.id+'_grid_mis_cursos" ></div>'+
								'</div>'
							,listeners:{
									afterrender:function(thisPanel){
										me.gridMisCursos();										
									}
							}
								    }]
					},{
					    columnWidth: 0.40,
//					    padding: '5 5 0 5',
					    border:false,	
					    items:[{
					    	border:false,
					    	bodyStyle:'background:#f5f5f5;',
					    	height: 290,
					        html: '<div class="panel panel-default" style="height:248px;">'+						            
									  '<div class="panel-body" style="padding:0px;" id="form_grid_temas" >'+
									 '</div>'+
								'</div>'
							,listeners:{
								afterrender:function(){
									me.gridTemasXCurso();
								}
							}		 
					    }]
					}
		            ];
		
		this.callParent(arguments);
	}
});