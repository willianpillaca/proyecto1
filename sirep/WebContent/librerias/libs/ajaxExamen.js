$(function(){
		
	/**@autor Willian Pillaca Meneses**/
		
		var ENV_WEBROOT = "../";
        
        var numPreguntas=10;
        var inicioPreguntas=1;
        var ini=1;        
        
        /**parametros iniciales**/
        
        $("#btn1").removeClass("btn btn-primary");  
        $("#btn1").addClass("btn btn-default");
        $("#btnPrev").prop( "disabled", true);
        $("#btnPrimero").prop( "disabled", true);
        $("#btnNext").prop( "disabled", false);
        $("#btnUltimo").prop( "disabled", false);
        
        /**Fin de Parametros iniciales**/
        
                       
        
        /**activa el numero de pregunta**/
        $("#btn1").on("click", function(e) {        	
            recorrerPregunta(1);
            desactivarBtnPrevPrimero();
            activarBtnNextUltimo();            
        });
        
        $("#btn2").on("click", function(e) {                        
            recorrerPregunta(2);
            activarBtnPrevPrimero();
            activarBtnNextUltimo();
        });
        
        $("#btn3").on("click", function(e) {                        
            recorrerPregunta(3);
            activarBtnPrevPrimero();
            activarBtnNextUltimo();
        });
        $("#btn4").on("click", function(e) {                        
            recorrerPregunta(4);
            activarBtnPrevPrimero();
            activarBtnNextUltimo();
        });
        $("#btn5").on("click", function(e) {                        
            recorrerPregunta(5);
            activarBtnPrevPrimero();
            activarBtnNextUltimo();
        });
        $("#btn6").on("click", function(e) {                        
            recorrerPregunta(6);
            activarBtnPrevPrimero();
            activarBtnNextUltimo();
        });
        $("#btn7").on("click", function(e) {                        
            recorrerPregunta(7);
            activarBtnPrevPrimero();
            activarBtnNextUltimo();
        });
        $("#btn8").on("click", function(e) {                        
            recorrerPregunta(8);
            activarBtnPrevPrimero();
            activarBtnNextUltimo();
        });
        $("#btn9").on("click", function(e) {                        
            recorrerPregunta(9);
            activarBtnPrevPrimero();
            activarBtnNextUltimo();
        });
        $("#btn10").on("click", function(e) {                        
            recorrerPregunta(10);
            activarBtnPrevPrimero();
            desactivarBtnNextUltimo();            
        });
        
        /**activa los botones Prev y Primero**/
        function activarBtnPrevPrimero(){
    	 	$("#btnPrimero").prop( "disabled", false);
         	$("#btnPrev").prop( "disabled", false);
        }
        
        /**desactiva los botones Prev y Primero**/
        function desactivarBtnPrevPrimero(){
    	 	$("#btnPrimero").prop( "disabled", true);
         	$("#btnPrev").prop( "disabled", true);
        }
        
        /**activa los botones Next y Ultimo**/
        function activarBtnNextUltimo(){
    	 	$("#btnNext").prop( "disabled", false);
         	$("#btnUltimo").prop( "disabled", false);
        }
        
        /**desactiva los botones Next y Ultimo**/
        function desactivarBtnNextUltimo(){
    	 	$("#btnNext").prop( "disabled", true);
         	$("#btnUltimo").prop( "disabled", true);
        }
        
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
            desactivarBtnNextUltimo();
            activarBtnPrevPrimero();            
            if(!$("input:radio[name=opciones"+numPreguntas+"]:checked").val()) {
                alertify.error('No marco una respuesta para la pregunta '+numPreguntas);
            }            
        });
        
        /**Boton primera pregunta**/
        $("#btnPrimero").off("click");
        $("#btnPrimero").on("click", function(e) {                      
            activarPrimeraPregunta();     
            activarBtnNextUltimo();            
            desactivarBtnPrevPrimero();            
            if(!$("input:radio[name=opciones"+inicioPreguntas+"]:checked").val()) {
                alertify.error('No marco una respuesta para la pregunta '+inicioPreguntas);
            }            
        });
        
        function suma(a,b){
        	var suma=a+b;
        	return suma;
        }
        
        
      
        /**boton siguiente**/
        $("#btnNext").off("click");
        $("#btnNext").on("click", function(e) {        	
            var activo=parseInt(obtenerElementoActivo());
            var idNext = activo+1;            
            $("#pregunta"+activo).hide();//oculta la pregunta anterior
            $("#pregunta"+idNext).show(); //muestra la siguiente pregunta
            preguntaActiva(idNext);//cambia el color de la pregunta 
            preguntaInactiva(activo);//cambia el color de la pregunta  
            $("#btnPrev").prop( "disabled", false );//activa el boton prev            
            $("#btnPrimero").prop( "disabled", false ); //activa el boton Primero
            if(!$("input:radio[name=opciones"+activo+"]:checked").val()) {
                alertify.error('No marco una respuesta para la pregunta '+activo);
            }
            if(activo == 9){
            	desactivarBtnNextUltimo();            	
            }            
        });
        
        /**boton anterior**/
        $("#btnPrev").off("click");
        $("#btnPrev").on("click", function(e) {                                    
            var activo=parseInt(obtenerElementoActivo());
            ini = activo;            
            var idPrev = activo-1;            
            $("#pregunta"+activo).hide();//oculta la pregunta anterior
            $("#pregunta"+idPrev).show(); //muestra la siguiente pregunta
            preguntaActiva(idPrev);//cambia el color de la pregunta 
            preguntaInactiva(activo);//cambia el color de la pregunta   
            $("#btnNext").prop( "disabled", false);
            $("#btnUltimo").prop( "disabled", false);
            if(!$("input:radio[name=opciones"+activo+"]:checked").val()) {
                alertify.error('No marco una respuesta para la pregunta '+activo);
            }
            if(ini == 2){
            	desactivarBtnPrevPrimero();
            }
        });
        
        
        /**Metodo para enviar Examen**/
        
        $("#btn_enviar_examen").off("click");
        $("#btn_enviar_examen").on("click", function(e) {
        	var rpta = [];
        	for(var i=1; i<11; i++){        		
        		rpta.push($('input:radio[name=opciones'+i+']:checked').val());        		
        	}        	
    		$.ajax({
				url: 'procesarexamen.app',
				type: 'post',
				data: {'rpta':rpta.toString()},
				dataType: 'json',	
				success: function(data) {			
					console.log('data');
					console.log(data)
					var rptaTrue= data.data.rptaTrue;
					var rptaFalse = data.data.rptaFalse;					
					if(data.data.success==true){												
						$("#rptaCorrecta").text(rptaTrue);
						$("#rptaIncorrecta").text(rptaFalse);
						$("#notaFinal").text(calcularNota(rptaTrue, 2));
						$("#estadoFinal").text(mensajeEstado(calcularNota(rptaTrue, 2)));
					}else{
						console.log('fracaso....');
					}
				},
				error: function(jqXHR, textStatus, error) {
					//alertify.error(error);
				}
				
			});
    		
    	});
        
        function calcularNota(pregCorrectas, puntajeXPregunta){
        	var nota = pregCorrectas*puntajeXPregunta;        	
        	return nota;
        }
        
        function mensajeEstado(nota){
        	var msg="";
        	if(nota >= 10){
        		msg = "APROBADO";
        		$("#estadoFinal").css("color", "blue");
        		$("#notaFinal").css("color", "blue");
        	}
        	else{
        		msg = "DESAPROBADO";
        		$("#estadoFinal").css("color", "red");
        		$("#notaFinal").css("color", "red");
        	}
        	
        	return msg;
        }
        
        /**guardar pregunta y Alternativa**/
        
        $("#btnGuardarPregunta").off("click");
    	$("#btnGuardarPregunta").on("click", function(e) {
    		
    		var descripcion =  $('#summernote').summernote('code');
    		var idCurso =  $('#idCurso').text(); 
    		console.log("tipo de pregunta->>>");
    		var tipoPregunta = $('input:radio[name=tipoPregunta]:checked').val();
    		if(tipoPregunta==2){
    			console.log("pregunta cerrada->>>");
    			$.ajax({
					url: 'saveexamenpreguntaabierta.app',
					type: 'post',
					data: {'descripcion':descripcion, 'idCurso':idCurso},
					dataType: 'json',
					success: function(data) {
						if(data.success==true){
							console.log('dentro de sucess');
							$("#msg1").val('');
							$("#msg2").val('');
							$("#msg3").val('');
							$("#msg4").val('');
							$("#msg5").val('');
//							$("#txt_cantidad").val('');
							alertify.success("la pregunta ah sido registrada correctamente");
//							$(".detalle-producto").load('detalle.php');
						}else{
//							alertify.error(data.msj);
						}
					},
					error: function(jqXHR, textStatus, error) {
						alertify.error(error);
					}
				});	
    		}
    		else{
    			console.log("pregunta abierta->>>>>");
    			var alt1 = $('#msg1').val();
        		var alt2 = $('#msg2').val();
        		var alt3 = $('#msg3').val();
        		var alt4 = $('#msg4').val();
        		var alt5 = $('#msg5').val();
        		var rpta = $('input:radio[name=rpta]:checked').val();
        		console.log('rpta->>>'+rpta);
        		console.log('alternativa1'+alt1);
        		if(descripcion!=''){
        			if(idCurso!=''){
        				$.ajax({
        					url: 'saveexamen.app',
        					type: 'post',
        					data: {'descripcion':descripcion, 'idCurso':idCurso, 'alt1':alt1, 'alt2':alt2, 'alt3':alt3, 'alt4':alt4, 'alt5':alt5, 'rpta': rpta},
        					dataType: 'json',
        					success: function(data) {
        						if(data.success==true){
        							console.log('dentro de sucess');
        							$("#msg1").val('');
        							$("#msg2").val('');
        							$("#msg3").val('');
        							$("#msg4").val('');
        							$("#msg5").val('');
//        							$("#txt_cantidad").val('');
        							alertify.success("la pregunta ah sido registrada correctamente");
//        							$(".detalle-producto").load('detalle.php');
        						}else{
//        							alertify.error(data.msj);
        						}
        					},
        					error: function(jqXHR, textStatus, error) {
        						alertify.error(error);
        					}
        				});				
        			}else{
        				alertify.error('No existe un curso asociado para esta pregunta');
        			}
        		}else{
        			alertify.error('Ingrese el enunciado de la pregunta');
        		}
    		}
    		
    		
    	});
        
        
        
	
	    
});