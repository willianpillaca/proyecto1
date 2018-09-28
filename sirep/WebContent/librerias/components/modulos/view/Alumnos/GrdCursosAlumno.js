Ext.define('librerias.components.modulos.view.Alumnos.GrdCursosAlumno', {
	extend : 'Ext.panel.Panel',
	alias : 'widget.listCursosAlumno',
	initComponent : function() {
		console.log('cursosAlumno->>');
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
            	,nameModel:'AlumnoCurso'
            	,fields:[{
    		        name: 'id',
    		        type: 'int'
    		    }, {
    		        name: 'codAlumno'
    		    }, {
    		        name: 'nombreAlumno'
    		    }, {
    		        name: 'codCurso'
    		    }, {
    		        name: 'nombreCurso'
    		    }, {
    		        name: 'tipoPago'
    		    }, {
    		        name: 'estadoPago'
    		    },{
    		    	name:'fechaDeEvaluacion',
    		    	mapping:'fechaEvaluacion',
    		    	convert:function(v,r){  
    		    		console.log('v->>');
    		    		console.log(v);
    		    		var d = new Date(v);    		    			    		    		
    		    		return d.toLocaleDateString();
    		    	}
    		    }, {
    		        name: 'estadoEvaluacion'
    		    }, {
    		        name: 'notaFinal'
    		    },
    		    {
    		    	name:'estadoDeEvaluacion',
    		    	mapping:'estadoEvaluacion',
    		    	convert:function(v,r){    		    		
    		    		var nivel='';
    		    		if(v==1){
    		    			nivel='<span style="color: #DF0101">POR EVALUAR</span>';
    		    		}
    		    		if(v==2){
    		    			nivel='EVALUADO';
    		    		}    		    		    		    		
    		    		return nivel;
    		    	}
    		    }
    		    ]
            ,readerStore:{
                type: 'json',
                root: 'data',
                idProperty: 'id'
//                	,
//                totalProperty: 'total'
            }
            ,loadStore:true
            ,url:'findallcursosalumno.app'
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
						text:'Codigo Alumno',
					    dataIndex: 'codAlumno',
					    width: 120,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					}
					,
					{
						text:'Nombre Alumno',
					    dataIndex: 'nombreAlumno',					    
					    width: 250,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					}
					,
					{
						text:'Codigo Curso',
					    dataIndex: 'codCurso',					    
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					}
					,
					{
						text:'Nombre Curso',
					    dataIndex: 'nombreCurso',
					    width:140,
					    align:'center',
					    renderer:rowStyle
					},
					{
						text:'Estado de Evaluación',
					    dataIndex: 'estadoDeEvaluacion',
					    width:180,
					    align:'center',
					    renderer:rowStyle
					},
					{
						text:'fecha de Evaluación',
					    dataIndex: 'fechaDeEvaluacion',
					    width:180,
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
							text : 'Rendir Examen',
							iconCls : 'new_curso_16',
							handler : function() {
								var grid = Ext.getCmp(me.id+'_grid');
								var record = grid.getSelectionModel().getSelection()[0];
								var cursoAlumno;								
								if(record){
									cursoAlumno=record.data;
								}
								CursosAlumnoManager.openExamen({
									cursoAlumno : cursoAlumno,
									grid : grid,
									enable : ESTADO_ACTIVO,
									msgConfirm:'Esta a punto de Iniciar el Examen, tendra <b>1 hora</b> para responder las <b>5</b> preguntas?'
									});
							}
						}						
												
					]
			}],
//			listeners:{
//            	select:function(thisGrid, record, index, eOpts){
//            		Ext.getCmp('btnInscribirse').setDisabled(false);
//            		Ext.getCmp('btnCurso').setDisabled(false);            		
//            	},
//            	deselect:function( thisGrid, record, index, eOpts ){
//            		Ext.getCmp('btnInscribirse').setDisabled(true);
//            		Ext.getCmp('btnCurso').setDisabled(true);
//            	}
//            
//            }
            
            
    			
    	};
		
		this.callParent(arguments);
	}
});