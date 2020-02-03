<!DOCTYPE html>
<html lang="es">
<head>
    <meta http-equiv="content-type" content="text/html; utf-8">
    <%@page import="ec.com.desgo.modelo.UserService"%>
    <%@page import="ec.com.desgo.controlador.Servlet"%>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
    <title>DESGO Website Menu</title>
    <link rel="icon" type="image/png" href="Login/images/icons/Desgo.ico"/>
    <meta name="description" content="DESGO website" />
    <meta name="keywords" content="desgo" />
    <meta name="author" content="Desgo" />
    <!--Estilo general de la pagina-->
    <link rel="stylesheet" type="text/css" href="Formulario/css/normalize.css" />
    <link rel="stylesheet" type="text/css" href="Formulario/css/demo.css" />
    <link rel="stylesheet" type="text/css" href="Formulario/css/component.css" />
    <script src="Formularios/js/modernizr.custom.js"></script>
    <!--Estilo del formulario-->
    <link rel="stylesheet" href="Formulario/css/estilosform.css">
    <!--Crear tablasde forma dinamica -->
    <script src="Formulario/dinamico/js/jquery-2.1.1.min.js"></script>
    <script src="Formulario/dinamico/js/bootstrap.js"></script>
    <script src="Formulario/js/dinamico.js" type="text/javascript"></script>
    <link rel="stylesheet" href="css/bootstrap.css">
    <!--Pestanias o tabs!-->
    <link rel="stylesheet" href="Formulario/css/estilos.css">
    <link rel="stylesheet" href="Formulario/css/font-awesome.css">
    <script src="Formulario/js/main.js"></script>
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0 ">
    <link rel="stylesheet" href="Menu/css/estilos.css">    
    <script src="Menu/js/classie.js"></script>
    <script src="Menu/js/gnmenu.js"></script>
    <!--new submenu!-->
    <link rel="shortcut icon" href="../favicon.ico"> 
    <link rel="stylesheet" type="text/css" href="Formpart2/css/default.css" />
    <link rel="stylesheet" type="text/css" href="Formpart2/css/component.css" />
    <script src="Formpart2/js/modernizr.custom.js"></script>
    <!--Estilos de la tabla!-->
    <link href="Formulario/css/estilosTable.css" rel="stylesheet" type="text/css"/>
    <!--Script con la clave de desdarrollador dada por google maps-->
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBAFL8QXJfjhLQ4UVfTWAQ6W7H1wM2vqdc&libraries=drawing&sensor=false&callback=initMap"></script>
    <!--Diseño del mapa dentro de la pagina-->
    <style type="text/css">
            #map{
                position: relative;
                padding-bottom: 70%;
                margin: 0;
                width: 100%;
                height: 100%;
                z-index: 0;
            }

            #panel {
                width: 200px;
                font-family: Arial, sans-serif;
                font-size: 13px;
                float: right;
                margin: 10px;
            }

            #color-palette {
                clear: both;
            }

            .color-button {
                width: 14px;
                height: 14px;
                font-size: 0;
                margin: 2px;
                float: left;
                cursor: pointer;
            }

            #delete-button {
                margin-top: 5px;
            }
        </style>
</head>
<body>
    <!--Script para hacer la transicion entre las pestañas-->
    <script>
                    $(document).ready(function () {
                        $("#tab1").hide();
                        $("#tab2").hide();
                        $("#tab3").hide();
                        $("#tab4").hide();
                        $("#tab5").hide();
                        $("#tab6").hide();
                        $("#tab7").hide();
                        $("#tab8").hide();
                        $("#tab9").hide();
                        $("#tab10").hide();
                        $("#tab11").hide();
                        $("#tab12").hide();
                       $("#tabB").hide();
                $("#contentPA").hide();
                        $("#contentPJ").hide();
                        $("#contentC").hide();
                        $("input[type=radio]").click(function (event) {
                            var valor = $(event.target).val();
                            if (valor == "IL_p_tipoN") {
                                $("#contentPA").show();
                                $("#contentPJ").hide();
                                $("#estadoCivil").change(function () {
                                    var valor = $(this).val();

                                    console.log(valor);
                                    if (valor == "IL_pnat_estcivil_c") {
                                        $("#contentC").show();
                                    } else {
                                        $("#contentC").hide();
                                    }
                                });

                            } else if (valor == "IL_p_tipoJ") {
                                $("#contentPA").hide();
                                $("#contentPJ").show();
                                $("#contentC").hide();
                            }

                        });       
                        /*FIN*/
                    });
                     function ver(){
                        $("#tab1").show();
                        $("#tab2").hide();
                            
                    }
                    function VER(id) {
                        var aux=document.getElementById(id);
                        console.log(aux.id);
                        switch(aux.id){
                            case "1":
                                $("#tab1").show();
                                $("#tab2").hide();
                                $("#tab3").hide();
                                $("#tab4").hide();
                                $("#tab5").hide();
                                $("#tab6").hide();
                                $("#tab7").hide();
                                $("#tab8").hide();
                                $("#tab9").hide();
                                $("#tab10").hide();
                                $("#tab11").hide();
                                $("#tab12").hide();
                                $("#tabB").show();
                                break;
                            case "2":
                                $("#tab1").hide();
                                $("#tab2").show();
                                $("#tab3").hide();
                                $("#tab4").hide();
                                $("#tab5").hide();
                                $("#tab6").hide();
                                $("#tab7").hide();
                                $("#tab8").hide();
                                $("#tab9").hide();
                                $("#tab10").hide();
                                $("#tab11").hide();
                                $("#tab12").hide();
                                $("#tabB").show();
                            break;
                            case "3":
                                $("#tab1").hide();
                                $("#tab2").hide();
                                $("#tab3").show();
                                $("#tab4").hide();
                                $("#tab5").hide();
                                $("#tab6").hide();
                                $("#tab7").hide();
                                $("#tab8").hide();
                                $("#tab9").hide();
                                $("#tab10").hide();
                                $("#tab11").hide();
                                $("#tab12").hide();
                                $("#tabB").show();
                            break;
                            case "4":
                                $("#tab1").hide();
                                $("#tab2").hide();
                                $("#tab3").hide();
                                $("#tab4").show();
                                $("#tab5").hide();
                                $("#tab6").hide();
                                $("#tab7").hide();
                                $("#tab8").hide();
                                $("#tab9").hide();
                                $("#tab10").hide();
                                $("#tab11").hide();
                                $("#tab12").hide();                                
                                $("#tabB").show();
                            break;
                            case "5":
                                $("#tab1").hide();
                                $("#tab2").hide();
                                $("#tab3").hide();
                                $("#tab4").hide();
                                $("#tab5").show();
                                $("#tab6").hide();
                                $("#tab7").hide();
                                $("#tab8").hide();
                                $("#tab9").hide();
                                $("#tab10").hide();
                                $("#tab11").hide();
                                $("#tab12").hide();
                                $("#tabB").show();
                            break;
                            case "6":
                                $("#tab1").hide();
                                $("#tab2").hide();
                                $("#tab3").hide();
                                $("#tab4").hide();
                                $("#tab5").hide();
                                $("#tab6").show();
                                $("#tab7").hide();
                                $("#tab8").hide();
                                $("#tab9").hide();
                                $("#tab10").hide();
                                $("#tab11").hide();
                                $("#tab12").hide();
                                $("#tabB").show();
                            break;
                            case "7":
                                $("#tab1").hide();
                                $("#tab2").hide();
                                $("#tab3").hide();
                                $("#tab4").hide();
                                $("#tab5").hide();
                                $("#tab6").hide();
                                $("#tab7").show();
                                $("#tab8").hide();
                                $("#tab9").hide();
                                $("#tab10").hide();
                                $("#tab11").hide();
                                $("#tab12").hide();
                                $("#tabB").show();
                            break;
                            case "8":
                                $("#tab1").hide();
                                $("#tab2").hide();
                                $("#tab3").hide();
                                $("#tab4").hide();
                                $("#tab5").hide();
                                $("#tab6").hide();
                                $("#tab7").hide();
                                $("#tab8").show();
                                $("#tab9").hide();
                                $("#tab10").hide();
                                $("#tab11").hide();
                                $("#tab12").hide();
                                $("#tabB").show();
                            break;
                            case "9":
                                $("#tab1").hide();
                                $("#tab2").hide();
                                $("#tab3").hide();
                                $("#tab4").hide();
                                $("#tab5").hide();
                                $("#tab6").hide();
                                $("#tab7").hide();
                                $("#tab8").hide();
                                $("#tab9").show();
                                $("#tab10").hide();
                                $("#tab11").hide();
                                $("#tab12").hide();
                                $("#tabB").show();
                            break;
                            case "10":
                                $("#tab1").hide();
                                $("#tab2").hide();
                                $("#tab3").hide();
                                $("#tab4").hide();
                                $("#tab5").hide();
                                $("#tab6").hide();
                                $("#tab7").hide();
                                $("#tab8").hide();
                                $("#tab9").hide();
                                $("#tab10").show();
                                $("#tab11").hide();
                                $("#tab12").hide();
                                $("#tabB").show();
                            break;
                            case "11":
                                $("#tab1").hide();
                                $("#tab2").hide();
                                $("#tab3").hide();
                                $("#tab4").hide();
                                $("#tab5").hide();
                                $("#tab6").hide();
                                $("#tab7").hide();
                                $("#tab8").hide();
                                $("#tab9").hide();
                                $("#tab10").hide();
                                $("#tab11").show();
                                $("#tab12").hide();
                                $("#tabB").show();
                            break;
                            case "12":
                                $("#tab1").hide();
                                $("#tab2").hide();
                                $("#tab3").hide();
                                $("#tab4").hide();
                                $("#tab5").hide();
                                $("#tab6").hide();
                                $("#tab7").hide();
                                $("#tab8").hide();
                                $("#tab9").hide();
                                $("#tab10").hide();
                                $("#tab11").hide();
                                $("#tab12").show();
                                $("#tabB").show();
                            break;
                        }   
                    }
                </script>
                
    <div class="container">
        <ul id="gn-menu" class="gn-menu-main" style="z-index: 8;">
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
                                    <a href="menu_1.jsp?idUser=<%=request.getParameter("idUser")%>&name=<%=request.getParameter("name")%>&empresa=<%=request.getParameter("empresa")%>">
                                        <label><%=request.getParameter("idUser") + " " + request.getParameter("name")%></label>
                                        
                                    </a>
                                    </div>
                                </li>
                                <li>
                                    <a class="gn-icon gn-icon-download" href="registrarAdministrador.jsp?idUser=<%=request.getParameter("idUser")%>&name=<%=request.getParameter("name")%>">Administrar</a>
                                </li>
                                <li>
                                    <a class="gn-icon gn-icon-archive" href="formularioAdministrador.jsp?idUser=<%=request.getParameter("idUser")%>&name=<%=request.getParameter("name")%>&empresa=<%=request.getParameter("empresa")%>">Formulario</a>
                                </li>
                                <li>
                                    <a class="gn-icon gn-icon-help">Ayuda</a>
                                </li>
                                <li>
                                    <a class="gn-icon codrops-icon-prev" href="login.jsp" >Salir</a>
                                </li>
                                <br>
                                
                            </ul>
                        </div>
                                
                    </nav>
                </li>
                <li style="float: left">
