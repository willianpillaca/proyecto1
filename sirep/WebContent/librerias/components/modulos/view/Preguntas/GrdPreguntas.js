Ext.define('librerias.components.modulos.view.Preguntas.GrdPreguntas', {
	extend : 'Ext.panel.Panel',
	alias : 'widget.listPreguntas',
	initComponent : function() {		
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
		
		var ideTema = this.preguntas.idTema;
		var tema = this.preguntas.tema;
//		var ideTema = this.idTema;
		
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
    		        name: 'descripcion'
    		    }, {
    		        name: 'nombre'
    		    }, {
    		        name: 'tipoPregunta'
    		    }, {
    		        name: 'puntajeAprobatorio'
    		    }, {
    		        name: 'codCurso'
    		    },{
    		        name: 'nombreProfesor'
    		    },{
    		        name: 'codProfesor'
    		    },{
    		    	name:'nivelDificultad',
    		    	mapping:'codNivelDificultad',
    		    	convert:function(v,r){    		    		
    		    		var nivel='';
    		    		if(v==1){
    		    			nivel='BASICO'
    		    		}
    		    		if(v==2){
    		    			nivel='INTERMEDIO'
    		    		}
    		    		if(v==3){
    		    			nivel='AVANZADO'
    		    		}    		    		
    		    		return nivel;
    		    	}
    		    },
    		    {
    		    	name:'tipoDePregunta',
    		    	mapping:'tipoPregunta',
    		    	convert:function(v,r){    		    		
    		    		var tipoPregunta='';
    		    		if(v==1){
    		    			tipoPregunta='SELECCION'
    		    		}
    		    		if(v==2){
    		    			tipoPregunta='DESARROLLO'
    		    		}    		    		    		    		
    		    		return tipoPregunta;
    		    	}
    		    }
//    		    ,{
//    		        name: 'nombreCompleto',
//    		        mapping:'id',
//    		        convert:function(v,r){    		        	
//    		        	var nom=(r.data.apaterno?r.data.apaterno:'')+' '+(r.data.amaterno?r.data.amaterno:'')+' '+(r.data.nombres?r.data.nombres:'');
//    		        	return nom;
//    		        }
//    		    }
    		    
    		    ]
            ,readerStore:{
                type: 'json',
                root: 'data',
                idProperty: 'id'
//                	,
//                totalProperty: 'total'
            }
            ,loadStore:true
            ,url:'listarpreguntas.app?ideTema='+ideTema
            ,columns: [
					{
						text:'ID',
					    dataIndex: 'id',
					    width: 50,					    
					    align:'center',
					    renderer:rowStyle,
					    filterable: true,
			            filter: {type: 'numeric'}
					},		
					{
						text:'ID',
					    dataIndex: 'codCurso',
					    width: 50,					    
					    align:'center',
					    renderer:rowStyle,
					    filterable: true,
					    hidden :true
			            
					},
					{
						text:'DESCRIPCION',
					    dataIndex: 'descripcion',					    
					    width: 400,
					    flex:2,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					}
					,
					{
						text:'NIVEL',
					    dataIndex: 'nivelDificultad',
					    width: 180,
					    flex:1,
					    align:'center',
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					}
					,
					{
						text:'TIPO',
					    dataIndex: 'tipoDePregunta',
					    width:140,
					    flex:1,
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
							text : 'Nueva Pregunta',
							iconCls : 'new_pregunta_16',
							handler : function() {
								var gridMisCursos = Ext.getCmp('winAdminPreguntas');								
								var titulo = gridMisCursos.title;							
								var aux = titulo.split(' ');
								var codigoCurso = aux[1];
								PreguntasManager.openFormPreguntasXTema({idGrid:me.id+'_grid'}, codigoCurso, ideTema, tema);
							}
						}
						,
						{
							text : 'Editar',
							iconCls : 'edit_user_16',							
							disabled:true,							
						}						
						,
						{
							text : 'Deshabilitar',
							iconCls : 'delete_user_16',							
							disabled:true,							
						}
						,
						{
							text : 'Habilitar',
							iconCls : 'enable_user_16',							
							disabled:true,							
						}
//						,{
//							text : 'Crear Pregunta',
//							iconCls : 'new_pregunta_16',						
//							handler: function(){
//								var grid = Ext.getCmp(me.id+'_grid');
//								var record = grid.getSelectionModel().getSelection()[0];
//								console.log('record->>');
//								console.log(record);
//								console.log(record.data);
//								var idCurso = record.data.id;
//								$('#txtCurso').text(record.data.nombre);
//								$('#idCurso').text(record.data.id);
//								$('#myModal').modal({show:true})								
//							}							
//						}
						
					]
			}]
            
            
    			
    	};
		
		this.callParent(arguments);
	}
});