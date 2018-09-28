Ext.ns('MatrizManager');
MatrizManager={
		
	openAdminUser:function(option){
		var usuario=option.usuario;
		console.log(usuario);
		var config={

                title: option.title || 'Crear Nuevo Usuario',
                width: 800,
                id:'winUsuariosEditSave',
                modal:true,
                height: 340,
                resizable:false,
                layout: 'fit',
                defaultType: 'container',
                bodyStyle:'background:#f5f5f5;padding:4px;',
                items:[
                       {
                       	xtype:'userAdmin'
                       	,id:'userAdmin'	
                       	,bodyStyle:'background:#f5f5f5;'
                       	,usuario:usuario
                       }
                       ]
				,buttons:[
		          {
		        	  text:'Grabar'
		              ,scale:'medium'
		              ,iconCls:'grabar_24'
		              ,handler:function(){
		            	  Ext.getCmp('userAdmin').saveUser({idWin:'winUsuariosEditSave',idGrid:option.idGrid});
		              }
		          }
		          ]
			
		};
		
		Ext.create('Ext.window.Window', config).show();
		
	},
		
	
	
	
	
		
};