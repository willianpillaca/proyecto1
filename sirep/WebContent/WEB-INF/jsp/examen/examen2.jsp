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
	
		<c:forEach var="i" begin="1" end="5">
			<a href="">holaaa</a><b>Item <c:out value="${i}"/><b>
		</c:forEach>
		
		
		<c:out value="${data['total']}"/>
		
		
		<c:out value="${data['data'][0].descripcion}"/>	
<%-- 		<c:forEach items="${data['data']}" var="item" varStatus="status"> --%>
<%-- 		  <c:out value="${item[0].description}"/>		   --%>
<%-- 		</c:forEach> --%>
		<br>
		<div class="panel panel-info" class="">
                    <div class="panel-heading">
                        <h3 class="panel-title">Curso: Gestion de Riesgos Ambientales<%= data.get("data") %> </h3>                        
                    </div>
                    <div class="panel-body detalle-producto">
                        <p class="lead">Preguntas:</p>
                        <div class="btn-toolbar" role="toolbar">
                            <div class="btn-group">
                            	<% for(int i=0; i<numPreg; i++ ){
                            		%>
                            			<button type="button" id="btn<%= i+1 %>" class="btn btn-primary"><%=i+1 %></button>	
                            		<%
                            	}                            		
                           		%>
                            </div>                                                      
                        </div>
                        
                        <% for(int i=0; i<numPreg; i++ ){
                        	
                           		%>
                           		<c:set var="aaa" value="${data['data'][0].descripcion}"/>
                           			<div id="pregunta<%=i+1 %>">
			                            <h2>Pregunta <%=i+1 %>:</h2>
			                            <div>
<%-- 			                            <c:out value="${aaa}"/> --%>
										<%= "hola"+(String)pageContext.getAttribute("aaa") %>
											
			                            </div>
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
                           		<%
                          	}                            		
                        %>
                        
                        
                        
                        <br/>                                                
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
      <script src="librerias/libs/js/jquery.js"></script>
    <script src="librerias/libs/js/jquery-1.8.3.min.js"></script>
    <script src="librerias/libs/js/bootstrap.min.js"></script>
   	
    <script type="text/javascript" src="librerias/libs/ajaxExamen.js"></script>
</body>
</html>