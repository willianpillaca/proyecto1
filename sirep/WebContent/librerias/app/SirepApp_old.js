Ext.Loader.setConfig({enabled: true});
Ext.Loader.setPath('Ext.ux', '/ext/lib/ext_4_2_1/ux');
Ext.require([
	             'Ext.grid.*',
	             'Ext.tree.*',
	             'Ext.window.Window',
	             'Ext.container.Viewport',
	             'Ext.layout.container.Border',
	             'Ext.state.*',
	             'Ext.data.*',
	             'Ext.grid.plugin.CellEditing',
	             'Ext.ux.grid.FiltersFeature',
	             'Ext.toolbar.Paging',
	             'Ext.ux.ajax.JsonSimlet',
	             'Ext.ux.ajax.SimManager'
	         ]);

var APP_ID_SIREP_JS = 'SIREPAPP';

Ext.onReady(function(){
	
	
	
	var myMask = new Ext.LoadMask(Ext.getBody(), {msg:"Cargando..."});
	myMask.show();
			//background:url('+BG_APP+');
	
           Ext.state.Manager.setProvider(Ext.create('Ext.state.CookieProvider'));
           Ext.create('Ext.container.Viewport', {
	                 layout: {
	                     type: 'border',
	                     padding: '0'
	                 },
	                 listeners:{
	                	 
	                	 afterrender:function(){
	                		 new Util.Ajax.runAjax({
			          				url : 'findusuariobypk.app',
			          				method : 'POST',
			          				async : true,
			          				params : {
			          					iUsuarioId:USER_ID_JSP
			          				}
			          				,success:function(result){
			          					var response=Ext.decode(result.responseText);
			          					myMask.hide();
			          					if(response.data){
			          						if(response.data.vUsuarioBgApplication){
			          							$('#SIREPAPP_panelCenter-body').css('background','url('+response.data.vUsuarioBgApplication+')');
			          						}else{
			          							$('#SIREPAPP_panelCenter-body').css('background','url('+BG_APP_DEFAULT+')');
			          						}
			          					}else{
			          						$('#SIREPAPP_panelCenter-body').css('background','url('+BG_APP_DEFAULT+')');
			          					}
			          				}
			          			});
	                		 
	                	 }
	                	 
	                 },
	       items: [
	               {
	            	   region:'west',
	            	   width:260,
	            	   xtype: 'panel',
	            	   title: 'MENU PRINCIPALL',
	            	   split: true,
	                   collapsible: true,
	                   margins: '3,3,0,0',
	                   layout: 'accordion',
	                   items:[
							{   xtype: 'treepanel',
							    title: 'Administracion',							    
							    height: 212,							    
							    forceLayout: true,
							    collapsed: true,
							    collapsible: true,
							    rootVisible: false,
							    border: false,
							    autoWidth: true,
							    listeners:{//Listeners apuntando a cada node
                                    itemclick:function(view, record, item, index, e)
                                    {                                    	
                                    	console.log('record->>>');
                                    	console.log(record);
                                    	var id= record.data.id;                                    	
                                    	/**nodo relacionado a Alumnos**/
                                    	if (id == 'nodusu')
                                        {                                    		
                                            addTabListadoClientes();
                                        }
                                    	
                                    	/**nodo relacionado a mis cursos**/
                                    	if (id == 'nodcurso')
                                        {                                    	
                                            addTabListadoCursos();
                                        }
                                    	if (id == 'nodMisNotas')
                                        {                                    		
                                            addTabMisNotas();
                                        }
                                    	
                                    	/**Nodo relacionado a Profesores**/
                                    	if (id == 'nodprof')
                                        {                                    	
                                            addTabListadoProfesores();
                                        }
                                    	
                                    	/**Nodo relacionado a Preguntas**/
                                    	if (id == 'nodpreg')
                                        {                                  
                                            addTabListadoPreguntas();
                                        }
                                    	/**Nodo Bandeja Alumno**/
                                    	if (id == 'nodAlumnoCurso')
                                        {                                  
                                            addTabBandejaAlumno();
                                        }
                                    	
                                    }
							    },
							    root: {
							        text: '',
							        isTarget: false,
							        expanded: true,
							        checked: false,
							        allowDrag: false,
							        allowDrop: false,
							        editable: false,
							        qtip: 1,
							        children: [
							            
							            {
							                text: 'Alumnos', 
							                id: 'nodousuario',
							                children: [
							                    {                 
							                    	id:'nodusu',
							                    	text: 'Administración de Alumnos',							                    	
							                    	leaf: true,
							                    },
							                    {                 
							                    	id:'nodAlumnoCurso',
							                    	text: 'Bandeja de Alumno',							                    	
							                    	leaf: true,
							                    }
							                ]
							            },
							            {
							                text: 'Cursos',
							                id: 'nodocurso',
							                children: [
							                    {
							                        id: 'nodcurso',
							                        text: 'Mis Cursos',
							                        leaf: true
							                    },
							                    {
							                        id: 'nodMisNotas',
							                        text: 'Mis Notas',
							                        leaf: true
							                    }
							                ]
							            },
							            {
							                text: 'Profesores',
							                id: 'nodoprofesor',
							                children: [
							                    {
							                        id:'nodprof',
							                        text: 'Administración de Profesores',
							                        leaf: true
					                    		}
							                ]
							            },
							            {
							                text: 'Preguntas',
							                id: 'nodopregunta',
							                children: [
							                    {
							                        id:'nodpreg',
							                        text: 'Administración de Preguntas',
							                        leaf: true
					                    		}
							                ]
							            },
							            {
							                text: 'Exámen Online',
							                id: 'nodoExamenes',
							                children: [
							                    {
							                        id:'nodoMisCursos',
							                        text: 'Mis Cursos',
							                        leaf: true
					                    		},
					                    		{
							                        id:'nodoMisNotas',
							                        text: 'Mis Notas',
							                        leaf: true
					                    		}
							                ]
							            }
							            
							        ]
								
							    },
							    loader: {
							
							    }
							}
	                          ]
	               },
	               {
	                     region: 'north',
	                     height: 50,
	                     resizable:false,
						 html:[
								'<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">'+
								        '<div id ="menu_opciones_ginnet" style="padding:0px 10px 0px 10px; z-index:100"><div class="navbar-collapse collapse">'+
								         ' <ul class="nav navbar-nav">'+
								         	MENU_USER_OPCIONES_JSP+									
								            ' <li class="dropdown" style="position:absolute;right:0px;margin:0px 10px 0px 0px;">'+
//								            ' <a href="#" class="dropdown-toggle" data-toggle="dropdown">'+USER_JSP+' ('+ROL_NAME_JSP+') <b class="caret">SALIR</b></a>'+
								            ' <a href="logout.app">SALIR</a>'+	
								             '<ul class="dropdown-menu">'+
								              ' <li><a href="#" onclick="#">Editar los datos mi cuenta</a></li>'+
								              ' <li><a href="#" onclick="SeguridadManager.openCambiarPassword({tipo:MODE_CHANGE_PASS_PERFIL})">Cambiar Contrase&ntilde;a</a></li>'+
								              ' <li><a href="#" onclick="SeguridadManager.personalizarTema()">Personalizar Tema</a></li>'+
								              ' <li><a href="logout.app">Salir del Sistema</a></li>'+
								             '</ul>'+
								           '</li>'+
								         ' </ul>'+
								       ' </div>'+
								       ' </div>'+
								  '</div>'
									]
	                     
	                 },
	                 TabPanelMain
//	               ,  {
//	                     region: 'center',
//	                     xtype: 'panel',
//	                     border:false,	                     
//		                 style:'border:0px;margin:0px;padding:0px;',
//		                 id: APP_ID_SIREP_JS+ '_panelCenter',
//		                 bodyStyle:'border:0px;',
//		                 html:'<div id="'+APP_ID_SIREP_JS+'_main" style="height:100%;width:100%;margin:0px;padding:0px;"></div>'
//		                	, dockedItems: [{
//		                		    xtype: 'toolbar',
//		                		    dock: 'bottom',
//		                		    autoScroll:true,
//		                		    id: APP_ID_SIREP_JS + '_buttomBar',
//		                		    items:['->',{
//		                		    	xtype:'component'
//		                		    		,html:'<div style="padding:8px;"><strong>Fecha de Proceso: 201403</strong></div>'
//		                		    	
//		                		    }]
//		                		}]
//	                 }
	                 ]
	             });
	         });

