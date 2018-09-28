//TabClientes de la Aplicacion Hiber Tadeo Moreno Tovilla
Ext.define('librerias.components.modulos.view.Clientes.PanelClientes', {
    extend: 'Ext.Panel',
	alias:'widget.panelGrdClientes',
	closable:   true,  
	title   :   'Clientes',
    layout:'fit',
	itemId:'TabListadoClientes',	
	initComponent: function(){
	    var me = this;
		me.items = Ext.create('librerias.components.modulos.view.Clientes.GrdClientes'); //Agregamos el Grid al PanelTab
		this.callParent();
    }
	

});