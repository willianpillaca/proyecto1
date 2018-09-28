<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Ex&aacute;men online</title>

    <!-- Bootstrap -->
    <link href="librerias/libs/css/bootstrap.css" rel="stylesheet">
    <link href="librerias/libs/css/cronometro.css" rel="stylesheet" />
    
	
	 <!-- Alertity -->
    <link rel="stylesheet" href="librerias/libs/js/alertify/themes/alertify.core.css" />
    <link rel="stylesheet" href="librerias/libs/js/alertify/themes/alertify.bootstrap.css" id="toggleCSS" />
    <script src="librerias/libs/js/alertify/lib/alertify.min.js"></script>
    <link rel="stylesheet" href="librerias/editor/dist/summernote.css">
    
    <script type="text/javascript">
	$(function() {
		$('button[type=submit]').click(function(e) {
			e.preventDefault();
			//Disable submit button
			$(this).prop('disabled',true);
			
			
// 			var form = $('#formadjuntar')document.forms[0];
			var form = document.getElementById("formadjuntar");
			var formData = new FormData(form);
			console.log("formData");
			console.log(formData);	
			// Ajax call for file uploaling
			var ajaxReq = $.ajax({
				url : 'fileupload.app',
				type : 'POST',
				data : formData,
				cache : false,
				contentType : false,
				processData : false,
				xhr: function(){
					//Get XmlHttpRequest object
					 var xhr = $.ajaxSettings.xhr() ;
					
					//Set onprogress event handler 
					 xhr.upload.onprogress = function(event){
						var perc = Math.round((event.loaded / event.total) * 100);
						$('#progressBar').text(perc + '%');
						$('#progressBar').css('width',perc + '%');
					 };
					 return xhr ;
				},
				beforeSend: function( xhr ) {
					//Reset alert message and progress bar
					$('#alertMsg').text('');
					$('#progressBar').text('');
					$('#progressBar').css('width','0%');
                }
			});

			// Called on success of file upload
			ajaxReq.done(function(msg) {
				$('#alertMsg').text(msg);
				$('input[type=file]').val('');
				$('button[type=submit]').prop('disabled',false);
			});
			
			// Called on failure of file upload
			ajaxReq.fail(function(jqXHR) {
				$('#alertMsg').text(jqXHR.responseText+'('+jqXHR.status+
						' - '+jqXHR.statusText+')');
				$('button[type=submit]').prop('disabled',false);
			});
		});
	});
</script>
    
</head>
<body>
	<div class="container">
		<div id="timer">
            <div class="container">
                <div id="hour">00</div>
                <div class="divider">:</div>
                <div id="minute">00</div>
                <div class="divider">:</div>
                <div id="second">00</div>                
            </div>            
        </div>
		
		<hr/>
		<div class="panel panel-info" class="">
                    <div class="panel-heading">
                        <h1 class="panel-title">CURSO: ${nombreCurso}</h1>                        
                    </div>
                    <div class="panel-body detalle-producto">                        
 						<h2>Preguntas a Desarrollar:</h2>
 						<div id="preguntaAbierta"></div><br/>
 						<form action="fileUpload" method="post" id="formadjuntar" enctype="multipart/form-data">
					      <div class="form-group">
					        <label>Seleccione Archivo:</label> <input class="form-control" type="file" name="file">
					      </div>
					      <input type="hidden" id="idCurso" name="idCurso" value="${idCurso}">
					      <input type="hidden" id="idUsuario" name="idUsuario" value="${idUsuario}">
					      <div class="form-group">
					        <button class="btn btn-primary" type="submit">Subir Archivo</button>
					      </div>
					    </form>					    
					    <!-- Bootstrap Progress bar -->
					    <div class="progress">
					      <div id="progressBar" class="progress-bar progress-bar-success" role="progressbar"
					        aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="width: 0%">0%</div>
					    </div>					
					    <!-- Alert -->
					    <div id="alertMsg" style="color: #357ebd; font-size: 16px;"></div>
<!-- 						<div id="preguntaAbierta"></div><br/> -->
<!-- 						<div class="form-group"> -->
<!-- 							<input type="file" class="form-control-file" name="datafile" /><br/> -->
<!-- 	 						<div id="upload" style="display:none;">Subiendo..</div> -->
<!-- 						</div> -->
						                       
                        <h2>PreguntasCerradas:</h2>                        
                        <div id="contentPreguntas">
