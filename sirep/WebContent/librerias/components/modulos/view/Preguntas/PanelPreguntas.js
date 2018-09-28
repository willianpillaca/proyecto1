/**@Autor: Willian Pillaca Meneses: Systema Radamanthys**/
Ext.define('librerias.components.modulos.view.Preguntas.PanelPreguntas', {
    extend: 'Ext.Panel',
	alias:'widget.panelGrdPreguntas',
	closable:   true,  
	title   :   'Preguntas',
    layout:'fit',
	itemId:'TabListadoPreguntas',	
	initComponent: function(){
	    var me = this;
		me.items = Ext.create('librerias.components.modulos.view.Preguntas.GrdPreguntas'); //Agregamos el Grid al PanelTab
		this.callParent();
    }	

});