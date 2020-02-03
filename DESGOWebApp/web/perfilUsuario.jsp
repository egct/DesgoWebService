<!DOCTYPE html>
<html lang="en" class="no-js">
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
		<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
		<title>DESGO Website Menu</title>
                <link rel="icon" type="image/png" href="Login/images/icons/Desgo.ico"/>
		<meta name="description" content="A sidebar menu as seen on the Google Nexus 7 website" />
		<meta name="keywords" content="google nexus 7 menu, css transitions, sidebar, side menu, slide out menu" />
		<meta name="author" content="Codrops" />
<!--		<link rel="shortcut icon" href="../favicon.ico">!-->
		<link rel="stylesheet" type="text/css" href="Menu/css/normalize.css" />
		<link rel="stylesheet" type="text/css" href="Menu/css/demo.css" />
		<link rel="stylesheet" type="text/css" href="Menu/css/component.css" />
		<script src="Menu/js/modernizr.custom.js"></script>
                
            
                
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
                                                                    <div class="row">  
                                                                        <img src="Formulario/icon/user.png" style="margin-left:13px; margin-top: 10px;">
                                                                    <a href="perfilUsuario.jsp?idUser=<%=request.getParameter("idUser")%>&name=<%=request.getParameter("name")%>&empresa=<%=request.getParameter("empresa")%>">
                                                                        <label><%=request.getParameter("idUser") + " " + request.getParameter("name")%></label>

                                                                    </a>
                                                                    </div>
                                                                </li>

								
								<li><a class="gn-icon gn-icon-archive" href="formularioUsuario.jsp?idUser=<%=request.getParameter("idUser")%>&name=<%=request.getParameter("name")%>&empresa=<%=request.getParameter("empresa")%>">Formulario</a></li>
								
								<li>
									<a class="gn-icon gn-icon-help">Ayuda</a>
								<!--	<ul class="gn-submenu">
										<li><a class="gn-icon gn-icon-article">Articles</a></li>
										<li><a class="gn-icon gn-icon-pictures">Images</a></li>
										<li><a class="gn-icon gn-icon-videos">Videos</a></li>
									</ul>!-->
								</li>
                                                                <li>
                                                                    <a class="gn-icon codrops-icon-prev" href="login.jsp" >Salir</a>
                                                                </li>
							</ul>
						</div><!-- /gn-scroller -->
					</nav>
				</li>
				<li style="float: left">
                <!--                    <h5> Bienvenido <%=request.getParameter("idUser") + " " + request.getParameter("name")%></h5>!-->
                                    <h6 style="font-size: 150% ">  Bienvenido</h6>
                                </li>

			</ul>
			 
                        <div style="position: relative; z-index: -1">
                            <%@ include file="Perfil.jsp" %>
                        </div>          
		</div><!-- /container -->
		<script src="Menu/js/classie.js"></script>
		<script src="Menu/js/gnmenu.js"></script>
		<script>
			new gnMenu( document.getElementById( 'gn-menu' ) );
                        var idUser=<%=request.getParameter("idUser")%>;
                        var name="<%=request.getParameter("name")%>";
                        var empresa="<%=request.getParameter("empresa")%>";
                        console.log("iduser"+idUser+"name"+name+"empre"+empresa);
		</script>
	</body>
  
    <footer style="width:100%; max-width:100%; margin: 0px auto; position: relative; text-align: justify; ">
       
       <div class="container-footer-all">
        
            <div class="container-body">

                <div class="colum1">
                    <h1>Mas informacion de la compañia</h1>

                    <p>La empresa DESGO es una iniciativa que realiza su actividad en el
                       ámbito del desarrollo de aplicaciones web y móviles integradas, 
                       enfocados en las áreas geográfica, ambiental y social; así mismo 
                       como explora en nuevas tecnologías aplicables a la elaboración de 
                       geoportales y análisis de big data.

                       DESGO brinda un espacio para la creación de nuevas ideas que 
                       potencialice a la juventud con el objetivo de integrar grupos 
                       multidisciplinarios que desarrollen productos para el beneficio
                       de la comunidad y el progreso del país
                       </p>

                </div>

                <div class="colum2">

                    <h1>Redes Sociales</h1>

                    <div class="row" >
                        <img src="Menu/icon/facebook.png" >
                        <a href="https://www.facebook.com/">
                            <label>Siguenos en Facebook</label>
                        </a>
                    </div>
                    <div class="row">
                        <img src="Menu/icon/twitter.png">
                        <a href="https://www.Twitter.com/">
                        <label>Siguenos en Twitter</label>
                        </a>
                    </div>
                    <div class="row">
                        <img src="Menu/icon/instagram.png">
                        <a href="https://www.Instagram.com/">
                        <label>Siguenos en Instagram</label>
                        </a>
                    </div>
                    <div class="row">
                        <img src="Menu/icon/google-plus.png">
                        <a href="https://www.Instagram.com/">
                        <label>Siguenos en Google Plus</label>
                        </a>
                    </div>
                    <div class="row">
                        <img src="Menu/icon/pinterest.png">
                        <label>Siguenos en Pinteres</label>
                    </div>


                </div>

                <div class="colum3">

                    <h1>Informacion Contactos</h1>

                    <div class="row2">
                        <img src="Menu/icon/house.png">
                        <label>Florinda de Alvear y 
                               Joaquín Gallegos Lara E17-25</label>
                    </div>

                    <div class="row2">
                        <img src="Menu/icon/smartphone.png">
                        <label>0997589895</label>
                    </div>

                    <div class="row2">
                        <img src="Menu/icon/contact.png">
                         <label>desgoecuador@outlook.com</label>
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
        
    <link rel="stylesheet" href="Menu/css/estilos.css">    
      
</html>