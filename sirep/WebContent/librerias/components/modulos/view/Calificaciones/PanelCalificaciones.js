//TabClientes de la Aplicacion Hiber Tadeo Moreno Tovilla
Ext.define('librerias.components.modulos.view.Cursos.PanelCursos', {
    extend: 'Ext.Panel',
	alias:'widget.panelGrdCursos',
	closable:   true,  
	title   :   'Cursos',
    layout:'fit',
	itemId:'TabListadoCursos',	
	initComponent: function(){
	    var me = this;
		me.items = Ext.create('librerias.components.modulos.view.Cursos.GrdCursos'); //Agregamos el Grid al PanelTab
		this.callParent();
    }
	

});