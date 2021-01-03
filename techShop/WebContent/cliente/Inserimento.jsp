<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="javax.servlet.*,java.util.*,model.*,java.sql.*"
	pageEncoding="UTF-8" session="true"%>
<%@include file="../WEB-INF/utilities/checkLogCliente.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Visulizza la tua recensione Tech Shop</title>

<script type="text/javascript">
function parseGetVars()
{
  // creo una array
  var args = new Array();
  // individuo la query (cioè tutto quello che sta a destra del ?)
  // per farlo uso il metodo substring della proprietà search
  // dell'oggetto location
  var query = window.location.search.substring(1);
  // se c'è una querystring procedo alla sua analisi
  if (query)
  {
    // divido la querystring in blocchi sulla base del carattere &
    // (il carattere & è usato per concatenare i diversi parametri della URL)
    var strList = query.split('&');
    // faccio un ciclo per leggere i blocchi individuati nella querystring
    for(str in strList)
    {
      // divido ogni blocco mediante il simbolo uguale
      // (uguale è usato per l'assegnazione del valore)
      var parts = strList[str].split('=');
      // inserisco nella array args l'accoppiata nome = valore di ciascun
      // parametro presente nella querystring
      args[unescape(parts[0])] = unescape(parts[1]);
    }
  }
  return args;
}

function scriviNominativo()
{
// Recupero i valori passati con GET
// Per farlo creo una variabile cui assegno come valore
// il risultato della funzione vista in precedenza
var get = parseGetVars();

// estraggo dall'array contenente i valori della querystring
// il valore dei parametri "nome" e "cognome"
var recensione = get['recensione'];
var titolo = get['titolo'];

// stampo a video
document.write(titolo);
document.write("&nbsp;");
document.write(recensione);
}
</script>
<style type="text/css">
body {
	margin: 50px 0 0 50px;
	font-family: Verdana, Arial, Tahoma, 'sans-serif';
}
</style>
<style>
div {
	background-color: green;
}
</style>

<link rel="icon" href="../images/favicon.ico" />
<meta name='viewport'
	content='width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0'>
<link rel='stylesheet' type='text/css' href='../css/table.css'>
<link rel='stylesheet' type='text/css'
	href='../css/sidenav-nav_top/stile-nav_top.css'>
<link rel='stylesheet' type='text/css'
	href='../css/sidenav-nav_top/sidenav-nav_top.css'>
<link rel='stylesheet' type='text/css' href='../css/header.css'>
<link rel='stylesheet' type='text/css' href='../css/content.css'>
<link rel='stylesheet' type='text/css' href='../css/footer.css'>
<link rel='stylesheet' type='text/css' href='../css/scrollbar.css'>
<link rel='stylesheet' type='text/css' href='../css/slideshow.css'>
<link rel='stylesheet' type='text/css' href='../css/translate.css'>
<link rel='stylesheet' type='text/css' href='../css/step.css'>
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Roboto:300,400,500,700"
	type="text/css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" src="../js/nav/menu-nav_top.js"></script>
<script type="text/javascript" src="../js/top.js"></script>
<script type="text/javascript" src="../js/scrollToDiv.js"></script>
<script type="text/javascript" src="../js/translate.js"></script>
<script type="text/javascript" src="../js/check-chrome.js"></script>
<script type="text/javascript"
	src="http://translate.google.com/translate_a/element.js?cb=googleTranslateElementInit"></script>

<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"
	integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf"
	crossorigin="anonymous">
<body onresize='resize()' id='home'>
	<header>
		<%@ include file="../WEB-INF/fragment/headernegozio.jsp"%>

		<div id='mySidenav' class="sidenav" style="background-color:#50c878;">
			<ul>
				<li onclick="window.open('ordini.jsp','_self')">I miei Ordini</li>

				<li><a href='../Logout'
					style='padding: 0; text-decoration: none; color: #141414;'>Disconnetti</a>
				</li>

			</ul>
		</div>
	</header>



	<h1>La tua recensione:</h1>
</head>

LA TUA RECENSIONE:
<script type="text/javascript">scriviNominativo()</script>

<br>
<br>
<br>
<br>

<body>

	RECENSIONI DELLA COMMUNITY
	<br>
	<br>





	<a href="rec.jsp">Vedi altre recensioni sul prodotto</a>


	<%@ include file="../WEB-INF/fragment/footer.jsp"%>
</body>
</html>