<!--                    <h5> Bienvenido <%=request.getParameter("idUser") + " " + request.getParameter("name")%></h5>!-->
                    <h6 style="font-size: 150% ">  Bienvenido</h6>
                </li>
            </ul>                    
         
            <!--Contenedor en donde se encuentran todas las pestañas-->
            <div class="main clearfix">
				<nav id="menu" class="nav">					
					<ul>
						<li>
                                                    <a onclick="VER('1');" id="1" href="#tab">
								<span class="icon">
                                                                    <i aria-hidden="true" style="z-index: 0;"><img src="Formpart2/iconos/Identificación_Ubicación.png" class="iconoDesgo"/></i>
                                                                </span>
								<span >Identificación Ubicación</span>
							</a>
						</li>
						<li>
							<a onclick="VER('2');" id="2" href="#tab">
								<span class="icon"> 
                                                                    <i aria-hidden="true" style="z-index: 0;"><img src="Formpart2/iconos/Identificación_Legal.png" class="iconoDesgo"/></i>
								</span>
								<span>Identificación legal</span>
							</a>
						</li>
						<li>
							<a onclick="VER('3');" id="3" href="#tab">
								<span class="icon">
                                                                    <i aria-hidden="true" style="z-index: 0;"><img src="Formpart2/iconos/Caracterización_del_lote.png" class="iconoDesgo"/></i>
								</span>
								<span>Caracterización del lote</span>
							</a>
						</li>
						<li>
							<a onclick="VER('4');" id="4" href="#tab">
								<span class="icon">
                                                                    <i aria-hidden="true" style="z-index: 0;"><img src="Formpart2/iconos/Límites.png" class="iconoDesgo"/></i>
								</span>
								<span>Limites       </span>
							</a>
						</li>
						<li>
							<a onclick="VER('5');" id="5" href="#tab">
								<span class="icon">
                                                                    <i aria-hidden="true" style="z-index: 0;"><img src="Formpart2/iconos/Gráficos_del_predio.png" class="iconoDesgo"/></i>
								</span>
								<span>Gráficos del predio</span>
							</a>
						</li>
						<li>
							<a onclick="VER('6');" id="6" href="#tab">
								<span class="icon">
                                                                    <i aria-hidden="true" style="z-index: 0;"><img src="Formpart2/iconos/Económica.png" class="iconoDesgo"/></i>
								</span>
								<span>Económica        </span>
							</a>
						</li>
                                                <li>
							<a onclick="VER('7');" id="7" href="#tab">
								<span class="icon">
                                                                    <i aria-hidden="true" style="z-index: 0;"><img src="Formpart2/iconos/Responsables.png" class="iconoDesgo"/></i>
								</span>
								<span>Responsables</span>
							</a>
						</li>
                                                 <li>
							<a onclick="VER('8');" id="8" href="#tab">
								<span class="icon">
                                                                    <i aria-hidden="true" style="z-index: 0;"><img src="Formpart2/iconos/Características_de_la_costrucción.png" class="iconoDesgo"/></i>
								</span>
								<span>Caracteristicas de la construcción</span>
							</a>
						</li>
                                                <li>
							<a onclick="VER('9');" id="9" href="#tab">
								<span class="icon">
                                                                    <i aria-hidden="true" style="z-index: 0;"><img src="Formpart2/iconos/Elementos_constitutivos.png" class="iconoDesgo"/></i>
								</span>
								<span>Elementos constructivos</span>
							</a>
						</li>
                                                <li>
							<a onclick="VER('10');" id="10" href="#tab">
								<span class="icon">
                                                                    <i aria-hidden="true" style="z-index: 0;"><img src="Formpart2/iconos/Mejoras.png" class="iconoDesgo"/></i>
								</span>
								<span>Mejoras      </span>
							</a>
						</li>
                                                <li>
							<a onclick="VER('11');" id="11" href="#tab">
								<span class="icon">
                                                                    <i aria-hidden="true" style="z-index: 0;"><img src="Formpart2/iconos/Vivisnda_Sensal.png" class="iconoDesgo"/></i>
								</span>
								<span>Vivienda Censal</span>
							</a>
						</li>
                                                <li>
							<a onclick="VER('12');" id="12" href="#tab">
								<span class="icon">
                                                                    <i aria-hidden="true" style="z-index: 0;"><img src="Formpart2/iconos/Vivisnda_Sensal.png" class="iconoDesgo"/></i>
								</span>
								<span>Mapa</span>
							</a>
						</li>
					</ul>
				</nav> 
			</div>
            
            <!--Sirve para el intercambio de pestañas-->
            <script>
			//  The function to change the class
			var changeClass = function (r,className1,className2) {
				var regex = new RegExp("(?:^|\\s+)" + className1 + "(?:\\s+|$)");
				if( regex.test(r.className) ) {
					r.className = r.className.replace(regex,' '+className2+' ');
			    }
			    else{
					r.className = r.className.replace(new RegExp("(?:^|\\s+)" + className2 + "(?:\\s+|$)"),' '+className1+' ');
			    }
			    return r.className;
			};	

			//  Creating our button in JS for smaller screens
			var menuElements = document.getElementById('menu');
