Ext.define('window.SirepWindow', {
	extend : 'Ext.window.Window',
	alias : 'widget.sirepWindow',
	initComponent : function() {
		console.log('sirepWin render to->'+APP_ID_SIREP_JS);
		this.minimizable=true;
		this.renderTo = APP_ID_SIREP_JS+'_main';
        this.constrain = true;
//        this.layout = 'fit';
		this.callParent(arguments);
	}
});