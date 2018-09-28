<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Certifica-t</title>  
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">  
  <link rel="stylesheet" href="librerias/template/bower_components/bootstrap/dist/css/bootstrap.min.css">  
  <link rel="stylesheet" href="librerias/template/bower_components/font-awesome/css/font-awesome.min.css">  
  <link rel="stylesheet" href="librerias/template/bower_components/Ionicons/css/ionicons.min.css">  
  <link rel="stylesheet" href="librerias/template/dist/css/AdminLTE.min.css">  
  <link rel="stylesheet" href="librerias/template/dist/css/skins/_all-skins.min.css">  
  <link rel="stylesheet" href="librerias/template/bower_components/morris.js/morris.css">  
  <link rel="stylesheet" href="librerias/template/bower_components/jvectormap/jquery-jvectormap.css">  
  <link rel="stylesheet" href="librerias/template/bower_components/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css">  
  <link rel="stylesheet" href="librerias/template/bower_components/bootstrap-daterangepicker/daterangepicker.css">  
  <link rel="stylesheet" href="librerias/template/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
  <link href="librerias/libs/css/cronometro.css" rel="stylesheet" />

  <!-- Google Font -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <header class="main-header">
    <!-- Logo -->
    <a href="#" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>BETA</b></span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>BETA</b></span>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>

      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
          <!-- Messages: style can be found in dropdown.less-->
          <li class="dropdown messages-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-envelope-o"></i>
              <span class="label label-success"></span>
            </a>            
          </li>
          <!-- Notifications: style can be found in dropdown.less -->
          <li class="dropdown notifications-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-bell-o"></i>
              <span class="label label-warning"></span>
            </a>            
          </li>
          <!-- Tasks: style can be found in dropdown.less -->
          <li class="dropdown tasks-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-flag-o"></i>
              <span class="label label-danger"></span>
            </a>            
          </li>
          <!-- User Account: style can be found in dropdown.less -->
          <li class="dropdown user user-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <img src="librerias/template/dist/img/avatar5.png" class="user-image" alt="User Image">
              <span class="hidden-xs">${usuario.vUsuarioUsername}</span>
            </a>
            <ul class="dropdown-menu">
              <!-- User image -->
              <li class="user-header">
                <img src="librerias/template/dist/img/avatar5.png" class="img-circle" alt="User Image">
                <p>${usuario.vUsuarioApPaterno}&nbsp;${usuario.vUsuarioApMaterno}&nbsp;${usuario.vUsuarioNombres}  - Alumno</p>
              </li>
              <!-- Menu Body -->
              
              <!-- Menu Footer-->
              <li class="user-footer">
                <div class="pull-left">
                  <a href="#" class="btn btn-default btn-flat">Cambiar Clave</a>
                </div>
                <div class="pull-right">
                  <a href="logout.app" class="btn btn-default btn-flat">Cerrar Session</a>
                </div>
              </li>
            </ul>
          </li>
          
        </ul>
      </div>
    </nav>
  </header>
  <!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
      <!-- Sidebar user panel -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="librerias/template/dist/img/avatar5.png" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p>${usuario.vUsuarioApPaterno}&nbsp;${usuario.vUsuarioApMaterno}&nbsp;${usuario.vUsuarioNombres}</p>
          <a href="#"><i class="fa fa-circle text-success"></i> Conectado</a>
        </div>
      </div>
      <!-- search form -->
      <form action="#" method="get" class="sidebar-form">
        <div class="input-group">
          <input type="text" name="q" class="form-control" placeholder="Buscar...">
          <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
        </div>
      </form>
      <!-- /.search form -->
      <!-- sidebar menu: : style can be found in sidebar.less -->
      <ul class="sidebar-menu" data-widget="tree">
        
        <li class="active treeview">
          <a href="#">
            <i class="fa fa-dashboard"></i> <span>Cursos</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li class="active"><a href="index.html"><i class="fa fa-circle-o"></i> Mis Cursos</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> Promociones</a></li>
          </ul>
        </li>
        
      </ul>
    </section>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>Rendir Exámen: Tienes 1 hora para resolver el Examen</h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Inicio</a></li>
        <li class="active">Rendir Examen</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
      <!-- Small boxes (Stat box) -->
      <div class="row">
        <div class="col-xs-12">
        	<div id="timer">
            <div class="container">
                <div id="hour">00</div>
                <div class="divider">:</div>
                <div id="minute">00</div>
                <div class="divider">:</div>
                <div id="second">00</div>                
            </div>            
        </div><br/>	
		    	
          <div class="panel panel-info" class="">
                    <div class="panel-heading">
                        <h1 class="panel-title">CURSO: ${nombreCurso}</h1>                        
                    </div>
                    <div class="panel-body detalle-producto">                        
 						<h2>Preguntas a Desarrollar:</h2>
 						<div id="preguntaAbierta"></div><br/>
 						<form action="fileUpload" method="post" id="formadjuntar" enctype="multipart/form-data">
					      <div class="form-group">
					        <label>Seleccione Archivo:</label> <input class="form-control" type="file" name="file">
					      </div>
					      <input type="hidden" id="idCurso" name="idCurso" value="${idCurso}">
					      <input type="hidden" id="idUsuario" name="idUsuario" value="${idUsuario}">
					      <div class="form-group">
					        <button class="btn btn-primary" type="submit">Subir Archivo</button>
					      </div>
					    </form>					    
					    <!-- Bootstrap Progress bar -->
					    <div class="progress">
					      <div id="progressBar" class="progress-bar progress-bar-success" role="progressbar"
					        aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="width: 0%">0%</div>
					    </div>					
					    <!-- Alert -->
					    <div id="alertMsg" style="color: #357ebd; font-size: 16px;"></div>
					    						                       
                        <h2>PreguntasCerradas:</h2>
                                                
                        <div id="contentPreguntas">
