<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="javax.servlet.*,java.util.*,model.*,java.sql.*"
	pageEncoding="UTF-8" session="true"%>

<%@include file="../WEB-INF/utilities/checkLogCliente.jsp"%>
<!DOCTYPE html>
<html>
<title>Tech Shop</title>
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
<header>
	<%@ include file="../WEB-INF/fragment/headernegozio.jsp"%>

	<div id='mySidenav' class="sidenav">
		<ul>
			<li onclick="window.open('ordini.jsp','_self')">I miei Ordini</li>

			<li><a href='../Logout'
				style='padding: 0; text-decoration: none; color: #141414;'>Disconnetti</a>
			</li>

		</ul>
	</div>
</header>
<body>



	<% Cookie corriere= new Cookie("corriere",request.getParameter("corriere")); 
corriere.setMaxAge(60*60*24);
Cookie spedizione= new Cookie("spedizione",request.getParameter("spedizione")); 
spedizione.setMaxAge(60*60*24);
Cookie im= new Cookie("im",request.getParameter("im"));
im.setMaxAge(60*60*24);

corriere.setMaxAge(60*60*24);
spedizione.setMaxAge(60*60*24);
im.setMaxAge(60*60*24);

response.addCookie(corriere);
response.addCookie(spedizione);
response.addCookie(im);
%>

<body>
	<form action=".venditore/ordini.jsp" method="get">
		<font color="green" size="5"> Conclusioni Spedizione </font>
		<h2>
			Info:
			<%=request.getParameter ("name")%>
			<br>
		</h2>
		<TABLE style="background-color: # ECE5B6;" WIDTH="30%">
			<tr width="100%">
			<tr>
				<td width="50%">Corriere</td>
				<td width="50%"><%=request.getParameter ("corriere")%></td>
			</tr>
			<tr>
				<td>Consegna</td>
				<td><%=request.getParameter("spedizione")%></td>
			</tr>
			<tr>
				<td>Impacchettamento</td>
				<td><%=request.getParameter("im")%></td>
			</tr>
			<tr>
				<td></td>
				<td align="right"><A HREF="cart.jsp"> <font size="4"
						color="blue"> conferma </font>
				</A></td>
			</tr>
		</table>
	</form>
</body>
<%@ include file="../WEB-INF/fragment/footer.jsp"%>
</html>