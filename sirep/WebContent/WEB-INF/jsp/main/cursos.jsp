<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">	
	<link href="librerias/css/bootstrap.min.css" rel="stylesheet">
	
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<link href="librerias/css/bootstrap.min.css" rel="stylesheet">
	<link href="librerias/css/bootstrap-responsive.min.css" rel="stylesheet">
	
	<link href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600"
	        rel="stylesheet">
	<link href="librerias/css/font-awesome.css" rel="stylesheet">
	<link href="librerias/css/style.css" rel="stylesheet">
	<link href="librerias/css/pages/dashboard.css" rel="stylesheet">
	<link rel="stylesheet" href="librerias/css/bootstrap-table.min.css">
	<title>::Ginnet::</title>
</head>
<body>
	<div class="navbar navbar-fixed-top">
	  <div class="navbar-inner">
	    <div class="container"> <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"><span
	                    class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span> </a><a class="brand" href="index.html">Sistema de Certificaciones </a>
	      <div class="nav-collapse">
	        <ul class="nav pull-right">
	          <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
	                            class="icon-cog"></i> Account <b class="caret"></b></a>
	            <ul class="dropdown-menu">
	              <li><a href="javascript:;">Settings</a></li>
	              <li><a href="javascript:;">Help</a></li>
	            </ul>
	          </li>
	          <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
	                            class="icon-user"></i> ${usuario.vUsuarioUsername} <b class="caret"></b></a>
	            <ul class="dropdown-menu">
	              <li><a href="javascript:;">Profile</a></li>
	              <li><a href="javascript:;">Logout</a></li>
	            </ul>
	          </li>
	        </ul>
	        <form class="navbar-search pull-right">
	          <input type="text" class="search-query" placeholder="Buscar">
	        </form>
	      </div>
	      <!--/.nav-collapse --> 
	    </div>
	    <!-- /container --> 
	  </div>
  		<!-- /navbar-inner --> 
	</div>
	<!-- /navbar -->
	<div class="subnavbar">
	  <div class="subnavbar-inner">
	    <div class="container">
	      <ul class="mainnav">
	        <li><a href="index.html"><i class="icon-dashboard"></i><span>Alumnos</span> </a> </li>
	        <li class="active"><a href="listadocursos.app"><i class="icon-list-alt"></i><span>Cursos</span> </a> </li>
	        <li><a href="guidely.html"><i class="icon-facetime-video"></i><span>Profesores</span> </a></li>
	        <li><a href="listadopreguntas.app"><i class="icon-bar-chart"></i><span>Preguntas</span> </a> </li>
	        <li><a href="shortcodes.html"><i class="icon-code"></i><span>Examenes</span> </a> </li>
	        <li class="dropdown"><a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown"> <i class="icon-long-arrow-down"></i><span>Drops</span> <b class="caret"></b></a></li>
	      </ul>
	    </div>
	    <!-- /container --> 
	  </div>
	  <!-- /subnavbar-inner --> 
	</div>
	<!-- /subnavbar -->
	<div class="main">
	  <div class="main-inner">
	    <div class="container">	      
	      <!-- /row --> 
	      <div class="row">
	      		<div class="span12">
	      			<div class="widget ">
	      				<div class="widget-header">
		      				<i class="icon-user"></i>
		      				<h3>Cursos</h3>
		  				</div>
		  				<div class="widget-content">
		      				<form id="edit-profile" class="form-horizontal">
		      						<div class="control-group">											
										<label class="control-label" for="firstname">Curso</label>
										<div class="controls">
											<input type="text" class="span6" id="firstname">
										</div> <!-- /controls -->				
									</div>
									<div class="form-actions">
										<button type="submit" class="btn btn-primary">Nuevo</button> 
										<button class="btn">Cancel</button>
									</div>
		      				</form>
	      				</div>
	      			</div>
	      			
	      			
	      		
	      		</div>
	      </div>
	      <div class="row">
	      	<div class="span12">
	      		<div class="widget widget-table action-table">
	            <div class="widget-header"> <i class="icon-th-list"></i>
	              <h3>Listado de Cursos</h3>
	            </div>
	            <!-- /widget-header -->
	            <div class="widget-content">
	              <table id ="tbl_cursos"
	              		data-toggle="table"
		               data-height="460"
		               data-ajax="ajaxRequest"
		               data-search="true"
		               data-side-pagination="server"
		               data-pagination="true"
	              		class="table table-striped table-bordered">
	                <thead>
	                  <tr>
	                    <th data-field="id">Nro</th>
		                <th data-field="nombre">Nombre del Curso</th>
		                <th data-field="descripcion">Descripcion</th>
		                <th data-field="tipoEvaluacion">Tipo de Evaluación</th>
		                <th data-field="costo">Costo</th>
	                  </tr>
	                </thead>
	                <tbody>
	                  
	                </tbody>
	              </table>
	            </div>
	            <!-- /widget-content --> 
	          </div>
	      	</div>	      	
	      </div>
	    </div>
	    <!-- /container --> 
	  </div>
	  <!-- /main-inner --> 
	</div>
	<!-- /main -->
	
	<!-- /extra -->
	<div class="footer">
	  <div class="footer-inner">
	    <div class="container">
	      <div class="row">
	        <div class="span12"> &copy; 2018 <a href="#">Willian Pillaca Meneses</a>. </div>
	        <!-- /span12 --> 
	      </div>
	      <!-- /row --> 
	    </div>
	    <!-- /container --> 
	  </div>
	  <!-- /footer-inner --> 
	</div>
	<!-- /footer --> 
	<!-- Le javascript
	================================================== --> 
	<!-- Placed at the end of the document so the pages load faster --> 
	<script src="librerias/js/jquery-1.7.2.min.js"></script> 
	<script src="librerias/js/excanvas.min.js"></script> 
	<script src="librerias/js/chart.min.js" type="text/javascript"></script> 
	<script src="librerias/js/bootstrap.js"></script>
	
	<script language="javascript" type="text/javascript" src="librerias/js/full-calendar/fullcalendar.min.js"></script>
	<script src="librerias/js/bootstrap-table.min.js"></script>
<!-- 	<script src="librerias/js/base.js"></script>  -->
	<script>     
	
	
	        $(document).ready(function() {	        	
	        	ajaxRequest();

	        	var $table = $('#tbl_cursos');
	        	//findallcursos.app
	            // your custom ajax request here
	            function ajaxRequest() {
	                
	                // data you need
	                $.ajax({ 
	                    type: 'GET', 
	                    url: 'findallcursos.app', 
// 	                    data: { get_param: 'value' }, 
	                    success: function (response) {	
		            		console.log(response);  
		            		
	                    	$.each(response.data, function(i, customer){	
// 	                    		console.log(customer.descripcion);        					
	        					var customerRow = '<tr>' +
	        										'<td><a href="">' + customer.id + '</a></td>' +
	        										'<td>' + customer.nombre + '</td>' +
	        										'<td>' + customer.descripcion + '</td>' +
	        										'<td>' + customer.tipoEvaluacion + '</td>' +
	        										'<td>' + customer.costo + '</td>' +	        										
	        									  '</tr>';
	        					
	        					$('#tbl_cursos tbody').append(customerRow);
	        					
	        		        });
	                    }
	                });
	                
	            } 
	        	
	        
	      });
	    </script><!-- /Calendar -->
	
	
</body>
</html>