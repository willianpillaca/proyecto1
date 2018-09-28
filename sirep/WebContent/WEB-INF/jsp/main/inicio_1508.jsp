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
							<li class="active"><a href="index.html">Examenes Online</a></li>
							<li class="dropdown">
								<a href="#" class="dropdown-toggle " data-toggle="dropdown" data-hover="dropdown" data-delay="0" data-close-others="false">Novedades <b class=" icon-angle-down"></b></a>
								<ul class="dropdown-menu">
									<li><a href="typography.html">Typography</a></li>
									<li><a href="components.html">Components</a></li>
									<li><a href="pricingbox.html">Pricing box</a></li>
								</ul>
							</li>
							<li><a href="#" role="button" data-toggle="modal" data-target="#login-modal">Registrar</a></li>							
							<li><a href="login.app" role="button">Iniciar Sesión</a></li>
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
							<li class="active">Cursos</li>
						</ul>
					</div>
				</div>
			</div>
		</section>		
		<section id="content">
			<div class="container">
						<div class="row">
							<main id="items" class="col-lg-12 row"></main>
							
							
							
						
						</div>
						<div class="row">
							<aside class="col-sm-12">
				                <h2>Carrito</h2>
				                <!-- Elementos del carrito -->
				                <ul id="carrito" class="list-group"></ul>
				                <hr>
				                <!-- Precio total -->
				                <p class="text-right txtTotal">Total: <span id="total"></span>&nbsp;Soles <a href="#" class="btn btn-success btn-medium btn-rounded" data-toggle="modal" data-target="#formPagoModal">Continuar</a></p> 
				            </aside>						
						</div>
						
					</div>
				</div>
				<!-- divider -->
				<div class="row">
					<div class="col-lg-12">
						<div class="solidline">
						</div>
					</div>
				</div>
			</div>
		</section>
				<!-- inicio de formulario de pago -->
		<div class="modal fade" id="formPagoModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
    	<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header" align="center">					
					<img id="img_logo" src="librerias/imagenes/logo_visa.png">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span class="fa fa-close" aria-hidden="true"></span>
					</button>
				</div>
                
                <!-- Begin # DIV Form -->
                <div id="div_forms_pago">                
                    <!-- Begin # Login Form -->
                    <form id="form_pago" action="pagarvisa.app" method="post">
		                <div class="modal-body">
				    		<div id="div-login-msg">
                                <div id="icon-login-msg" class="fa fa-cog"></div>
                                <span id="text-login-msg">Ingrese los datos de su cuenta.</span>
                            </div>
				    		<input id="pago_nombres" class="form-control" type="text" placeholder="Nombres" required>
				    		<input id="pago_apellido" class="form-control" type="password" placeholder="Apellido" required>
				    		<input id="pago_email" class="form-control" type="text" placeholder="correo electrónico" required>
				    		<input id="pago_dni" class="form-control" type="text" placeholder="DNI" required>
				    		<input id="pago_dni" class="form-control" type="text" value="120" required>
				    		
                            
        		    	</div>
				        <div class="modal-footer">
                            <div>
                                <button type="submit" id="btnPagarVisa" class="btn btn-theme btn-lg btn-block">Pagar</button>
                            </div>				    	    
				        </div>
                    </form>
                    <!-- End # Login Form -->                    
                    
                </div>
                <!-- End # DIV Form -->
                
			</div>
		</div>
	</div>
		
		
		<!-- fin de formulario de pago -->
		
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

	<script>
	$(document).ready(function() {
	      console.log('aaaa');
		  // Variables
	            let baseDeDatos = [
	                {
	                    id: 1,
	                    nombre: 'Microsoft Word 2015',
	                    img:'<img src="librerias/imagenes/icon_word_64.png">',
	                    precio: 120
	                },
	                {
	                    id: 2,
	                    nombre: 'Microsoft Excel 2015',
	                    img:'<img src="librerias/imagenes/icon_excel_64.png">',
	                    precio: 130
	                },
	                {
	                    id: 3,
	                    nombre: 'Linux Server',
	                    img:'<img src="librerias/imagenes/icon_linux_64.png">',
	                    precio:150
	                },
	                {
	                    id: 4,
	                    nombre: 'Windows Server',
	                    img:'<img src="librerias/imagenes/icon_windows_64.png">',
	                    precio: 180
	                },
	                {
	                    id: 5,
	                    nombre: 'Microsoft Acces',
	                    img:'<img src="librerias/imagenes/icon_acces_64.png">',
	                    precio: 120
	                },
	                {
	                    id: 6,
	                    nombre: 'SQL server 2015',
	                    img:'<img src="librerias/imagenes/icon_sql_64.png">',
	                    precio: 130
	                },
	                {
	                    id: 7,
	                    nombre: 'Microsoft office 2013',
	                    img:'<img src="librerias/imagenes/icon_office_64.png">',
	                    precio:150
	                },
	                {
	                    id: 8,
	                    nombre: 'Java Developer',
	                    img:'<img src="librerias/imagenes/icon_java_64.png">',
	                    precio: 180
	                }

	            ]
	            let $items = document.querySelector('#items');
	            let carrito = [];
	            let total = 0;
	            let $carrito = document.querySelector('#carrito');
	            let $total = document.querySelector('#total');
	            
				/**
				<div class=" col-lg-3">
									<div class="box">
										<div class="box-gray aligncenter">
											<h4>Curso 1</h4>
											<div class="icon">
												<i class="fa fa-desktop fa-3x"></i>
											</div>
											<p>
												Voluptatem accusantium doloremque laudantium sprea totam rem aperiam.
											</p>

										</div>
										<div class="box-bottom">
											<a href="#">Inscribirse</a>
										</div>
									</div>
								</div>			
				**/			
				// Funciones			
	            function renderItems () {
	                for (let info of baseDeDatos) {
	                    // Estructura
	                    let miNodo = document.createElement('div');
	                    miNodo.classList.add('card', 'col-lg-3');
	                    // Body
	                    let miNodoCardBody = document.createElement('div');
	                    miNodoCardBody.classList.add('card-body', 'box');
						// Body
	                    let miNodoCardBodyW = document.createElement('div');
	                    miNodoCardBodyW.classList.add('box-gray','aligncenter');
	                    // Titulo
	                    let miNodoTitle = document.createElement('h4');
	                    miNodoTitle.classList.add('card-title');
	                    miNodoTitle.textContent = info['nombre'];
                        // Imagen
                        let miNodoImagen = document.createElement('div');
                        miNodoImagen.classList.add('icon');
                        miNodoImagen.innerHTML = info['img'];                        
	                    
	                    // Precio
	                    let miNodoPrecio = document.createElement('h3');
	                    miNodoPrecio.classList.add('card-text');
	                    miNodoPrecio.textContent = ' S/ '+ info['precio'] ;
	                    // Boton 
	                    let miNodoBoton = document.createElement('button');
	                    miNodoBoton.classList.add('btn', 'btn-theme');
	                    miNodoBoton.textContent = '+ Agregar';
	                    miNodoBoton.setAttribute('marcador', info['id']);
	                    miNodoBoton.addEventListener('click', anyadirCarrito);
	                    // Insertamos
						miNodoCardBody.appendChild(miNodoCardBodyW);
	                    miNodoCardBodyW.appendChild(miNodoTitle);
	                    miNodoCardBodyW.appendChild(miNodoImagen);
	                    miNodoCardBodyW.appendChild(miNodoPrecio);
	                    miNodoCardBodyW.appendChild(miNodoBoton);
	                    miNodo.appendChild(miNodoCardBody);
	                    $items.appendChild(miNodo);
	                }
	            }
	            function anyadirCarrito () {
	                // Anyadimos el Nodo a nuestro carrito
	                carrito.push(this.getAttribute('marcador'))
	                // Calculo el total
	                calcularTotal();
	                // Renderizamos el carrito 
	                renderizarCarrito();

	            }

	            function renderizarCarrito () {
	                // Vaciamos todo el html
	                $carrito.textContent = '';
	                // Generamos los Nodos a partir de carrito
	                carrito.forEach(function (item, indice) {
	                    // Obtenemos el item que necesitamos de la variable base de datos
	                    let miItem = baseDeDatos.filter(function(itemBaseDatos) {
	                        return itemBaseDatos['id'] == item;
	                    });
	                    // Creamos el nodo del item del carrito
	                    let miNodo = document.createElement('li');
	                    miNodo.classList.add('list-group-item', 'text-right', 'txtCompra');
	                    
	                    miNodo.textContent = miItem[0]['nombre'] +" - "+ miItem[0]['precio']+' Soles';//revisar
	                    // Boton de borrar
	                    let miBoton = document.createElement('button');
	                    miBoton.classList.add('btn', 'btn-danger', 'mx-5', 'btnEliminarCompra');
	                    miBoton.textContent = 'Eliminar';
	                    miBoton.setAttribute('posicion', indice);
	                    miBoton.addEventListener('click', borrarItemCarrito);
	                    // Mezclamos nodos
	                    miNodo.appendChild(miBoton);
	                    $carrito.appendChild(miNodo);
	                })
	            }

	            function borrarItemCarrito () {
	                // Obtenemos la posicion que hay en el boton pulsado
	                let posicion = this.getAttribute('posicion');
	                // Borramos la posicion que nos interesa
	                carrito.splice(posicion, 1);
	                // volvemos a renderizar
	                renderizarCarrito();
	                // Calculamos de nuevo el precio
	                calcularTotal();
	            }

	            function calcularTotal () {
	                // Limpiamos precio anterior
	                total = 0;
	                // Recorremos el array del carrito
	                for (let item of carrito) {
	                    // De cada elemento obtenemos su precio
	                    let miItem = baseDeDatos.filter(function(itemBaseDatos) {
	                        return itemBaseDatos['id'] == item;
	                    });
	                    total = total + miItem[0]['precio'];
	                }
	                // Formateamos el total para que solo tenga dos decimales
	                let totalDosDecimales = total.toFixed(2);
	                // Renderizamos el precio en el HTML
	                $total.textContent = totalDosDecimales;
	            }
	            // Eventos

	            // Inicio
	            renderItems();
	});


	</script>

</body>

</html>
