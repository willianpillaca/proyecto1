<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
	<meta charset="utf-8">
	<title>Examen Online</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<meta name="description" content="" />
	<!-- css -->
	<link href="librerias/willian/css/bootstrap.min.css" rel="stylesheet" />
	<link href="librerias/willian/css/fancybox/jquery.fancybox.css" rel="stylesheet">
	<link href="librerias/willian/css/jcarousel.css" rel="stylesheet" />
	<link href="librerias/willian/css/flexslider.css" rel="stylesheet" />
	<link href="librerias/willian/css/style.css" rel="stylesheet" />
	<link href="librerias/willian/css/ginnet.css" rel="stylesheet" />	
	<!-- Theme skin -->
	<link href="librerias/willian/skins/default.css" rel="stylesheet" />

	

</head>
<body>
	<div id="wrapper">
		<!-- start header -->
		<header>
			<div class="navbar navbar-default navbar-static-top">
				<div class="container">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
						<a class="navbar-brand" href="index.html"><span>C</span>ertifica-t</a>
					</div>
					<div class="navbar-collapse collapse ">
						<ul class="nav navbar-nav">
							<li><a href="index.html">Examenes Online</a></li>
							<li><a href="novedades.html">Novedades <b class=" icon-angle-down"></b></a></li>
							<li class="active"><a href="cursosxalumno.app?cod=10">Mis Cursos</a></li>							
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="0" data-close-others="false"><span>Bienvenido: </span>${usuario.vUsuarioUsername}&nbsp;&nbsp;<b class="fa fa-sort-down"></b></a>
								<ul class="dropdown-menu">
									<li><a href="logout.app">Cerrar sesion</a></li>																		
								</ul>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</header>
		<!-- end header -->
		<section id="inner-headline">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<ul class="breadcrumb">
							<li><a href="#"><i class="fa fa-home"></i></a><i class="icon-angle-right"></i></li>
							<li class="active">Mis Cursos</li>
						</ul>
					</div>
				</div>
			</div>
		</section>		
		<section id="content">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<div class="row">
							<h4>Cursos Matriculados</h4>
							<div class="table-responsive">
								<table id="myTableCursos" class="table table-bordred table-striped">
									<thead>                   
										<th><input type="checkbox" id="checkall" /></th>
										<th>Curso</th>
										<th>Nombre</th>
										<th>Descripcion</th>										
										<th>Estado</th>
										<th>Fecha de Inscripcion</th>
										<th>Fecha de Evaluacion</th>										                      
										<th></th>
									</thead>
									<tbody>										
									</tbody>
								
								</table>
								
								<div class="clearfix"></div>
								<ul class="pagination pull-right">
								  <li class="disabled"><a href="#"><span class="fa fa-angle-left"></span></a></li>
								  <li class="active"><a href="#">1</a></li>
								  <li><a href="#">2</a></li>
								  <li><a href="#">3</a></li>
								  <li><a href="#">4</a></li>
								  <li><a href="#">5</a></li>
								  <li><a href="#"><span class="fa fa-angle-right"></span></a></li>
								</ul>								
							</div>
						</div>
					</div>
				</div>
			</div>
			
			<div class="modal fade" id="edit" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
      			<div class="modal-dialog">
    				<div class="modal-content">
          				<div class="modal-header">
        					<button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="fa fa-close" aria-hidden="true"></span></button>
        						<h2 class="modal-title custom_align" id="Heading">Esta seguro de rendir el Examen?</h2>
      					</div>
          				<div class="modal-body">
          					<h4>Uted tendra un tiempo de 60  minutos para resolver el Examen</h4>
      					</div>
          				<div class="modal-footer ">
        					<button type="button" id="btnIniciarExamen" class="btn btn-warning btn-lg" style="width: 100%;"><span class="fa fa-clock-o"></span> Aceptar</button>
      					</div>
        			</div>
    				<!-- /.modal-content --> 
  				</div>
      			<!-- /.modal-dialog --> 
    		</div>
    
    
    
    <div class="modal fade" id="delete" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
      <div class="modal-dialog">
    <div class="modal-content">
          <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
        <h4 class="modal-title custom_align" id="Heading">Delete this entry</h4>
      </div>
          <div class="modal-body">
       
       <div class="alert alert-danger"><span class="glyphicon glyphicon-warning-sign"></span> Are you sure you want to delete this Record?</div>
       
      </div>
        <div class="modal-footer ">
        <button type="button" class="btn btn-success" ><span class="glyphicon glyphicon-ok-sign"></span> Yes</button>
        <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> No</button>
      </div>
        </div>
    <!-- /.modal-content --> 
  </div>
      <!-- /.modal-dialog --> 
    </div>
			
			
		</section>
		
		
		
		<footer>			
			<div id="sub-footer">
				<div class="container">
					<div class="row">
						<div class="col-lg-6">
							<div class="copyright">
								<p>&copy; Ginnet 2018</p>								
							</div>
						</div>
						<div class="col-lg-6">
							<ul class="social-network">
								<li><a href="#" data-placement="top" title="Facebook"><i class="fa fa-facebook"></i></a></li>
								<li><a href="#" data-placement="top" title="Twitter"><i class="fa fa-twitter"></i></a></li>
								<li><a href="#" data-placement="top" title="Linkedin"><i class="fa fa-linkedin"></i></a></li>
								<li><a href="#" data-placement="top" title="Pinterest"><i class="fa fa-pinterest"></i></a></li>
								<li><a href="#" data-placement="top" title="Google plus"><i class="fa fa-google-plus"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</footer>
	</div>
	<a href="#" class="scrollup"><i class="fa fa-angle-up active"></i></a>
	<!-- javascript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="librerias/willian/js/jquery.js"></script>
	<script src="librerias/willian/js/jquery.easing.1.3.js"></script>
	<script src="librerias/willian/js/bootstrap.min.js"></script>
	<script src="librerias/willian/js/jquery.fancybox.pack.js"></script>
	<script src="librerias/willian/js/jquery.fancybox-media.js"></script>
	<script src="librerias/willian/js/google-code-prettify/prettify.js"></script>
	<script src="librerias/willian/js/portfolio/jquery.quicksand.js"></script>
	<script src="librerias/willian/js/portfolio/setting.js"></script>
	<script src="librerias/willian/js/jquery.flexslider.js"></script>
	<script src="librerias/willian/js/animate.js"></script>
	<script src="librerias/willian/js/custom.js"></script>
	<script src="librerias/willian/js/ginnet.js"></script>
	
	<script>
	    $(document).ready(function() {
	    	$.ajax({ 
	    		type: 'POST', 
	    		url: 'listarmiscursos.app', 
	            data: { idAlumno: '2'}, 
	    		success: function (response) {	
	    			console.log('data preguntas->>>');
	    			console.log(response.data);
	    			var data = response.data;
	    			console.log(data.length);
	    			var html ='';
					for(var i=0; i<data.length; i++){
						html ="<tr>"+
							"<td><input type='checkbox' class='checkthis' /></td>"+
							"<td>"+data[i].codCurso+"</td>"+
							"<td>"+data[i].nombre+"</td>"+
							"<td>"+data[i].descripcion+"</td>"+
							"<td>Pediente por Evaluar</td>"+
							"<td>23/07/2018</td>"+
							"<td>23/07/2018</td>"+
// 							"<td><p data-placement='top' data-toggle='tooltip' title='Rendir Examen'><button class='btn btn-theme' data-title='Rendir Examen' data-toggle='modal' data-target=''#edit' ><span class='fa fa-edit'></span></button></p></td>"+
							"<td><button class='btn btn-success' onclick='fnRendirExamen(\""+data[i].codCurso+"\", \""+data[i].nombre+"\", \""+data[i].id+"\")'>Rendir</button></td>"+
						"</tr>";
						$('#myTableCursos tbody').append(html);
					}	    			
	    		}
	    	});
		});

    </script>

</body>

</html>