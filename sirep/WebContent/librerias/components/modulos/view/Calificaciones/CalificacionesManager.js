Ext.ns('CalificacionesManager');
CalificacionesManager={		
		/**calificar Pregunta Abierta**/	
	openCalificarExamen:function(option){
		var resultado=option.resultado;
		console.log('resultadoW->>>>');
		console.log(resultado);
		var idResultado = resultado.id; 
		var config={

                title:'Calificar',
                width: 400,
                id:'winActualizarNota',
                modal:true,
                resizable:false,
                layout: 'fit',
                defaultType: 'container',
                bodyStyle:'background:#fff;padding:10px;',
                items:[
                       {
                       	xtype:'form'
                       	,id:'formCalificarExamen'	
                       	,border:false
                       	,bodyStyle:'background:#fff;'
                       	,defaults: {
	                                width: 360,
	                                inputType: 'text'
	                                ,fieldStyle:'background:#fff;'
	                                ,labelWidth:125
	                                ,labelStyle:'color:#666;'
                            },
                            defaultType: 'textfield',
                            items:[
								{
								    fieldLabel: 'Ingresar Puntaje',								    
								    name: 'notaExamen',
								    id: 'notaExamen',
								}]
                       		
                       }
                       ]
		,buttons:[
		          {
		        	  text:'Grabar'
		              ,scale:'medium'
		              ,iconCls:'key_24'
		              ,handler:function(){
		            	  var nota = Ext.getCmp('notaExamen').getValue();		            	  
		            	  console.log('nota->>>'+nota);		            	  
		            	  if(Ext.getCmp('formCalificarExamen').getForm().isValid()){		            		  
		            		  Ext.getCmp('winActualizarNota').body.mask('Espere un momento por favor');
		            		  new Util.Ajax.runAjax({
		          				url : 'actualizarnotaexamen.app',
		          				method : 'POST',
		          				async : true,
		          				params : {nota: nota, idResultado: idResultado},
		          				success:function(result){
		          					var response=Ext.decode(result.responseText);
		          					Ext.getCmp('winActualizarNota').body.unmask();
		          					if(response.success){
		          						option.grid.store.load();
		          						var msg=response.message;
		          						Util.UiMessageBox({msg:msg,title:'Mensaje'});
		          						Ext.getCmp('winActualizarNota').close();
		          						}else{
		          							Util.UiMessageBox({msg:response.message,title:'Error',iconClsAceptar:'cancel_24'});
		          						}
		          					}
		          				});		            		  
		            		  }		            	  
		              }
		          }
		          ]
			
		};
		
		Ext.create('Ext.window.Window', config).show();
		
	}
		
};