<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="css/bootstrap.min.css" rel="stylesheet">
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
	<style>
	.table {
    border: none;
}

.table-definition thead th:first-child {
    pointer-events: none;
    background: white;
    border: none;
}

.table td {
    vertical-align: middle;
}

.page-item > * {
    border: none;
}

.custom-checkbox {
  min-height: 1rem;
  padding-left: 0;
  margin-right: 0;
  cursor: pointer; 
}
  .custom-checkbox .custom-control-indicator {
    content: "";
    display: inline-block;
    position: relative;
    width: 30px;
    height: 10px;
    background-color: #818181;
    border-radius: 15px;
    margin-right: 10px;
    -webkit-transition: background .3s ease;
    transition: background .3s ease;
    vertical-align: middle;
    margin: 0 16px;
    box-shadow: none; 
  }
    .custom-checkbox .custom-control-indicator:after {
      content: "";
      position: absolute;
      display: inline-block;
      width: 18px;
      height: 18px;
      background-color: #f1f1f1;
      border-radius: 21px;
      box-shadow: 0 1px 3px 1px rgba(0, 0, 0, 0.4);
      left: -2px;
      top: -4px;
      -webkit-transition: left .3s ease, background .3s ease, box-shadow .1s ease;
      transition: left .3s ease, background .3s ease, box-shadow .1s ease; 
    }
  .custom-checkbox .custom-control-input:checked ~ .custom-control-indicator {
    background-color: #84c7c1;
    background-image: none;
    box-shadow: none !important; 
  }
    .custom-checkbox .custom-control-input:checked ~ .custom-control-indicator:after {
      background-color: #84c7c1;
      left: 15px; 
    }
  .custom-checkbox .custom-control-input:focus ~ .custom-control-indicator {
    box-shadow: none !important; 
  }
  
  /* The Modal (background) */

	
	
	</style>
</head>
<body>
	<div class="navbar navbar-fixed-top">
	  <div class="navbar-inner">
	    <div class="container"> 
	    	<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span> </a><a class="brand" href="index.html">Sistema de Certificaciones </a>
	      <div class="nav-collapse">
	        <ul class="nav pull-right">
	          <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
	                            class="icon-cog"></i> Ingresar <b class="caret"></b></a>
	            
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
	<!-- /subnavbar -->
	<div class="main">
	  <div class="main-inner">
	    <div class="container">
	      <div class="row">
	        <div class="span6">
	        	<div style="padding-top: 10px; padding-right: 20px">
	        		<form id="edit-profile" class="form-horizontal">
						<fieldset>
							<div class="control-group">											
								<label class="control-label" for="username">Apellidos y Nombres</label>
								<div class="controls">
									<input type="text" class="span6 disabled" id="username" placeholder="ingrese nombre y apellido" style="width: 350px;">												
								</div>				
							</div>
							<div class="control-group">											
								<label class="control-label" for="firstname">Usuario</label>
								<div class="controls">
									<input type="text" class="span6" id="firstname" placeholder="ingrese un mombre de usuario" style="width: 350px;">
								</div> <!-- /controls -->				
							</div> <!-- /control-group -->
										
							<div class="control-group">											
								<label class="control-label" for="email">Correo</label>
								<div class="controls">
									<input type="text" class="span4" id="email" placeholder="willian@gmail.com" style="width: 350px;">
								</div> <!-- /controls -->				
							</div> <!-- /control-group -->									
										
							<div class="control-group">											
								<label class="control-label" for="password1">Password</label>
								<div class="controls">
									<input type="password" class="span4" id="password1" placeholder="ingrese una contrase&ntilde;a" style="width: 350px;">
								</div> <!-- /controls -->				
							</div> <!-- /control-group -->
										
							<div class="control-group">											
								<label class="control-label" for="password2">Confirmar </label>
								<div class="controls">
									<input type="password" class="span4" id="password2" placeholder="repita su contrase&ntilde;a" style="width: 350px;">
								</div> <!-- /controls -->				
							</div> <!-- /control-group -->
                                        	
							<div class="form-actions">
								<button type="submit" class="btn btn-primary">Registrasrse</button>								
							</div> <!-- /form-actions -->
						</fieldset>
					</form>
					<div>
			          	<a href="testexamen.app"><img src="librerias/imagenes/logo_visa.png" title ="Pagar con Visa" style="margin: 0px 0px 0px 0px;"></a>
			        </div>	        	
	        	</div>	          
	          
	          
	          	          	           
	        </div>
	        <div class="span6">
	        	<div class="widget widget-table action-table">
	            <div class="widget-header"> <i class="icon-th-list"></i>
	              <h3>Cursos Disponibles</h3>
	            </div>	            
	            <div class="widget-content">	            	
           			<table id ="tbl_listado_cursos" data-toggle="table" data-height="460"
		               data-ajax="ajaxRequest" data-search="true" data-side-pagination="server"
		               data-pagination="true" class="table table-striped table-bordered">
	                	<thead>
		                  	<tr>
			                    <th data-field="id">Nro</th>
				                <th data-field="nombre">Nombre del Curso</th>
				                <th data-field="descripcion">Descripcion</th>		                
				                <th data-field="costo">Costo</th>
				                <th class="td-actions" style="width: 100px;">Seleccionar</th>
		                  	</tr>
	                	</thead>
		                <tbody>	                  
	                	</tbody>
	              	</table>	              
	            </div>
	          </div>
	          
	          	          
	          
	        </div>
	        <!-- /span12 -->	        
	      </div>
	      <!-- /row -->
<!-- 	      ventna modal  -->
			<!--vetana modal para resultados -->
			
			<!-- fin de ventana modal -->		
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
	        <div class="span12"> &copy; 2018 <a href="#">willian1802@gmail.com</a>. </div>
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
	<script src="https://static-content.vnforapps.com/v1/js/checkout.js?qa=true"></script>  
	<script>

	
    

	function ajaxRequest() {
        console.log('ccccc');
        // data you need
        $.ajax({ 
            type: 'GET', 
            url: 'findallcursos.app', 
	//       data: { get_param: 'value' }, 
            success: function (response) {	
        		console.log('aaaaa');  
        		
            	$.each(response.data, function(i, customer){	
//             		console.log(customer.descripcion);        					
					var customerRow = '<tr>' +
										'<td>' + customer.id + '</td>' +
										'<td>' + customer.nombre + '</td>' +
										'<td>' + customer.descripcion + '</td>' +										
										'<td>' + customer.costo + '</td>' +	  
										//'<td class="td-actions"><button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">Pagar</button></td>' +
										'<td><label class="custom-control custom-checkbox"><input type="checkbox" style="display: none" class="custom-control-input"><span class="custom-control-indicator"></span></label></td>'+      										
									  '</tr>';
					
					$('#tbl_listado_cursos tbody').append(customerRow);
					
		        });
            }
        });
        
    } 
	
	        	
	
	            
	
	        $(document).ready(function() {

				//metodo para inscribirse en los cursos
				
								
		        
	        	ajaxRequest();
	        	console.log('dentro e ajax');        	
	        	
	            


		    
	        
	      });
	    </script><!-- /Calendar -->
	
	
</body>
</html>