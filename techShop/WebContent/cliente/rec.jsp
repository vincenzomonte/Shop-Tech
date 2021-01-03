<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="javax.servlet.*,java.util.*,model.*,java.sql.*"
	pageEncoding="UTF-8" session="true"%>
<%@include file="../WEB-INF/utilities/checkLogCliente.jsp"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
* {
	box-sizing: border-box;
}

body {
	font-family: Arial;
	margin: 0 auto; /* Center website */
	max-width: 800px; /* Max width */
	padding: 20px;
}

.heading {
	font-size: 25px;
	margin-right: 25px;
}

.fa {
	font-size: 25px;
}

.checked {
	color: orange;
}

/* Three column layout */
.side {
	float: left;
	width: 15%;
	margin-top: 10px;
}

.middle {
	float: left;
	width: 70%;
	margin-top: 10px;
}

/* Place text to the right */
.right {
	text-align: right;
}

/* Clear floats after the columns */
.row:after {
	content: "";
	display: table;
	clear: both;
}

/* The bar container */
.bar-container {
	width: 100%;
	background-color: #f1f1f1;
	text-align: center;
	color: white;
}

/* Individual bars */
.bar-5 {
	width: 60%;
	height: 18px;
	background-color: #4CAF50;
}

.bar-4 {
	width: 30%;
	height: 18px;
	background-color: #2196F3;
}

.bar-3 {
	width: 10%;
	height: 18px;
	background-color: #00bcd4;
}

.bar-2 {
	width: 4%;
	height: 18px;
	background-color: #ff9800;
}

.bar-1 {
	width: 15%;
	height: 18px;
	background-color: #f44336;
}

/* Responsive layout - make the columns stack on top of each other instead of next to each other */
@media ( max-width : 400px) {
	.side, .middle {
		width: 100%;
	}
	/* Hide the right column on small screens */
	.right {
		display: none;
	}
}
</style>

<style>
div {
	background-color: green;
}
</style>
<meta charset="ISO-8859-1">
<title>Recensioni Clienti Tech Shop</title>
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
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
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
	<h1>Recensioni relativi al prodotto acquistato:</h1>

	<span class="heading">Voto delgli utenti</span>
	<span class="fa fa-star checked"></span>
	<span class="fa fa-star checked"></span>
	<span class="fa fa-star checked"></span>
	<span class="fa fa-star checked"></span>
	<span class="fa fa-star"></span>
	<p>4.1 media basata su 254 recensioni.</p>
	<hr style="border: 3px solid #f1f1f1">

	<div class="row">
		<div class="side">
			<div>5 stelle</div>
		</div>
		<div class="middle">
			<div class="bar-container">
				<div class="bar-5"></div>
			</div>
		</div>
		<div class="side right">
			<div>150</div>
		</div>
		<div class="side">
			<div>4 stelle</div>
		</div>
		<div class="middle">
			<div class="bar-container">
				<div class="bar-4"></div>
			</div>
		</div>
		<div class="side right">
			<div>63</div>
		</div>
		<div class="side">
			<div>3 stelle</div>
		</div>
		<div class="middle">
			<div class="bar-container">
				<div class="bar-3"></div>
			</div>
		</div>
		<div class="side right">
			<div>15</div>
		</div>
		<div class="side">
			<div>2 stelle</div>
		</div>
		<div class="middle">
			<div class="bar-container">
				<div class="bar-2"></div>
			</div>
		</div>
		<div class="side right">
			<div>6</div>
		</div>
		<div class="side">
			<div>1 stelle</div>
		</div>
		<div class="middle">
			<div class="bar-container">
				<div class="bar-1"></div>
			</div>
		</div>
		<div class="side right">
			<div>20</div>
		</div>
	</div>


	<%@ include file="../WEB-INF/fragment/footer.jsp"%>

</body>
</html>