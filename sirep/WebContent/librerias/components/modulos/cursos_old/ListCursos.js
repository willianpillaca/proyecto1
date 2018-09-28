Ext.define('cursos.ListCursos', {
	extend : 'Ext.panel.Panel',
	alias : 'widget.listCursos',
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
            	,nameModel:'Curso'
            	,fields:[{
    		        name: 'id',
    		        type: 'int'
    		    }, {
    		        name: 'nombre'
    		    }, {
    		        name: 'descripcion'
    		    }, {
    		        name: 'descripcionEvaluacion',
    		        mapping: 'tipoEvaluacion',
    		        convert:function(v,r){    		        	
    		        	if(v=='1'){
    		        		return 'tipo 1';
    		        	}
    		        	if(v==2){
    		        		return 'tipo 2';
    		        	}    		        	
    		        }
    		    }, 
//    		    {
//    		        name: 'fechaDefinicion',    		        	
//    		    	mapping: 'fechaDefinicion',
//    		    	convert: function(v,r){
//    		    		var fecha = new Date(v);
//    		    		return fecha.toLocaleDateString();
//    		    	}
//    		    },
//    		    {
//    		        name: 'fechaCierre',
//    		        mapping: 'fechaCierre',
//    		    	convert: function(v,r){
//    		    		var fecha = new Date(v);
//    		    		return fecha.toLocaleDateString();
//    		    	}
//    		    }, 
    		    {
    		        name: 'costo'
    		    }, {
    		    	name: 'descripcionProfesor',
    		        mapping: 'idProfesor',
    		        convert: function(v, r){
    		        	if(v=='1'){
    		        		return 'profesor1';
    		        	}
    		        	if(v==2){
    		        		return 'profesor1';
    		        	}
    		        }
    		    }]
            ,readerStore:{
                type: 'json',
                root: 'data',
                idProperty: 'id'
//                	,
//                totalProperty: 'total'
            }
            ,loadStore:true
            ,url:'findallcursos.app'
            ,columns: [
					{
						text:'ID User',
					    dataIndex: 'idProyecto',
					    width: 50,
					    hidden:true,
					    align:'center',
					    renderer:rowStyle,
					    filterable: true,
			            filter: {type: 'numeric'}
					}
					,
					{
						
						text:'Nombre Proyecto',
					    dataIndex: 'nombreProyecto',
					    width: 150,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					}
					,
					{
						text:'Descripcion',
					    dataIndex: 'descripcionProyecto',					    
					    width: 350,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					},
					{
						text:'Estado',
					    dataIndex: 'descripcionEstado',					    
					    width: 100,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					},					
					{
						text:'Fecha Definición',
					    dataIndex: 'fechaDefinicion',					    
					    width: 120,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					},
					{
						text:'Fecha Cierre',
					    dataIndex: 'fechaCierre',					    
					    width: 120,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					},
					{
						text:'Número Participantes',
					    dataIndex: 'numeroParticipantes',					    
					    width: 140,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					},
					{
						text:'Tipo de Proyecto',
					    dataIndex: 'descripcionTipoProyecto',					    
					    width: 120,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					},
					{
						text:'Tipo de Retorno',
					    dataIndex: 'descripcionTipoRetorno',					    
					    width: 120,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					},
					{
						text:'Tipo de Devolucion',
					    dataIndex: 'tiempoDevolucion',					    
					    width: 130,
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
							text : 'Nuevo Proyecto',
							iconCls : 'new_proyecto_16',
							id:me.id+'_grid_action_new',
							handler : function() {
								ProyectosManager.openAdminProyecto({idGrid:me.id+'_grid'});
							}
						}
						,
						{
							text : 'Editar Curso',
							iconCls : 'edit_proyecto_16',
							id:me.id+'_grid_action_edit',
							disabled:true,
							handler : function() {
								var grid = Ext.getCmp(me.id+'_grid');
								var record = grid.getSelectionModel().getSelection()[0];
								var proyecto;
								
								if(record){
									proyecto=record.data;
								}
								
								SeguridadManager.openAdminUser({
																	idGrid:me.id+'_grid'
																	,title:'Editar Curso'
																	,proyecto:proyecto
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