//TabClientes de la Aplicacion Hiber Tadeo Moreno Tovilla
Ext.define('librerias.components.modulos.view.Profesores.PanelProfesores', {
    extend: 'Ext.Panel',
	alias:'widget.panelGrdProfesores',
	closable:   true,  
	title   :   'Profesores',
    layout:'fit',
	itemId:'TabListadoProfesores',	
	initComponent: function(){
	    var me = this;
		me.items = Ext.create('librerias.components.modulos.view.Profesores.GrdProfesores'); //Agregamos el Grid al PanelTab
		this.callParent();
    }
	

});