<!--                         	aqui se recargan las preguntas -->							
                        </div>
                        <button class="btn btn-success" id="btn_enviar_examen" data-toggle="modal" data-target="#myModal">Finalizar</button>
                    </div>
                    
<!--                     ventana modal -->

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
                    
		</div>
        </div>
      </div>
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  <footer class="main-footer">
    <div class="pull-right hidden-xs">
      <b>Version</b> 2.4.0
    </div>
    <strong>Ginnet &copy; 2018
  </footer>
</div>
<!-- ./wrapper -->

<!-- jQuery 3 -->
<script src="librerias/template/bower_components/jquery/dist/jquery.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="librerias/template/bower_components/jquery-ui/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
  $.widget.bridge('uibutton', $.ui.button);
</script>
<script src="librerias/template/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

<script src="librerias/template/bower_components/raphael/raphael.min.js"></script>
<script src="librerias/template/bower_components/morris.js/morris.min.js"></script>

<script src="librerias/template/bower_components/jquery-sparkline/dist/jquery.sparkline.min.js"></script>

<script src="librerias/template/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="librerias/template/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>

<script src="librerias/template/bower_components/jquery-knob/dist/jquery.knob.min.js"></script>

<script src="librerias/template/bower_components/moment/min/moment.min.js"></script>
<script src="librerias/template/bower_components/bootstrap-daterangepicker/daterangepicker.js"></script>

<script src="librerias/template/bower_components/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js"></script>

<script src="librerias/template/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>

<script src="librerias/template/bower_components/jquery-slimscroll/jquery.slimscroll.min.js"></script>

<script src="librerias/template/bower_components/fastclick/lib/fastclick.js"></script>

<script src="librerias/template/dist/js/adminlte.min.js"></script>

<script src="librerias/template/dist/js/pages/dashboard.js"></script>

<script src="librerias/template/dist/js/demo.js"></script>

<script type="text/javascript" src="librerias/libs/ajaxExamen.js"></script>
    <script src="librerias/js/jquery.ajaxfileupload.js"></script>

