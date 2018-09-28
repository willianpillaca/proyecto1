Ext.ns('CursosManager');
ProyectosManager={
		
	openAdminCurso:function(option){
		var curso=option.curso;
		console.log(curso);
		var config={

                title: 'Crear Nuevo Curso',
                width: 850,
                id:'winCursosEditSave',
                modal:true,
                height: 340,
                resizable:false,
                layout: 'fit',
                defaultType: 'container',
                bodyStyle:'background:#f5f5f5;padding:4px;',
                items:[
                       {
                       	xtype:'cursoAdmin'
                       	,id:'cursoAdmin'	
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
				            	  Ext.getCmp('cursoAdmin').saveCurso({idWin:'winCursosEditSave',idGrid:option.idGrid});
				              }
				          }
				          ]
			
		};
		
		Ext.create('Ext.window.Window', config).show();
		
	},	
	personalizarTema:function(){
		
		Ext.create('Ext.window.Window', {
		    title: 'Personalizar Tema',
		    height: 350,
		    width: 600,
		    modal:true,
		    id:'winPersonalizarTema',
		    layout: 'form',
		    autoScroll:true,
		    bodyStyle:'background:#fff;padding:10px 0px 10px 10px;',
		    items:[
		           {
		        	   xtype:'component'
		        	  ,html:'<div style="width:565px;float:left;">'+
		        	  		'<div style="float:left;border:1px #ccc solid;width:180px;height:130px;margin:0px 10px 0px 0px;"><img lang="Tema por Defecto" class="imgTema" src="librerias/imagenes/background2.jpg" /></div>'+
		        	  		'<div style="float:left;border:1px #ccc solid;width:180px;height:130px;margin:0px 10px 0px 0px;"><img lang="Tema Aqua" class="imgTema" src="librerias/imagenes/tiger_light_blue.jpg" /></div>'+
		        	  		'<div style="float:left;border:1px #ccc solid;width:180px;height:130px;margin:0px 0px 0px 0px;"><img lang="Tema red" class="imgTema" src="librerias/imagenes/bgrojo.png" /></div>'+
		        	  		''+
		        	  		''+
		        		  '</div>'
		        	  	,listeners:{
		        	  		afterrender:function(){
		        	  			$('.imgTema').each(function(){
		        	  				var test=this.lang;
		        	  				$(this).qtip({ 
	                                    content: {
	                                        text:test 
	                                        },
	                                    style: {
	                                        classes: 'qtip-dark qtip-shadow'
	                                    },
	                                    position: {
	                                        my: 'top center',  // Position my top left...
	                                        at: 'bottom center'
	                                    }
	                                });
		        	  				
		        	  			});
		        	  			
		        	  			$('.imgTema').click(function(){
		        	  				var imgBg=$(this).attr('src');
		        	  				
		        	  				Util.UiMessageBox({
		        	  					msg : 'Seguro de Personalizar el Tema del Sistema?',
		        	  					title : 'Confirmar',
		        	  					textAceptar : 'Si',
		        	  					fn_aceptar:function(){
		        	  						new Util.Ajax.runAjax({
		        	  		      				url : 'personalizartema.app',
		        	  		      				method : 'POST',
		        	  		      				async : true,
		        	  		      				params : {
		        	  		      					bgApp:imgBg
		        	  		      				}
		        	  		      				,success:function(result){
		        	  		      					var response=Ext.decode(result.responseText);
		        	  		      					var msg=response.message;
		        	  		      					Util.UiMessageBox({msg:msg,title:'Mensaje'});
		        	  		      					$('#SIREPAPP_panelCenter-body').css('background','url('+imgBg+')');
		        	  		      					Ext.getCmp('winPersonalizarTema').close();
		        	  		      				}
		        	  		      			});
		        	  						
		        	  					},
		        	  					textCancelar:'No',
		        	  					showCancel:true
		        	  				});
		        	  				
		        	  				
		        	  				
		        	  			});
		        	  		}
		        	  	}	
		           }
		           ]
		}).show();
		
	}
		
};