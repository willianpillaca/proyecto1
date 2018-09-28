Ext.define('librerias.components.modulos.view.Clientes.GrdClientes', {
	extend : 'Ext.panel.Panel',
	alias : 'widget.listClientes',
	initComponent : function() {
		console.log('clientes->>');
		var filters = {
    	        ftype: 'filters',
    	        encode: true, // json encode the filter query
    	        local: true,
    	    };
		function rowStyle(v){
			return '<div style="padding:4px 0px 4px 0px;color:#333;">'+(v?v:'')+'</div>';
		}
		
		var me=this;
		this.border=false;
		
		this.items={

            	xtype:'sireGrid'
            	,width: 'auto'
            	,features:[filters]
            	,border:false   
            	,id:'clentes_grid'
            	,bodyStyle:'background:#fff;padding:0px;'
            	,nameModel:'Usuario'
            	,fields:[{
    		        name: 'iUsuarioId',
    		        type: 'int'
    		    }, {
    		        name: 'vUsuarioUsername'
    		    }, {
    		        name: 'iUsuarioIndhabilitado'
    		    }, {
    		        name: 'vUsuarioEmail'
    		    }, {
    		        name: 'vUsuarioNombres'
    		    }, {
    		        name: 'dUsuarioFecnacimiento'
    		    }, {
    		        name: 'iUsuarioSexo'
    		    }, {
    		        name: 'vUsuarioApMaterno'
    		    }, {
    		        name: 'vUsuarioApPaterno'
    		    },{
    		    	name:'iUsuarioEstado'
    		    },{
    		    	name:'desEstado'
    		    	,mapping:'iUsuarioIndhabilitado'
    		    	,convert:function(v){
    		    		return (v==ESTADO_ACTIVO?'<img src="librerias/css/icons/aprobe_v1_16.png" title="Habilitado" />':'<img src="librerias/css/icons/no_aprobe_v1_16.png" title="Deshabilitado" />');
    		    	}
    		    }, 
    		    {
    		        name: 'nombreCompleto',
    		        mapping:'iUsuarioId',
    		        convert:function(v,r){
    		        	var nom=(r.data.vUsuarioApPaterno?r.data.vUsuarioApPaterno:'')+' '+(r.data.vUsuarioApMaterno?r.data.vUsuarioApMaterno:'')+' '+(r.data.vUsuarioNombres?r.data.vUsuarioNombres:'');
    		        	return nom;
    		        }
    		    }, {
    		        name: 'roles'
    		    }, {
    		        name: 'desRoles',
    		        mapping:'roles',
    		        convert:function(v,r){
    		        	var listRoles=new Array();
    		        	
    		        	Ext.each(v,function(item){
    		        		listRoles.push(item.rol.vRolNombre);
    		        	});
    		        	
    		        	var desRoles=listRoles.join(", ");
    		        	
    		        	return desRoles;
    		        }
    		    }
    		    ]
            ,readerStore:{
                type: 'json',
                root: 'data',
                idProperty: 'iUsuarioId'
//                	,
//                totalProperty: 'total'
            }
            ,loadStore:true
            ,url:'findallusuarios.app'
            ,columns: [
					{
						text:'ID User',
					    dataIndex: 'iUsuarioId',
					    width: 50,
					    hidden:true,
					    align:'center',
					    renderer:rowStyle,
					    filterable: true,
			            filter: {type: 'numeric'}
					}
					,
					{
						text:'Usuario',
					    dataIndex: 'vUsuarioUsername',
					    width: 120,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					}
					,
					{
						text:'Nombre Completo',
					    dataIndex: 'nombreCompleto',
					    flex:1,
					    width: 150,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					}
					,
					{
						text:'Roles',
					    dataIndex: 'desRoles',
					    flex:1,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					}
					,
					{
						text:'Habilitado',
					    dataIndex: 'desEstado',
					    width:70,
					    align:'center',
					    renderer:rowStyle
					}
                       ]	
            ,
            dockedItems : [{
				xtype : 'toolbar',
				dock : 'top',
				items : [
						{
							text : 'Nuevo',
							iconCls : 'new_user_16',
							handler : function() {
								ClientesManager.openAdminClientes({idGrid:'clentes_grid'});
							}
						}
						,
						{
							text : 'Editar',
							iconCls : 'edit_user_16',							
							disabled:true,							
						}
						,
						{
							text : 'Cambiar Contrase&ntilde;a',
							iconCls : 'key_user_16',							
							disabled:true							
						}
						,
						{
							text : 'Deshabilitar',
							iconCls : 'delete_user_16',							
							disabled:true,							
						}
						,
						{
							text : 'Habilitar',
							iconCls : 'enable_user_16',							
							disabled:true,							
						}
						
					]
			}]
            
            
    			
    	};
		
		this.callParent(arguments);
	}
});