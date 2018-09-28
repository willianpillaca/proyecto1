Ext.define('librerias.components.modulos.view.Cursos.GrdCursos', {
	extend : 'Ext.panel.Panel',
	alias : 'widget.listCursos',
	initComponent : function() {
		console.log('cursos->>');
		var filters = {
    	        ftype: 'filters',
    	        encode: true, // json encode the filter query
    	        local: true,
    	    };
		function rowStyle(v){
			return '<div style="padding:4px 0px 4px 0px;color:#333;">'+(v?v:'')+'</div>';
		}
		
		var me=this;
		this.border=false;
		
		this.items={

            	xtype:'sireGrid'
            	,width: 'auto'        		
            	,features:[filters]
            	,border:false 
            	,id:me.id+'_grid'
            	,bodyStyle:'background:#fff;padding:0px;'
            	,nameModel:'Usuario'
            	,fields:[{
    		        name: 'id',
    		        type: 'int'
    		    }, {
    		        name: 'codCurso'
    		    }, {
    		        name: 'nombre'
    		    }, {
    		        name: 'descripcion'
    		    }, {
    		    	name:'pdf'
        		    	,mapping:'sylabus'
        		    	,convert:function(v){
        		    		return ('<a href=""><img src="librerias/css/icons/icon_pdf_16.png" title="descargar" /></a>');
        		    	}
    		    }    		    
    		    , {
    		        name: 'tipoEvaluacion'
    		    }, {
    		        name: 'costo'
    		    },{
    		        name: 'nombreCompleto'
    		    },    		    
    		    ]
            ,readerStore:{
                type: 'json',
                root: 'data',
                idProperty: 'id'
//                	,
//                totalProperty: 'total'
            }
            ,loadStore:true
            ,url:'findallcursos.app'
            ,columns: [
					{
						text:'ID Curso',
					    dataIndex: 'id',
					    width: 50,
					    hidden:true,
					    align:'center',
					    renderer:rowStyle,
					    filterable: true,
			            filter: {type: 'numeric'}
					}
					,
					{
						text:'Codigo',
					    dataIndex: 'codCurso',
					    width: 120,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					}
					,
					{
						text:'Nombre',
					    dataIndex: 'nombre',
					    flex:1,
					    width: 150,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					},
					{
						text:'Descripcion',
					    dataIndex: 'descripcion',
					    flex:1,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					}
					,
					{
						text:'Tipo de Evaluación',
					    dataIndex: 'tipoEvaluacion',
					    width:140,
					    align:'center',
					    renderer:rowStyle
					},					
					{
						text:'Sílabo',
					    dataIndex: 'pdf',
					    width:70,
					    align:'center',
					    renderer:rowStyle
					}
                       ]	
            ,
            dockedItems : [{
				xtype : 'toolbar',
				dock : 'top',
				items : [
						{
							text : 'Nuevo Curso',
							iconCls : 'new_curso_16',
							handler : function() {
								CursosManager.openAdminCursos({idGrid:me.id+'_grid'});
							}
						}
						,
						{
							text : 'Editar Curso',
							iconCls : 'edit_curso_16',
							id:'btnCurso',
							disabled:true,							
						}
						,
						{
							text : 'Asignar Profesor',
							iconCls : 'edit_curso_16',
							id:'btnInscribirse',
							disabled:true,
							handler:function(){								
								var grid = Ext.getCmp(me.id+'_grid');
								var record = grid.getSelectionModel().getSelection()[0];
								var curso;
								if(record){
									curso=record.data;
								}
								CursosManager.saveAlumnoCurso({
									curso : curso,
									grid : grid,
									enable : ESTADO_ACTIVO,
									msgConfirm:'Esta Seguro de Inscribirse?'
									});
							}
							
						}						
					]
			}],
			listeners:{
            	select:function(thisGrid, record, index, eOpts){
            		Ext.getCmp('btnInscribirse').setDisabled(false);
            		Ext.getCmp('btnCurso').setDisabled(false);            		
            	},
            	deselect:function( thisGrid, record, index, eOpts ){
            		Ext.getCmp('btnInscribirse').setDisabled(true);
            		Ext.getCmp('btnCurso').setDisabled(true);
            	}
            
            }
            
            
    			
    	};
		
		this.callParent(arguments);
	}
});