//			menuElements.insertAdjacentHTML('afterBegin','<button type="button" id="menutoggle" class="navtoogle" aria-hidden="true"><i aria-hidden="true" class="icon-menu"> </i> Formulario</button>');
			menuElements.insertAdjacentHTML('afterBegin','<button type="button" id="menutoggle" class="navtoogle" aria-hidden="true"><i aria-hidden="true"> </i> Formulario</button>');

			//  Toggle the class on click to show / hide the menu
			document.getElementById('menutoggle').onclick = function() {
				changeClass(this, 'navtoogle active', 'navtoogle');
			}

			// http://tympanus.net/codrops/2013/05/08/responsive-retina-ready-menu/comment-page-2/#comment-438918
			document.onclick = function(e) {
				var mobileButton = document.getElementById('menutoggle'),
					buttonStyle =  mobileButton.currentStyle ? mobileButton.currentStyle.display : getComputedStyle(mobileButton, null).display;

				if(buttonStyle === 'block' && e.target !== mobileButton && new RegExp(' ' + 'active' + ' ').test(' ' + mobileButton.className + ' ')) {
					changeClass(mobileButton, 'navtoogle active', 'navtoogle');
				}
			}
		</script>
                    
        <!--Formulario donde se encuentran cada una de las secciones que se muestran en las pestanias-->    
        <div>
            <a name="tab" ></a><br> 
            <br>
        </div>
        <form class="formulario" method="POST" action="Controlador?action=Formulario">
        
            <div class="secciones">
       
        
                <!--Primera seccion de la identificacion de la ubicacion del lote-->              
               <article id="tab1" >
                   <center><span style="background: #ffffff;">&nbsp;Identificación Ubicación&nbsp;</span></center><br> 
                                    <!--Inicia la primera parte de Identificacion de lote!-->
                                    <h5>Clave catastral anterior: </h5>
                                    <br>
                                    <center>
                                        <table class="gentab" style="width: 80%">
                                            <tr>
                                                <td style="border-left:hidden;border-right: hidden;border-top:hidden"> </td>
                                                <th style="border-left:hidden;border-right: hidden;border-top:hidden"> </th>
                                                <th style="border-left:hidden;border-right: hidden;border-top:hidden"> </th>
                                                <th style="border-left:hidden;border-right: hidden;border-top:hidden"> </th>
                                                <th style="border-left:hidden;border-right: hidden;border-top:hidden"> </th>
                                                <th style="border-left:hidden;border-right: hidden;border-top:hidden"> </th>
                                                <th style="border-left:hidden;border-right: hidden;border-top:hidden"> </th>
                                                <th style="border-left:hidden;border-right: hidden;border-top:hidden"> </th>
                                                <th style="border-left:hidden;border-right: hidden;border-top:hidden"> </th>
                                                <th style="border-left:hidden;border-right: hidden;border-top:hidden"> </th>
                                                <th style="border-left:hidden;border-right: hidden;border-top:hidden"> </th>
                                                <th style="border-left:hidden;border-right: hidden;border-top:hidden"> </th>
                                                <th style="border-left:hidden;border-right: hidden;border-top:hidden"> </th>
                                                <th style="border-left:hidden;border-top:hidden"> </th>
                                                <th >BL</th>
                                                <th >PS</th>
                                                <th >UN</th>
                                            </tr>
                                            <tr>
                                                <th ><input id="IU_cca_pro1" maxlength="2" onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;"></th>
                                                <th ><input  id="IU_cca_pro2" maxlength="2" onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;" ></th>
                                                <th ><input  id="IU_cca_can1" maxlength="2" onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;"></th>
                                                <th ><input  id="IU_cca_can2" maxlength="2" onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;"></th>
                                                <th ><input  id="IU_cca_par1" maxlength="2" onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;"></th>
                                                <th ><input  id="IU_cca_par2" maxlength="2" onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;"></th>
                                                <th ><input  id="IU_cca_zon1" maxlength="2" onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;"></th>
                                                <th ><input  id="IU_cca_zon2" maxlength="2" onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;"></th>
                                                <th ><input  id="IU_cca_sec1" maxlength="2" onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;"></th>
                                                <th ><input  id="IU_cca_sec2" maxlength="2" onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;"></th>
                                                <th ><input  id="IU_cca_man1" maxlength="2" onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;"></th>
                                                <th ><input  id="IU_cca_man2" maxlength="2" onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;"></th>
                                                <th ><input  id="IU_cca_pre1" maxlength="2" onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;"></th>
                                                <th ><input  id="IU_cca_pre2" maxlength="2" onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;"></th>
                                                <th ><input  id="IU_cca_ph1" maxlength="2" onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;"></th>
                                                <th ><input  id="IU_cca_ph2" maxlength="2" onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;"></th>
                                                <th ><input  id="IU_cca_ph3" maxlength="2" onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;"></th>

                                            </tr>
                                            <tr>
                                                <td colspan="2"> PRO </td>
                                                <td colspan="2"> CAN </td>
                                                <td colspan="2"> PAR </td>
                                                <td colspan="2"> ZON </td>
                                                <td colspan="2"> SEC </td>
                                                <td colspan="2"> MAN </td>
                                                <td colspan="2"> PRE </td>
                                                <td colspan="3"> P.H. </td>

                                            </tr>
                                        </table>
                                    </center>
                                    <br>

                                    <h5>Clave catastral Urbana Actual: </h5>
                                    <br>
                                    <center>
                                        <table class="gentab"  >
                                            <tr>
                                                <th colspan="10" ><input id="IU_ccu"  maxlength="26" onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;" ></th>

                                            </tr>
                                            <tr>
                                                <td style="padding-left: 3px;padding-right: 3px"> Pro </td>
                                                <td style="padding-left: 3px;padding-right: 3px"> Can </td>
                                                <td style="padding-left: 3px;padding-right: 3px"> Par </td>
                                                <td style="padding-left: 3px;padding-right: 3px"> Zona </td>
                                                <td style="padding-left: 3px;padding-right: 3px"> Sec </td>
                                                <td style="padding-left: 3px;padding-right: 3px"> Man </td>
                                                <td style="padding-left: 3px;padding-right: 3px"> Lote </td>
                                                <td style="padding-left: 3px;padding-right: 3px"> Bloque </td>
                                                <td style="padding-left: 3px;padding-right: 3px"> Piso </td>
                                                <td style="padding-left: 3px;padding-right: 3px"> Cod. Unidad </td>                                   
                                            </tr>
                                        </table>
                                    </center>
                                    <br>
                                    <h5>Número del predio: </h5>
                                    <br><br>
                                    <center>
                                        <table class="gentab" style="width: 30%;height: 100%">
                                            <tr>
                                                <th ><input id="IU_np"  maxlength="10" onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;" ></th>
                                            </tr>
                                        </table>
                                        <br>
                                    </center>

                                    <h5>Datos descriptivos del predio</h5>   
                                    <br>
                                    <section class="form-group">
                                        <ul class="form-fields">
                                            <li><label >Nombre del sector:</label><input type="text" id="IU_dd_nsec" placeholder="Nombre del sector" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209 && (event.keyCode < 45 || event.keyCode > 57)) event.returnValue = false;" > </li>
                                            <li><label>Nombre del edificio:</label><input type="text" id="IU_dd_nedi" placeholder="Nombre del edificio" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209 && (event.keyCode < 45 || event.keyCode > 57)) event.returnValue = false;"> </li>
                                            <li><label >Uso del predio:</label><input type="text" id="IU_dd_usop" placeholder="Uso del predio" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209 && (event.keyCode < 45 || event.keyCode > 57)) event.returnValue = false;"> </li>
                                            <li><label>Tipo de predio</label> </li>
                                        </ul>  

                                    </section>
                                        
                                      
                                    <center>
                                        <div class="radio" style="white-space: normal;">
                                            <input type="radio" name="diclote" id="IU_dd_urb">
                                            <label for="IU_dd_urb">Urbano</label>
                                            <input type="radio" name="diclote" id="IU_dd_rur">
                                            <label for="IU_dd_rur">Rural</label>
                                        </div>
                                    </center>

                                    <section class="form-group">
                                        <ul class="form-fields">       
                                            <li><label>Regimen de tenencia</label> </li>
                                        </ul>  

                                    </section>
                                    <center>
                                        <div class="radio" style="white-space: normal;">
                                            <input type="radio" name="tenencia" id="IU_dd_uni">
                                            <label for="IU_dd_uni">Unipropiedad</label>
                                            <input type="radio" name="tenencia" id="IU_dd_ph">
                                            <label for="IU_dd_ph">Popiedad Horizontal</label>
                                            <input type="radio" name="tenencia" id="IU_dd_op">
                                            <label for="IU_dd_op">OP-Copropiedad (DER-ACC)</label> 
                                        </div> <br><br>
                                    </center>
                                    <h5>Direccion</h5><br><br>
                                    <section class="form-group">
                                        <ul class="form-fields">
                                            <li><label >Calle principal: </label><input type="text" id="IU_d_callep" placeholder="Calle Principal" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209 && (event.keyCode < 45 || event.keyCode > 57)) event.returnValue = false;"> </li>
                                            <li><label>No:</label><input type="text" id="IU_d_no" placeholder="No de direccion" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209 && (event.keyCode < 45 || event.keyCode > 57)) event.returnValue = false;"> </li>
                                            <li><label >Intersección:</label><input type="text" id="IU_d_inter" placeholder="Interseccion" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209 && (event.keyCode < 45 || event.keyCode > 57)) event.returnValue = false;"> </li>
                                     
                                        </ul>  

                                    </section><br><br>
                    </article>
                
                <!--Segunda seccion de la identificacion legal del lote-->
                <article id="tab2">
                <center><span style="background: #ffffff;">&nbsp;Identificación legal&nbsp;</span></center><br> 

                                    <div>
                                        <!--Inicia la primera parte de Identificacion de lote!-->
                                        <h5>Propietario</h5><br><br> 
                                        <div class="general">   
                                            <label style="width: 20%;display: inline-block;">Tipo de propietario</label><br>
                                        </div>
                                        <center>
                                            <div class="radio" style="white-space: normal;">
                                                <input type="radio" name="tippersona" id="IL_p_tipoN" value="IL_p_tipoN" checked="checked">
                                                <label for="IL_p_tipoN">Natural</label>
                                                <input type="radio" name="tippersona" id="IL_p_tipoJ" value="IL_p_tipoJ" checked="checked">
                                                <label for="IL_p_tipoJ">Jurídica</label> <br><br> 
                                            </div>
                                            <div class="general">   
                                                <label style="width: 20%;display: inline-block;">Personeria juridica</label><br>
                                            </div>
                                            <center>
                                                <div class="radio" style="white-space: normal;">
                                                    <input type="radio" name="propietario" id="IL_p_perPublico">
                                                    <label for="IL_p_perPublico">Publico</label>
                                                    <input type="radio" name="propietario" id="IL_p_perPrivado">
                                                    <label for="IL_p_perPrivado">Privado</label>

                                                </div> <br><br>
                                            </center>
                                            <h5>Dirección</h5><br><br>
                                            <section class="form-group">
                                                <ul class="form-fields">
                                                    <li><label style="float: left;text-align: left">Pais: </label><input type="text" id="IL_dir_pais" placeholder="Pais" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209) event.returnValue = false;"> </li>
                                                    <li><label style="float: left;text-align: left">Ciudad:</label><input type="text" id="IL_dir_ciu" placeholder="Ciudad" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209) event.returnValue = false;"> </li>
                                                    <li><label style="float: left;text-align: left">Calle principal:</label><input type="text" id="IL_dir_cprincipal" placeholder="Calle principal" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209) event.returnValue = false;"> </li>
                                                    <li><label style="float: left;text-align: left">No: </label><input type="text" id="IL_dir_no" placeholder="Número" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209) event.returnValue = false;"> </li>
                                                    <li><label style="float: left;text-align: left">Intersección:</label><input type="text" id="IL_dir_inter" placeholder="Intersección" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209) event.returnValue = false;"> </li>
                                                    <li><label style="float: left;text-align: left">Celular:</label><input type="text" id="IL_dir_cel" placeholder="Número de celular" class="text-input" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"> </li>
                                                    <li><label style="float: left;text-align: left">Convencional:</label><input type="text" id="IL_dir_con" placeholder="Número convencional" class="text-input" onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;"> </li>
                                                    <li><label style="float: left;text-align: left">E-mail:</label><input type="email" id="IL_dir_email" placeholder="E-mail" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209 && (event.keyCode < 45 || event.keyCode > 57)) event.returnValue = false;"> </li>

                                                </ul>  

                                            </section> <br><br>
                                            
                                            <div id="contentPA" >

                                                <h5>Persona natural</h5><br><br>
                                                <section class="form-group">
                                                    <ul class="form-fields">
                                                        <li><label style="float: left;text-align: left">Nombre y Apellidos:</label><input type="text" id="IL_pnat_nomApl" placeholder="Nombres y apellidos" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209) event.returnValue = false;"> </li>
                                                        <li><label style="float: left;text-align: left">N° documento de identidad:</label><input type="text" id="IL_pnat_docIdent" placeholder="Número del documento de identidad" class="text-input" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"> </li>
                                                        <li><label style="float: left;text-align: left">Telefono:</label><input type="text" id="IL_pnat_telefono" placeholder="Número de telefono" class="text-input" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"> </li>
                                                        <li><label style="float: left;text-align: left">Correo Electronico: </label><input type="email" id="IL_pnat_correo" placeholder="E-mail" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209 && (event.keyCode < 45 || event.keyCode > 57)) event.returnValue = false;"> </li>
                                                        <li><label style="float: left;text-align: left">Estado civil</label><select id="estadoCivil"   name="estcivil">
                                                            <option value="IL_pnat_estcivil_s" id="IL_pnat_estcivil_s">Soltero/a</option>
                                                            <option value="IL_pnat_estcivil_c" id="IL_pnat_estcivil_c">Casado/a</option>
                                                            <option value="IL_pnat_estcivil_d" id="IL_pnat_estcivil_d">Divorciado/a</option>
                                                            <option value="IL_pnat_estcivil_v" id="IL_pnat_estcivil_v">Viudo/a</option>
                                                            <option value="IL_pnat_estcivil_u" id="IL_pnat_estcivil_u">Union de hecho</option>
                                                        </select>
                                                        </li>
                                                        <li><label style="float: left;text-align: left">Tipo de identificación:</label><select id="IL_pnat_inscrito"   name="pn_tipoidentificacion">
                                                            <option value="IL_pnat_inscrito_c" id="IL_pnat_inscrito_c">Cedula</option>
                                                            <option value="IL_pnat_inscrito_p" id="IL_pnat_inscrito_p">Pasaporte</option>
                                                            <option value="IL_pnat_inscrito_r" id="IL_pnat_inscrito_r">RUC</option>
                                                        </select>
                                                        </li>
                                                        <li><label style="float: left;text-align: left">Condicion fisica:</label><select id="IL_pnat_inscrito"   name="IL_pnat_inscrito">
                                                            <option value="IL_pnat_cfisica_nt" id="IL_pnat_inscrito_nt">No tiene</option>
                                                            <option value="IL_pnat_cfisica_a" id="IL_pnat_inscrito_a">Abandonado</option>
                                                            <option value="IL_pnat_cfisica_ac" id="IL_pnat_inscrito_ac">En acabados</option>
                                                            <option value="IL_pnat_cfisica_est" id="IL_pnat_inscrito_est">En estructura</option>
                                                            <option value="IL_pnat_cfisica_rec" id="IL_pnat_inscrito_rec">Reconstruida</option>
                                                            <option value="IL_pnat_cfisica_sinM" id="IL_pnat_inscrito_sinM">Sin modificacion</option>
                                                            <option value="IL_pnat_cfisica_t" id="IL_pnat_inscrito_t">Terminada</option>
                                                        </select>
                                                        </li>
                                                    </ul>  
                                                </section>
                                                    <br><br>
                                                    <!--aquiiiiiiiiiiiiiiiiiiiiiii !-->
                                            </div> 
                                    </div>
                                            <div id="contentC" >
                                                <h5>Conyuge</h5><br><br>
                                               <section class="form-group">
                                                    <ul class="form-fields">
                                                        <li><label style="float: left;text-align: left">Nombre y Apellidos:</label><input type="text" id="IL_conyuge_nA" placeholder="Nombres y apellidos del conyuge" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209) event.returnValue = false;"> </li>
                                                        <li><label style="float: left;text-align: left">N° documento de identidad:</label><input type="text" id="IL_conyuge_noDocI" placeholder="Número del documento de identidad" class="text-input" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"> </li>
                                                        <li><label style="float: left;text-align: left">Telefono:</label><input type="text" id="IL_conyuge_telefono" placeholder="Número de telefono" class="text-input" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"> </li>
                                                        <li><label style="float: left;text-align: left">Correo Electronico: </label><input type="email" id="IL_conyuge_correo" placeholder="E-mail" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209 && (event.keyCode < 45 || event.keyCode > 57)) event.returnValue = false;"> </li>
                                                        <li><label style="float: left;text-align: left">Tipo de identificación:</label><select id="IL_pnat_inscrito"   name="pn_tipoidentificacion">
                                                            <option value="IL_pnat_inscrito_c" id="IL_conyuge_inscrito_C">Cedula</option>
                                                            <option value="IL_pnat_inscrito_p" id="IL_conyuge_inscrito_P">Pasaporte</option>
                                                            <option value="IL_pnat_inscrito_r" id="IL_conyuge_inscrito_R">RUC</option>
                                                        </select>
                                                        </li>
                                                        <li><label style="float: left;text-align: left">Condicion fisica:</label><select id="IL_conyuge_cfisica"   name="IL_conyuge_cfisica">
                                                            <option value="IL_pnat_cfisica_nt" id="IL_conyuge_cfisica_No">No tiene</option>
                                                            <option value="IL_pnat_cfisica_a" id="IL_conyuge_cfisica_A">Abandonado</option>
                                                            <option value="IL_pnat_cfisica_ac" id="IL_conyuge_cfisica_Ena">En acabados</option>
                                                            <option value="IL_pnat_cfisica_est" id="IL_conyuge_cfisica_Enes">En estructura</option>
                                                            <option value="IL_pnat_cfisica_rec" id="IL_conyuge_cfisica_R">Reconstruida</option>
                                                            <option value="IL_pnat_cfisica_sinM" id="IL_conyuge_cfisica_SinM">Sin modificacion</option>
                                                            <option value="IL_pnat_cfisica_t" id="IL_conyuge_cfisica_T">Terminada</option>
                                                        </select>
                                                        </li>
                                                    </ul>  
                                                </section>
                                            </div> <br><br>
                                            <div id="contentPJ" >
                                                <h5 style="float: left">Persona juridica</h5><br><br>
                                                 <section class="form-group">
                                                    <ul class="form-fields">
                                                        <li><label style="float: left;text-align: left">Razon social:</label><input type="text" id="IL_juri_rsocial" placeholder="Razon social" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209) event.returnValue = false;"> </li>
                                                        <li><label style="float: left;text-align: left">RUC:</label><input type="text" id="IL_juri_ruc" placeholder="RUC" class="text-input" maxlength="13"  onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"> </li>
                                                        <li><label style="float: left;text-align: left">Lugar de inscripcion:</label><input type="text" id="IL_juri_lugar" placeholder="Lugar de inscripción" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209) event.returnValue = false;"> </li>
                                                        <li><label style="float: left;text-align: left">N° acuerdo o registro:  </label><input type="text" id="IL_juri_noAcuerdo" placeholder="N° acuerdo o registro" class="text-input" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"> </li>
                                                        <li><label style="float: left;text-align: left">Nombre del representante:  </label><input type="text" id="IL_juri_nR" placeholder="Nombre del representante" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209) event.returnValue = false;"> </li>
                                                        <li><label style="float: left;text-align: left">Inscrito en</label><select id="IL_juri_inscrito"   name="inscrito">
                                                            <option value="IL_juri_inscrito_M" id="IL_juri_inscrito_M">Ministerio</option>
                                                            <option value="IL_juri_inscrito_S" id="IL_juri_inscrito_S">Superintendencia</option>
                                                        </select>
                                                        </li>
                                                        <li><label style="float: left;text-align: left">Tipo de identificación:</label><select id="IL_juri_identificacion"   name="IL_juri_identificacion">
                                                            <option value="IL_juri_inscrito_C" id="IL_juri_inscrito_C">Cedula</option>
                                                            <option value="IL_juri_inscrito_P" id="IL_juri_inscrito_P">Pasaporte</option>
                                                            <option value="IL_juri_inscrito_Op" id="IL_juri_inscrito_Op">RUC</option>
                                                        </select>
                                                        </li>
                                                       
                                                    </ul>  
                                                </section><br><br>
                                            </div>
                                            <h5>Coopropietarios en derechos y acciones</h5><br><br> 
                                            <div>
                                                <div style="text-align: center" id="content" class="dinamico">

                                                    <label id="bt_add" style="" class="btn btn-default">Agregar </label>&nbsp;&nbsp;&nbsp;&nbsp;
                                                    <label id="bt_del" class="btn btn-default">Eliminar </label>&nbsp;&nbsp;&nbsp;&nbsp;
                                                    <label id="bt_delall" class="btn btn-default">Eliminar todo </label><br><br>                  

                                                </div>  

                                                <center>
                                                    <table id="tabla" class="table table-bordered" style="width: 80%;">
                                                        <thead>
                                                            <tr>
                                                                <td> Nº </td>
                                                                <td> Coopropietarios (Nombres y apellidos) </td>
                                                                <td> Número de identificación </td>
                                                                <td> Porcentaje (propiedad) </td>
                                                                <td> Alicuota </td>
                                                                <td> Fecha de esritura </td>
                                                                <td> Fecha de Inscripción </td>
                                                            </tr>
                                                        </thead>
                                                        <br>
                                                    </table>
                                                </center>

                                            </div>

                                            <br>
                                            <h5>Documento titulo de propiedad</h5><br><br> 
                                             <section class="form-group">
                                                    <ul class="form-fields">
                                                        <li><label style="float: left;text-align: left">N° de notaria: </label><input type="text" id="IL_docPro_Nnotaria" placeholder="Número de notaria" class="text-input" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;" > </li>
                                                        <li><label style="float: left;text-align: left">Canton inscripcion del titulo:</label><input type="text" id="IL_docPro_canton" placeholder="Canton inscripcion del titulo" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209) event.returnValue = false;"> </li>
                                                        <li><label style="float: left;text-align: left">Fecha de inscripcion: </label><input type="date" id="IL_docPro_fechaInscripcion" placeholder="Registro de la propiedad" class="text-input" min="1900-01-01" max="2030-01-01"> </li>
                                                        <li><label style="float: left;text-align: left">Fecha de protocolizacion:  </label><input type="date" id="IL_docPro_fechaProto" placeholder="Fecha de protocolizacion" class="text-input"  min="1900-01-01" max="2030-01-01"> </li>
                                                        <li><label style="float: left;text-align: left">Inscripcion del titulo</label></li>                                   
                                                    </ul>  
                                                 <center> 
                                                 <table class="gentab" style="width: 30%">
                                                        <tr>
                                                            <th ><input id="IL_docPro_inscripcion_P1" maxlength="1" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"></th>
                                                            <th ><input id="IL_docPro_inscripcion_P2" maxlength="1" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"></th>
                                                            <th ><input id="IL_docPro_inscripcion_C1" maxlength="1" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"></th>
                                                            <th ><input id="IL_docPro_inscripcion_C2" maxlength="1" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"></th>
                                                        </tr>
                                                        <tr>
                                                            <td colspan="2"> Provincia </td>
                                                            <td colspan="2"> Canton </td>

                                                        </tr>
                                                    </table>
                                                    <br>
                                                 </center>
                                                 
                                            </section><br><br>

                                        <div class="general">
                                            <label style="width: 30%;">Area: <input id="IL_docPro_area" style="width: 90%" maxlength="13" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"> </label>
                                            <label style="padding-left: 40px;">Unidades: </label>

                                            <div style="float: left"class="gensel">
                                                <select  name="unidadil">
                                                    <option value="IL_docPro_unidades_no" id="IL_docPro_unidades_no">No tiene</option>
                                                    <option value="IL_docPro_unidades_m2" id="IL_docPro_unidades_m2">m²</option>
                                                    <option value="IL_docPro_unidades_ha" id="IL_docPro_unidades_ha">Ha</option>
                                                    <option value="IL_docPro_unidades_cuadrada" id="IL_docPro_unidades_cuadrada">Cuadrada</option>
                                                    <option value="IL_docPro_unidades_solar" id="IL_docPro_unidades_solar">Solar</option>
                                                    <option value="IL_docPro_unidades_leg" id="IL_docPro_unidades_leg">Leguas</option>
                                                    <option value="IL_docPro_unidades_acre" id="IL_docPro_unidades_acre">Acre</option>
                                                    <option value="IL_docPro_unidades_otros" id="IL_docPro_unidades_otros">Otros</option>
                                                </select>
                                            </div>
                                            <br><br>
                                        </div>

                                        <h5>Predio sin titulo</h5><br><br>
                                        <section class="form-group">
                                                    <ul class="form-fields">
                                                        <li><label style="float: left;text-align: left">Requiere perfeccionamiento: </label><select id="IL_predioST_requiereP"   name="IL_predioST_requiereP">
                                                            <option value="IL_predioST_requiereP_si" id="IL_predioST_requiereP_si">Si</option>
                                                            <option value="IL_predioST_requiereP_no" id="IL_predioST_requiereP_no">No</option>
                                                        </select>
                                                        <li><label style="float: left;text-align: left">Años sin perfeccionamiento: </label><input type="number" id="IL_predioST_aniosSP" placeholder="Años sin perfeccionamiento" class="text-input" min="0"> </li>
                                                        <li><label style="float: left;text-align: left">Años que esta en posesion:</label><input type="number" id="IL_predioST_aniosPosesion" placeholder="Años que esta en posesion" class="text-input" min="0"> </li>
                                                         <li><label style="float: left;text-align: left">Nombre del pueblo/etnia:</label><input type="text" id="IL_predioST_nombrePE" placeholder="Nombre del pueblo/etnia" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209) event.returnValue = false;"> </li>
                                             
                                                    </ul>  
                                        </section><br><br>
                               
                                        <h5>Forma de adquisicion</h5><br><br>
                                        <section class="form-group">
                                                    <ul class="form-fields">
                                                        <li><label style="float: left;text-align: left">Forma de adquisición </label><select id="IL_formaA_adquisicion"   name="IL_formaA_adquisicion">
                                                             <option value="IL_formaA_adquisicion_actosS" id="IL_formaA_adquisicion_actosS">Actos Societarios</option>
                                                            <option value="IL_formaA_adquisicion_adju" id="IL_formaA_adquisicion_adju">Adjudicación</option>
                                                            <option value="IL_formaA_adquisicion_bienM" id="IL_formaA_adquisicion_bienM">Bien Mostrenco</option>
                                                            <option value="IL_formaA_adquisicion_compraV" id="IL_formaA_adquisicion_compraV">Compra venta</option>
                                                            <option value="IL_formaA_adquisicion_dacionP" id="IL_formaA_adquisicion_dacionP">Dación de pago</option>
                                                            <option value="IL_formaA_adquisicion_donCon" id="IL_formaA_adquisicion_donCon">Donación/Contribución</option>
                                                            <option value="IL_formaA_adquisicion_expro" id="IL_formaA_adquisicion_expro">Expropiación</option>
                                                            <option value="IL_formaA_adquisicion_hpEfectiva" id="IL_formaA_adquisicion_hpEfectiva">Herencia/Posesión Efectiva</option>
                                                            <option value="IL_formaA_adquisicion_posesion" id="IL_formaA_adquisicion_posesion">Posesion</option>
                                                            <option value="IL_formaA_adquisicion_indem" id="IL_formaA_adquisicion_indem">Indemnizacion</option>
                                                            <option value="IL_formaA_adquisicion_permuta" id="IL_formaA_adquisicion_permuta">Permuta</option>
                                                            <option value="IL_formaA_adquisicion_presc" id="IL_formaA_adquisicion_presc">Prescripcion Adquisicion de dominio</option>
                                                            <option value="IL_formaA_adquisicion_resolJ" id="IL_formaA_adquisicion_resolJ">Resolucion judicial</option>
                                                            <option value="IL_formaA_adquisicion_sinP" id="IL_formaA_adquisicion_sinP">Sin perfeccionar</option>
                                                            <option value="IL_formaA_adquisicion_remate" id="IL_formaA_adquisicion_remate">Remate</option>
                                                            <option value="IL_formaA_adquisicion_particion" id="IL_formaA_adquisicion_particion">Particion</option>
                                                            <option value="IL_formaA_adquisicion_compen" id="IL_formaA_adquisicion_compen">Compensacion</option>
                                                        </select>
                                                        
                                                       
                                                    </ul>  
                                        </section><br><br>
                                       

                                    
                    </article>
                
                <!--Tercera seccion de la caracterizacion del lote-->
                <article id="tab3" name="tab3" >
                <center><span style="background: #ffffff;">&nbsp;Caracterización del lote&nbsp;</span></center><br> 
                    <!--Inicia la parte de informacion legal de lote!-->	
                                <div>
                                    <h5>Caracteristicas del lote</h5><br><br>
                                     <section class="form-group">
                                                    <ul class="form-fields">
                                                        <li><label style="float: left;text-align: left">Área grafica del lote: </label><input type="text" id="CL_caracteristica_area" placeholder="Área grafica del lote" class="text-input"  onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"> </li>
                                                        <li><label style="float: left;text-align: left">Dimensión del frente:</label><input type="text" id="CL_caracteristica_dimension" placeholder="Dimensión del frente" class="text-input"  onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"> </li>
                                                        <li><label style="float: left;text-align: left">Localización del predio en la manzana</label><br>
                                                        <center>
                                                        <table  style="width: 30%;float: left" >
                                                            <tr>
                                                                <td  id="CL_localizacion_m00" class="btn-default"><img src="http://www.rocaportal.net/wp-content/uploads/2016/02/predio-goole-maps.jpg" style="height: 20px;width: 20px"> </td>
                                                                <td  id="CL_localizacion_m01" > s</td>
                                                                <td  id="CL_localizacion_m02"> s</td>
                                                                <td  id="CL_localizacion_m03"> s</td>
                                                                <td  id="CL_localizacion_m04"> s</td>
                                                                <td  id="CL_localizacion_m05"> s</td>
                                                            </tr>
                                                            <tr>
                                                                <th  id="CL_localizacion_m10">s</th>
                                                                <th  id="CL_localizacion_m11">s</th>
                                                                <th  id="CL_localizacion_m12">s</th>
                                                                <th  id="CL_localizacion_m13">s</th>
                                                                <th  id="CL_localizacion_m14">s</th>
                                                                <th  id="CL_localizacion_m15">s</th>
                                                            </tr>
                                                        </table><br><br><br><br>
                                                        </center>
                                                        <script>
                                                            $('#td1').click(function () {
                                                                console.log("aquii");
                                                            });
                                                        </script>
                                                        <li><label style="float: left;text-align: left">Dimensión del frente:</label><input type="text" id="CL_localizacion_dimensionF" placeholder="Dimensión del frente" class="text-input"  onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"> </li>
                                                    </ul>  
                                        </section><br><br>
                                    <h5>Infraestructura e instalaciones</h5><br><br>
                                        <section class="form-group">
                                                    <ul class="form-fields">
                                                        <li><label style="float: left;text-align: left">Agua </label><select id="CL_infraInst_agservicios"   name="CL_infraInst_agservicios">
                                                            <option value="CL_infraInst_agservicios_no" id="CL_infraInst_agservicios_no" >No tiene</option>
                                                            <option value="CL_infraInst_agservicios_portable" id="CL_infraInst_agservicios_portable">Potable</option>
                                                            <option value="CL_infraInst_agservicios_tanquero" id="CL_infraInst_agservicios_tanquero">Tanquero</option>
                                                            <option value="CL_infraInst_agservicios_pozo" id="CL_infraInst_agservicios_pozo">Pozo o vertiente</option>
                                                            <option value="CL_infraInst_agservicios_rio" id="CL_infraInst_agservicios_rio">Rio o canal</option>
                                                            <option value="CL_infraInst_agservicios_entubada" id="CL_infraInst_agservicios_entubada">Entubada</option>
                                                            <option value="CL_infraInst_agservicios_otros" id="CL_infraInst_agservicios_otros">Otros</option>
                                                            </select></li>
                                                        <li><label style="float: left;text-align: left">Alcantarillado  </label><select id="CL_infraInst_alservicios"   name="CL_infraInst_alservicios">
                                                            <option value="CL_infraInst_alservicios_no" id="CL_infraInst_alservicios_no">No tiene</option>
                                                            <option value="CL_infraInst_alservicios_redC" id="CL_infraInst_alservicios_redC">Red combinada</option>
                                                            <option value="CL_infraInst_alservicios_redS" id="CL_infraInst_alservicios_redS">Red Separada</option>
                                                            <option value="CL_infraInst_alservicios_pozoS" id="CL_infraInst_alservicios_pozoS">Pozo septico</option>
                                                            <option value="CL_infraInst_alservicios_pluvial" id="CL_infraInst_alservicios_pluvial">Pluvial</option>
                                                            <option value="CL_infraInst_alservicios_san" id="CL_infraInst_alservicios_san">Sanitario</option>
                                                            <option value="CL_infraInst_alservicios_otros" id="CL_infraInst_alservicios_otros">Otros</option>
                                                        </select></li>
                                                         <li><label style="float: left;text-align: left">Energia Electrica</label><select id="CL_infraInst_enservicios"   name="CL_infraInst_enservicios">
                                                             <option value="CL_infraInst_enservicios_no" id="CL_infraInst_enservicios_no">No tiene</option>
                                                            <option value="CL_infraInst_enservicios_redP" id="CL_infraInst_enservicios_redP">Red publica</option>
                                                            <option value="CL_infraInst_enservicios_redPro" id="CL_infraInst_enservicios_redPro">Red provisional</option>
                                                            <option value="CL_infraInst_enservicios_redDef" id="CL_infraInst_enservicios_redDef">Red definitiva</option>
                                                            <option value="CL_infraInst_enservicios_panelS" id="CL_infraInst_enservicios_panelS">Panel solar</option>
                                                            <option value="CL_infraInst_enservicios_generador" id="CL_infraInst_enservicios_generador">Generador</option>
                                                            <option value="CL_infraInst_enservicios_otros" id="CL_infraInst_enservicios_otros">Otros</option>
                                                        </select></li>
                                                        <li><label style="float: left;text-align: left">Via urbana</label><select id="CL_infraInst_viaservicios"   name="CL_infraInst_viaservicios">
                                                             <option value="CL_infraInst_viaservicios_a" id="CL_infraInst_viaservicios_a">Avenida</option>
                                                            <option value="CL_infraInst_viaservicios_c" id="CL_infraInst_viaservicios_c">Calle</option>
                                                            <option value="CL_infraInst_viaservicios_p" id="CL_infraInst_viaservicios_p">Pasaje</option>
                                                            <option value="CL_infraInst_viaservicios_e" id="CL_infraInst_viaservicios_e">Escalinata</option>
                                                            <option value="CL_infraInst_viaservicios_noT" id="CL_infraInst_viaservicios_noT">No tiene</option>
                                                            <option value="CL_infraInst_viaservicios_otros" id="CL_infraInst_viaservicios_otros">Otros</option>
                                                        </select></li>
                                                        <li><label style="float: left;text-align: left">Tipo de via de acceso</label><select id="CL_infraInst_tipoviaservicios"   name="CL_infraInst_tipoviaservicios">
                                                            <option value="CL_infraInst_tipoviaservicios_pav" id="CL_infraInst_tipoviaservicios_pav">Pavimento rigido</option>
                                                            <option value="CL_infraInst_tipoviaservicios_as" id="CL_infraInst_tipoviaservicios_as">Asfalto</option>
                                                            <option value="CL_infraInst_tipoviaservicios_adoOr" id="CL_infraInst_tipoviaservicios_adoOr">Adoquin ornamental</option>
                                                            <option value="CL_infraInst_tipoviaservicios_adoVe" id="CL_infraInst_tipoviaservicios_adoVe">Adoquin vehicular</option>
                                                            <option value="CL_infraInst_tipoviaservicios_piedra" id="CL_infraInst_tipoviaservicios_piedra">Piedra</option>
                                                            <option value="CL_infraInst_tipoviaservicios_lastre" id="CL_infraInst_tipoviaservicios_lastre">Lastre</option>
                                                            <option value="CL_infraInst_tipoviaservicios_tierra" id="CL_infraInst_tipoviaservicios_tierra">Tierra</option>
                                                            <option value="CL_infraInst_tipoviaservicios_otros" id="CL_infraInst_tipoviaservicios_otros">Otros</option>
                                                        </select></li>
                                                       <li><label style="float: left;text-align: left">Infraestructura vial</label><select id="CL_infraInst_infvial_acera"   name="CL_infraInst_infvial_acera">
                                                          <option value="CL_infraInst_infvial_acera" id="CL_infraInst_infvial_acera">Acera</option>
                                                          <option value="CL_infraInst_infvial_bordi" id="CL_infraInst_infvial_bordi">Bordillos</option>
                                                          <option value="CL_infraInst_infvial_otros" id="CL_infraInst_infvial_otros">Otros</option>
                                                        </select></li>
                                                    </ul>  
                                        </section><br><br>
                                        <h5 style="float: left;padding-right: 10px">Otros servicios </h5><br><br>
                                                        <center>
                                                            <table  style="width: 30%;float: left" >
                                                                <tr>
                                                                    <td>Alumbrado publico</td>
                                                                    <td><input id="CL_infraInst_otrosServicios_alum" type="checkbox" name="serv" >                           
                                                                </tr>
                                                                <tr>
                                                                    <td>Recoleccion basura</td>
                                                                    <td><input id="CL_infraInst_otrosServicios_recol" type="checkbox" name="serv" >                           
                                                                </tr>
                                                                <tr>
                                                                    <td>Transporte publico</td>
                                                                    <td><input id="CL_infraInst_otrosServicios_trans" type="checkbox" name="serv" >                           
                                                                </tr>
                                                                <tr>
                                                                    <td>Aseo de calles</td>
                                                                    <td><input id="CL_infraInst_otrosServicios_aseo" type="checkbox" name="serv" >                           
                                                                </tr>
                                                                <tr>
                                                                    <td>No tiene</td>
                                                                    <td><input  id="CL_infraInst_otrosServicios_no" type="checkbox" name="serv" >                           
                                                                </tr>
                                                            </table><br><br><br><br><br><br><br><br>
                                                        </center><br><br><br>
                                                            <h5 style="float: left;padding-right: 10px">Telefonia </h5><br><br>
                                                            <center>
                                                                <table  style="width: 30%;float: left" >
                                                                    <tr>
                                                                        <td>Fija</td>
                                                                        <td><input id="CL_infraInst_telefonia_fija" type="checkbox" name="Telefonia" >                           
                                                                    </tr>
                                                                    <tr>
                                                                        <td>Movil</td>
                                                                        <td><input id="CL_infraInst_telefonia_movil" type="checkbox" name="Telefonia" >                           
                                                                    </tr>
                                                                    <tr>
                                                                        <td>No tiene</td>
                                                                        <td><input id="CL_infraInst_telefonia_no" type="checkbox" name="Telefonia" >                           
                                                                    </tr>

                                                                </table><br><br>      
                                                            </center>    
                                                                </div>


                    
                    </article>
                        
                <!--Cuarta seccion limites--> 
                <article id="tab4" name="tab4">
                <center><span style="background: #ffffff;">&nbsp;Limites&nbsp;</span></center><br> 
                        <h5>Linderos / Colindantes </h5><br><br>
                         <section class="form-group">
                            <ul class="form-fields">
                                <li><label style="float: left;text-align: left">Nombre colindante(s): </label><input type="text" id="L_lindero_nombreC" placeholder="Nombre de los colindantes(s)" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209) event.returnValue = false;"> </li>
                                <li><label style="float: left;text-align: left">Área de escritura:</label><input type="text" id="L_lindero_areaE" placeholder="Área de escritura" class="text-input" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"> </li>
                            </ul>              
                         </section><br><br>  
                        
                    </article>        
                
                <!--Quinta seccion graficos del predio-->
                <article id="tab5" name="tab5" >
                <center><span style="background: #ffffff;">&nbsp;Gráficos del predio&nbsp;</span></center><br> 
                                <div>
                                    <h5>Plano del predio y construcciones </h5><br><br>
                                    <center>
                                        <input type="file" id="filesPPC" name="filesPPC[]"/>
                                        <br/>
                                        <output id="listPPC"></output>
                                    </center><br><br>                            
                                    <h5>Fotografia de la fachada</h5><br><br>
                                    <center>
                                        <input type="file" id="filesFF" name="filesFF[]"/>
                                        <br/>
                                        <output id="listFF"></output>
                                    </center><br><br>
                                </div> 
                               
                                <script>
                                    var externalAux;   
                                    function archivo(evt) {
                                        var files = evt.target.files; // FileList object
                                        //
                                        externalAux=this.id;
                                        console.log(externalAux);
                                        
                                        // Obtenemos la imagen del campo "file".
                                        for (var i = 0, f; f = files[i]; i++) {
                                          //Solo admitimos imágenes.
                                          if (!f.type.match('image.*')) {
                                              continue;
                                          }

                                          var reader = new FileReader();

                                          reader.onload = (function(theFile) {
                                              return function(e) {
                                                // Insertamos la imagen
                                                console.log(externalAux.toString()+"a");
                                                
                                                if(1){
                                                    document.getElementById("listPPC").innerHTML = ['<img class="thumb" src="', e.target.result,'" title="', escape(theFile.name), '"/>'].join('');
                                                }else{
                                                   document.getElementById("listFF").innerHTML = ['<img class="thumb" src="', e.target.result,'" title="', escape(theFile.name), '"/>'].join('');                                                
                                                }
                                              };
                                          })(f);

                                          reader.readAsDataURL(f);
                                        }
                                        
                                    }
                          
                                    
                                        document.getElementById('filesPPC').addEventListener('change', archivo, false);                                    
                                        document.getElementById('filesFF').addEventListener('change', archivo, false);                                    
                                        
                                    
                            </script>
                    </article>
                           
                <!--Sexto seccion economia-->
                <article id="tab6" name="tab6">
                <center><span style="background: #ffffff;">&nbsp;Económica&nbsp;</span></center><br> 
                    <div>
                        <h5>Avaluo Municipal </h5><br><br>
                        <section class="form-group">
                            <ul class="form-fields">
                                <li><label style="float: left;text-align: left">Avaluo de tierra: </label><input type="text" id="E_avaluo_tierra" placeholder="Avaluo de tierras" class="text-input" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"> </li>
                                <li><label style="float: left;text-align: left">Avaluo construcciones:</label><input type="text" id="E_avaluo_construcciones" placeholder="Avaluo construcciones" class="text-input" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"> </li>
                                 <li><label style="float: left;text-align: left">Avaluo total:</label><input type="text" id="E_avaluo_total" placeholder="Avaluo total" class="text-input" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"> </li>
                            </ul>              
                        </section><br><br>  
                    </div>
                </article>
                         
                <!--Septimo seccion responsables-->
                <article id="tab7" name="tab7">
                <center><span style="background: #ffffff;">&nbsp;Responsables&nbsp;</span></center><br>                     
                                <h5>Actualizador predial </h5><br><br>
                                <section class="form-group">
                                        <ul class="form-fields">
                                            <li><label style="float: left;text-align: left">Cedula / Pasaporte: </label><input type="text" id="Re_actualizador_cedulap" placeholder="Cedula / Pasaporte" class="text-input" maxlength="10" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"> </li>
                                            <li><label style="float: left;text-align: left">Fecha:</label><input type="date" id="Re_actualizador_fecha" placeholder="Fecha actualizada" class="text-input" min="1900-01-01" max="2030-01-01"> </li>
                                            <li><label style="float: left;text-align: left">Firma</label></li><br><br>
                                            <center>
                                                <input type="file" name="archivo3" id="Re_actualizador_firma">
                                            </center>
                                        </ul>              
                                </section><br><br> 
                                
                                <h5>Fiscalizador predial </h5><br><br>
                                 <section class="form-group">
                                        <ul class="form-fields">
                                            <li><label style="float: left;text-align: left">Cedula / Pasaporte: </label><input type="text" id="Re_fiscalizador_cedula1p" placeholder="Cedula / Pasaporte" class="text-input" maxlength="10" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"> </li>
                                            <li><label style="float: left;text-align: left">Fecha:</label><input type="date" id="Re_fiscalizador_fecha" placeholder="Fecha actualizada" class="text-input"  min="1900-01-01" max="2030-01-01"> </li>
                                            <li><label style="float: left;text-align: left">Firma</label></li><br><br>
                                            <center>
                                                  <input type="file" name="archivo4" id="Re_fiscalizador_firma">
                                            </center>
                                        </ul>              
                                </section><br><br>                
                    </article>
                     
                <!--Octava seccion caracteristicas de la construccion-->
                <article id="tab8" name="tab8">
                <center><span style="background: #ffffff;">&nbsp;Caracteristicas de la construcción&nbsp;</span></center><br>                                         
                                <div>
                                    <h5>Clave bloque piso o PH </h5><br><br>
                                      <section class="form-group">
                                        <ul class="form-fields">
                                            <li><label style="float: left;text-align: left">Código de ubicacion: </label><input type="text" id="CC_codigo_ubicacion" placeholder="Codigo de ubicación" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209 && (event.keyCode < 45 || event.keyCode > 57)) event.returnValue = false;"> </li>
                                            <li><label style="float: left;text-align: left">Código bloque: </label><input type="text" id="CC_codigo_bloque" placeholder="Código bloque" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209 && (event.keyCode < 45 || event.keyCode > 57)) event.returnValue = false;"> </li>
                                            <li><label style="float: left;text-align: left">Código piso:</label><input type="text" id="CC_codigo_piso" placeholder="Código piso" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209 && (event.keyCode < 45 || event.keyCode > 57)) event.returnValue = false;"> </li>
                                            <li><label style="float: left;text-align: left">Código unidad:</label><input type="text" id="CC_codigo_unidad" placeholder="Código unidad" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209 && (event.keyCode < 45 || event.keyCode > 57)) event.returnValue = false;"> </li>
                                            <li><label style="float: left;text-align: left">Clave bloque piso ph: </label><input type="text" id="CC_codigo_ph" placeholder="Clave bloque piso ph" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209 && (event.keyCode < 45 || event.keyCode > 57)) event.returnValue = false;"> </li>
                                        </ul>              
                                </section><br><br> 
                        
                                    <h5>Datos descriptivos del bloque - piso </h5><br><br>
                                     <section class="form-group">
                                                    <ul class="form-fields">
                                                        <li><label style="float: left;text-align: left">Nivel del piso</label><select id="CC_datosD_npiso"   name="CC_datosD_npiso">
                                                            <option value="CC_datosD_npiso_calzada" id="CC_datosD_npiso_calzada">Nivel Calzada</option>
                                                            <option value="CC_datosD_npiso_subs" id="CC_datosD_npiso_subs">Subsuelo</option>
                                                        </select></li>
                                                        <li><label style="float: left;text-align: left">Condicion fisica</label><select id="CC_datosD_cfisica"   name="CC_datosD_cfisica">
                                                            <option value="CC_datosD_cfisica_no" id="CC_datosD_cfisica_no">No tiene</option>
                                                            <option value="CC_datosD_cfisica_aband" id="CC_datosD_cfisica_aband">Abandonado</option>
                                                            <option value="CC_datosD_cfisica_acabd" id="CC_datosD_cfisica_acabd">En acabados</option>
                                                            <option value="CC_datosD_cfisica_struc" id="CC_datosD_cfisica_struc">En estructura</option>
                                                            <option value="CC_datosD_cfisica_recon" id="CC_datosD_cfisica_recon">Reconstruida</option>
                                                            <option value="CC_datosD_cfisica_sinM" id="CC_datosD_cfisica_sinM">Sin modificacion</option>
                                                            <option value="CC_datosD_cfisica_term" id="CC_datosD_cfisica_term">Terminada</option>
                                                        </select></li>
                                                         <li><label style="float: left;text-align: left">Valor cultural</label><select id="CC_datosD_vcultural"   name="CC_datosD_vcultural">
                                                            <option value="CC_datosD_vcultural_no" id="CC_datosD_vcultural_no">No tiene</option>
                                                            <option value="CC_datosD_vcultural_ance" id="CC_datosD_vcultural_ance">Ancestral</option>
                                                            <option value="CC_datosD_vcultural_arqui" id="CC_datosD_vcultural_arqui">Arquitectonico</option>
                                                            <option value="CC_datosD_vcultural_hist" id="CC_datosD_vcultural_hist">Historico</option>
                                                        </select></li>
                                                        <li><label style="float: left;text-align: left">Estado de conservacion</label><select id="CC_datosD_econserv"   name="CC_datosD_econserv">
                                                             <option value="CC_datosD_econserv_mBueno" id="CC_datosD_econserv_mBueno">Muy bueno</option>
                                                            <option value="CC_datosD_econserv_Bueno" id="CC_datosD_econserv_Bueno">Bueno</option>
                                                            <option value="CC_datosD_econserv_reg" id="CC_datosD_econserv_reg">Regular</option>
                                                            <option value="CC_datosD_econserv_malo" id="CC_datosD_econserv_malo">Malo</option>
                                                        </select></li>
                                                        <li><label style="float: left;text-align: left">Año de construcción:</label><input type="date" id="CC_datosD_anioConst" placeholder="Año de construcción" class="text-input" min="1600-01-01-01" max="2030-01-01"> </li>
                                                        <li><label style="float: left;text-align: left">Año de restauración: </label><input type="date" id="CC_datosD_anioRest" placeholder="Año de restauración" class="text-input" min="1600-01-01-01" max="2030-01-01"> </li>
                                                        <li><label style="float: left;text-align: left">Área construida (m²): </label><input type="text" id="CC_codigo_piso" placeholder="Área construida (m²)" class="text-input" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"> </li>
                                                        <li><label style="float: left;text-align: left">Uso constructivo del piso:</label><input type="text" id="CC_codigo_unidad" placeholder="Uso constructivo del piso" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209 && (event.keyCode < 45 || event.keyCode > 57)) event.returnValue = false;"> </li>
                                                      
                                                    </ul>  
                                        </section><br><br>
                                    </div>
                                    <h5>PH </h5><br><br>
                                    <section class="form-group">
                                        <ul class="form-fields">
                                            <li><label style="float: left;text-align: left">Alicuota:  </label><input type="text" id="CC_ph_alicuota" placeholder="Alicuota" class="text-input" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"> </li>
                                            <li><label style="float: left;text-align: left">Área declarada:</label><input type="text" id="CC_ph_areaC" placeholder="Área declarada" class="text-input" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"> </li>
                                           <li><label style="float: left;text-align: left">Unidades:</label><select id="CC_ph_unidadph"   name="CC_ph_unidadph">
                                               <option value="CC_ph_unidadph_no" id="CC_ph_unidadph_no">No tiene</option>
                                                <option value="CC_ph_unidadph_m2" id="CC_ph_unidadph_m2">m²</option>
                                                <option value="CC_ph_unidadph_ha" id="CC_ph_unidadph_ha">Ha</option>
                                                <option value="CC_ph_unidadph_c" id="CC_ph_unidadph_c">Cuadrada</option>
                                                <option value="CC_ph_unidadph_solar" id="CC_ph_unidadph_solar">Solar</option>
                                                <option value="CC_ph_unidadph_leguas" id="CC_ph_unidadph_leguas">Leguas</option>
                                                <option value="CC_ph_unidadph_acre" id="CC_ph_unidadph_acre">Acre</option>
                                                <option value="CC_ph_unidadph_otros" id="CC_ph_unidadph_otros">Otros</option>
                                            </select></li>
                                             <li><label style="float: left;text-align: left">Área de aumento constructivo:</label><input type="text" id="CC_ph_areaAC" placeholder="Área de aumento constructivo" class="text-input" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"> </li>
                                        </ul>              
                                    </section><br><br>                                         
                    </article>
                
                <!--Noveno seccion elementos constructivos-->
                <article id="tab9" name="tab9">
                <center><span style="background: #ffffff;">&nbsp;Elementos constructivos&nbsp;</span></center><br>                                                          
                          <div>
                                <h5>Elementos Constructivos</h5><br><br> 
                                            <div>
                                                <div style="text-align: center" id="content1" class="dinamico">
                                                    <label id="bt_adCC" class="btn btn-default">Agregar </label>&nbsp;&nbsp;&nbsp;&nbsp;
                                                    <label id="bt_delCC" class="btn btn-default">Eliminar </label>&nbsp;&nbsp;&nbsp;&nbsp;
                                                    <label id="bt_delallCC" class="btn btn-default">Eliminar todo </label>&nbsp;&nbsp;&nbsp;&nbsp;
                                                </div>  
                                                <center>
                                                    <table id="tablaCC" class="table">
                                                        <thead>
                                                            <tr>
                                                                <td> N </td>   
                                                                <td> N Bloque </td>  
                                                                <td> N Piso </td>
                                                                <td> Unidad Constructiva</td>
                                                                <td> Estructura </td>
                                                                <td> Cubierta </td>
                                                                <td> Acabados </td>
                                                                <td> Tipo de Acabado </td>
                                                                <td> Uso de la Construcci&oacute;n </td>
                                                            </tr>
                                                        </thead>
                                                        <br>
                                                    </table>
                                                </center>
                                            </div>
                                </div>
                           
                    </article>
                
                <!--Decimo seccion mejoras-->
                <article id="tab10" name="tab10">
                <center><span style="background: #ffffff;">&nbsp;Mejoras&nbsp;</span></center><br>                                                                             
                        <h5>Obras complementarias o mejoras</h5><br><br> 
                        <section class="form-group">
                                        <ul class="form-fields">
                                            <li><label style="float: left;text-align: left">Tipo de obra: </label><select id="M_obras_tipobra"   name="M_obras_tipobra">
                                                <option value="M_obras_tipobra_no" id="M_obras_tipobra_no">No tiene</option>
                                                <option value="M_obras_tipobra_ac" id="M_obras_tipobra_ac">Aceras y cercas</option>
                                                <option value="M_obras_tipobra_cro" id="M_obras_tipobra_cro">Canal de riego ocasional</option>
                                                <option value="M_obras_tipobra_cr" id="M_obras_tipobra_cr">Canal de riego</option>
                                            </select></li>
                                            <li><label style="float: left;text-align: left">Materiales: </label><select id="M_obras_material"   name="M_obras_material">
                                                 <option value="M_obras_material_no" id="M_obras_material_no">No tiene</option>
                                                 <option value="M_obras_material_a" id="M_obras_material_a">Aluminio</option>
                                                 <option value="M_obras_material_c" id="M_obras_material_c">Caña</option>
                                                 <option value="M_obras_material_h" id="M_obras_material_h">Hierro</option>
                                                 <option value="M_obras_material_mc" id="M_obras_material_mc">Madera comun</option>
                                                 <option value="M_obras_material_mp" id="M_obras_material_mp">Madera procesada fina</option>
                                                 <option value="M_obras_material_pp" id="M_obras_material_pp">Plasticos preformado</option>
                                            </select></li>                                           
                                            <li><label style="float: left;text-align: left">Estado: </label><select id="M_obras_estobra"   name="M_obras_estobra">
                                                 <option value="M_obras_estobra_no" id="M_obras_estobra_no">Muy bueno</option>
                                                <option value="M_obras_estobra_b" id="M_obras_estobra_b">Bueno</option>
                                                <option value="M_obras_estobra_r" id="M_obras_estobra_r">Regular</option>
                                                <option value="M_obras_estobra_m" id="M_obras_estobra_m">Malo</option>
                                            </select></li>
                                            <li><label style="float: left;text-align: left">Área:</label><input type="text" id="M_obras_area" placeholder="Área" class="text-input" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"> </li>
                                        </ul>              
                        </section><br><br>              
                    </article>
                     
                <!--Undecima seccion vivienda sensal-->
                <article id="tab11" name="tab11">
                <center><span style="background: #ffffff;">&nbsp;Vivienda Censal&nbsp;</span></center><br>                                                                                             
                        <h5>Clave catastral - Unidad o Vivienda</h5><br><br>
                            <section class="form-group">
                                <ul class="form-fields">
                                    <li><label style="float: left;text-align: left">Código de la unidad:</label><input type="text" id="VS_catstral_codigo" placeholder="Código de la unidad" class="text-input" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"> </li>
                                </ul>              
                            </section><br><br>              
                        <h5>Datos descriptivos de la unidad en P.H.</h5><br><br>
                            <section class="form-group">
                                <ul class="form-fields">
                                    <li><label style="float: left;text-align: left">Clasificacion vivienda: </label><select id="VS_datos_clavivienda"   name="VS_datos_clavivienda">
                                         <option value="VS_datos_clavivienda_no" id="VS_datos_clavivienda_no">No aplica</option>
                                            <option value="VS_datos_clavivienda_bodega" id="VS_datos_clavivienda_bodega">Bodega</option>
                                            <option value="VS_datos_clavivienda_casa" id="VS_datos_clavivienda_casa">Casa</option>
                                            <option value="VS_datos_clavivienda_choza" id="VS_datos_clavivienda_choza">Choza</option>
                                            <option value="VS_datos_clavivienda_covacha" id="VS_datos_clavivienda_covacha">Covacha</option>
                                            <option value="VS_datos_clavivienda_ci" id="VS_datos_clavivienda_ci">Cuarto en casa de inquilinato</option>
                                            <option  value="VS_datos_clavivienda_dept" id="VS_datos_clavivienda_dept">Departamento en casa o edificio</option>
                                            <option value="VS_datos_clavivienda_localC" id="VS_datos_clavivienda_localC">Local comercial</option>
                                            <option value="VS_datos_clavivienda_mediagua" id="VS_datos_clavivienda_mediagua">Mediagua</option>
                                            <option value="VS_datos_clavivienda_oficina" id="VS_datos_clavivienda_oficina">Oficina</option>
                                            <option value="VS_datos_clavivienda_otra" id="VS_datos_clavivienda_otra">Otra vivienda particular</option>
                                            <option value="VS_datos_clavivienda_parq" id="VS_datos_clavivienda_parq">Parqueadero</option>
                                            <option value="VS_datos_clavivienda_rancho" id="VS_datos_clavivienda_rancho">Rancho</option>
                                            <option value="VS_datos_clavivienda_villa" id="VS_datos_clavivienda_villa">Villa</option>
                                    </select></li>
                                    <li><label style="float: left;text-align: left">Tipo de documento:</label><select id="VS_datos_tipdoc"   name="VS_datos_tipdoc">
                                        <option value="VS_datos_tipdoc_cedula" id="VS_datos_tipdoc_cedula">Cedula de identidad</option>
                                        <option value="VS_datos_tipdoc_past" id="VS_datos_tipdoc_past">Pasaporte</option>
                                        <option value="VS_datos_tipdoc_ruc" id="VS_datos_tipdoc_ruc">RUC</option>
                                    </select></li>
                                    <li><label style="float: left;text-align: left">Tipo de vivienda</label></li>
                                </ul>              
                            </section>
                            <center>
                                        <div class="radio" style="white-space: normal;text-align: center">
                                            <input type="radio" name="tipvivienda" id="VS_datos_tipov_p">
                                            <label for="VS_datos_tipov_p">Particular</label>
                                            <input type="radio" name="tipvivienda" id="VS_datos_tipov_c">
                                            <label for="VS_datos_tipov_c">Colectiva</label> <br><br> 
                                        </div>
                            </center>
                            <section class="form-group">
                                <ul class="form-fields">
                                    <li><label style="float: left;text-align: left">Condición de ocupación de la vivienda</label></li>
                                </ul>              
                            </section> 
                            <center>
                                    <div class="radio" style="white-space: normal;">
                                        <input type="radio" name="ocupvivienda" id="VS_datos_condicv_o">
                                        <label for="VS_datos_condicv_o">Ocupada</label>
                                        <input type="radio" name="ocupvivienda" id="VS_datos_condicv_d">
                                        <label for="VS_datos_condicv_d">Desocupada</label> <br><br> 
                                    </div>
                            </center>
                            <section class="form-group">
                                <ul class="form-fields">
                                    <li><label style="float: left;text-align: left">Descripción del documento de identidad:</label><input type="text" id="VS_datos_descrip_docI" placeholder="Descripción del documento de identidad" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209) event.returnValue = false;"> </li>
                                    <li><label style="float: left;text-align: left">Apellidos y nombres del jefe de hogar:</label><input type="text" id="VS_datos_apNomb_jefeh" placeholder="Apellidos y nombres del jefe de hogar" class="text-input" onKeypress="if ( (event.keyCode < 65 || event.keyCode > 90) && (event.keyCode < 97 || event.keyCode > 122) && event.keyCode !== 32 && event.keyCode !== 241 && event.keyCode !== 209) event.returnValue = false;"> </li>
                                </ul>              
                            </section><br><br> 
                        <h5>Instalaciones nivel vivienda</h5><br><br>
                             <section class="form-group">
                                                    <ul class="form-fields">
                                                        <li><label style="float: left;text-align: left">Acabado piso:</label><select id="VS_instal_acabadopiso"   name="VS_instal_acabadopiso">
                                                           <option value="VS_instal_acabadopiso_no" id="VS_instal_acabadopiso_no">No tiene</option>
                                                            <option value="VS_instal_acabadopiso_adq" id="VS_instal_acabadopiso_adq">Adoquin</option>
                                                            <option value="VS_instal_acabadopiso_alf" id="VS_instal_acabadopiso_alf">Alfombra</option>
                                                            <option value="VS_instal_acabadopiso_cer" id="VS_instal_acabadopiso_cer">Ceramica</option>
                                                            <option value="VS_instal_acabadopiso_cesp" id="VS_instal_acabadopiso_cesp">Cesped sintetico</option>
                                                            <option value="VS_instal_acabadopiso_duela" id="VS_instal_acabadopiso_duela">Duela procesada</option>
                                                            <option value="VS_instal_acabadopiso_cemento" id="VS_instal_acabadopiso_cemento">En cementado</option>
                                                            <option value="VS_instal_acabadopiso_flot" id="VS_instal_acabadopiso_flot">Flotante</option>
                                                            <option value="VS_instal_acabadopiso_gres" id="VS_instal_acabadopiso_gres">Gres</option>
                                                            <option value="VS_instal_acabadopiso_tol" id="VS_instal_acabadopiso_tol">Laminas de tol carrujado</option>
                                                            <option value="VS_instal_acabadopiso_madera" id="VS_instal_acabadopiso_madera">Madera comun</option>
                                                            <option value="VS_instal_acabadopiso_marmol" id="VS_instal_acabadopiso_marmol">Marmol</option>
                                                            <option value="VS_instal_acabadopiso_marmoli" id="VS_instal_acabadopiso_marmoli">Marmolina</option>
                                                            <option value="VS_instal_acabadopiso_parq" id="VS_instal_acabadopiso_parq">Parquet</option>
                                                            <option value="VS_instal_acabadopiso_pint" id="VS_instal_acabadopiso_pint">Pintura de alto trafico</option>
                                                            <option value="VS_instal_acabadopiso_porcel" id="VS_instal_acabadopiso_porcel">Porcelanato</option>
                                                            <option value="VS_instal_acabadopiso_tab" id="VS_instal_acabadopiso_tab">Tabon</option>
                                                            <option value="VS_instal_acabadopiso_vin" id="VS_instal_acabadopiso_vin">Vinil</option>
                                                        </select></li>
                                                        <li><label style="float: left;text-align: left">Estado acabado piso:</label><select id="VS_instal_estacabpiso"   name="VS_instal_estacabpiso">
                                                            <option value="VS_instal_estacabpiso_mb" id="VS_instal_estacabpiso_mb">Muy bueno</option>
                                                            <option value="VS_instal_estacabpiso_b" id="VS_instal_estacabpiso_b">Bueno</option>
                                                            <option value="VS_instal_estacabpiso_r" id="VS_instal_estacabpiso_r">Regular</option>
                                                            <option value="VS_instal_estacabpiso_m" id="VS_instal_estacabpiso_m">Malo</option>
                                                        </select></li>
                                                        <li><label style="float: left;text-align: left">Agua proviene:</label><select id="VS_instal_agproviene"   name="VS_instal_agproviene">
                                                            <option value="VS_instal_agproviene_no" id="VS_instal_agproviene_no">No tiene</option>
                                                            <option value="VS_instal_agproviene_redP" id="VS_instal_agproviene_redP">De red publica</option>
                                                            <option value="VS_instal_agproviene_pozo" id="VS_instal_agproviene_pozo">De pozo</option>
                                                            <option value="VS_instal_agproviene_riov" id="VS_instal_agproviene_riov">De rio, vertiente,acequia</option>
                                                            <option value="VS_instal_agproviene_repar" id="VS_instal_agproviene_repar">De carro repartidor</option>
                                                            <option value="VS_instal_agproviene_lluvia" id="VS_instal_agproviene_lluvia">Otro (Agua lluvia)</option>
                                                        </select></li>
                                                        <li><label style="float: left;text-align: left">Agua recibe:</label><select id="VS_instal_agrecibe"   name="VS_instal_agrecibe">
                                                            <option value="VS_instal_agrecibe_no" id="VS_instal_agrecibe_no">No tiene</option>
                                                            <option value="VS_instal_agrecibe_tD" id="VS_instal_agrecibe_tD">Por tuberia dentro de la vivienda</option>
                                                            <option value="VS_instal_agrecibe_tF" id="VS_instal_agrecibe_tF">Por tuberia fuera de la vivienda pero dentro del edificio, lote o terreno</option>
                                                            <option value="VS_instal_agrecibe_tFE" id="VS_instal_agrecibe_tFE">Por tuberia fuera del edificio, lote o terreno</option>
                                                            <option value="VS_instal_agrecibe_noT" id="VS_instal_agrecibe_noT">No recibe agua por tuberia sino por otros medios</option>
                                                        </select></li>
                                                        <li><label style="float: left;text-align: left">Tipo de via de acceso</label><select id="CL_infraInst_tipoviaservicios"   name="CL_infraInst_tipoviaservicios">
                                                            <option value="CL_infraInst_tipoviaservicios_pav" id="CL_infraInst_tipoviaservicios_pav">Pavimento rigido</option>
                                                            <option value="CL_infraInst_tipoviaservicios_as" id="CL_infraInst_tipoviaservicios_as">Asfalto</option>
                                                            <option value="CL_infraInst_tipoviaservicios_adoOr" id="CL_infraInst_tipoviaservicios_adoOr">Adoquin ornamental</option>
                                                            <option value="CL_infraInst_tipoviaservicios_adoVe" id="CL_infraInst_tipoviaservicios_adoVe">Adoquin vehicular</option>
                                                            <option value="CL_infraInst_tipoviaservicios_piedra" id="CL_infraInst_tipoviaservicios_piedra">Piedra</option>
                                                            <option value="CL_infraInst_tipoviaservicios_lastre" id="CL_infraInst_tipoviaservicios_lastre">Lastre</option>
                                                            <option value="CL_infraInst_tipoviaservicios_tierra" id="CL_infraInst_tipoviaservicios_tierra">Tierra</option>
                                                            <option value="CL_infraInst_tipoviaservicios_otros" id="CL_infraInst_tipoviaservicios_otros">Otros</option>
                                                        </select></li>
                                                        <li><label style="float: left;text-align: left">Eliminacion de excretas: </label><select id="VS_instal_excretas"   name="VS_instal_excretas">
                                                            <option value="VS_instal_excretas_no" id="VS_instal_excretas_no">No tiene</option>
                                                            <option value="VS_instal_excretas_redP" id="VS_instal_excretas_redP">Conectado a red publica de alcantarillado</option>
                                                            <option value="VS_instal_excretas_pozoS" id="VS_instal_excretas_pozoS">Conectado a pozo septico</option>
                                                            <option value="VS_instal_excretas_pozoC" id="VS_instal_excretas_pozoC">Conectado a pozo ciego</option>
                                                            <option value="VS_instal_excretas_desD" id="VS_instal_excretas_desD">Con descarga directa al mar, rio, lago o quebrada</option>
                                                            <option value="VS_instal_excretas_let" id="VS_instal_excretas_let">Letrina</option>
                                                        </select></li>
                                                        <li><label style="float: left;text-align: left">Energia electrica proviene:</label><select id="VS_instal_electrica"   name="VS_instal_electrica">
                                                           <option value="VS_instal_electrica_no" id="VS_instal_electrica_no">No tiene</option>
                                                            <option value="VS_instal_electrica_empresa" id="VS_instal_electrica_empresa">Red de empresa electrica de servicio publico</option>
                                                            <option value="VS_instal_electrica_panel" id="VS_instal_electrica_panel">Panel solar</option>
                                                            <option value="VS_instal_electrica_gen" id="VS_instal_electrica_gen">Generador de luz (planta electrica)</option>
                                                            <option value="VS_instal_electrica_otro" id="VS_instal_electrica_otro">Otro</option>
                                                        </select></li>
                                                        <li><label style="float: left;text-align: left">Eliminacion de basura: </label><select id="VS_instal_basura"   name="VS_instal_basura">
                                                            <option value="VS_instal_basura_no" id="VS_instal_basura_no">No tiene</option>
                                                            <option value="VS_instal_basura_recol" id="VS_instal_basura_recol">Por carro recolector</option>
                                                            <option value="VS_instal_basura_baldio" id="VS_instal_basura_baldio">La arrojan en terreno baldio o quebrada</option>
                                                            <option value="VS_instal_basura_queman" id="VS_instal_basura_queman">La queman</option>
                                                            <option value="VS_instal_basura_ent" id="VS_instal_basura_ent">La entierran</option>
                                                            <option value="VS_instal_basura_arr" id="VS_instal_basura_arr">La arrojan al rio, acequia o canal</option>
                                                            <option value="VS_instal_basura_otro" id="VS_instal_basura_otro">De otra forma</option>
                                                        </select></li>
                                                        <li><label style="float: left;text-align: left">Tenencia de la vivienda:</label><select id="VS_instal_tenvivienda"   name="VS_instal_tenvivienda">
                                                            <option value="VS_instal_tenvivienda_anti" id="VS_instal_tenvivienda_anti">Anticresis</option>
                                                            <option value="VS_instal_tenvivienda_arr" id="VS_instal_tenvivienda_arr">Arrendada</option>
                                                            <option value="VS_instal_tenvivienda_serv" id="VS_instal_tenvivienda_serv">Por servicios</option>
                                                            <option value="VS_instal_tenvivienda_pres" id="VS_instal_tenvivienda_pres">Prestada o cedida</option>
                                                            <option value="VS_instal_tenvivienda_rdh" id="VS_instal_tenvivienda_rdh">Propia (regalada, donada, hererdada)</option>
                                                            <option value="VS_instal_tenvivienda_pp" id="VS_instal_tenvivienda_pp">Propia y la esta pagando</option>
                                                            <option value="VS_instal_tenvivienda_ptp" id="VS_instal_tenvivienda_ptp">Propia y totalmente pagada</option>
                                                        </select></li>
                                                        <li><label style="float: left;text-align: left">Descripción del documento de identidad:</label><input type="text" id="VS_datos_descrip_docI" placeholder="Descripción del documento de identidad" class="text-input"> </li>
                                                        <li><label style="float: left;text-align: left">N° de habitacones:</label><input type="number" id="VS_instal_noh"placeholder="Número de habitacones" class="text-input" min="1"> </li>
                                                        <li><label style="float: left;text-align: left">N° de dormitorios:</label><input type="number" id="VS_instal_nod" placeholder="Número de dormitorios" class="text-input" min="1"> </li>
                                                        <li><label style="float: left;text-align: left">Espacios para ducharse:</label><input type="number" id="VS_instal_ed" placeholder="Espacios para ducharse" class="text-input" min="1"> </li>
                                                        <li><label style="float: left;text-align: left">N° de habitantes:</label><input type="number" id="VS_instal_nohabit" placeholder="Número de habitantes" class="text-input" min="0"> </li>
                                                        <li><label style="float: left;text-align: left">N° de hogares: </label><input type="number" id="VS_instal_nohog" placeholder="Número de hogares" class="text-input" min="1"> </li>
                                                        <li><label style="float: left;text-align: left">Posee telefono convencional</label></li>
                                                    </ul>  
                             </section>
                                <center>
                                    <div class="radio" style="white-space: normal;">
                                        <input type="radio" name="poseetel" id="VS_instal_telefono_S">
                                        <label for="VS_instal_telefono_S">Si</label>
                                        <input type="radio" name="poseetel" id="VS_instal_telefono_N">
                                        <label for="VS_instal_telefono_N">No</label> <br><br> 
                                    </div>
                                </center>
                            <section class="form-group">
                                <ul class="form-fields">
                                    <li><label style="float: left;text-align: left">N° de telefonos celulares: </label><input type="number" id="VS_instal_telefono_no" placeholder="Número de telefonos celulares" class="text-input" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)event.returnValue = false;"> </li>
                                    <li><label style="float: left;text-align: left">Servicios de internet</label></li>
                                </ul>  
                             </section>
                                <center>
                                    <div class="radio" style="white-space: normal;">
                                        <input type="radio" name="servinter" id="VS_instal_internet_S">
                                        <label for="VS_instal_internet_S">Si</label>
                                        <input type="radio" name="servinter" id="VS_instal_internet_N">
                                        <label for="VS_instal_internet_N">No</label> <br><br> 
                                </center>
                        <h5>Observaciones</h5><br><br>
                         <section class="form-group">
                                <ul class="form-fields">
                                    <li> <textarea id=VS_observ_descrip" rows="3" cols="40" style="width: 80%;background: #fff" placeholder="Escribe aquí tus comentarios" maxlength="255"></textarea></li>
                                   
                                </ul>  
                             </section>
                    </article>    
                     
                <!--Duodecima seccion mapa-->
                <article id="tab12" name="tab12">
                <center><span style="background: #ffffff;">&nbsp;Mapa&nbsp;</span></center><br>                                                                                             
                    <div>
                                    <br> 
                                    <section>
                                        <script type="text/javascript">
            var drawingManager;
            var selectedShape;
            var colors = ['#1E90FF', '#FF1493', '#32CD32', '#FF8C00', '#4B0082'];
            var selectedColor;
            var colorButtons = {};

            function clearSelection () {
                if (selectedShape) {
                    if (selectedShape.type !== 'marker') {
                        selectedShape.setEditable(false);
                    }
                    
                    selectedShape = null;
                }
            }

            function setSelection (shape) {
                if (shape.type !== 'marker') {
                    clearSelection();
                    shape.setEditable(true);
                    selectColor(shape.get('fillColor') || shape.get('strokeColor'));
                }
                
                selectedShape = shape;
            }

            function deleteSelectedShape () {
                if (selectedShape) {
                    selectedShape.setMap(null);
                }
            }

            function selectColor (color) {
                selectedColor = color;
                for (var i = 0; i < colors.length; ++i) {
                    var currColor = colors[i];
                    colorButtons[currColor].style.border = currColor == color ? '2px solid #789' : '2px solid #fff';
                }

                // Retrieves the current options from the drawing manager and replaces the
                // stroke or fill color as appropriate.
                var polylineOptions = drawingManager.get('polylineOptions');
                polylineOptions.strokeColor = color;
                drawingManager.set('polylineOptions', polylineOptions);

                var rectangleOptions = drawingManager.get('rectangleOptions');
                rectangleOptions.fillColor = color;
                drawingManager.set('rectangleOptions', rectangleOptions);

                var circleOptions = drawingManager.get('circleOptions');
                circleOptions.fillColor = color;
                drawingManager.set('circleOptions', circleOptions);

                var polygonOptions = drawingManager.get('polygonOptions');
                polygonOptions.fillColor = color;
                drawingManager.set('polygonOptions', polygonOptions);
            }

            function setSelectedShapeColor (color) {
                if (selectedShape) {
                    if (selectedShape.type == google.maps.drawing.OverlayType.POLYLINE) {
                        selectedShape.set('strokeColor', color);
                    } else {
                        selectedShape.set('fillColor', color);
                    }
                }
            }

            function makeColorButton (color) {
                var button = document.createElement('span');
                button.className = 'color-button';
                button.style.backgroundColor = color;
                google.maps.event.addDomListener(button, 'click', function () {
                    selectColor(color);
                    setSelectedShapeColor(color);
                });

                return button;
            }

            function buildColorPalette () {
                var colorPalette = document.getElementById('color-palette');
                for (var i = 0; i < colors.length; ++i) {
                    var currColor = colors[i];
                    var colorButton = makeColorButton(currColor);
                    colorPalette.appendChild(colorButton);
                    colorButtons[currColor] = colorButton;
                }
                selectColor(colors[0]);
            }
