<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.google.gson.Gson" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.HashMap" %>
<jsp:useBean class="pe.gob.ep.ginnet.radamanthys.bean.Examen" id="examen"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Ex&aacute;men online</title>

    <!-- Bootstrap -->
    <link href="librerias/libs/css/bootstrap.css" rel="stylesheet">
    
	
	 <!-- Alertity -->
    <link rel="stylesheet" href="librerias/libs/js/alertify/themes/alertify.core.css" />
    <link rel="stylesheet" href="librerias/libs/js/alertify/themes/alertify.bootstrap.css" id="toggleCSS" />
    <script src="librerias/libs/js/alertify/lib/alertify.min.js"></script>
    
    
</head>
<body>
	<div class="container">
		<% HashMap<String, Object>  data = ((HashMap)request.getAttribute("data")); %>
		
		<% Object object =  request.getAttribute("num"); 
		int numPreg =Integer.parseInt(object.toString());
		
		
		
		
		%>
	
<%-- 		<c:forEach var="i" begin="0" end="${data['total']-1}"> --%>
<%-- 			<a href="">holaaa</a><b>Item <c:out value="${i}"/><b> --%>
<%-- 		</c:forEach>		 --%>
		
<%-- 		<c:out value="${data['total']}"/> --%>		
			
<%-- 		<c:forEach items="${data['data']}" var="item" varStatus="status"> --%>
<%-- 		  <c:out value="${item[0].description}"/>		   --%>
<%-- 		</c:forEach> --%>
		<br>
		<div class="panel panel-info" class="">
                    <div class="panel-heading">
                        <h3 class="panel-title">Curso: Gestion de Riesgos Ambientales</h3>                        
                    </div>
                    <div class="panel-body detalle-producto">
                        <p class="lead">Preguntas:</p>
                        <div class="btn-toolbar" role="toolbar">
                            <div class="btn-group">
                            	<c:forEach var="i" begin="0" end="${data['total']-1}">									
									<button type="button" id="btn<c:out value="${i+1}"/>" class="btn btn-primary"><c:out value="${i+1}"/></button>
								</c:forEach>
                           		                            	
                            </div>                                                      
                        </div>
                        <c:forEach var="i" begin="0" end="${data['total']-1}">
									<c:set var="isNone" value="${i+1}"/>                                                  		
                           			<div id="pregunta<c:out value="${i+1}"/>" style="display:<c:if test="${isNone != 1}">none</c:if>">
			                            <h2>Pregunta <c:out value="${i+1}"/>:</h2>
			                            <div id="textoPregunta">
											<c:out value="${data['data'][i].descripcion}"/>											
			                            </div>
			            				<c:forEach var="j" begin="0" end="4">			                            
				                            <div class="radio">
				                                <label><input type="radio" name="opciones<c:out value="${i+1}"/>" id="opciones_<c:out value="${i+1}"/>_<c:out value="${j+1}"/>" value="<c:out value="${data['data'][i].alternativa[j].valor}"/>"><c:out value="${data['data'][i].alternativa[j].descripcion}"/>	</label>
				                            </div>			                            
			                            </c:forEach> 
			                        </div>
                       
                        </c:forEach>
                        
                        <br/>                                                
                        <div class="btn-group">
                            <button type="button" class="btn btn-primary" id="btnPrimero"><< Inicio</button>
                            <button type="button" class="btn btn-primary" id="btnPrev">< Anterior</button>
                            <button type="button" class="btn btn-primary" id="btnNext">Siguiente ></button>
                            <button type="button" class="btn btn-primary" id="btnUltimo">Ultimo >></button>                            
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
   	
    <script type="text/javascript" src="librerias/libs/ajaxExamen.js"></script>
</body>
</html>