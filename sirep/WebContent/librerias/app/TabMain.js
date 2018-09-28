//TabPrincipal de la Aplicacion
Ext.define('librerias.app.TabMain', {
    extend: 'Ext.tab.Panel',//<<----Herencia
	maxTabWidth: 230,
    border: false,
	activeTab   : 0,  
    enableTabScroll :  true, //hacemos que sean recorridas  
    
    initComponent: function() {    	
        this.tabBar = {
            border: false,
			
        };
        
        this.callParent();
    },
	items: [{
            title: 'Pagina Principal',
            iconCls: 'tabs',
            html:'<body scroll="no"> <!-- Start page content --> <div id="start-div">'+
                 '<div style="float:left;" ><img src="librerias/imagenes/imagen_test.jpg" /></div>'+
                 '<div style="margin-left:100px;">'+
                 '<h2 style="display: block; border-bottom: 1px solid teal;padding-bottom: 4px;">Bienvenido: '+NOMBRE_USER_JSP+'</h2>'+
                '<p> <b>CARGO: '+ROL_NAME_JSP+' </b> </p>'+
            '</div>   	</div> </body>'

        }]
	
});