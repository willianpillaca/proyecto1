Ext.define('librerias.components.modulos.view.Calificaciones.GrdCursos', {
	extend : 'Ext.panel.Panel',
	alias : 'widget.listCalificaciones',
	initComponent : function() {
		console.log('Calificaciones->>');
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
    		    },{
    		        name: 'vUsuarioApMaterno'
    		    }, {
    		        name: 'vUsuarioApPaterno'
    		    },{
    		        name: 'vUsuarioNombres'
    		    },{
    		        name: 'estado'
    		    },{
    		        name: 'rutaArchivo'
    		    },{
    		        name: 'nota'
    		    },{
    		        name: 'numPregCorrectas'
    		    },{
    		        name: 'numPregIncorrectas'
    		    },
    		    {
    		        name: 'nombreCompleto',
    		        mapping:'iUsuarioId',
    		        convert:function(v,r){    		        	
    		        	var nom=(r.data.vUsuarioApPaterno?r.data.vUsuarioApPaterno:'')+' '+(r.data.vUsuarioApMaterno?r.data.vUsuarioApMaterno:'')+' '+(r.data.vUsuarioNombres?r.data.vUsuarioNombres:'');
    		        	return nom;
    		        }
    		    } ,
    		    {
    		        name: 'nombre'
    		    }, {
    		    	name:'pdf'
        		    	,mapping:'rutaArchivo'
        		    	,convert:function(v){
        		    		console.log(v);
        		    		return ('<a target="_blank" href="files/'+v+'"><img src="librerias/css/icons/icon_pdf_16.png" title="descargar" /></a>');
        		    	}
    		    },
    		    {
    		    	name:'desEstado'
    		    	,mapping:'estado'
    		    	,convert:function(v){
    		    		return (v==1?'<img src="librerias/css/icons/no_aprobe_v1_16.png" title="Por Revisado" />':'<img src="librerias/css/icons/aprobe_v1_16.png" title="Revisado" />');
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
            ,url:'mostrarresultadoexamen.app?idUsuario='+IDE_USUARIO
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
						text:'Curso',
					    dataIndex: 'nombre',
					    width: 120,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					}
					,
					{
						text:'Alumno',
					    dataIndex: 'nombreCompleto',
					    flex:2,
					    width: 350,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					},
					{
						text:'Nota',
					    dataIndex: 'nota',
					    flex:1,		
					    width: 40,
					    align:'center',
					    renderer:rowStyle			            
					},
					{
						text:'Correctas',
					    dataIndex: 'numPregCorrectas',
					    flex:1,			
					    align:'center',
					    renderer:rowStyle,
					    width: 40			            
					},
					{
						text:'Incorrectas',
					    dataIndex: 'numPregIncorrectas',
					    flex:1,		
					    align:'center',
					    renderer:rowStyle,
					    width: 50		
					},
					{
						text:'Ruta',
					    dataIndex: 'pdf',
					    flex:1,
					    width: 50,
					    renderer:rowStyle,
					    align:'center',
			            filter: {
			                type: 'string'
			            }
					},					
					{
						text:'Estado',
					    dataIndex: 'desEstado',					    
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
							text : 'Calificar',
							iconCls : 'icon_calificar_16',
							id: 'btn_calificar',
							disabled:true,
							handler : function() {
								
								var grid = Ext.getCmp(me.id+'_grid');
								var record = grid.getSelectionModel().getSelection()[0];								
								var resultado;								
								if(record){
									resultado=record.data;
								}								
								CalificacionesManager.openCalificarExamen({resultado:resultado, grid:grid});
							}
						}												
					]
			}],
			listeners:{
            	select:function(thisGrid, record, index, eOpts){
            		Ext.getCmp('btn_calificar').setDisabled(false);            		            		
            	},
            	deselect:function( thisGrid, record, index, eOpts ){
            		Ext.getCmp('btn_calificar').setDisabled(true);            		
            	}
            
            }
            
            
    			
    	};
		
		this.callParent(arguments);
	}
});