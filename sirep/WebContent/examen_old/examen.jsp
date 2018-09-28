<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Ex&aacute;men online</title>

    <!-- Bootstrap -->
    <link href="libs/css/bootstrap.css" rel="stylesheet">
    
	
	 <!-- Alertity -->
    <link rel="stylesheet" href="libs/js/alertify/themes/alertify.core.css" />
    <link rel="stylesheet" href="libs/js/alertify/themes/alertify.bootstrap.css" id="toggleCSS" />
    <script src="libs/js/alertify/lib/alertify.min.js"></script>
</head>
<body>
	<div class="container">
		
		<br>
		<div class="panel panel-info" class="">
                    <div class="panel-heading">
                        <h3 class="panel-title">Curso: Gestion de Riesgos Ambientales</h3>                        
                    </div>
                    <div class="panel-body detalle-producto">
                        <p class="lead">Preguntas:</p>
                        <div class="btn-toolbar" role="toolbar">
                            <div class="btn-group">
                                <button type="button" id="btn1" class="btn btn-primary">1</button>
                                <button type="button" id="btn2" class="btn btn-primary">2</button>
                                <button type="button" id="btn3" class="btn btn-primary">3</button>
                                <button type="button" id="btn4" class="btn btn-primary">4</button>
                                <button type="button" id="btn5" class="btn btn-primary">5</button>
                                <button type="button" id="btn6" class="btn btn-primary">6</button>
                                <button type="button" id="btn7" class="btn btn-primary">7</button>
                                <button type="button" id="btn8" class="btn btn-primary">8</button>
                                <button type="button" id="btn9" class="btn btn-primary">9</button>
                                <button type="button" id="btn10" class="btn btn-primary">10</button>
                            </div>                                                      
                        </div>
                        <div id="pregunta1">
                            <h2>Pregunta 1:</h2>
                            <div>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book</div>
                            <div class="radio">
                                <label><input type="radio" name="opciones1" id="opciones_1_1" value="opcion_1_1">Alternativa 1 de 1</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones1" id="opciones_2_1" value="opcion_2_1">Alternativa 2 de 1</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones1" id="opciones_3_1" value="opcion_3_1">Alternativa 3 de 1</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones1" id="opciones_4_1" value="opcion_4_1">Alternativa 4 de 1</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones1" id="opciones_5_1" value="opcion_5_1">Alternativa 5 de 1</label>
                            </div> 
                        </div>
                        <div id="pregunta2" style="display:none">
                            <h2>Pregunta 2:</h2>
                            <div>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book</div>
                            <div class="radio">
                                <label><input type="radio" name="opciones2" id="opciones_1_2" value="opcion_1_2">Alternativa 1 de 2</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones2" id="opciones_2_2" value="opcion_2_2">Alternativa 2 de 2</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones2" id="opciones_3_2" value="opcion_3_2">Alternativa 3 de 2</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones2" id="opciones_4_2" value="opcion_4_2">Alternativa 4 de 2</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones2" id="opciones_5_2" value="opcion_5_2">Alternativa 5 de 2</label>
                            </div> 
                        </div>
                        <div id="pregunta3" style="display:none">
                            <h2>Pregunta 3:</h2>
                            <div>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book</div>
                            <div class="radio">
                                <label><input type="radio" name="opciones3" id="opciones_1_3" value="opcion_1_3">Alternativa 1 de 3</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones3" id="opciones_2_3" value="opcion_2_3">Alternativa 2 de 3</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones3" id="opciones_3_3" value="opcion_3_3">Alternativa 3 de 3</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones3" id="opciones_4_3" value="opcion_4_3">Alternativa 4 de 3</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones3" id="opciones_5_3" value="opcion_5_3">Alternativa 5 de 3</label>
                            </div> 
                        </div>
                        <div id="pregunta4" style="display:none">
                            <h2>Pregunta 4:</h2>
                            <div>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book</div>
                            <div class="radio">
                                <label><input type="radio" name="opciones4" id="opciones_1_4" value="opcion_1_4">Alternativa 1 de 4</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones4" id="opciones_2_4" value="opcion_2_4">Alternativa 2 de 4</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones4" id="opciones_3_4" value="opcion_3_4">Alternativa 3 de 4</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones4" id="opciones_4_4" value="opcion_4_4">Alternativa 4 de 4</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones4" id="opciones_5_4" value="opcion_5_4">Alternativa 5 de 4</label>
                            </div> 
                        </div>
                        <div id="pregunta5" style="display:none">
                            <h2>Pregunta 5:</h2>
                            <div>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book</div>
                            <div class="radio">
                                <label><input type="radio" name="opciones5" id="opciones_1_5" value="opcion_1_5">Alternativa 1 de 5</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones5" id="opciones_2_5" value="opcion_2_5">Alternativa 2 de 5</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones5" id="opciones_3_5" value="opcion_3_5">Alternativa 3 de 5</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones5" id="opciones_4_5" value="opcion_4_5">Alternativa 4 de 5</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones5" id="opciones_5_5" value="opcion_5_5">Alternativa 5 de 5</label>
                            </div> 
                        </div>
                        <div id="pregunta6" style="display:none">
                            <h2>Pregunta 6:</h2>
                            <div>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book</div>
                            <div class="radio">
                                <label><input type="radio" name="opciones6" id="opciones_1_6" value="opcion_1_6">Alternativa 1 de 6</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones6" id="opciones_2_6" value="opcion_2_6">Alternativa 2 de 6</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones6" id="opciones_3_6" value="opcion_3_6">Alternativa 3 de 6</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones6" id="opciones_4_6" value="opcion_4_6">Alternativa 4 de 6</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones6" id="opciones_5_6" value="opcion_5_6">Alternativa 5 de 6</label>
                            </div> 
                        </div>
                        <div id="pregunta7" style="display:none">
                            <h2>Pregunta 7:</h2>
                            <div>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book</div>
                            <div class="radio">
                                <label><input type="radio" name="opciones7" id="opciones_1_7" value="opcion_1_7">Alternativa 1 de 7</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones7" id="opciones_2_7" value="opcion_2_7">Alternativa 2 de 7</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones7" id="opciones_3_7" value="opcion_3_7">Alternativa 3 de 7</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones7" id="opciones_4_7" value="opcion_4_7">Alternativa 4 de 7</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones7" id="opciones_5_7" value="opcion_5_7">Alternativa 5 de 7</label>
                            </div> 
                        </div>
                        <div id="pregunta8" style="display:none">
                            <h2>Pregunta 8:</h2>
                            <div>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book</div>
                            <div class="radio">
                                <label><input type="radio" name="opciones8" id="opciones_1_8" value="opcion_1_8">Alternativa 1 de 8</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones8" id="opciones_2_8" value="opcion_2_8">Alternativa 2 de 8</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones8" id="opciones_3_8" value="opcion_3_8">Alternativa 3 de 8</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones8" id="opciones_4_8" value="opcion_4_8">Alternativa 4 de 9</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones8" id="opciones_5_8" value="opcion_5_8">Alternativa 5 de 10</label>
                            </div> 
                        </div>
                        <div id="pregunta9" style="display:none">
                            <h2>Pregunta 9:</h2>
                            <div>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book</div>
                            <div class="radio">
                                <label><input type="radio" name="opciones9" id="opciones_1_9" value="opcion_1_9">Alternativa 1 de 9</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones9" id="opciones_2_9" value="opcion_2_9">Alternativa 2 de 9</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones9" id="opciones_3_9" value="opcion_3_9">Alternativa 3 de 9</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones9" id="opciones_4_9" value="opcion_4_9">Alternativa 4 de 9</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones9" id="opciones_5_9" value="opcion_5_9">Alternativa 5 de 9</label>
                            </div> 
                        </div>
                        <div id="pregunta10" style="display:none">
                            <h2>Pregunta 10:</h2>
                            <div>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book</div>
                            <div class="radio">
                                <label><input type="radio" name="opciones10" id="opciones_1_10" value="opcion_1_10">Alternativa 1 de 10</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones10" id="opciones_2_10" value="opcion_2_10">Alternativa 2 de 10</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones10" id="opciones_3_10" value="opcion_3_10">Alternativa 3 de 10</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones10" id="opciones_4_10" value="opcion_4_10">Alternativa 4 de 10</label>
                            </div>
                            <div class="radio">
                                <label><input type="radio" name="opciones10" id="opciones_5_10" value="opcion_5_10">Alternativa 5 de 10</label>
                            </div> 
                        </div><br/>                                                
                        <div class="btn-group">
                            <button type="button" class="btn btn-primary" id="btnPrimero"><< Inicio</button>
                            <button type="button" class="btn btn-primary" id="btnPrev">< Anterior</button>
                            <button type="button" class="btn btn-primary" id="btnNext">Siguiente ></button>
                            <button type="button" class="btn btn-primary" id="btnUltimo">Ultimo >></button>
                         </div>
                    </div>
		</div>
                <button class="btn btn-success" data-toggle="modal" data-target="#add_new_record_modal" id="btn_pagar_efectivo">Finalizar</button>
 	</div>
      <script src="libs/js/jquery.js"></script>
    <script src="libs/js/jquery-1.8.3.min.js"></script>
    <script src="libs/js/bootstrap.min.js"></script>
   	
    <script type="text/javascript" src="libs/ajaxExamen.js"></script>
</body>
</html>