<script>
	    $(document).ready(function() {

	    	$('[data-toggle="popover"]').popover();
			//inicio - cronometro			
			var tiempo = {
					hora: 0,
					minuto: 0,
					segundo: 0
				};
				var tiempo_corriendo = null;
				tiempo_corriendo = setInterval(function(){
				// Segundos
				tiempo.segundo++;
				if(tiempo.segundo >= 60)
				{
					tiempo.segundo = 0;
					tiempo.minuto++;
				}
				// Minutos
				if(tiempo.minuto >= 60)
				{
					tiempo.minuto = 0;
					tiempo.hora++;
				}
					$("#hour").text(tiempo.hora < 10 ? '0' + tiempo.hora : tiempo.hora);
					$("#minute").text(tiempo.minuto < 10 ? '0' + tiempo.minuto : tiempo.minuto);
					$("#second").text(tiempo.segundo < 10 ? '0' + tiempo.segundo : tiempo.segundo);
				}, 1000);	    	
			//fin - cronometro

				var cod= '${codigoCurso}';
			    console.log("cod->>>"+cod);
		    	$.ajax({ 
		    		type: 'POST', 
		    		url: 'obtenerpreguntas.app', 
		            data: { codCurso: cod, cantidad:10}, 
		    		success: function (response) {
		    			var data = response.data;	    			
		    			var html;
		    			for(var i=1; i<=data.length; i++){		    				
			    			html = "<div id='pregunta"+i+"'>"+
								"<h3>Pregunta "+i+":</h3>"+
								"<a tabindex='0' data-toggle='popover' data-trigger='focus' title='"+data[i-1].tema+"' data-content='"+data[i-1].descripcionTema+"' data-html='true'>"+data[i-1].descripcion+"</a>"+
								//aqui entra una caja de texto
			                    "<div class='radio'>"+
			                        "<label><input type='radio' name='opciones"+i+"' id='opciones_1_"+i+"' value='opcion_1_"+i+"'>"+data[i-1].alternativa1+"</label>"+
			                    "</div>"+
			                    "<div class='radio'>"+
			                        "<label><input type='radio' name='opciones"+i+"' id='opciones_2_"+i+"' value='opcion_2_"+i+"'>"+data[i-1].alternativa2+"</label>"+
			                    "</div>"+
			                    "<div class='radio'>"+
			                        "<label><input type='radio' name='opciones"+i+"' id='opciones_3_"+i+"' value='opcion_3_"+i+"'>"+data[i-1].alternativa3+"</label>"+
			                    "</div>"+
			                    "<div class='radio'>"+
			                        "<label><input type='radio' name='opciones"+i+"' id='opciones_4_"+i+"' value='opcion_4_"+i+"'>"+data[i-1].alternativa4+"</label>"+
			                    "</div>"+
			                    "<div class='radio'>"+
			                        "<label><input type='radio' name='opciones"+i+"' id='opciones_5_"+i+"' value='opcion_5_"+i+"'>"+data[i-1].alternativa5+"</label>"+
			                    "</div>"+ 
	                		"</div>"+	                		
	                		"<hr style='color:#eea236' size='10'/>";
							$("#contentPreguntas").append(html);			
				    	}                    
		    			//$("body").html(response);	    			
		    		}
		    	});

		    	//preguntas abiertas

		    	$.ajax({ 
		    		type: 'POST', 
		    		url: 'obtenerpreguntasabiertas.app', 
		            data: { codCurso: cod, cantidad:1}, 
		    		success: function (response) {
		    			var data = response.data;	    						    				    							    			
					    $("#preguntaAbierta").html(data[0].descripcion);                    
		    		}
		    	});
		});

	    $(document).ajaxSuccess(function () {
	        $("[data-toggle=popover]").popover();
	        $("[data-toggle=tooltip]").tooltip();
	        // any other code
	    });
    </script>
    


</body>
</html>