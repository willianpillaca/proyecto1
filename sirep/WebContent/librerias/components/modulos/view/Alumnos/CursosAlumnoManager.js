Ext.ns('CursosAlumnoManager');
CursosAlumnoManager={
	
		
	openExamen:function(options){		
		var cursoAlumno=options.cursoAlumno;		
		Util.UiMessageBox({
			msg : options.msgConfirm,
			title : 'Confirmar',
			textAceptar : 'Si',
			fn_aceptar:function(){				
				new Util.Ajax.runAjax({
      				url : 'obtenerpreguntas.app',
      				method : 'POST',
      				async : true,
      				params : {      					
      					codCurso:cursoAlumno.codCurso
      					,cantidad:2      					
      				}
      				,success:function(result){      					
      					var response=Ext.decode(result.responseText);
      					console.log('response');
      					console.log(response);
      					console.log(result);
      					console.log(response.data[0]);
      					console.log(response.data[0].descripcion);
      					var a1 = response.data[0].alternativa1;
      					var a2 = response.data[0].alternativa2;
      					var a3 = response.data[0].alternativa3;
      					var a4 = response.data[0].alternativa4;
      					var a5 = response.data[0].alternativa5;
      					var html='';
      					var descripcion= response.data[0].descripcion;
      					html=descripcion+'<br/>'
      					+'<div><span>Alternativas:</span></div><br/>'
      					+'A)'+a1+'<br/>'
      					+'B)'+a2+'<br/>'
      					+'C)'+a3+'<br/>'
      					+'D)'+a4+'<br/>'
      					+'E)'+a5+'<br/>';
      					var codCurso= response.data[0].codCurso;
      					var msg=response.message;
      					if(response.success){
      						var cant =1
      						var nropreguntas=3;
      							for(var i=1; i<nropreguntas; i++){
      								console.log('i->>'+i);
      								window['form'+i]= Ext.create('Ext.form.Panel',{
          								title: 'Pregunta'+i,
          								height:300,
          								//hidden:true,
          								id:'pregunta'+i,
          								html:html,
          								buttons:[
											{
											  text:'Siguiente'
											  ,scale:'medium'
											  ,iconCls:'icon_flecha_derecha_24'
											  ,handler:function(){											
												console.log('aaaa->>>');
											  }
											}
											]
          							});
      							}
      							
      							
      						
      						
      						Ext.create('Ext.window.Window', {
      						    title: ''+codCurso,
      						    height: 400,
      						    width: 600,
      						    layout: 'fit',
      						    items:[
      						           	//form1,
      						           	{
      						           		xtype:'panel',      						           		
      						           		items:[
      						           		       		
				      						           	form1
				      						           	
      						           		       ]
      						           		
      						           	},
//      						          {
//    						           		xtype:'panel',
//    						           		title:'bb',
//    						           		items:[
//													{
//													 		xtype:'textfield',
//													 		fieldLabel: 'willian pillaca',
//													 	},
//													 	{
//				      						           		xtype:'textfield',
//				      						           		fieldLabel: 'meneses',
//				      						           	}
//    						           		       ]
//    						           		
//    						           	}
      						           	
      						           	//form2,
      						          
      						           ],
//      						           buttons:[
//      								          {
//      								        	  text:'Siguiente'
//      								              ,scale:'medium'
//      								              ,iconCls:'icon_flecha_derecha_24'
//      								              ,handler:function(){
////      								            	  Ext.getCmp('panelFormExamen').hide();
////      								            	Ext.getCmp('panelFormExamen').body.mask('Cargando siguiente pregunta. Espere un momento por favor.');
////      								            	Ext.getCmp('panelFormExamen').getForm().reset(true);
////      								            	cant++;
////      								            	console.log('cant->>>'+cant);
////      								            	Ext.getCmp('panelFormExamen').body.unmask();
//      								            	
//      								              }
//      								          }
//      								          ]
      						}).show();      						
      					}      					
      					Util.UiMessageBox({msg:msg,title:'Mensaje'});
      				}
      			});				
			},
			textCancelar:'No',
			showCancel:true
		});
		
		
		
//		var config={
//
//                title: 'Crear Nuevo Cursos',
//                width: 750,
//                id:'winCursosEditSave',
//                modal:true,
//                height: 500,
//                resizable:true,
//                layout: 'fit',
//                defaultType: 'container',
//                bodyStyle:'background:#f5f5f5;padding:4px;',
//                items:[
//                       {
//                       	xtype:'userCursos'
//                       	,id:'userCursos'	
//                       	,bodyStyle:'background:#f5f5f5;'
//                       	,curso:curso
//                       }
//                       ]
//		,buttons:[
//		          {
//		        	  text:'Grabar'
//		              ,scale:'medium'
//		              ,iconCls:'grabar_24'
//		              ,handler:function(){		            	  
//		            	  Ext.getCmp('userCursos').saveCurso({idWin:'formAdminCursos',idGrid:option.idGrid});
//		              }
//		          }
//		          ]
//			
//		};		
		Ext.create('Ext.window.Window', config).show();		
	}
		
};