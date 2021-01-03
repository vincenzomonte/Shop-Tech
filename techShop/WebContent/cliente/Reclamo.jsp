<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="javax.servlet.*,java.util.*,model.*,java.sql.*"
	pageEncoding="UTF-8" session="true"%>
<%! Connection con=null; %>
<%
	UserModelDS model=new UserModelDS();
	Collection<NegozioBean>  negozi= model.getAllNegozio();
%>
<%@include file="../WEB-INF/utilities/checkLogCliente.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset='utf-8'>
<meta http-equiv='X-UA-Compatible' content='IE=edge'>
<title>Tech Shop</title>

<script type="text/javascript">
<!--
function Email() {
var email = document.modulo.email.value;
var oggetto = document.modulo.oggetto.value;
var messaggio = document.modulo.messaggio.value;
if ((email.indexOf("@") == (-1)) || (email == "") || (email == "undefined")) {
alert("Inserire un indirizzo email valido.");
document.modulo.email.focus();
}
else if ((oggetto == "") || (oggetto == "undefined")) {
alert("Inserire un oggetto.");
document.modulo.oggetto.focus();
}
else if ((messaggio == "") || (messaggio == "undefined")) {
alert("Inserire un messaggio.");
document.modulo.messaggio.focus();
}
else {
location.href = "mailto:enzomonte2020@gmail.com," + email + "?Subject=" + oggetto + "&Body=" + messaggio;
}
}
</script>

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
</head>
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


	<h2>In questa sezione puoi contattare il venditore ,che ti aiutera con l' acquisto!!!</h2>

	<h5>Hai bisogno di aiuto sul ordine effettuato,problemi col prodotto?</h5>

	<h5>Scrivici!!!</h5>







	<form action="form.jsp" name="modulo" method="post">
		Email:<br /> <input type="text" name="email"> <br /> Oggetto
		con n°Ordine:<br /> <input type="text" name="oggetto"> <br />
		Messaggio 1:<br />
		<textarea name="messaggio" rows="10" cols="30"></textarea>
		<br /> <input type="button" value="Invia" onClick="Email()">
	</form>
	<br>
	<br>
	<br> Ci farebbe piacere conoscere la tua esprienza d'acquisto su
	Shop Tech Store
	<br> In modo da migliorare il nostro servizio e poter crescere
	come negozio online.
	<br> Abbiamo predisposto un semplice questionario che richiedera'
	meno di un minuto per esser compilato:
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<a href="Recensione.jsp">Clicca qui per lasciare una recensione: </a>



	<%@ include file="../WEB-INF/fragment/footer.jsp"%>



</body>
</html>