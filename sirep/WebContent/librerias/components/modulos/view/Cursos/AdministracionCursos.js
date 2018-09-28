Ext.define('Cursos.AdministracionCursos', {
	extend : 'Ext.panel.Panel',
	alias : 'widget.userCursos',
	
	
	
	/**guardar Curso**/ 
	
	saveCurso: function(options){		
		if(Ext.getCmp('formAdminCursos').getForm().isValid()){			
			var formValues=Util.serialize('formAdminCursos');			
			Ext.apply(formValues);			
			formValues.costo=10;
			formValues.sylabus='sin sylabus adjuntado';			
			Ext.getCmp(options.idWin).body.mask('Espere un momento por favor.');			
			new Util.Ajax.runAjax({
				url : 'savecurso.app',
				method : 'POST',
				async : true,
				params : formValues
				,success:function(result){
					var response=Ext.decode(result.responseText);
					Ext.getCmp(options.idWin).body.unmask();
					if(response.success){						
						if(Ext.getCmp(options.idGrid)){
							Ext.getCmp(options.idGrid).getSelectionModel().deselectAll();
							Ext.getCmp(options.idGrid).store.load();
						}
						
						if(Ext.getCmp(options.idWin)){							
							Ext.getCmp('winCursosEditSave').close();
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
	
	createFormCursos:function(){
//		CKEDITOR.replace( 'editor1' );		
		var me=this;
		var curso;
		if(me.curso){
			curso=me.curso
		}		
		
		Ext.create('Ext.form.Panel',{
					renderTo:'form_admin_curso'
					,border:false					
					,layout:'form'
					,id:'formAdminCursos'
					,width:680
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
							    value: (curso?curso.id:'')
							}
							,
							{
								xtype: 'textfield',
								name:'codCurso',
								fieldLabel: 'Codigo'
							},
							{
								xtype: 'textfield',
								fieldLabel: 'Nombre',
								name:'nombre',
							},
							
					        {
					        	xtype:'htmleditor'
					        	//,fieldLabel: 'Editar Examen'					        	
					        	,enableColors: false
					        	,name:'descripcion'
					            ,enableAlignments: false
					        	,width:500
					        	,draggable:true
					        },					               
					        
					        {
								xtype : 'ComboCustomized',
								fieldLabel: 'Tipo de Evaluacion',
								allowBlank:false								
								,parametros : {
									url : 'listelementocatalogobyidgrupo.app',									
									params : {
											idGrupo:2
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
								blankText : 'Seleccione el Tipo de Evaluacion',
								queryMode : 'local',
								name:'tipoEvaluacion',
								id:me.id+'_tipoEvaluacion',	
								width:140,
								listConfig : {
									getInnerTpl : function() {										
										return '<div style="padding:2px;">{vCatalogoNombre}</div>';
									}
								}
							},
							{
								xtype : 'ComboCustomized',
								fieldLabel: 'Profesor a Cargo',
								allowBlank:false								
								,parametros : {
									url : 'listardocentes.app',
									record : {
										fields : [

												{
													name : "iUsuarioId"
												},
												{
													name : "vUsuarioApPaterno"
												},
												{
													name : "vUsuarioApMaterno"
												},
												{
													name : "vUsuarioNombres"
												},
												{
													name : "nombreCompleto"
												}

										]
									}
								},
								displayField : 'nombreCompleto',
								forceSelection : true,
								valueField : 'iUsuarioId',
								enableKeyEvents : true,
								allowBlank : false,
								blankText : 'Seleccione Docente',
								queryMode : 'local',
								name:'idProfesor',
								id:me.id+'_docente',	
								width:140,
								listConfig : {
									getInnerTpl : function() {										
										return '<div style="padding:2px;">{nombreCompleto}</div>';
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
					    	height: 400,
					    	width:720,
					        html: '<div class="panel panel-default" style="height:300px;">'+
						            '<div class="panel-heading" style="padding:7px !important;">'+
									    '<h3 class="panel-title" style="font-size:12px;" >Curso</h3>'+
									  '</div>'+
									  '<div class="panel-body" id="form_admin_curso" ></div>'+
								'</div>'
							,listeners:{
									afterrender:function(thisPanel){
										me.createFormCursos();										
									}
							}
								    }
					
    	       ];
		this.callParent(arguments);
	}
});