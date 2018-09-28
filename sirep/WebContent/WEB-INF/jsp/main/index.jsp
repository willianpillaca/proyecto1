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
  
<!--   ginnet   -->
  <link href="librerias/willian/css/ginnet.css" rel="stylesheet" />

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
            <li><a href="index2.html"><i class="fa fa-circle-o"></i> Promociones</a></li>
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
      <h1>Mis Cursos</h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Inicio</a></li>
        <li class="active">Mis Cursos</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
      <!-- Small boxes (Stat box) -->
      <div class="row">
        <div class="col-xs-12">
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">Relacion de Cursos Matriculados</h3>

              <div class="box-tools">
                <div class="input-group input-group-sm" style="width: 150px;">
                  <input type="text" name="table_search" class="form-control pull-right" placeholder="Search">

                  <div class="input-group-btn">
                    <button type="submit" class="btn btn-default"><i class="fa fa-search"></i></button>
                  </div>
                </div>
              </div>
            </div>
            <!-- /.box-header -->
            <div class="box-body table-responsive no-padding">
              <table id="myTableCursos" class="table table-hover">
              	<thead> 
	                <tr>
	                  <th>ID</th>
	                  <th>Codigo</th>
	                  <th>Curso</th>
	                  <th>Profesor</th>                  
	                  <th>Estado</th>                  
	                </tr> 
                </thead>
                <tbody>										
				</tbody>               
              </table>
            </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->
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
							"<td>"+data[i].id+"</td>"+
							"<td>"+data[i].codCurso+"</td>"+
							"<td>"+data[i].nombre+"</td>"+
							"<td>"+data[i].profesor+"</td>"+							
							"<td><span class='label label-warning'>Pendiente</span></td>"+
							"<td><button class='btn btn-block btn-primary' onclick='fnRendirExamen(\""+data[i].codCurso+"\", \""+data[i].nombre+"\", \""+data[i].id+"\")'>Rendir</button></td>"+
						"</tr>";
						$('#myTableCursos tbody').append(html);
					}	    			
	    		}
	    	});
		});

    </script>


</body>
</html>