function openWindow(){
	
	Util.UiMessageBox({msg:'Este es un mensaje de prueba'})
	
}

/**funcion para listado de usuarios**/
function addTabListadoClientes(){
	
    var tab=this.TabPanelMain.getComponent('TabListadoClientes');    
	if(!tab){ //si no existe lo creamos			
            tab = Ext.create('librerias.components.modulos.view.Clientes.PanelClientes', {});
            this.TabPanelMain.add(tab); //Se agrega el Panel Cliente al TabMain            
            this.TabPanelMain.doLayout(); //Redibujado del Panel            
            this.TabPanelMain.setActiveTab(tab); //Activamos el Tab
   		
        } 
    this.TabPanelMain.setActiveTab(tab); //Se activa el Tab Clickeado 				     		 
}

/**funcion para listado de cursos**/
function addTabListadoCursos(){	
    var tab=this.TabPanelMain.getComponent('TabListadoCursos');    
	if(!tab){ //si no existe lo creamos			
            tab = Ext.create('librerias.components.modulos.view.Cursos.PanelCursos', {});
            this.TabPanelMain.add(tab); //Se agrega el Panel Cliente al TabMain            
            this.TabPanelMain.doLayout(); //Redibujado del Panel            
            this.TabPanelMain.setActiveTab(tab); //Activamos el Tab
   		
        } 
    this.TabPanelMain.setActiveTab(tab); //Se activa el Tab Clickeado 				     		 
}

