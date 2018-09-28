
Ext.define('cursos.AdministracionCursos', {
	extend : 'Ext.panel.Panel',
	alias : 'widget.cursoAdmin',
	getListRoles:function(){
		var me=this;
		var grid=Ext.getCmp(me.id+'_gridAdminUser');
		var store=grid.store;
		var roles=null;
		var i=0;
		store.each(function(){
			if(!roles){roles= new Object();}
			roles['roles['+i+'].iUsuarioxrolRolId']=this.data.iRolId;
			i++;
		});
		return roles;
	},
	saveProyecto:function(options){

		var me=this;
		
		if(Ext.getCmp(me.id+'_formAdminCurso').getForm().isValid()){
			var formValues=Util.serialize(me.id+'_formAdminCurso');			
			Ext.apply(formValues);
			console.log(formValues);
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
						var msg=response.message+'<br />Se ha guardado con exito el curso: <strong>'+formValues.nombreProyecto+'</strong>';
						Util.UiMessageBox({msg:(formValues.id?response.message:msg),title:'Mensaje'});						
						if(Ext.getCmp(options.idGrid)){
							Ext.getCmp(options.idGrid).getSelectionModel().deselectAll();
							Ext.getCmp(options.idGrid).store.load();
						}
						if(Ext.getCmp(options.idWin)){
							Ext.getCmp(options.idWin).close();
						}
					}else{
						Util.UiMessageBox({msg:response.message,title:'Error',iconClsAceptar:'cancel_24'});
					}
				}
			});
			
		}else{
			console.log('no es valido');
		}			
	},
	createFormCurso:function(){
		var me=this;
		var curso;
		if(me.curso){
			curso=me.curso
		}
		console.log(me.curso);
		
		Ext.create('Ext.form.Panel',{
					renderTo:me.id+'_form_admin_user'
					,border:false
					,layout:'form'
					,id:me.id+'_formAdminCurso'
					,width:385
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
					        	xtype:'textfield'
					        	,fieldLabel: 'Codigo Curso'
					        	,allowBlank:false	
					        	,name:'codCurso'
					        	,value: (curso?curso.codCurso:'')
					        },
					        {
					        	xtype:'textfield'
					        	,fieldLabel: 'Nombre'
					        	,allowBlank:false	
					        	,name:'nombre'
					        	,value: (curso?curso.nombre:'')
					        },
					        {
					        	xtype:'textfield'
					        	,fieldLabel: 'descripcion'
					        	,allowBlank:false	
					        	,name:'descripcion'
					        	,value: (curso?curso.descripcion:'')
					        },
							{
								xtype : 'ComboCustomized',
								fieldLabel: 'Tipo de Evaluacion',
								allowBlank:false,
								parametros : {
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
								valueField : 'vCatalogoAbreviatura',
								name: 'tipoEvaluacion',
								enableKeyEvents : true,
								allowBlank : false,
								blankText : 'Seleccione el Tipo',
								queryMode : 'local',								
								
							},							
					        {
					        	xtype:'textfield'
					        	,fieldLabel: 'Costo'
					        	,name:'costo'
//					        	,value: (curso?new Date(prpyecto.fechaDefinicion):'')
					        	,value: (curso?curso.costo:'')
					        },
					        {
								xtype : 'ComboCustomized',
								fieldLabel: 'Profesor a Cargo',
								allowBlank:false,
								parametros : {
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
								valueField : 'vCatalogoAbreviatura',
								name: 'idProfesor',
								enableKeyEvents : true,
								allowBlank : false,
								blankText : 'Seleccione el Tipo',
								queryMode : 'local',								
								
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
					    columnWidth: 0.5,
					    padding: '5 5 0 5',
					    border:false,	
					    items:[{
					    	border:false,
					    	bodyStyle:'background:#f5f5f5;',
					    	height: 290,
					        html: '<div class="panel panel-default" style="height:248px;">'+
						            '<div class="panel-heading" style="padding:5px !important;">'+
									    '<h3 class="panel-title" style="font-size:12px;" >Datos del Proyecto</h3>'+
									  '</div>'+
									  '<div class="panel-body" id="'+me.id+'_form_admin_user" ></div>'+
								'</div>'
							,listeners:{
									afterrender:function(thisPanel){
										me.createFormProyecto();										
									}
							}
								    }]
					},{
					    columnWidth: 0.5,
					    padding: '5 5 0 5',
					    border:false,	
					    items:[{
					    	border:false,
					    	bodyStyle:'background:#f5f5f5;',
					    	height: 290,
					        html: '<div class="panel panel-default" style="height:248px;">'+
						            '<div class="panel-heading" style="padding:5px !important;">'+
									    '<h3 class="panel-title" style="font-size:12px;" >&nbsp;</h3>'+
									  '</div>'+
									  '<div class="panel-body"  id="'+me.id+'_form_admin_user_roles" >'+
									 '</div>'+
								'</div>'
							,listeners:{
								afterrender:function(){
									me.createGridRoles();
								}
							}		 
					    }]
					}
    	       ];
		this.callParent(arguments);
	}
});