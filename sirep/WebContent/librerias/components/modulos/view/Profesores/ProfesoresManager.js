Ext.ns('ProfesoresManager');
ProfesoresManager={
		
		openAdminProfesor:function(option){
		console.log('option profes0res->>>');
		console.log(option);
		console.log('profesor->>>>');
		var profesor=option.profesor;
		console.log(profesor);
		var config={

                title: 'Crear Nuevo Profesor',
                width: 800,
                id:'winProfesorEditSave',
                modal:true,
                height: 340,
                resizable:false,
                layout: 'fit',
                defaultType: 'container',
                bodyStyle:'background:#f5f5f5;padding:4px;',
                items:[
                       {
                       	xtype:'userProfesores'
                       	,id:'userProfesores'	
                       	,bodyStyle:'background:#f5f5f5;'
                       	,profesor:Profesor
                       }
                       ]
		,buttons:[
		          {
		        	  text:'Grabar'
		              ,scale:'medium'
		              ,iconCls:'grabar_24'
		              ,handler:function(){
		            	  console.log('dentro de guardar->>>>>');
//		            	  Ext.getCmp('userAdmin').saveUser({idWin:'winPreguntasEditSave',idGrid:option.idGrid});
		              }
		          }
		          ]
			
		};		
		Ext.create('Ext.window.Window', config).show();		
	}
		
};