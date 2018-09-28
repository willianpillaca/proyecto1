//TabClientes de la Aplicacion Hiber Tadeo Moreno Tovilla
Ext.define('librerias.components.modulos.view.Alumnos.PanelAlumnos', {
    extend: 'Ext.Panel',
	alias:'widget.panelGrdAlumnos',
	closable:   true,  
	title   :   'Cursos Inscritos',
    layout:'fit',
	itemId:'TabListadoCursosAlumno',	
	initComponent: function(){
	    var me = this;
		me.items = Ext.create('librerias.components.modulos.view.Alumnos.GrdCursosAlumno'); //Agregamos el Grid al PanelTab
		this.callParent();
    }
	

});