<!--                         	aqui se recargan las preguntas -->							
                        </div>
                    </div>
                    
		</div>
				
				<div id="myModal" class="modal fade" role="dialog">
		  <div class="modal-dialog">		
		    <!-- Modal content-->
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal">&times;</button>
		        <h4 class="modal-title">Resumen del Examen</h4>
		        
		      </div>
		      <div class="modal-body">
		        <p>Respuestas Correctas: <span id="rptaCorrecta"></span></p>
		        <p>Respuestas Incorrectas: <span id="rptaIncorrecta"></span></p>
		        <p>Nota: <span id="notaFinal"></span></p>
		        <p>Estado: <span id="estadoFinal"></span></p>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-success" data-dismiss="modal">Close</button>
		      </div>
		    </div>
		
		  </div>
		</div>
		
				<button class="btn btn-success" id="btn_enviar_examen" data-toggle="modal" data-target="#myModal">Finalizar</button>
                
 	</div>
      <script src="librerias/libs/js/jquery.js"></script>
    <script src="librerias/libs/js/jquery-1.8.3.min.js"></script>
    <script src="librerias/libs/js/bootstrap.min.js"></script>
   	<script src="librerias/editor/dist/summernote.js"></script>
    <script type="text/javascript" src="librerias/libs/ajaxExamen.js"></script>
    <script src="librerias/js/jquery.ajaxfileupload.js"></script>
    
    <script>  

//     	$('input[type="file"]').ajaxfileupload({
// 	       'action': 'UploadFile',	      	    
// 	  	   'onComplete': function(response) {
// 		  	console.log('response');
// 		  	console.log(response);   	  	  		        
// 	       	$('#upload').hide();
// 	        //alert("Archivo enviado!!");
// 	      alertify.success('Archivo enviado');
// 	      },
// 	      'onStart': function() {
// 	    	  console.log($('#upload'));
// 	        $('#upload').show(); 
// 	      }
// 	 	});

	
	    $(document).ready(function() {
			//inicio - cronometro
			
			var tiempo = {
					hora: 0,
					minuto: 0,
					segundo: 0
				};

				var tiempo_corriendo = null;
				tiempo_corriendo = setInterval(function(){
				// Segundos
				tiempo.segundo++;
				if(tiempo.segundo >= 60)
				{
					tiempo.segundo = 0;
					tiempo.minuto++;
				}      

				// Minutos
				if(tiempo.minuto >= 60)
				{
					tiempo.minuto = 0;
					tiempo.hora++;
				}
					$("#hour").text(tiempo.hora < 10 ? '0' + tiempo.hora : tiempo.hora);
					$("#minute").text(tiempo.minuto < 10 ? '0' + tiempo.minuto : tiempo.minuto);
					$("#second").text(tiempo.segundo < 10 ? '0' + tiempo.segundo : tiempo.segundo);
				}, 1000);
	    	
			//fin - cronometro
		    
		    var cod= '${codigoCurso}';
		    console.log("cod->>>"+cod);
	    	$.ajax({ 
	    		type: 'POST', 
	    		url: 'obtenerpreguntas.app', 
	            data: { codCurso: cod, cantidad:10}, 
	    		success: function (response) {
	    			var data = response.data;	    			
	    			var html;
	    			for(var i=1; i<=data.length; i++){		    				
		    			html = "<div id='pregunta"+i+"'>"+
							"<h3>Pregunta "+i+":</h3>"+
							"<div>"+data[i-1].descripcion+"</div>"+
							//aqui entra una caja de texto
		                    "<div class='radio'>"+
		                        "<label><input type='radio' name='opciones"+i+"' id='opciones_1_"+i+"' value='opcion_1_"+i+"'>"+data[i-1].alternativa1+"</label>"+
		                    "</div>"+
		                    "<div class='radio'>"+
		                        "<label><input type='radio' name='opciones"+i+"' id='opciones_2_"+i+"' value='opcion_2_"+i+"'>"+data[i-1].alternativa2+"</label>"+
		                    "</div>"+
		                    "<div class='radio'>"+
		                        "<label><input type='radio' name='opciones"+i+"' id='opciones_3_"+i+"' value='opcion_3_"+i+"'>"+data[i-1].alternativa3+"</label>"+
		                    "</div>"+
		                    "<div class='radio'>"+
		                        "<label><input type='radio' name='opciones"+i+"' id='opciones_4_"+i+"' value='opcion_4_"+i+"'>"+data[i-1].alternativa4+"</label>"+
		                    "</div>"+
		                    "<div class='radio'>"+
		                        "<label><input type='radio' name='opciones"+i+"' id='opciones_5_"+i+"' value='opcion_5_"+i+"'>"+data[i-1].alternativa5+"</label>"+
		                    "</div>"+ 
                		"</div>"+
                		"<hr style='color:#eea236' size='10'/>";
						$("#contentPreguntas").append(html);			
			    	}                    
	    			//$("body").html(response);	    			
	    		}
	    	});

	    	//preguntas abiertas

	    	$.ajax({ 
	    		type: 'POST', 
	    		url: 'obtenerpreguntasabiertas.app', 
	            data: { codCurso: cod, cantidad:1}, 
	    		success: function (response) {
	    			var data = response.data;	    						    				    							    			
				    $("#preguntaAbierta").html(data[0].descripcion);                    
	    		}
	    	});
		});
    </script>    
</body>
</html>