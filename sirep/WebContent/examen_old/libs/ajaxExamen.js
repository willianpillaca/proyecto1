$(function(){
	var ENV_WEBROOT = "../";
        
        var numPreguntas=10;
        var inicioPreguntas=1;
	
        /**@autor Willian Pillaca**/               
        
        /**activa el numero de pregunta**/
        $("#btn1").on("click", function(e) {                        
            //preguntaActiva(1);            
            recorrerPregunta(1);
        });
        
        $("#btn2").on("click", function(e) {            
            console.log('pregunta 2');            
            //$("#pregunta1").hide();            
            //$("#pregunta2").show();
            //preguntaActiva(1);            
            recorrerPregunta(2);
        });
        
        $("#btn3").on("click", function(e) {                        
            recorrerPregunta(3);
        });
        $("#btn4").on("click", function(e) {                        
            recorrerPregunta(4);
        });
        $("#btn5").on("click", function(e) {                        
            recorrerPregunta(5);
        });
        $("#btn6").on("click", function(e) {                        
            recorrerPregunta(6);
        });
        $("#btn7").on("click", function(e) {                        
            recorrerPregunta(7);
        });
        $("#btn8").on("click", function(e) {                        
            recorrerPregunta(8);
        });
        $("#btn9").on("click", function(e) {                        
            recorrerPregunta(9);
        });
        $("#btn10").on("click", function(e) {                        
            recorrerPregunta(10);
        });
        
        
        
        function recorrerPregunta(n){
            for(var i=1; i<11; i++){
                if(i==n){
                    $("#btn"+i).removeClass("btn btn-primary");            
                    $("#btn"+i).addClass("btn btn-default");
                    $("#pregunta"+i).show();
                }
                else{
                    $("#btn"+i).removeClass("btn btn-default");
                    $("#btn"+i).addClass("btn btn-primary");
                    $("#pregunta"+i).hide();
                }
            }
            
        }
        
        function preguntaActiva(i){            
            $("#btn"+i).removeClass("btn btn-primary");            
            $("#btn"+i).addClass("btn btn-default");            
        }
        
        function preguntaInactiva(i){            
            $("#btn"+i).removeClass("btn btn-default");
            $("#btn"+i).addClass("btn btn-primary");            
        }
        
        function preguntaMarcada(){
            
        }        
        
        /**funcion para el botn de ultima pregunta**/
        function activarUltimaPregunta(){
            //recorremos todo las preguntas hasta el penultimo
            for(var i=1; i<numPreguntas;i++){
                $("#pregunta"+i).hide();//oculta la pregunta anterior  
                $("#btn"+i).addClass("btn btn-primary");
            }
            $("#pregunta"+numPreguntas).show(); //muestra la siguiente pregunta
            $("#btn"+numPreguntas).removeClass("btn btn-primary");//desactivar color
            $("#btn"+numPreguntas).addClass("btn btn-default"); 
            //$("#btnNext").removeAttr('disabled'); 
        }
        
        /**funcion para el botn de primera pregunta**/
        function activarPrimeraPregunta(){
            //recorremos todo las preguntas hasta el penultimo
            for(var i=2; i<=numPreguntas;i++){
                $("#pregunta"+i).hide();//oculta la pregunta anterior
                $("#btn"+i).addClass("btn btn-primary");
            }
            $("#pregunta"+inicioPreguntas).show(); //muestra la siguiente pregunta
            $("#btn"+inicioPreguntas).removeClass("btn btn-primary");//desactivar color
            $("#btn"+inicioPreguntas).addClass("btn btn-default"); 
            //$("#btnNext").removeAttr('disabled');
        }
        
        
        function obtenerElementoActivo(){
            var id;
            for(var i=1;i<11;i++){
                if( $("#pregunta"+i).is(":visible") ){                                        
                    id=i;
                }                
            }
            return id;
        }
        
        /**Boton ultima pregunta**/
        $("#btnUltimo").off("click");
        $("#btnUltimo").on("click", function(e) {                      
            activarUltimaPregunta();   
            $("#btnNext").prop( "disabled", true );
            $("#btnPrev").prop( "disabled", false );
            if(!$("input:radio[name=opciones"+numPreguntas+"]:checked").val()) {
                alertify.error('No marco una respuesta para la pregunta'+numPreguntas);
            }            
        });
        
        /**Boton primera pregunta**/
        $("#btnPrimero").off("click");
        $("#btnPrimero").on("click", function(e) {                      
            activarPrimeraPregunta();     
            $("#btnNext").prop( "disabled", false);
            $("#btnPrev").prop( "disabled", true );
            if(!$("input:radio[name=opciones"+inicioPreguntas+"]:checked").val()) {
                alertify.error('No marco una respuesta para la pregunta'+inicioPreguntas);
            }            
        });
        
        /**botn siguiente**/
        $("#btnNext").off("click");
        $("#btnNext").on("click", function(e) {                                    
            var activo=parseInt(obtenerElementoActivo());
            var idNext = activo+1;            
            $("#pregunta"+activo).hide();//oculta la pregunta anterior
            $("#pregunta"+idNext).show(); //muestra la siguiente pregunta
            preguntaActiva(idNext);//cambia el color de la pregunta 
            preguntaInactiva(activo);//cambia el color de la pregunta  
            $("#btnPrev").prop( "disabled", false );
            if(!$("input:radio[name=opciones"+activo+"]:checked").val()) {
                alertify.error('No marco una respuesta para la pregunta'+activo);
            }            
        });
        
        /**boton anterior**/
        $("#btnPrev").off("click");
        $("#btnPrev").on("click", function(e) {                                    
            var activo=parseInt(obtenerElementoActivo());
            var idPrev = activo-1;            
            $("#pregunta"+activo).hide();//oculta la pregunta anterior
            $("#pregunta"+idPrev).show(); //muestra la siguiente pregunta
            preguntaActiva(idPrev);//cambia el color de la pregunta 
            preguntaInactiva(activo);//cambia el color de la pregunta   
            $("#btnNext").prop( "disabled", false);
            if(!$("input:radio[name=opciones"+activo+"]:checked").val()) {
                alertify.error('No marco una respuesta para la pregunta'+activo);
            }            
        });
        
	$(".btn-agregar-producto").off("click");
	$(".btn-agregar-producto").on("click", function(e) {
		var cantidad = $("#txt_cantidad").val();
		var producto_id = $("#cbo_producto").val();
		if(producto_id!=0){
			if(cantidad!=''){
				$.ajax({
					url: 'Controller/ProductoController.php?page=1',
					type: 'post',
					data: {'producto_id':producto_id, 'cantidad':cantidad},
					dataType: 'json',
					success: function(data) {
						if(data.success==true){
							$("#txt_cantidad").val('');
							alertify.success(data.msj);
							$(".detalle-producto").load('detalle.php');
						}else{
							alertify.error(data.msj);
						}
					},
					error: function(jqXHR, textStatus, error) {
						alertify.error(error);
					}
				});				
			}else{
				alertify.error('Ingrese una cantidad');
			}
		}else{
			alertify.error('Seleccione un producto');
		}
	});
	
        
        $("#btn_pagar_efectivo").off("click");
        $("#btn_pagar_efectivo").on("click", function(e) {
                console.log('dentro del btn guardar->>');
		//var id = $(this).attr("id");
                var nombre = $("#txtnombre").val()+" "+$("#txtapellidos").val();
                var email = $("#txtemail").val();
                var telefono = $("#txttelefono").val();
                console.log("nombre->>>"+nombre);
		$.ajax({
			url: 'Controller/ProductoController.php?page=3',
			type: 'post',
                        data: {'nombre':nombre, 'email':email, 'telefono':telefono},
			dataType: 'json',
			success: function(data) {
				if(data.success==true){
					$("#txt_cantidad").val('');
                                        $("#txtnombre").val('');
                                        $("#txtapellidos").val('');
                                        $("#txtemail").val('');
                                        $("#txttelefono").val('');
					alertify.success(data.msj);
					$(".detalle-producto").load('detalle.php');
				}else{
					alertify.error(data.msj);
				}
			},
			error: function(jqXHR, textStatus, error) {
				alertify.error(error);
			}
		});
	});
        
        /**Eliminar Producto**/
	$(".eliminar-producto").off("click");
	$(".eliminar-producto").on("click", function(e) {
		var id = $(this).attr("id");
		$.ajax({
			url: 'Controller/ProductoController.php?page=2',
			type: 'post',
			data: {'id':id},
			dataType: 'json'
		}).done(function(data){
			if(data.success==true){
				alertify.success(data.msj);
				$(".detalle-producto").load('detalle.php');
			}else{
				alertify.error(data.msj);
			}
		})
	});
	
});