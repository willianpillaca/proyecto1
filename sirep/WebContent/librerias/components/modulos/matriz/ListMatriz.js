Ext.define('matriz.ListMatriz', {
	extend : 'Ext.panel.Panel',
	alias : 'widget.listMatriz',
	initComponent : function() {
		var filters = {
    	        ftype: 'filters',
    	        	 encode: true, // json encode the filter query
    	             local: true,
    	    };
		
	
		
		Ext.define("ModelProyectos",{
	        extend : "Ext.data.Model",
	        fields  : [
	            {name: 'codigo', type :'string'},
	            {name: 'descripcion', type :'string'},
	            {name: 'param1', type:'string'},
	            {name: 'param2', type:'string'},
	            {name: 'param3', type:'string'},
	            {name: 'param4', type:'string'},
	            {name: 'param5', type:'string'},
	            {name: 'param6', type:'string'},
	            {name: 'param7', type:'string'},
	            {name: 'param8', type:'string',
	            	convert:function(v){
	            		console.log('v->>'+v);
	            		if(v==1){
	            			return '<span style="color: #A82E06">'+v+'</span>';
	            		}
	            		else if(v==3){
	            			return '<span style="color: #F7FE2E">'+v+'</span>';
	            		}
	            		else if(v==9){
	            			return '<span style="color: #298A08">'+v+'</span>';
	            		}
              		  
    		    	 }
	            },
	            {name: 'param9', type:'string',
	            	convert:function(v){
	            		console.log('v->>'+v);
	            		if(v==1){
	            			return '<span style="color: #A82E06">'+v+'</span>';
	            		}
	            		else if(v==3){
	            			return '<span style="color:#F7FE2E">'+v+'</span>';
	            		}
	            		else if(v==9){
	            			return '<span style="color: #298A08">'+v+'</span>';
	            		}
              		  
    		    	 }
	            },
	            {name: 'param10', type:'string',
	            	convert:function(v){
	            		console.log('v->>'+v);
	            		if(v==1){
	            			return '<span style="color: #A82E06">'+v+'</span>';
	            		}
	            		else if(v==3){
	            			return '<span style="color: #F7FE2E">'+v+'</span>';
	            		}
	            		else if(v==9){
	            			return '<span style="color: #298A08">'+v+'</span>';
	            		}
              		  
    		    	 }
	            },
	            {name: 'param11', type:'string',
	            	convert:function(v){
	            		console.log('v->>'+v);
	            		if(v==1){
	            			return '<span style="color: #A82E06">'+v+'</span>';
	            		}
	            		else if(v==3){
	            			return '<span style="color: #F7FE2E">'+v+'</span>';
	            		}
	            		else if(v==9){
	            			return '<span style="color: #298A08">'+v+'</span>';
	            		}
              		  
    		    	 }
	            },
	            {name: 'param12', type:'string',
	            	convert:function(v){
	            		console.log('v->>'+v);
	            		if(v==1){
	            			return '<span style="color: #A82E06">'+v+'</span>';
	            		}
	            		else if(v==3){
	            			return '<span style="color: #F7FE2E">'+v+'</span>';
	            		}
	            		else if(v==9){
	            			return '<span style="color: #298A08">'+v+'</span>';
	            		}
              		  
    		    	 }
	            }
	        ]
	    });
	 
	    // define almacenador local con informacion local java Script
	    var storeProyectos = Ext.create("Ext.data.Store",{
	        model : "ModelProyectos",
	        data  : [
             	{"codigo" : 'INDICADORES DE LA EMPRESA','descripcion':'','param1':'', 'param2':'', 'param3':'', 'param4':'', 'param5':'', 'param6':'', 'param7':'','param8':'','param9':'','param10':'','param11':'','param12':''},
	            {"codigo" : 'Market Share Cemento','descripcion':'1','param1':'', 'param2':'%', 'param3':'MT', 'param4':'30,6%', 'param5':'30,1%', 'param6':'30,5%',  'param7':'30,7%','param8':'1','param9':'3','param10':'3','param11':'1','param12':'9'},
	            {"codigo" : 'Market Share Hormigón (m3)','descripcion':'1','param1':'', 'param2':'%', 'param3':'ME', 'param4':'30,7%', 'param5':'30,1%', 'param6':'32%', 'param7':'30,9%','param8':'3','param9':'1','param10':'1','param11':'3','param12':'9'},
	            {"codigo" : 'Volumen Segmento P','descripcion':'1','param1':'', 'param2':'%', 'param3':'ME', 'param4':'', 'param5':'', 'param6':'', 'param7':'','param8':'3','param9':'9','param10':'3','param11':'9','param12':'1'},
	            {"codigo" : 'Market Share PPEE','descripcion':'1','param1':'', 'param2':'%', 'param3':'MT', 'param4':'35,3%', 'param5':'27,5%', 'param6':'33,4%', 'param7':'32,3%','param8':'3','param9':'1','param10':'9','param11':'3','param12':'1'},
	            {"codigo" : 'MOMD Segmento P','descripcion':'2','param1':'', 'param2':'UF/m3', 'param3':'MT', 'param4':'', 'param5':'', 'param6':'', 'param7':'','param8':'1','param9':'3','param10':'9','param11':'3','param12':'3'},
	            {"codigo" : 'MOMD Urbano ','descripcion':'2','param1':'', 'param2':'UF/m3', 'param3':'MT', 'param4':'0,7', 'param5':'', 'param6':'', 'param7':'','param8':'9','param9':'1','param10':'3','param11':'3','param12':'9'},
	            {"codigo" : '% Penetración VAP País Urbano','descripcion':'1','param1':'', 'param2':'UF/m3', 'param3':'MT', 'param4':'', 'param5':'', 'param6':'', 'param7':'','param8':'9','param9':'1','param10':'1','param11':'9','param12':'3'},
	            {"codigo" : '% puzolana (CK ratio)','descripcion':'1','param1':'', 'param2':'%', 'param3':'ME', 'param4':'28,4%', 'param5':'27,6%', 'param6':'25%', 'param7':'','param8':'1','param9':'3','param10':'9','param11':'1','param12':'3'},
	            {"codigo" : 'Precios NHPM','descripcion':'2','param1':'', 'param2':'Cement/KK', 'param3':'MT', 'param4':'', 'param5':'', 'param6':'', 'param7':'','param8':'9','param9':'3','param10':'3','param11':'3','param12':'1'},
	            {"codigo" : 'Índice de Satisfacción de Clientes (semanal)','descripcion':'2','param1':'', 'param2':'UF / ton', 'param3':'MT', 'param4':'2,7185', 'param5':'2,68', 'param6':'2,64', 'param7':'','param8':'1','param9':'1','param10':'3','param11':'9','param12':'1'},
	            {"codigo" : 'Índice de Satisfacción de Clientes (anual)','descripcion':'1','param1':'', 'param2':'%', 'param3':'MT', 'param4':'', 'param5':'', 'param6':'', 'param7':'','param8':'1','param9':'9','param10':'9','param11':'3','param12':'1'},
	            {"codigo" : 'INDICADORES DEL AREA','descripcion':'','param1':'', 'param2':'', 'param3':'', 'param4':'', 'param5':'', 'param6':'', 'param7':'','param8':'3','param9':'1','param10':'1','param11':'1','param12':'1'},
	            {"codigo" : 'Reclamos Clientes Cemento (mensual)','descripcion':'1','param1':'', 'param2':'%', 'param3':'ME', 'param4':'', 'param5':'', 'param6':'', 'param7':'','param8':'3','param9':'9','param10':'1','param11':'2','param12':'9'},
	            {"codigo" : '% Ventas directas sobre el total de distribución','descripcion':'1','param1':'', 'param2':'%', 'param3':'ME', 'param4':'0,23%', 'param5':'0,23%', 'param6':'80%', 'param7':'0,46%','param8':'1','param9':'3','param10':'9','param11':'1','param12':'1'},
	            {"codigo" : 'Reclamos Clientes Hormigón (mensual)','descripcion':'2','param1':'', 'param2':'%', 'param3':'', 'param4':'', 'param5':'', 'param6':'', 'param7':'','param8':'3','param9':'3','param10':'1','param11':'9','param12':'9'},
	        ]
	    });
	 
	    //Defiinimos la presentacion de la grilla
	    var grid = Ext.create("Ext.grid.Panel",{
	        title : "Nombre del Indicador",
	        store : storeProyectos,	        
	        width : 600,
	        height : 600	,
	        columns : [ //-&gt; se definen las culumnas con la informacion a mostrar
	            
                {
                	text : "NOMBRE DEL INDICADOR",
                	dataIndex: "codigo",
                	width: 250,
                	flex:1,
            	},
	            {text : "Indicador",dataIndex: "descripcion",width: 60,
	            	renderer: function(value, metaData, record) {
	            		if(value==1){
	            			return '<img src="http://localhost:8180/sirep/librerias/imagenes/flecha-hacia-arriba.png"/>';
	            		}
	            		if(value==2){
	            			return '<img src="http://localhost:8180/sirep/librerias/imagenes/flecha-hacia-abajo.png"/>';
	            		}	            		
	            		
	            	}
	            },
	            {	
	            	text : "Unidad de<br/>Medida", 
	            	dataIndex: "param2",width: 60},
	            {
            		text : "M/MP", 
            		dataIndex: "param3",
        			width: 60
	            },
	            {
        			text : "CIERRE al<br/> 31.12.2012<br/> (AÑO)", 
        			dataIndex: "param4",width: 65},
	            {
    				text : "INDICADOR <br/>DEL MES<br/> ACTUAL EN <br/>CURSO 2013", 
    				dataIndex: "param5",width: 70},
	            {
					text : "META DEL<br/> AÑO 2013<br/> (AÑO)",
					dataIndex: "param6",width: 70},	            
	            {
					text : "AVANCE<br/> ACUMULADO AL 2013<br/> (AÑO)",
					flex:1, 
					dataIndex: "param7",width: 70},
				
				//inicio de proyectos de Estrategicos
					{
						text : "PROYETOS ESTRATEGICOS",
						flex:1, 
						columns:[{
							text: 'PROY 1',
							columns:[{
								text:'<div style="writing-mode: tb-rl; height:250px; text-align:center">PROYECTO DE IMPLEMENTACION DE REYENUE<BR/> MANAGEMENT</div>',
								columns:[{
									text:'EA',
									width:40,
									dataIndex: "param11"
									
								}],
								width:40
							}],
							width:40
								
						},
						{
							text: 'PROY 2',
							columns:[{
								text:'<div style="writing-mode: tb-rl; height:250px; text-align:center">PROYECTO DE IMPLEMENTACION DE REYENUE<BR/> MANAGEMENT</div>',
								columns:[{
									text:'EA',
									width:40,
									dataIndex: "param8"
								}],
								width:40
							}],
							width:40
								
						},
						{
							text: 'PROY 3',
							columns:[{
								text:'<div style="writing-mode: tb-rl; height:250px; text-align:center">PROYECTO DE IMPLEMENTACION DE REYENUE<BR/> MANAGEMENT</div>',
								columns:[{
									text:'EA',
									width:40,
									dataIndex: "param9"
								}],
								width:40
							}],
							width:40
								
						},
						{
							text: 'PROY 4',
							columns:[{
								text:'<div style="writing-mode: tb-rl; height:250px; text-align:center">PROYECTO DE IMPLEMENTACION DE REYENUE<BR/> MANAGEMENT</div>',
								columns:[{
									text:'EA',
									width:40,
									dataIndex: "param10"
								}],
								width:40
							}],
							width:40
								
						},
						{
							text: 'PROY 5',
							columns:[{
								text:'<div style="writing-mode: tb-rl; height:250px; text-align:center">PROYECTO DE IMPLEMENTACION DE REYENUE<BR/> MANAGEMENT</div>',
								columns:[{
									text:'EA',
									width:40,
									dataIndex: "param11"
								}],
								width:40
							}],
							width:40
								
						},
						{
							text: 'PROY 6',
							columns:[{
								text:'<div style="writing-mode: tb-rl; height:250px; text-align:center">PROYECTO DE IMPLEMENTACION DE REYENUE<BR/> MANAGEMENT</div>',
								columns:[{
									text:'EA',
									width:40,
									dataIndex: "param12"
								}],
								width:40
							}],
							width:40
								
						},
						{
							text: 'PROY 7',
							columns:[{
								text:'<div style="writing-mode: tb-rl; height:250px; text-align:center">PROYECTO DE IMPLEMENTACION DE REYENUE<BR/> MANAGEMENT</div>',
								columns:[{
									text:'EA',
									width:40,
									dataIndex: "param8"
								}],
								width:40
							}],
							width:40
								
						}															
						]
					},
					
				//fin de proyectos estrategicos	
					
				//Inicio de Proyectos operativos	
				{
					text : "PROYETOS OPERATIVOS",
					flex:1, 
					columns:[{
						text: 'PROY 8',
						columns:[{
							text:'<div style="writing-mode: tb-rl; height:250px; text-align:center">PROYECTO DE IMPLEMENTACION DE REYENUE<BR/> MANAGEMENT</div>',
							columns:[{
								text:'EA',
								width:40,
								dataIndex: "param10"
							}],
							width:40
						}],
						width:40
							
					},
					{
						text: 'PROY 9',
						columns:[{
							text:'<div style="writing-mode: tb-rl; height:250px; text-align:center">PROYECTO DE IMPLEMENTACION DE REYENUE<BR/> MANAGEMENT</div>',
							columns:[{
								text:'EA',
								width:40,
								dataIndex: "param12"
							}],
							width:40
						}],
						width:40
							
					},
					{
						text: 'PROY 10',
						columns:[{
							text:'<div style="writing-mode: tb-rl; height:250px; text-align:center">PROYECTO DE IMPLEMENTACION DE REYENUE<BR/> MANAGEMENT</div>',
							columns:[{
								text:'EA',
								width:40,
								dataIndex: "param9"
							}],
							width:40
						}],
						width:40
							
					},
					{
						text: 'PROY 11',
						columns:[{
							text:'<div style="writing-mode: tb-rl; height:250px; text-align:center">PROYECTO DE IMPLEMENTACION DE REYENUE<BR/> MANAGEMENT</div>',
							columns:[{
								text:'EA',
								width:40,
								dataIndex: "param10"
							}],
							width:40
						}],
						width:40
							
					},
					{
						text: 'PROY 12',
						columns:[{
							text:'<div style="writing-mode: tb-rl; height:250px; text-align:center">PROYECTO DE IMPLEMENTACION DE REYENUE<BR/> MANAGEMENT</div>',
							columns:[{
								text:'EA',
								width:40,
								dataIndex: "param11"
							}],
							width:40
						}],
						width:40
							
					},
					{
						text: 'PROY 13',
						columns:[{
							text:'<div style="writing-mode: tb-rl; height:250px; text-align:center">PROYECTO DE IMPLEMENTACION DE REYENUE<BR/> MANAGEMENT</div>',
							columns:[{
								text:'EA',
								width:40,
								dataIndex: "param8"
							}],
							width:40
						}],
						width:40
							
					},
					{
						text: 'PROY 14',
						columns:[{
							text:'<div style="writing-mode: tb-rl; height:250px; text-align:center">PROYECTO DE IMPLEMENTACION DE REYENUE<BR/> MANAGEMENT</div>',
							columns:[{
								text:'EA',
								width:40,
								dataIndex: "param12"
							}],
							width:40
						}],
						width:40
							
					},
					{
						text: 'PROY 15',
						columns:[{
							text:'<div style="writing-mode: tb-rl; height:250px; text-align:center">PROYECTO DE IMPLEMENTACION DE REYENUE<BR/> MANAGEMENT</div>',
							columns:[{
								text:'EA',
								width:40,
								dataIndex: "param10"
							}],
							width:40
						}],
						width:40
							
					},
					{
						text: 'PROY 16',
						columns:[{
							text:'<div style="writing-mode: tb-rl; height:250px; text-align:center">PROYECTO DE IMPLEMENTACION DE REYENUE<BR/> MANAGEMENT</div>',
							columns:[{
								text:'EA',
								width:40,
								dataIndex: "param8"
							}],
							width:40
						}],
						width:40
							
					},
					{
						text: 'PROY 17',
						columns:[{
							text:'<div style="writing-mode: tb-rl; height:250px; text-align:center">PROYECTO DE IMPLEMENTACION DE REYENUE<BR/> MANAGEMENT</div>',
							columns:[{
								text:'EA',
								width:40,
								dataIndex: "param10"
							}],
							width:40
						}],
						width:40
							
					},
					{
						text: 'PROY 18',
						columns:[{
							text:'<div style="writing-mode: tb-rl; height:250px; text-align:center">PROYECTO DE IMPLEMENTACION DE REYENUE<BR/> MANAGEMENT</div>',
							columns:[{
								text:'EA',
								width:40,
								dataIndex: "param9"
							}],
							width:40
						}],
						width:40
							
					},
					{
						text: 'PROY 19',
						columns:[{
							text:'<div style="writing-mode: tb-rl; height:250px; text-align:center">PROYECTO DE IMPLEMENTACION DE REYENUE<BR/> MANAGEMENT</div>',
							columns:[{
								text:'EA',
								width:40,
								dataIndex: "param12"
							}],
							width:40
						}],
						width:40
							
					},
					{
						text: 'PROY 20',
						columns:[{
							text:'<div style="writing-mode: tb-rl; height:250px; text-align:center">PROYECTO DE IMPLEMENTACION DE REYENUE<BR/> MANAGEMENT</div>',
							columns:[{
								text:'EA',
								width:40,
								dataIndex: "param10"
							}],
							width:40
						}],
						width:40
							
					},
					{
						text: 'PROY 21',
						columns:[{
							text:'<div style="writing-mode: tb-rl; height:250px; text-align:center">PROYECTO DE IMPLEMENTACION DE REYENUE<BR/> MANAGEMENT</div>',
							columns:[{
								text:'EA',
								width:40,
								dataIndex: "param12"
							}],
							width:40
						}],
						width:40
							
					},
					{
						text: 'PROY 22',
						columns:[{
							text:'<div style="writing-mode: tb-rl; height:250px; text-align:center">PROYECTO DE IMPLEMENTACION DE REYENUE<BR/> MANAGEMENT</div>',
							columns:[{
								text:'EA',
								width:40,
								dataIndex: "param8"
							}],
							width:40
						}],
						width:40
							
					},
					{
						text: 'PROY 23',
						columns:[{
							text:'<div style="writing-mode: tb-rl; height:250px; text-align:center">PROYECTO DE IMPLEMENTACION DE REYENUE<BR/> MANAGEMENT</div>',
							columns:[{
								text:'EA',
								width:40,
								dataIndex: "param9"
							}],
							width:40
						}],
						width:40
							
					},
					{
						text: 'PROY 24',
						columns:[{
							text:'<div style="writing-mode: tb-rl; height:250px; text-align:center">PROYECTO DE IMPLEMENTACION DE REYENUE<BR/> MANAGEMENT</div>',
							columns:[{
								text:'EA',
								width:40,
								dataIndex: "param9"
							}],
							width:40
						}],
						width:40
							
					}										
					]
				},
				
				//fin de proyectos operativos
	        ]
	    }); 
			
		var me=this;
    	this.border=false;	
    	
    	this.items={
    			xtype:grid,
    			
            	
    	};
		this.callParent(arguments);
	}
});