/**funcion para listado de profesores**/
function addTabListadoProfesores(){	
    var tab=this.TabPanelMain.getComponent('TabListadoProfesores');    
	if(!tab){ //si no existe lo creamos			
            tab = Ext.create('librerias.components.modulos.view.Profesores.PanelProfesores', {});
            this.TabPanelMain.add(tab); //Se agrega el Panel Cliente al TabMain            
            this.TabPanelMain.doLayout(); //Redibujado del Panel            
            this.TabPanelMain.setActiveTab(tab); //Activamos el Tab
   		
        } 
    this.TabPanelMain.setActiveTab(tab); //Se activa el Tab Clickeado 				     		 
}

/**funcion para listado de preguntas**/
function addTabListadoPreguntas(){	
    var tab=this.TabPanelMain.getComponent('TabListadoPreguntas');    
	if(!tab){ //si no existe lo creamos			
            tab = Ext.create('librerias.components.modulos.view.Preguntas.PanelPreguntas', {});
            this.TabPanelMain.add(tab); //Se agrega el Panel Cliente al TabMain            
            this.TabPanelMain.doLayout(); //Redibujado del Panel            
            this.TabPanelMain.setActiveTab(tab); //Activamos el Tab
   		
        } 
    this.TabPanelMain.setActiveTab(tab); //Se activa el Tab Clickeado 				     		 
}


/**funcion para listado de Bandeja Alumno**/
function addTabBandejaAlumno(){	
    var tab=this.TabPanelMain.getComponent('TabBandejaAlumno');    
	if(!tab){ //si no existe lo creamos			
            tab = Ext.create('librerias.components.modulos.view.Alumnos.PanelAlumnos', {});
            this.TabPanelMain.add(tab); //Se agrega el Panel Cliente al TabMain            
            this.TabPanelMain.doLayout(); //Redibujado del Panel            
            this.TabPanelMain.setActiveTab(tab); //Activamos el Tab
   		
        } 
    this.TabPanelMain.setActiveTab(tab); //Se activa el Tab Clickeado 				     		 
}





this.TabPanelMain = Ext.create('librerias.app.TabMain', {
	region: 'center',
	id:'TabMain'
});