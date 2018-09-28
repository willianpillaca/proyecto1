Ext.define('Preguntas.AdministracionTemas', {
	extend : 'Ext.panel.Panel',
	alias : 'widget.userTemas',
	
	
	/**guardar Pregunta**/
	saveTema: function(options, idCurso){		
		if(Ext.getCmp('formAdminTemas').getForm().isValid()){			
			var formValues=Util.serialize('formAdminTemas');			
			Ext.apply(formValues);			
			formValues.idCurso=idCurso;			
			formValues.tipo=1;
			formValues.estado=1;
			Ext.getCmp('gridTemasPorCurso').body.mask('Espere un momento por favor.');			
			new Util.Ajax.runAjax({
				url : 'savetemacurso.app',
				method : 'POST',
				async : true,
				params : formValues
				,success:function(result){
					var response=Ext.decode(result.responseText);
					Ext.getCmp('gridTemasPorCurso').body.unmask();
					if(response.success){
						if(Ext.getCmp('gridTemasPorCurso')){
							Ext.getCmp('gridTemasPorCurso').getSelectionModel().deselectAll();
//							Ext.getCmp('gridTemasPorCurso').store.load();
							Ext.getCmp('gridTemasPorCurso').store.load({
		        	    		   params:{idCurso: idCurso}
		        	    		});
						}
						
						if(Ext.getCmp('gridTemasPorCurso')){							
							Ext.getCmp('winTemaEditSave').close();
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
	
	createFormTema:function(){
//		CKEDITOR.replace( 'editor1' );		
		var me=this;
		var tema;
		if(me.tema){
			tema=me.tema
		}	
		
		
		Ext.create('Ext.form.Panel',{
					renderTo:'form_admin_tema'
					,border:false					
					,layout:'form'
					,id:'formAdminTemas'
					,width:680
					,height:400
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
							    name: 'idTema',
							    value: (tema?tema.idTema:'')
							},							
							{
					            xtype: 'textfield',
					            name: 'tema',
					            id: 'txtTema',
					            fieldLabel: 'Titulo',
					            allowBlank: false  // requires a non-empty value
					        },
					        {
					        	xtype:'htmleditor'
					        	//,fieldLabel: 'Editar Examen'					        	
					        	,enableColors: false
					        	,name:'descripcion'
					            ,enableAlignments: false
					        	,width:580
					        	,padding: '0 0 0 5'
					        	,height:250
					        	,draggable:true
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
					    	height:400,
					    	width:700,
					        html: '<div class="panel panel-default" style="height:450px; width:700px;">'+
						            '<div class="panel-heading" style="padding:5px !important;">'+
									    '<h3 class="panel-title" style="font-size:12px;" >Ingrese el tema</h3>'+
									  '</div>'+
									  '<div class="panel-body" id="form_admin_tema" ></div>'+
								'</div>'
							,listeners:{
									afterrender:function(thisPanel){
										me.createFormTema();										
									}
							}
								    }
					
    	       ];
		this.callParent(arguments);
	}
});