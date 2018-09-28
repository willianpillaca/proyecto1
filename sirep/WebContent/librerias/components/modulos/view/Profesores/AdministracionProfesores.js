Ext.define('Profesores.AdministracionProfesores', {
	extend : 'Ext.panel.Panel',
	alias : 'widget.userProfesores',
	
	
	createFormProfesores:function(){
		console.log('hola willian->>>');
		var me=this;
		var pregunta;
		if(me.pregunta){
			pregunta=me.pregunta
		}
		console.log(me.pregunta)
		
		Ext.create('Ext.form.Panel',{
					renderTo:'form_admin_profesor'
					,border:false
					,layout:'form'
					,id:'formAdminProfesores'
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
							    value: (pregunta?pregunta.id:'')
							}
							,
					        {
					        	xtype:'textfield'
					        	,fieldLabel: 'Login de Usuario'
					        	,allowBlank:false					        	
					        }
					        ,
					        {
					        	xtype:'textfield'
					        	,fieldLabel: 'Apellido Paterno'
					        	,allowBlank:false				        	
					        }
					        ,
					        {
					        	xtype:'textfield'
					        	,fieldLabel: 'Apellido Materno'
					        	,name:'vUsuarioApMaterno'					        	
					        }
					        ,
					        {
					        	xtype:'textfield'
					        	,fieldLabel: 'Nombres'
					        	,allowBlank:false					        	
					        }
					        ,
					        {
					        	xtype:'textfield'
					        	,fieldLabel: 'Correo Electronico'
					        	,vtype:'email'
					        	,allowBlank:false					        	
					        }
					        ,
					        {
					        	xtype:'datefield'
					        	,fieldLabel: 'Fec. Nacimiento'					        	
					        }]
			
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
									    '<h3 class="panel-title" style="font-size:12px;" >Profesor</h3>'+
									  '</div>'+
									  '<div class="panel-body" id="form_admin_profesor" ></div>'+
								'</div>'
							,listeners:{
									afterrender:function(thisPanel){
										me.createFormPreguntas();										
									}
							}
								    }]
					},{
					    columnWidth: 0.45,
					    padding: '5 5 0 5',
					    border:false
					}
    	       ];
		this.callParent(arguments);
	}
});