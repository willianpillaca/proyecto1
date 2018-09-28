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
								<a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="0" data-close-others="false"><span>Bienvenido: </span>${usuario}<b class="fa fa-sort-down"></b></a>
								<ul class="dropdown-menu">
									<li><a href="typography.html">Cerrar sesion</a></li>
									<li><a href="components.html">Cambiar contraseña</a></li>									
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
								<table id="mytable" class="table table-bordred table-striped">
									<thead>                   
										<th><input type="checkbox" id="checkall" /></th>
										<th>Curso</th>
										<th>Profesor</th>
										<th>Estado</th>
										<th>Fecha de Inscripcion</th>
										<th>Fecha de Evaluacion</th>
										<th></th>                      
										<th></th>
									</thead>
									<tbody>
										<tr>
											<td><input type="checkbox" class="checkthis" /></td>
											<td>Mircrosoft Word 2013</td>
											<td>Espinoza Morales Mariela</td>
											<td>Evaluado</td>
											<td>10/07/2018</td>
											<td>10/07/2018</td>
											<td><p data-placement="top" data-toggle="tooltip" title="Edit"><button class="btn btn-theme btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" ><span class="fa fa-edit"></span></button></p></td>
											<td><p data-placement="top" data-toggle="tooltip" title="Delete"><button class="btn btn-success btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><span class="fa fa-address-card-o"></span></button></p></td>
										</tr>
										<tr>
											<td><input type="checkbox" class="checkthis" /></td>
											<td>Mircrosoft Excel 2013</td>
											<td>Peve Saldaña Diana</td>
											<td>Pediente por Evaluar</td>
											<td>10/07/2018</td>
											<td>10/07/2018</td>
											<td><p data-placement="top" data-toggle="tooltip" title="Rendir Examen"><button class="btn btn-theme btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" ><span class="fa fa-edit"></span></button></p></td>
											<td><p data-placement="top" data-toggle="tooltip" title="Delete"><button class="btn btn-success btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><span class="fa fa-address-card-o"></span></button></p></td>
										</tr>
										<tr>
											<td><input type="checkbox" class="checkthis" /></td>
											<td>Autocad 2018</td>	
											<td>Espinoza Quiroz Lourdes</td>
											<td>Pediente por Evaluar</td>
											<td>10/07/2018</td>
											<td>10/07/2018</td>
											<td><p data-placement="top" data-toggle="tooltip" title="Rendir Examen"><button class="btn btn-theme btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" ><span class="fa fa-edit"></span></button></p></td>
											<td><p data-placement="top" data-toggle="tooltip" title="Delete"><button class="btn btn-success btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><span class="fa fa-address-card-o"></span></button></p></td>
										</tr>
										<tr>
											<td><input type="checkbox" class="checkthis" /></td>
											<td>Arcgis 2015</td>
											<td>Cordova Aquino ricardo</td>
											<td>Pediente por Evaluar</td>
											<td>10/07/2018</td>
											<td>10/07/2018</td>
											<td><p data-placement="top" data-toggle="tooltip" title="Rendir Examen"><button class="btn btn-theme btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" ><span class="fa fa-edit"></span></button></p></td>
											<td><p data-placement="top" data-toggle="tooltip" title="Delete"><button class="btn btn-success btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><span class="fa fa-address-card-o"></span></button></p></td>
										</tr>
										<tr>
											<td><input type="checkbox" class="checkthis" /></td>
											<td>Linux Basico</td>
											<td>Pillaca Meneses willian</td>
											<td>Pediente por Evaluar</td>
											<td>10/07/2018</td>
											<td>10/07/2018</td>
											<td><p data-placement="top" data-toggle="tooltip" title="Rendir Examen"><button class="btn btn-theme btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" ><span class="fa fa-edit"></span></button></p></td>
											<td><p data-placement="top" data-toggle="tooltip" title="Delete"><button class="btn btn-success btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><span class="fa fa-address-card-o"></span></button></p></td>
										</tr>
										
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
				<!-- divider -->
				<!--<div class="row">
					<div class="col-lg-12">
						<div class="solidline">
						</div>
					</div>
				</div>-->
				

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
		
		<div class="modal fade" id="login-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
    	<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header" align="center">					
					<img class="img-circle" id="img_logo" src="http://bootsnipp.com/img/logo.jpg">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span class="fa fa-close" aria-hidden="true"></span>
					</button>
				</div>
                
                <!-- Begin # DIV Form -->
                <div id="div-forms">
                
                    <!-- Begin # Login Form -->
                    <form id="login-form">
		                <div class="modal-body">
				    		<div id="div-login-msg">
                                <div id="icon-login-msg" class="fa fa-cog"></div>
                                <span id="text-login-msg">Ingrese su usuario y password.</span>
                            </div>
				    		<input id="login_username" class="form-control" type="text" placeholder="usuario" required>
				    		<input id="login_password" class="form-control" type="password" placeholder="Password" required>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox"> recordar password
                                </label>
                            </div>
        		    	</div>
				        <div class="modal-footer">
                            <div>
                                <button type="submit" class="btn btn-theme btn-lg btn-block">Login</button>
                            </div>
				    	    <div>
                                <button id="login_lost_btn" type="button" class="btn btn-link">olvidaste tu password?</button>
                                <button id="login_register_btn" type="button" class="btn btn-link">Registrarme</button>
                            </div>
				        </div>
                    </form>
                    <!-- End # Login Form -->
                    
                    <!-- Begin | Lost Password Form -->
                    <form id="lost-form" style="display:none;">
    	    		    <div class="modal-body">
		    				<div id="div-lost-msg">
                                <div id="icon-lost-msg" class="fa fa-envelope"></div>
                                <span id="text-lost-msg">Ingrese su correo.</span>
                            </div>
		    				<input id="lost_email" class="form-control" type="text" placeholder="E-Mail" required>
            			</div>
		    		    <div class="modal-footer">
                            <div>
                                <button type="submit" class="btn btn-theme btn-lg btn-block">Enviar</button>
                            </div>
                            <div>
                                <button id="lost_login_btn" type="button" class="btn btn-link">Ingresar</button>
                                <button id="lost_register_btn" type="button" class="btn btn-link">Registrarme</button>
                            </div>
		    		    </div>
                    </form>
                    <!-- End | Lost Password Form -->
                    
                    <!-- Begin | Register Form -->
                    <form id="register-form" style="display:none;">
            		    <div class="modal-body">
		    				<div id="div-register-msg">
                                <div id="icon-register-msg" class="fa fa-user"></div>
                                <span id="text-register-msg">Nueva Cuenta.</span>
                            </div>
		    				<input id="register_username" class="form-control" type="text" placeholder="Usuario " required>
                            <input id="register_email" class="form-control" type="text" placeholder="E-Mail" required>
							<input id="register_nombres" class="form-control" type="text" placeholder="Nombres" required>
							<input id="register_apaterno" class="form-control" type="text" placeholder="Apellido Paterno" required>
							<input id="register_amaterno" class="form-control" type="text" placeholder="Apellido Materno" required>
                            <input id="register_password" class="form-control" type="password" placeholder="Password" required>
            			</div>
		    		    <div class="modal-footer">
                            <div>
                                <button type="submit" class="btn btn-theme btn-lg btn-block">Registrar</button>
                            </div>
                            <div>
                                <button id="register_login_btn" type="button" class="btn btn-link">Ingresar</button>
                                <button id="register_lost_btn" type="button" class="btn btn-link">olvidaste tu password?</button>
                            </div>
		    		    </div>
                    </form>
                    <!-- End | Register Form -->
                    
                </div>
                <!-- End # DIV Form -->
                
			</div>
		</div>
	</div>
		
		<footer>
			<div class="container">
				<div class="row">
					<div class="col-lg-3">
						<div class="widget">
							<h5 class="widgetheading">Get in touch with us</h5>
							<address>
					<strong>Moderna company Inc</strong><br>
					 Modernbuilding suite V124, AB 01<br>
					 Someplace 16425 Earth </address>
							<p>
								<i class="icon-phone"></i> (123) 456-7890 - (123) 555-7891 <br>
								<i class="icon-envelope-alt"></i> email@domainname.com
							</p>
						</div>
					</div>
					<div class="col-lg-3">
						<div class="widget">
							<h5 class="widgetheading">Pages</h5>
							<ul class="link-list">
								<li><a href="#">Press release</a></li>
								<li><a href="#">Terms and conditions</a></li>
								<li><a href="#">Privacy policy</a></li>
								<li><a href="#">Career center</a></li>
								<li><a href="#">Contact us</a></li>
							</ul>
						</div>
					</div>
					<div class="col-lg-3">
						<div class="widget">
							<h5 class="widgetheading">Latest posts</h5>
							<ul class="link-list">
								<li><a href="#">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</a></li>
								<li><a href="#">Pellentesque et pulvinar enim. Quisque at tempor ligula</a></li>
								<li><a href="#">Natus error sit voluptatem accusantium doloremque</a></li>
							</ul>
						</div>
					</div>
					<div class="col-lg-3">
						<div class="widget">
							<h5 class="widgetheading">Flickr photostream</h5>
							<div class="flickr_badge">
								<script type="text/javascript" src="https://www.flickr.com/badge_code_v2.gne?count=8&amp;display=random&amp;size=s&amp;layout=x&amp;source=user&amp;user=34178660@N03"></script>
							</div>
							<div class="clear">
							</div>
						</div>
					</div>
				</div>
			</div>
			<div id="sub-footer">
				<div class="container">
					<div class="row">
						<div class="col-lg-6">
							<div class="copyright">
								<p>&copy; Moderna Theme. All right reserved.</p>
								<div class="credits">
									<!--
                    All the links in the footer should remain intact.
                    You can delete the links only if you purchased the pro version.
                    Licensing information: https://bootstrapmade.com/license/
                    Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/buy/?theme=Moderna
                  -->
									Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
								</div>
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

</body>

</html>
