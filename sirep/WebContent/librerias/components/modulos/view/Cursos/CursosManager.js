Ext.ns('CursosManager');
CursosManager={
	
		
		/**guardar Almuno Curso**/
	saveAlumnoCurso: function(options){
		var curso = options.curso;		
		var grid=options.grid;
		var cursoAlumno;
		var tipoDePago=1;
		var estadoDeEvaluacion=1;
		var estadoDePago=1;
		var codDeAlumno=1;
		var nombreDeAlumno=NOMBRE_USER_JSP;
		var id;
		Util.UiMessageBox({
			msg : options.msgConfirm,
			title : 'Confirmar',
			textAceptar : 'Si',
			fn_aceptar:function(){				
				new Util.Ajax.runAjax({
      				url : 'savealumnocurso.app',
      				method : 'POST',
      				async : true,
      				params : {      					
      					codCurso:curso.codCurso
      					,nombreCurso:curso.nombre
      					,tipoPago:tipoDePago
      					,estadoEvaluacion:estadoDeEvaluacion
      					,estadoPago:estadoDePago
      					,nombreAlumno:nombreDeAlumno
      					,codAlumno:codDeAlumno
      					,notaFinal:0
      					,reclamo:'NO'
  						,notaFinalReclamo:0
      					,id:id
      				}
      				,success:function(result){
      					var response=Ext.decode(result.responseText);
      					var msg=response.message;
      					if(response.success){      						
      						options.grid.store.load();      						
      					}      					
      					Util.UiMessageBox({msg:msg,title:'Mensaje'});
      				}
      			});
				
			},
			textCancelar:'No',
			showCancel:true
		});
	},
		
	openAdminCursos:function(option){		
		var curso=option.curso;
		console.log(curso);
		var config={

                title: 'Crear Nuevo Cursos',
                width: 750,
                id:'winCursosEditSave',
                modal:true,
                height: 500,
                resizable:true,
                layout: 'fit',
                defaultType: 'container',
                bodyStyle:'background:#f5f5f5;padding:4px;',
                items:[
                       {
                       	xtype:'userCursos'
                       	,id:'userCursos'	
                       	,bodyStyle:'background:#f5f5f5;'
                       	,curso:curso
                       }
                       ]
		,buttons:[
		          {
		        	  text:'Grabar'
		              ,scale:'medium'
		              ,iconCls:'grabar_24'
		              ,handler:function(){		            	  
		            	  Ext.getCmp('userCursos').saveCurso({idWin:'formAdminCursos',idGrid:option.idGrid});
		              }
		          }
		          ]
			
		};		
		Ext.create('Ext.window.Window', config).show();		
	}
		
};