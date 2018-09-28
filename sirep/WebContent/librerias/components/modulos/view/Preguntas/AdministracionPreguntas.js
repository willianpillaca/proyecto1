Ext.define('Preguntas.AdministracionPreguntas', {
	extend : 'Ext.panel.Panel',
	alias : 'widget.userPreguntas',
	
	
	/**guardar Pregunta X Tema**/
	savePreguntaXTema: function(options, codigo, idTema){
		console.log('idTema->>>>>>>>>>>>'+idTema);
		console.log(options);
		if(Ext.getCmp('formAdminPreguntasXTema').getForm().isValid()){			
			var formValues=Util.serialize('formAdminPreguntasXTema');
			console.log('miiiiiiform->>>>');
			console.log(formValues);
			Ext.apply(formValues);			
			formValues.puntajeAprobatorio=20;			
			formValues.codProfesor=1;
			formValues.idTema= idTema;
			formValues.codCurso=codigo;
			formValues.nombreProfesor=NOMBRE_USER_JSP;
			formValues.imagenPregunta='sin imagen adjunta';
			if(formValues.alternativa1==''){				
				formValues.alternativa1 = '--';
				formValues.alternativa2 = '--';
				formValues.alternativa3 = '--';
				formValues.alternativa4 = '--';
				formValues.alternativa5 = '--';
				formValues.respuesta = '--';
			}
			//formValues.codCurso='sin imagen adjunta';
			if(formValues.respuesta=='1'){				
				formValues.respuesta=formValues.alternativa1;
			}			
			if(formValues.respuesta=='2'){				
				formValues.respuesta=formValues.alternativa2;
			}
			if(formValues.respuesta=='3'){				
				formValues.respuesta=formValues.alternativa3;
			}
			if(formValues.respuesta=='4'){				
				formValues.respuesta=formValues.alternativa4;
			}
			if(formValues.respuesta=='5'){				
				formValues.respuesta=formValues.alternativa5;
			}
			console.log(formValues);
			Ext.getCmp(options.idWin).body.mask('Espere un momento por favor.');			
			new Util.Ajax.runAjax({
				url : 'savepreguntaxtema.app',
				method : 'POST',
				async : true,
				params : formValues
				,success:function(result){
					var response=Ext.decode(result.responseText);
					Ext.getCmp(options.idWin).body.unmask();
					if(response.success){												
						console.log('options.idGrid->'+options.idGrid);
						console.log('options.idWin->>>');
						console.log(options.idWin);
						if(Ext.getCmp(options.idGrid)){
							Ext.getCmp(options.idGrid).getSelectionModel().deselectAll();
							Ext.getCmp(options.idGrid).store.load();
						}
						
						if(Ext.getCmp(options.idWin)){
							console.log('form_admin_pregunta->>>')
							Ext.getCmp('winPreguntasEditSave').close();
						}
					}else{
						Util.UiMessageBox({msg:response.message,title:'Error',iconClsAceptar:'cancel_24'});
					}
				}
			});
			
		}else{
			console.log('no es valido');
		}
		console.log(options);
	},
	
	/**guardar Pregunta**/
	savePregunta: function(options, codigo){		
		if(Ext.getCmp('formAdminPreguntas').getForm().isValid()){			
			var formValues=Util.serialize('formAdminPreguntas');			
			Ext.apply(formValues);			
			formValues.puntajeAprobatorio=20;			
			formValues.codProfesor=1;
			formValues.codCurso=codigo;
			formValues.nombreProfesor=NOMBRE_USER_JSP;
			formValues.imagenPregunta='sin imagen adjunta';
			if(formValues.alternativa1==''){
				console.log('dato vacio->>>>');
				formValues.alternativa1 = '--';
				formValues.alternativa2 = '--';
				formValues.alternativa3 = '--';
				formValues.alternativa4 = '--';
				formValues.alternativa5 = '--';
				formValues.respuesta = '--';
			}
			//formValues.codCurso='sin imagen adjunta';
			if(formValues.respuesta=='1'){
				console.log('dentro de 1');
				formValues.respuesta=formValues.alternativa1;
			}
			if(formValues.respuesta=='1'){
				console.log('dentro de 1');
				formValues.respuesta=formValues.alternativa1;
			}
			if(formValues.respuesta=='2'){				
				formValues.respuesta=formValues.alternativa2;
			}
			if(formValues.respuesta=='3'){				
				formValues.respuesta=formValues.alternativa3;
			}
			if(formValues.respuesta=='4'){				
				formValues.respuesta=formValues.alternativa4;
			}
			if(formValues.respuesta=='5'){				
				formValues.respuesta=formValues.alternativa5;
			}
			console.log(formValues);
			Ext.getCmp(options.idWin).body.mask('Espere un momento por favor.');			
			new Util.Ajax.runAjax({
				url : 'savepregunta.app',
				method : 'POST',
				async : true,
				params : formValues
				,success:function(result){
					var response=Ext.decode(result.responseText);
					Ext.getCmp(options.idWin).body.unmask();
					if(response.success){												
						console.log('options.idGrid->'+options.idGrid);
						console.log('options.idWin->>>');
						console.log(options.idWin);
						if(Ext.getCmp(options.idGrid)){
							Ext.getCmp(options.idGrid).getSelectionModel().deselectAll();
							Ext.getCmp(options.idGrid).store.load();
						}
						
						if(Ext.getCmp(options.idWin)){
							console.log('form_admin_pregunta->>>')
							Ext.getCmp('winPreguntasEditSave').close();
						}
					}else{
						Util.UiMessageBox({msg:response.message,title:'Error',iconClsAceptar:'cancel_24'});
					}
				}
			});
			
		}else{
			console.log('no es valido');
		}
		
		
		console.log(options);
	},
	
	createFormPreguntas:function(){
//		CKEDITOR.replace( 'editor1' );		
		var me=this;
		var pregunta;
		if(me.pregunta){
			pregunta=me.pregunta
		}	
		
		
		Ext.create('Ext.form.Panel',{
					renderTo:'form_admin_pregunta'
					,border:false					
					,layout:'form'
					,id:'formAdminPreguntasXTema'
					,width:680
					,height:600
					,autoScroll: true
					,padding:'5 5 0 5'
					,fieldDefaults: {
						 labelWidth: 120
			         	,fieldStyle:'background:#fff;'
			        	,labelStyle:'color:#666;'
			        }
					,items:[
							{
							    xtype: 'hiddenfield',
							    name: 'id',
							    value: (pregunta?pregunta.id:'')
							},
					        {
					        	xtype:'htmleditor'
					        	//,fieldLabel: 'Editar Examen'					        	
					        	,enableColors: false
					        	,name:'descripcion'
					            ,enableAlignments: false
					        	,width:580
					        	,padding: '0 0 0 5'
					        	,height:150
					        	,draggable:true
					        },
					        {
					        	 xtype:'fieldcontainer',							    	  
					        	 name:'tipos',						    	  
						    	 layout: 'hbox',
						    	 items:[
						    	         {
						    	        	 	xtype : 'ComboCustomized',
												fieldLabel: 'Nivel de Dificultad',
												allowBlank:false								
												,parametros : {
													url : 'listelementocatalogobyidgrupo.app',									
													params : {
															idGrupo:1
													},
													record : {
														fields : [

																{
																	name : "iCatalogoId"
																},
																{
																	name : "vCatalogoNombre"
																},
																{
																	name : "vCatalogoAbreviatura"
																},
																{
																	name : "vCatalogoDefinicion"
																},
																{
																	name : "iCatalogoGrupoId"
																}

														]
													}
												},
												displayField : 'vCatalogoNombre',
												forceSelection : true,
												valueField : 'iCatalogoId',
												enableKeyEvents : true,
												allowBlank : false,
												blankText : 'Seleccione el Nivel de Dificultad',
												queryMode : 'local',
												name:'codNivelDificultad',
												id:me.id+'_codNivelDificultad',	
												width:320,
												listConfig : {
													getInnerTpl : function() {										
														return '<div style="padding:2px;">{vCatalogoNombre}</div>';
													}
												}
						    	         },						    	         
						    	         
						    	         {
												xtype : 'ComboCustomized',
												fieldLabel: 'Tipo de Respuesta',
												labelWidth: 140,
												allowBlank:false								
												,parametros : {
													url : 'listelementocatalogobyidgrupo.app',									
													params : {
															idGrupo:4
													},
													record : {
														fields : [

																{
																	name : "iCatalogoId"
																},
																{
																	name : "vCatalogoNombre"
																},
																{
																	name : "vCatalogoAbreviatura"
																},
																{
																	name : "vCatalogoDefinicion"
																},
																{
																	name : "iCatalogoGrupoId"
																}

														]
													}
												},
												displayField : 'vCatalogoNombre',
												forceSelection : true,
												valueField : 'vCatalogoAbreviatura',
												enableKeyEvents : true,
												allowBlank : false,
												blankText : 'Seleccione',
												queryMode : 'local',
												margin: '0 0 0 20',
												name:'tipoPregunta',
												id:me.id+'_tipoPregunta',	
												width:320,
												listConfig : {
													getInnerTpl : function() {										
														return '<div style="padding:2px;">{vCatalogoNombre}</div>';
													}
												},
												listeners : {
													select : function(field, record, c) {														
														var tipoRespta = record[0].data.vCatalogoNombre;
														if(tipoRespta == 'DESARROLLO'){
															Ext.getCmp('alternativa1').setDisabled(true);
															Ext.getCmp('alternativa2').setDisabled(true);
															Ext.getCmp('alternativa3').setDisabled(true);
															Ext.getCmp('alternativa4').setDisabled(true);
															Ext.getCmp('alternativa5').setDisabled(true);
															Ext.getCmp(me.id+'_respuesta').setDisabled(true);
														}
														if(tipoRespta == 'SELECCION'){															
															Ext.getCmp('alternativa1').setDisabled(false);
															Ext.getCmp('alternativa2').setDisabled(false);
															Ext.getCmp('alternativa3').setDisabled(false);
															Ext.getCmp('alternativa4').setDisabled(false);
															Ext.getCmp('alternativa5').setDisabled(false);
															Ext.getCmp(me.id+'_respuesta').setDisabled(false);
														}
														
														
													}
												},
											}
						    	         ]
						    	  
					        },				
					        {
					        	xtype:'textfield',					        	
					        	height: 45,
					            name: 'alternativa1',
					            id: 'alternativa1',
					            fieldLabel: 'Alternativa 1',
					            anchor: '100%'			        	
					        },
					        {
					        	xtype:'textfield',					        	
					        	height: 45,
					            fieldLabel: 'Alternativa 2',
					            name: 'alternativa2',
					            id: 'alternativa2',
					            anchor: '100%'					        	
					        },
					        {
					        	xtype:'textfield',				        	
					        	height: 45,
					            fieldLabel: 'Alternativa 3',
					            name: 'alternativa3',
					            id: 'alternativa3',
					            anchor: '100%'					        	
					        },
					        {
					        	xtype:'textfield',					        	
					        	height: 45,
					            fieldLabel: 'Alternativa 4',
					            name: 'alternativa4',
					            id: 'alternativa4',
					            anchor: '100%'					        	
					        },
					        {
					        	xtype:'textfield',					        	
					        	height: 45,
					            fieldLabel: 'Alternativa 5',
					            name: 'alternativa5',
					            id: 'alternativa5',
					            anchor: '100%'
					        },
					        {
								xtype : 'ComboCustomized',
								fieldLabel: 'Respuesta',
								labelWidth: 75,
								allowBlank:false								
								,parametros : {
									url : 'listelementocatalogobyidgrupo.app',									
									params : {
											idGrupo:3
									},
									record : {
										fields : [

												{
													name : "iCatalogoId"
												},
												{
													name : "vCatalogoNombre"
												},
												{
													name : "vCatalogoAbreviatura"
												},
												{
													name : "vCatalogoDefinicion"
												},
												{
													name : "iCatalogoGrupoId"
												}

										]
									}
								},
								displayField : 'vCatalogoNombre',
								forceSelection : true,
								valueField : 'vCatalogoAbreviatura',
								enableKeyEvents : true,
//								allowBlank : false,
								blankText : 'Seleccione',
								queryMode : 'local',
								margin: '0 0 0 5',
								name:'respuesta',
								id:me.id+'_respuesta',	
								width:130,
								listConfig : {
									getInnerTpl : function() {										
										return '<div style="padding:2px;">{vCatalogoNombre}</div>';
									}
								}
							}
					        ]
			
		});
		
	
	},
	
	initComponent : function() {		
		var me=this;		
    	this.border=false;	
    	this.layout='column';
    	this.items=[					    	
					    {
					    	border:false,
					    	bodyStyle:'background:#f5f5f5;',
					    	height:600,
					    	width:700,
					        html: '<div class="panel panel-default" style="height:650px; width:700px;">'+
						            '<div class="panel-heading" style="padding:5px !important;">'+
									    '<h3 class="panel-title" style="font-size:12px;" >Ingrese la Pregunta</h3>'+
									  '</div>'+
									  '<div class="panel-body" id="form_admin_pregunta" ></div>'+
								'</div>'
							,listeners:{
									afterrender:function(thisPanel){
										me.createFormPreguntas();										
									}
							}
								    }
					
    	       ];
		this.callParent(arguments);
	}
});