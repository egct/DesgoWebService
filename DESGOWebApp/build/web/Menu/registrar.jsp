<!DOCTYPE html>
<html lang="en" class="no-js">
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
		<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
		<title>DESGO Website Menu</title>
		<meta name="description" content="A sidebar menu as seen on the Google Nexus 7 website" />
		<meta name="keywords" content="google nexus 7 menu, css transitions, sidebar, side menu, slide out menu" />
		<meta name="author" content="Codrops" />
<!--		<link rel="shortcut icon" href="../favicon.ico">!-->
		<link rel="stylesheet" type="text/css" href="css/normalize.css" />
		<link rel="stylesheet" type="text/css" href="css/demo.css" />
		<link rel="stylesheet" type="text/css" href="css/component.css" />
		<script src="js/modernizr.custom.js"></script>
                <!--Links para el registro!-->
                <link rel="stylesheet" href="./css/reset.css">
                <link href="https://fonts.googleapis.com/css?family=Lato:400,900" rel="stylesheet">
                <link rel="stylesheet" href="./css/main.css">         
                
	</head>
	<body>
		<div class="container">
			<ul id="gn-menu" class="gn-menu-main">
				<li class="gn-trigger">
					<a class="gn-icon gn-icon-menu"><span>Menu</span></a>
					<nav class="gn-menu-wrapper">
						<div class="gn-scroller">
							<ul class="gn-menu">
								<li class="gn-search-item">
									<input placeholder="Search" type="search" class="gn-search">
									<a class="gn-icon gn-icon-search"><span>Search</span></a>
								</li>
								<li>
									<a class="gn-icon gn-icon-download">Registrar Usuario</a>
								<!--	<ul class="gn-submenu">
										<li><a class="gn-icon gn-icon-illustrator">Vector Illustrations</a></li>
										<li><a class="gn-icon gn-icon-photoshop">Photoshop files</a></li>
									</ul!-->
								</li>
								<li><a class="gn-icon gn-icon-cog">Escoger Formulario</a></li>
								<li><a class="gn-icon gn-icon-archive">Contestar Formulario</a></li>
								<li>
									<a class="gn-icon gn-icon-help">Ayuda</a>
								<!--	<ul class="gn-submenu">
										<li><a class="gn-icon gn-icon-article">Articles</a></li>
										<li><a class="gn-icon gn-icon-pictures">Images</a></li>
										<li><a class="gn-icon gn-icon-videos">Videos</a></li>
									</ul>!-->
								</li>
							</ul>
						</div><!-- /gn-scroller -->
					</nav>
				</li>
<!--				<li><a href="http://tympanus.net/codrops">Codrops</a></li> !-->

                                <li><a class="codrops-icon codrops-icon-prev" href="http://localhost:8080/DESGO_WebApp/Login/"><span>Salir</span></a></li>
			</ul>
			<header>
                            <div class="container">
                                <div class="form__top">
                                    <h2>Formulario <span>Registro</span></h2>
                                </div>		
                                <form class="form__reg" action="">
                                        <input class="input" type="text" placeholder="&#128100;  Nombre" required autofocus>
                                        <input class="input" type="email" placeholder="&#9993;  Email" required>
                                        <input class="input" type="text" placeholder="&#128222;  Telefono" required>
                                        <input class="input" type="text" placeholder="&#8962;  Dirección" required>
                                    <div class="btn__form">
                                        <input class="btn__submit" type="submit" value="REGISTRAR">
                                        <input class="btn__reset" type="reset" value="LIMPIAR">	
                                    </div>
                                </form>
                            </div>         

			</header> 
		</div><!-- /container -->
		<script src="js/classie.js"></script>
		<script src="js/gnmenu.js"></script>
		<script>
			new gnMenu( document.getElementById( 'gn-menu' ) );
		</script>
	</body>
  
    <footer>
       
       <div class="container-footer-all">
        
            <div class="container-body">

                <div class="colum1">
                    <h1>Mas informacion de la compañia</h1>

                    <p>Esta compañia se dedica a la venta de software integrado con un 
                    conjunto de cosas que no se lo que estoy escribiendo, este 
                    texto es solo para llenara informacion en el cuadro de informacion 
                    de la compañia.</p>

                </div>

                <div class="colum2">

                    <h1>Redes Sociales</h1>

                    <div class="row" >
                        <img src="icon/facebook.png" >
                        <a href="https://www.facebook.com/">
                            <label>Siguenos en Facebook</label>
                        </a>
                    </div>
                    <div class="row">
                        <img src="icon/twitter.png">
                        <a href="https://www.Twitter.com/">
                        <label>Siguenos en Twitter</label>
                        </a>
                    </div>
                    <div class="row">
                        <img src="icon/instagram.png">
                        <a href="https://www.Instagram.com/">
                        <label>Siguenos en Instagram</label>
                        </a>
                    </div>
                    <div class="row">
                        <img src="icon/google-plus.png">
                        <a href="https://www.Instagram.com/">
                        <label>Siguenos en Google Plus</label>
                        </a>
                    </div>
                    <div class="row">
                        <img src="icon/pinterest.png">
                        <label>Siguenos en Pinteres</label>
                    </div>


                </div>

                <div class="colum3">

                    <h1>Informacion Contactos</h1>

                    <div class="row2">
                        <img src="icon/house.png">
                        <label>La Romana, 
                        Republica Dominicana
                        Manuel del Cabral
                        Casa # 27</label>
                    </div>

                    <div class="row2">
                        <img src="icon/smartphone.png">
                        <label>+1-829-395-2064</label>
                    </div>

                    <div class="row2">
                        <img src="icon/contact.png">
                         <label>Cristiancedano1030@gmail.com</label>
                    </div>

                </div>

            </div>
        
        </div>
        
        <div class="container-footer">
               <div class="footer">
                    <div class="copyright">
                        © 2019 Todos los Derechos Reservados | <a href="">DESGO</a>
                    </div>

                    <div class="information">
                        <a href="">Informacion Compañia</a> | <a href="">Privacion y Politica</a> | <a href="">Terminos y Condiciones</a>
                    </div>
                </div>

            </div>
        
    </footer>  
        
    <link rel="stylesheet" href="css/estilos.css">    
      
</html>