Ext.define('objetivos.AdministracionObjetivos', {
	extend : 'Ext.panel.Panel',
	alias : 'widget.objetivoAdmin',
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
	saveUser:function(options){
		console.log('guardar Objetivo->>>');
	},
	createFormUser:function(){
		var me=this;
		var usuario;
		if(me.usuario){
			usuario=me.usuario
		}
		console.log(me.usuario)
		
		Ext.create('Ext.form.Panel',{
					renderTo:me.id+'_form_admin_user'
					,border:false
					,layout:'form'
					,id:me.id+'_formAdminUser'
					,width:385
					,fieldDefaults: {
						 labelWidth: 120
			         	,fieldStyle:'background:#fff;'
			        	,labelStyle:'color:#666;'
			        }
					,items:[
							{
							    xtype: 'hiddenfield',
							    name: 'iUsuarioId',
							    value: (usuario?usuario.iUsuarioId:'')
							}
							,
					        {
					        	xtype:'textfield'
					        	,fieldLabel: 'Objetivo'
					        	,allowBlank:false	
					        	,name:'vUsuarioUsername'
					        	,value: (usuario?usuario.vUsuarioUsername:'')
					        }
					        ,
					        {
								xtype : 'ComboCustomized',
								fieldLabel: 'Tipo de Objetivo',
								allowBlank:false,
								parametros : {
									url : 'listelementocatalogobyidgrupo.app',
									callback:function(){
										if(usuario){
											Ext.getCmp(me.id+'_iUsuarioSexo').setValue(usuario.iUsuarioSexo);
										}
									},
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
								valueField : 'iCatalogoId',
								enableKeyEvents : true,
								allowBlank : false,
								blankText : 'Seleccione el Tipo de Objetivo',
								queryMode : 'local',								
							}					        
					        ,
					        {
								xtype : 'ComboCustomized',
								fieldLabel: 'Seleccion el Area',
								allowBlank:false,
								parametros : {
									url : 'listelementocatalogobyidgrupo.app',
									callback:function(){
										if(usuario){
											Ext.getCmp(me.id+'_iUsuarioSexo').setValue(usuario.iUsuarioSexo);
										}
									},
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
								valueField : 'iCatalogoId',
								enableKeyEvents : true,
								allowBlank : false,
								blankText : 'Seleccione el Area',
								queryMode : 'local',																
							}
					        ,
					        {
								xtype : 'ComboCustomized',
								fieldLabel: 'Seleccion el Proyecto',
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
								valueField : 'iCatalogoId',
								enableKeyEvents : true,
								allowBlank : false,
								blankText : 'Seleccione el Sexo del usuario',
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
					    columnWidth: 0.55,
					    padding: '5 5 0 5',
					    border:false,	
					    items:[{
					    	border:false,
					    	bodyStyle:'background:#f5f5f5;',
					    	height: 290,
					        html: '<div class="panel panel-default" style="height:248px;">'+
						            '<div class="panel-heading" style="padding:7px !important;">'+
									    '<h3 class="panel-title" style="font-size:12px;" >Datos del Objetivo</h3>'+
									  '</div>'+
									  '<div class="panel-body" id="'+me.id+'_form_admin_user" ></div>'+
								'</div>'
							,listeners:{
									afterrender:function(thisPanel){
										me.createFormUser();										
									}
							}
								    }]
					}
    	       ];
		this.callParent(arguments);
	}
});