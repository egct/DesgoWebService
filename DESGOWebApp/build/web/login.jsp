<%-- 
    Document   : index
    Created on : 02/08/2019, 6:14:32
    Author     : Egct
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ec.com.desgo.modelo.UserService"%>
<%@page import="ec.com.desgo.controlador.Servlet"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>DESGO</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
                    <!--Icono de la parte de la pestaña del navegador-->
        <link rel="icon" type="image/png" href="Login/images/icons/Desgo.ico"/>
<!--===============================================================================================-->
                                    <!--Pagina de estilos -->
	<link rel="stylesheet" type="text/css" href="Login/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Login/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Login/fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Login/vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="Login/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Login/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Login/vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="Login/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Login/css/util.css">
	<link rel="stylesheet" type="text/css" href="Login/css/main.css">
<!--===============================================================================================-->
        <script src="Js/ControladorModal.js" type="text/javascript"></script>
        
        <script src="Menu/js/modernizr.custom.js"></script>
        <link href="Index/css/index.css" rel="stylesheet" type="text/css"/>
        
</head>
<body>
    <!--Contenedor general del tema del menu-->
		<div class="container">
		       
                    <!--Permite hacer una lista en donde se encuentran todas las opciones del menu-->
                        <ul id="gn-menu" class="gn-menu-main">
				
                                <li >
                                    <h6>&nbsp;</h6>
                                </li>
                               <li >
                                   <h6 style="font-size: 150% ">&nbsp;<button class="iniciar" id="iniciar" onclick="location.href='login.jsp'">DESGO</button></h6>
                                </li>
                                <br>
                                <p>Piensa, cree, sueña y atrevete... Inicia sesión</p>
                                <br>
			</ul>
                   
		</div><!-- Fin del container -->
		
    <!--Contenedor total de la pagina-->
	<div class="limiter">
            <!--Fondo de mapa de la pagina-->
		<div class="container-login100" style="background-image: url('Login/images/bg-01.jpg');">
			<div class="wrap-login100">
                            <form  class="login100-form validate-form" action="Servlet?action=Login" method="POST" >
				<!--Foto estandar de perfil principal de la pagina de login-->	
                                        <span class="login100-form-logo">
						<i class="zmdi zmdi-accounts-alt"></i>
					</span>
                                <!--Texto de iniciar sesion en la pagina del login debajo del logo-->
					<span class="login100-form-title p-b-34 p-t-27">
						Iniciar Sesión
					</span>
                                <!--Inputs de ingreso de los datos de login y password-->
					<div class="wrap-input100 validate-input" data-validate = "Enter username">
                                            <input class="input100" type="text" id="username" name="username" placeholder="Usuario">
						<span class="focus-input100" data-placeholder="&#xf207;"></span>
					</div>
					<div class="wrap-input100 validate-input" data-validate="Enter password">
                                            <input class="input100" type="password" id="pass" name="pass" placeholder="Contraseña">
						<span class="focus-input100" data-placeholder="&#xf191;"></span>
					</div>
                                <!--Boton de envio de datos y acceder a la pagina -->
					<div class="container-login100-form-btn">
                                            <button class="login100-form-btn" >
							Acceder
						</button>
					</div>
                                <!--Etiqueta para cuando te olvidas la contrase;a-->
					<div class="text-center p-t-90">
						<a class="txt1" href="#">
							He olvidado mi contraseña
						</a>
					</div>
				</form>
			</div>
		</div>
	</div>
 
	<div id="dropDownSelect1"></div>
	
<!--===============================================================================================-->
	<script src="Login/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="Login/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="Login/vendor/bootstrap/js/popper.js"></script>
	<script src="Login/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="Login/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="Login/vendor/daterangepicker/moment.min.js"></script>
	<script src="Login/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="Login/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="Login/js/main.js"></script>

</body>
</html>