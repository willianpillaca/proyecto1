Ext.ns('PreguntasManager');
PreguntasManager={
	
	
	openPreguntas:function(codigo, nombreCurso, idTema){
		//inicio grid
		var preguntas = new Object();
		preguntas.codCurso = codigo;
		preguntas.nombre = nombreCurso;
		preguntas.idTema = idTema;
		var config={
                title: 'Preguntas: '+codigo+' '+nombreCurso,
                autoScroll:true,
                width: 800,
                id:'winAdminPreguntas',
                height: 400,
                codCurso: codigo,
                maximizable:true,
                layout: {
				        type: 'vbox',
				        align: 'stretch',    
				        padding: 0
				    },
                defaultType: 'container',
                bodyStyle:'background:#fff;padding:0px;',
                items:[
                       {
                       	xtype:'listPreguntas'
                       	,id:'listPreguntas'
                       	,layout:'fit'	
                       }
                       ]
            };		
		PreguntasManager.begin(config);
		
		
		//fin de grid
	},
	openPreguntasXTema:function(codigo, nombreCurso, idTema, tema){
		//inicio grid
		var preguntas = new Object();
		preguntas.codCurso = codigo;
		preguntas.nombre = nombreCurso;
		preguntas.idTema = idTema;
		preguntas.tema = tema;
		var config={
                title: 'Preguntas: '+codigo+' '+nombreCurso,
                autoScroll:true,
                width: 800,
                id:'winAdminPreguntas',
                height: 400,
                maximizable:true,
                layout: {
				        type: 'vbox',
				        align: 'stretch',    
				        padding: 0
				},
                defaultType: 'container',
                bodyStyle:'background:#fff;padding:0px;',
                items:[
                       {
                       	xtype:'listPreguntas'
                       	,id:'listPreguntas'
                       	,layout:'fit'
                       	,preguntas: preguntas	
                       }
                       ]
            };		
		PreguntasManager.begin(config);
		
		
		//fin de grid
	},
	begin : function(config) {		
		if (Ext.getCmp(config.id)) {
			Ext.getCmp(config.id).show();
		} else {
			var idBoton = Ext.id();
			config.animateTarget = idBoton;
			var btn = {
				xtype : 'button',
				text : config.title,
				id : idBoton,
				scale : 'medium',
				iconCls : 'iconWin24',
				handler : function() {
					Ext.getCmp(config.id).show();
				},
				listeners : {
					afterrender : function() {
						Ext.get(this.id).on('contextmenu',
										function(e, b) {
											e.preventDefault();
											var contextMenu = new Ext.menu.Menu(
													{
														items : [
																{
																	text : 'Restaurar',
																	handler : function() {
																		Ext.getCmp(config.id).show();
																	}
																},
																{
																	text : 'Minimizar',
																	handler : function() {
																		Ext.getCmp(config.id).hide();
																	}
																},
																{
																	text : 'Cerrar',
																	handler : function() {
																		Ext.getCmp(config.id).close();
																	}
																} ]
													});

											contextMenu.showAt(e.getPageX(), e.getPageY() - 65);

										});
					}
				}
			};

			Ext.getCmp(APP_ID_SIREP_JS + '_buttomBar').insert(0, btn);

			var elementWindow = Ext.widget('sirepWindow', config);

			elementWindow.on('beforeclose', function(panel, eOpts) {
				Ext.getCmp(idBoton).destroy();

			});

			elementWindow.on('minimize', function(thisWin, eOpts) {
				thisWin.hide();
			});

			elementWindow.show();
		}

	},
	
	openFormPreguntasXTema:function(option,codigo, idTema, tema){		
		
		var pregunta=option.pregunta;
		
		var config={

                title: 'Crear Nuevo Pregunta: '+tema,
                width: 720,
                id:'winPreguntasEditSave',
                modal:true,
                height: 650,
                resizable:true,
                layout: 'fit',
                defaultType: 'container',
                bodyStyle:'background:#f5f5f5;padding:4px;',
                items:[
                       {
                       	xtype:'userPreguntas'
                       	,id:'userPreguntas'	
                       	,bodyStyle:'background:#f5f5f5;'
                       	,pregunta:pregunta
                       }
                       ]
		,buttons:[
		          {
		        	  text:'Grabar'
		              ,scale:'medium'
		              ,iconCls:'grabar_24'
		              ,handler:function(){		            	  
		            	  Ext.getCmp('userPreguntas').savePreguntaXTema({idWin:'formAdminPreguntasXTema',idGrid:option.idGrid}, codigo, idTema);
		              }
		          }
		          ]
			
		};		
		Ext.create('Ext.window.Window', config).show();		
	},
	
	
//	openAdminPreguntas:function(option,codigo){		
//		var pregunta=option.pregunta;		
//		var config={
//
//                title: 'Crear Nuevo Pregunta',
//                width: 720,
//                id:'winPreguntasEditSave',
//                modal:true,
//                height: 650,
//                resizable:true,
//                layout: 'fit',
//                defaultType: 'container',
//                bodyStyle:'background:#f5f5f5;padding:4px;',
//                items:[
//                       {
//                       	xtype:'userPreguntas'
//                       	,id:'userPreguntas'	
//                       	,bodyStyle:'background:#f5f5f5;'
//                       	,pregunta:pregunta
//                       }
//                       ]
//		,buttons:[
//		          {
//		        	  text:'Grabar'
//		              ,scale:'medium'
//		              ,iconCls:'grabar_24'
//		              ,handler:function(){		            	  
//		            	  Ext.getCmp('userPreguntas').savePregunta({idWin:'formAdminPreguntas',idGrid:option.idGrid}, codigo);
//		              }
//		          }
//		          ]
//			
//		};		
//		Ext.create('Ext.window.Window', config).show();		
//	},
	
	openNuevoTema:function(option,idCurso){		
		console.log('option->>>');
		console.log(option);
		var tema=option.tema;		
		var config={

                title: 'Crear Nuevo Tema',
                width: 720,
                id:'winTemaEditSave',
                modal:true,
                height: 450,
                resizable:true,
                layout: 'fit',
                defaultType: 'container',
                bodyStyle:'background:#f5f5f5;padding:4px;',
                items:[
                       {
                       	xtype:'userTemas'
                       	,id:'userTemas'	
                       	,bodyStyle:'background:#f5f5f5;'
                       	,tema:tema
                       }
                       ]
		,buttons:[
		          {
		        	  text:'Grabar'
		              ,scale:'medium'
		              ,iconCls:'grabar_24'
		              ,handler:function(){		            	  
		            	  Ext.getCmp('userTemas').saveTema({idWin:'winTemaEditSave',idGrid:option.idGrid}, idCurso);
		              }
		          }
		          ]
			
		};		
		Ext.create('Ext.window.Window', config).show();		
	}
		
};