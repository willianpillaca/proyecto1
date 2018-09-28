Ext.define('objetivos.ListProyectos', {
	extend : 'Ext.panel.Panel',
	alias : 'widget.listObjetivos',
	initComponent : function() {
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
    	;
    	this.items={

            	xtype:'sireGrid'
            	,width: 789
            	,features:[filters]
            	,border:false
            	,id:me.id+'_grid'
            	,bodyStyle:'background:#fff;padding:0px;'
            	,nameModel:'Usuario'
            	,fields:[{
    		        name: 'param1'
    		    }, {
    		        name: 'param2'
    		    }, {
    		        name: 'param3'
    		    }   		    
    		    ]
            ,readerStore:{
                type: 'json',
                root: 'data',
                idProperty: 'param1'
//                	,
//                totalProperty: 'total'
            }
            ,loadStore:true
            ,url:'findallobjetivos.app'
            ,columns: [					
					{
						text:'Objetivo',
					    dataIndex: 'param1',
					    width: 200,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					}
					,
					{
						text:'Tipo de Objetivo',
					    dataIndex: 'param2',
					    flex:1,
					    width: 150,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					}
					,
					{
						text:'Area',
					    dataIndex: 'param3',
					    flex:1,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					}
					
                       ]	
            ,
            dockedItems : [{
				xtype : 'toolbar',
				dock : 'top',
				items : [
						{
							text : 'Nuevo Objetivo',
							iconCls : 'new_objetivo_16',
							id:me.id+'_grid_action_new',
							handler : function() {
								ObjetivosManager.openAdminObjetivo({idGrid:me.id+'_grid'});
							}
						}
						,
						{
							text : 'Editar Objetivo',
							iconCls : 'edit_objetivo_16',
							id:me.id+'_grid_action_edit',
							disabled:true,
							handler : function() {
								var grid = Ext.getCmp(me.id+'_grid');
								var record = grid.getSelectionModel().getSelection()[0];
								var usuario;
								
								if(record){
									usuario=record.data;
								}
								
								SeguridadManager.openAdminUser({
																	idGrid:me.id+'_grid'
																	,title:'Editar Usuario'
																	,usuario:usuario
																});
							}
						}						
					]
			}]
            ,listeners:{
            	select:function(thisGrid, record, index, eOpts){
            		Ext.getCmp(me.id+'_grid_action_edit').setDisabled(false);
            		Ext.getCmp(me.id+'_grid_action_key').setDisabled(false);
            		if(record.data.iUsuarioIndhabilitado==ESTADO_ACTIVO){
            			Ext.getCmp(me.id+'_grid_action_disabled').setDisabled(false);
            			Ext.getCmp(me.id+'_grid_action_enable').setDisabled(true);
            		}else{
            			Ext.getCmp(me.id+'_grid_action_enable').setDisabled(false);
            			Ext.getCmp(me.id+'_grid_action_disabled').setDisabled(true);
            		}
            	},
            	deselect:function( thisGrid, record, index, eOpts ){
            		Ext.getCmp(me.id+'_grid_action_edit').setDisabled(true);
            		Ext.getCmp(me.id+'_grid_action_key').setDisabled(true);
            		Ext.getCmp(me.id+'_grid_action_disabled').setDisabled(true);
            		Ext.getCmp(me.id+'_grid_action_enable').setDisabled(true);
            	}
            
            }
            
    			
    	};
		this.callParent(arguments);
	}
});