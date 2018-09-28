<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<%@ include file="../include/variablesglobales.jsp"%>
<script src="librerias/libBase/include.js"></script>
<script src="librerias/libBase/include.base.js"></script>
<script src="librerias/app/SirepManager.js"></script>
<%@ include file="../include/ScriptsComponents.jsp"%>
<script src="librerias/app/SirepApp.js"></script>
<!-- <script src="librerias/ckeditor/ckeditor.js"></script> -->
<title>Sistema Ginnet</title>

<!-- Bootstrap -->
<link href="librerias/libs/css/bootstrap.css" rel="stylesheet">	 <!-- Alertity -->
<link rel="stylesheet" href="librerias/libs/js/alertify/themes/alertify.core.css" />
<link rel="stylesheet" href="librerias/libs/js/alertify/themes/alertify.bootstrap.css" id="toggleCSS" />
<script src="librerias/libs/js/alertify/lib/alertify.min.js"></script>
<!-- <script src="librerias/libs/summernote/summernote.min.js"></script> -->
<!-- <link rel="stylesheet" href="librerias/libs/summernote/summernote.css" /> -->


</head>
<body>
<script>
	$(document).ready(function() {
	    $('#summernote').summernote();	    
	    
	    /**activar mostra alternativas**/
	    $(".rtdPregunta").click(function(evento){
	          
            var valor = $(this).val();
            
            console.log('valor->>>'+valor);
          
            if(valor == '1'){
                $("#alternativasPreguntaCerrada").css("display", "block");
                $("#alternativaPreguntaAbierta").css("display", "none");                
            }else{
                $("#alternativasPreguntaCerrada").css("display", "none");                
                $("#alternativaPreguntaAbierta").css("display", "block");                
            }
    	});	    
	    
	});	
</script>		
			
	
	
<!-- 	modal para registro de pregunta -->

	<div id="myModal" class="modal fade" tabindex="-1" role="dialog">
	<div class="modal-dialog">
		<div class="modal-content">			
			<div class="modal-body">
				<div class="container col-md-12">					
					<div class="panel panel-primary">
					  <div id="idCurso" style="display: none"></div>		
					  <div class="panel-heading">Nueva Pregunta Curso: <b><span id="txtCurso"></span></b></div>
					  <div class="panel-body">					  	

					  	
					  	<div id="summernote">
					      --Ingrese aqui la pregunta--
					  
					    </div><br/>
					    <div class="controls">
					    	
					    	<div class="row" style="padding: 0 5px 0 5px">
					    		<label class="radio-inline"><input class="rtdPregunta" type="radio" name="tipoPregunta" value="1" checked="checked">Pregunta Cerrada</label>
								<label class="radio-inline"><input class="rtdPregunta" type="radio" name="tipoPregunta" value="2">Pregunta Abierta</label>
					    	</div>
					    	
							<br/>							
					    	<div id="alternativasPreguntaCerrada" style="padding: 0 5px 0 5px">
					    		<div class="row">
                                	<div class="input-group">
									    <span class="input-group-addon">									    	
										        <input type="radio" name="rpta" value="1" aria-label="Radio button for following text input">									      	
									    </span>
									    <input id="msg1" type="text" class="form-control" name="msg" placeholder="Alternativa A" aria-label="Text input with radio button">
								  	</div>
								  	<div class="input-group">
									    <span class="input-group-addon">									    	
										        <input type="radio" name="rpta" value="2" aria-label="Radio button for following text input">									      	
									    </span>
									    <input id="msg2" type="text" class="form-control" name="msg" placeholder="Alternativa B" aria-label="Text input with radio button">
								  	</div>
								  	<div class="input-group">
									    <span class="input-group-addon">									    	
										        <input type="radio" name="rpta" value="3" aria-label="Radio button for following text input">									      	
									    </span>
									    <input id="msg3" type="text" class="form-control" name="msg" placeholder="Alternativa C" aria-label="Text input with radio button">
								  	</div>
								  	<div class="input-group">
									    <span class="input-group-addon">									    	
										        <input type="radio" name="rpta" value="4" aria-label="Radio button for following text input">									      	
									    </span>
									    <input id="msg4" type="text" class="form-control" name="msg" placeholder="Alternativa D" aria-label="Text input with radio button">
								  	</div>
								  	<div class="input-group">
									    <span class="input-group-addon">									    	
										        <input type="radio" name="rpta" value="5" aria-label="Radio button for following text input">									      	
									    </span>
									    <input id="msg5" type="text" class="form-control" name="msg" placeholder="Alternativa E" aria-label="Text input with radio button">									    
								  	</div>                                
                            	</div>
					    	</div>
					    	<div id="alternativaPreguntaAbierta" style="display: none">
					    		<div class="alert alert-danger" role="alert">
								  <strong>Advertencia!</strong> Al marcar esta opcion el Alumno deberá Ingresar la respuesta.
								</div>
					    	</div>					    						    
					    </div>					    
				  		</div>
					</div>
										
				</div>
			</div>
			<div class="modal-footer">
				<button class="btn btn-default" data-dismiss="modal">Cancelar</button>				
				<button type="button" class="btn btn-success" id="btnGuardarPregunta">Guardar</button>
			</div>
		</div>
	</div>
</div>
							
   	
   	<script src="librerias/libs/js/jquery.js"></script>
    <script src="librerias/libs/js/jquery-1.8.3.min.js"></script>
    <script src="librerias/libs/js/bootstrap.min.js"></script>
   	
   	<link href="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.2/summernote.css" rel="stylesheet">
	<script src="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.2/summernote.js"></script>
    <script type="text/javascript" src="librerias/libs/ajaxExamen.js"></script>
</body>
</html>