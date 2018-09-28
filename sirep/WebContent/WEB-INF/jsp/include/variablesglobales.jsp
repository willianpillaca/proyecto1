<%@page import="pe.gob.ep.ginnet.util.Constante"%>
<jsp:useBean id="constante" scope="session" class="pe.gob.ep.ginnet.util.Constante" />
<% 	
	constante = new Constante();
%>
<script>
 /*
 *definicion de constantes
 */
 <%=constante.CONSTANTE_JAVASCRIPT%>
 
 /*
  * Variables de Sesion
  */
  var MENU_USER_OPCIONES_JSP='${usuario.strMenu}';
  var IDE_USUARIO='${usuario.iUsuarioId}';
  var ROL_ID_JSP = parseInt('${usuario.idRolSelectedLogin}',10);	
  var ROL_NAME_JSP = '${usuario.rolName}';
  var USER_JSP = '${usuario.vUsuarioUsername}';
  var NOMBRE_USER_JSP='${usuario.vUsuarioNombres} ${usuario.vUsuarioApPaterno} ${usuario.vUsuarioApMaterno}';
  var USER_ID_JSP='${usuario.iUsuarioId}';

</script>