var map, infoWindow;
            function initialize () {
                var map = new google.maps.Map(document.getElementById('map'), {
                    zoom: 8,
                    center: new google.maps.LatLng(52.25097, 20.97114),
                    zoomControl: true
                });
                     infoWindow = new google.maps.InfoWindow;
                if (navigator.geolocation) {
                  navigator.geolocation.getCurrentPosition(function(position) {
                    var pos = {
                      lat: position.coords.latitude,
                      lng: position.coords.longitude
                    };
                      var marker = new google.maps.Marker({
                        position:pos,
                        map: map
                      });
                      map.setCenter(pos);
                  }, function() {
                    handleLocationError(true, infoWindow, map.getCenter());
                  });
                } else {
                  // Browser doesn't support Geolocation
                  handleLocationError(false, infoWindow, map.getCenter());
                }
                var polyOptions = {
                    strokeWeight: 0,
                    fillOpacity: 0.45,
                    editable: true,
                    draggable: true
                };
                // Creates a drawing manager attached to the map that allows the user to draw
                // markers, lines, and shapes.
                drawingManager = new google.maps.drawing.DrawingManager({
                    drawingMode: google.maps.drawing.OverlayType.POLYGON,
                    markerOptions: {
                        draggable: true
                    },
                    polylineOptions: {
                        editable: true,
                        draggable: true
                    },
                    rectangleOptions: polyOptions,
                    circleOptions: polyOptions,
                    polygonOptions: polyOptions,
                    map: map
                });

                google.maps.event.addListener(drawingManager, 'overlaycomplete', function (e) {
                    var newShape = e.overlay;
                    
                    newShape.type = e.type;
                    
                    if (e.type !== google.maps.drawing.OverlayType.MARKER) {
                        // Switch back to non-drawing mode after drawing a shape.
                        drawingManager.setDrawingMode(null);

                        // Add an event listener that selects the newly-drawn shape when the user
                        // mouses down on it.
                        google.maps.event.addListener(newShape, 'click', function (e) {
                            if (e.vertex !== undefined) {
                                if (newShape.type === google.maps.drawing.OverlayType.POLYGON) {
                                    var path = newShape.getPaths().getAt(e.path);
                                    path.removeAt(e.vertex);
                                    if (path.length < 3) {
                                        newShape.setMap(null);
                                    }
                                }
                                if (newShape.type === google.maps.drawing.OverlayType.POLYLINE) {
                                    var path = newShape.getPath();
                                    path.removeAt(e.vertex);
                                    if (path.length < 2) {
                                        newShape.setMap(null);
                                    }
                                }
                            }
                            setSelection(newShape);
                        });
                        setSelection(newShape);
                    }
                    else {
                        google.maps.event.addListener(newShape, 'click', function (e) {
                            setSelection(newShape);
                        });
                        setSelection(newShape);
                    }
                });

                // Clear the current selection when the drawing mode is changed, or when the
                // map is clicked.
                google.maps.event.addListener(drawingManager, 'drawingmode_changed', clearSelection);
                google.maps.event.addListener(map, 'click', clearSelection);
                google.maps.event.addDomListener(document.getElementById('delete-button'), 'click', deleteSelectedShape);

                buildColorPalette();
            }
            google.maps.event.addDomListener(window,'load', initialize);
        </script>
      
                                    <div id="panel">
                                        <div id="color-palette"></div>
                                        <div><br><br><br>
                                            <label id="delete-button" class="btn btn-default" style="border: white 5px ridge; color: #000000; background: #FFFFFF">&nbsp;&nbsp;Eliminar&nbsp;&nbsp; </label>    
                                        </div>
                                    </div>
                                    <div id="map"></div>
                                    </section>
                                </div>
                    </article>        
            
                <article id="tabB">
                    <style type="text/css">
                    #submit {
                        margin-top:5%;
                        cursor:pointer;
                        width:30%;
                        height:10%;
                        background:#666666;
                        border:2px solid #f6f6f6;
                        padding:10px;
                        margin-top:5px;
                        font-size:100%;
                        color:#ffffff;
                    }

                    </style><center>
                    <input id="submit" type="submit" value="Enviar "class="botonform">
                    <input id="submit" type="reset" value="Borrar " class="botonform">
                    </center>    
                </article>
            </div>
        
                                    
        </form>    
    </div><!-- /container -->      
    <script>
            new gnMenu(document.getElementById('gn-menu'));
            var idUser =<%=request.getParameter("idUser")%>;
            var name = "<%=request.getParameter("name")%>";
            console.log("iduser" + idUser + "name" + name);
    </script>
      
</body>
    <footer style="width:100%; max-width:100%; margin: 0px auto; position: relative; text-align: justify; ">
        <div class="container-footer-all" style="width: 100%">
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
                <div class="colum3" style="text-align: justify">
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
                        <label>desgoecuador @outlook.com</label>
                    </div>
                </div>
            </div>
        </div>
        <div class="container-footer"  style="text-align: justify">
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
</html>