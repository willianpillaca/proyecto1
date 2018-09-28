Ext.define('librerias.components.modulos.view.Profesores.GrdProfesores', {
	extend : 'Ext.panel.Panel',
	alias : 'widget.listProfesores',
	initComponent : function() {
		console.log('profesores->>');
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
        		,id: 'profesores_grid'
            	,features:[filters]
            	,border:false            	
            	,bodyStyle:'background:#fff;padding:0px;'
            	,nameModel:'Usuario'
            	,fields:[{
    		        name: 'id',
    		        type: 'int'
    		    }, {
    		        name: 'codPersona'
    		    }, {
    		        name: 'codEspecialidad'
    		    }, {
    		        name: 'codInstitucion'
    		    }, {
    		        name: 'anioFinalizo'
    		    }, {
    		        name: 'codGradoAcademico'
    		    }, {
    		        name: 'codNacionalidad'
    		    }    		    
    		    ]
            ,readerStore:{
                type: 'json',
                root: 'data',
                idProperty: 'id'
//                	,
//                totalProperty: 'total'
            }
            ,loadStore:true
            ,url:'findallprofesores.app'
            ,columns: [
					{
						text:'ID Curso',
					    dataIndex: 'id',
					    width: 50,
					    hidden:true,
					    align:'center',
					    renderer:rowStyle,
					    filterable: true,
			            filter: {type: 'numeric'}
					}
					,
					{
						text:'Codigo',
					    dataIndex: 'codPersona',
					    width: 120,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					}
					,
					{
						text:'Especialiad',
					    dataIndex: 'codEspecialidad',
					    flex:1,
					    width: 150,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					}
					,
					{
						text:'Institucion',
					    dataIndex: 'codInstitucion',
					    flex:1,
					    renderer:rowStyle,
			            filter: {
			                type: 'string'
			            }
					}
					,
					{
						text:'Año Finalizo',
					    dataIndex: 'anioFinalizo',
					    width:70,
					    align:'center',
					    renderer:rowStyle
					},
					{
						text:'Grado Academico',
					    dataIndex: 'codGradoAcademico',
					    width:70,
					    align:'center',
					    renderer:rowStyle
					},
					{
						text:'Nacionalidad',
					    dataIndex: 'codNacionalidad',
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
								ProfesoresManager.openAdminProfesor({idGrid:'profesores_grid'});
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