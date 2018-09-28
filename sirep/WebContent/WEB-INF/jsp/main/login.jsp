<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="es"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="es"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="es"> <![endif]-->
<html lang="es">
<head>
<!--   <meta charset="utf-8"> -->
  <meta http-equiv="content-type" content="text/html; charset=utf-8" />
  <title>::GINNET::</title>
<!-- Estilos Login -->
  <link rel="stylesheet" href="librerias/acceso/css/loginStyle.css" />
  
<!-- Estilos Login -->
 
<!-- Ext js -->
<!--   <link rel="stylesheet" href="/ext/lib/ext_4_2_1/resources/ext-theme-gray/ext-theme-gray-all.css" />
	 -->
	 <link rel="stylesheet" href="/ext/lib/ext_4_2_1/resources/ext-theme-neptune/ext-theme-neptune-all.css" />
  
  <script src="/ext/lib/ext_4_2_1/ext-all.js"></script>
  
  
 <!-- Ext Js -->
 
 <!-- Jquery -->
  <script src="/ext/lib/jquery_1_8_2/jquery1.8.2.js"></script>
 <!-- Jquery -->

<!-- Generic -->
<link rel="stylesheet" href="librerias/css/genericStyle.css" />
<script src="librerias/libBase/common/Util.js"></script>
<!-- Generic -->

  <script src="librerias/libBase/common/selectize.min.js"></script>
  <link rel="stylesheet" href="librerias/libBase/common/selectize.css" />
  <script src="librerias/acceso/js/login.js"></script>
  
  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
  
</head>
<body>	
   <section class="container">
    <div class="login" id="loginPanel">
    
      <h1>Sistema GINNET</h1>
      <div style="width: 50%;float:left;">
      <img src="librerias/imagenes/planeamiento.png" style="width: 250px;height: 220px;margin: 0px 0px 0px 45px;">
      </div>
      <div style="width: 50%;float:left;">
      <form action="<c:url value='/j_security_check_for_standar'/>" method="post" id="j_form_login">
        <p><input onblur="login.findRolesByUserName(this.value);" type="text" name="j_username" id="j_username" class="inputLogin" placeholder="Usuario" required></p>
        <p><input type="password" name="j_password" class="inputLogin" placeholder="Contraseña" id="j_password" required></p>
        <p style="width: 350px;" id="contentRoles">
        <select id="roles" placeholder="Selecione un Rol" style="width: 100%;" name="rol" required>
			    
          </select>
        </p>
        <p class="remember_me">
        <span style="color: red;" id="messageValidation" ></span>
        <c:choose>
	        	<c:when test="${SPRING_SECURITY_LAST_EXCEPTION.message == 'Bad credentials'}">
	        		<span class="errorlogin" ><spring:message code="login.error.badcredentials"/> </span>
	            </c:when>
	            <c:when test="${SPRING_SECURITY_LAST_EXCEPTION.message == 'User not found'}">
	            	<span class="errorlogin" ><spring:message code="login.error.notfound"/></span>
	            </c:when>
	            <c:when test="${SPRING_SECURITY_LAST_EXCEPTION.message == 'Maximum sessions of 1 for this principal exceeded'}">
	                <span class="errorlogin" ><spring:message code="login.error.maximum"/></span>
	            </c:when>
	            <c:when test="${SPRING_SECURITY_LAST_EXCEPTION.message == 'User is disabled'}">
	                <span class="errorlogin" ><spring:message code="login.error.disabled"/></span>
	            </c:when>
	         </c:choose>
         
        </p>
        <p class="submit"><input type="button" name="commit" value="Acceder" onclick="login.validateLogin();"></p>
      </form>
      </div>
    </div>
  </section>
  
</body>
</html>
