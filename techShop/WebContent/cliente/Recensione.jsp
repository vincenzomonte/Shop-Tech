<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="javax.servlet.*,java.util.*,model.*,java.sql.*"
	pageEncoding="UTF-8" session="true"%>
<%@include file="../WEB-INF/utilities/checkLogCliente.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scrivere Recensioni Tech Shop</title>
<style type="text/css">
body {
	margin: 100px 0 0 50px;
	font-family: Verdana, Arial, Tahoma, 'sans-serif';
}

.campoform {
	padding: 12px;
	border: #CCCCCC 1px solid;
	width: 250px;
}

.buttonform {
	background: #999999;
	padding: 10px;
	color: #FFFFFF;
	border: none;
	font-weight: bold;
	cursor: pointer;
}

.buttonform:hover {
	background: #333333;
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
	<h1>LASCIA UNA RECENSIONE ED UNA VOTAZIONE SUL TUO ACQUISITO</h1>


	<form action="rec.jsp" method="get">
		<div class="fieldset">
			<h4>
				Come consideri questo prodotto? <em class="required">*</em>
			</h4>
			<span id="input-message-box"></span>
			<table class="data-table review-summary-table ratings"
				id="product-review-table">
				<col width="1" />
				<col />
				<col />
				<col />
				<col />
				<col />
				<thead>
					<tr>
						<th>&nbsp;</th>
						<th>
							<div class="rating-box">
								<span class="rating-number">1</span> <span class="rating nobr"
									style="width: 20%;"> stella</span>
							</div>
						</th>
						<th>
							<div class="rating-box">
								<span class="rating-number">2</span> <span class="rating nobr"
									style="width: 40%;"> stelle</span>
							</div>
						</th>
						<th>
							<div class="rating-box">
								<span class="rating-number">3</span> <span class="rating nobr"
									style="width: 60%;"> stelle</span>
							</div>
						</th>
						<th>
							<div class="rating-box">
								<span class="rating-number">4</span> <span class="rating nobr"
									style="width: 80%;"> stelle</span>
							</div>
						</th>
						<th>
							<div class="rating-box">
								<span class="rating-number">5</span> <span class="rating nobr"
									style="width: 100%;"> stelle</span>
							</div>
						</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th>Qualità</th>
						<td class="value"><label for="Quality_1"><input
								type="radio" name="ratings[1]" id="Quality_1" value="1"
								class="radio" /></label></td>
						<td class="value"><label for="Quality_2"><input
								type="radio" name="ratings[1]" id="Quality_2" value="2"
								class="radio" /></label></td>
						<td class="value"><label for="Quality_3"><input
								type="radio" name="ratings[1]" id="Quality_3" value="3"
								class="radio" /></label></td>
						<td class="value"><label for="Quality_4"><input
								type="radio" name="ratings[1]" id="Quality_4" value="4"
								class="radio" /></label></td>
						<td class="value"><label for="Quality_5"><input
								type="radio" name="ratings[1]" id="Quality_5" value="5"
								class="radio" /></label></td>
					</tr>
					<tr>
						<th>Prezzo</th>
						<td class="value"><label for="Price_1"><input
								type="radio" name="ratings[3]" id="Price_1" value="11"
								class="radio" /></label></td>
						<td class="value"><label for="Price_2"><input
								type="radio" name="ratings[3]" id="Price_2" value="12"
								class="radio" /></label></td>
						<td class="value"><label for="Price_3"><input
								type="radio" name="ratings[3]" id="Price_3" value="13"
								class="radio" /></label></td>
						<td class="value"><label for="Price_4"><input
								type="radio" name="ratings[3]" id="Price_4" value="14"
								class="radio" /></label></td>
						<td class="value"><label for="Price_5"><input
								type="radio" name="ratings[3]" id="Price_5" value="15"
								class="radio" /></label></td>
					</tr>
					<tr>
						<th>Servizio</th>
						<td class="value"><label for="Value_1"><input
								type="radio" name="ratings[2]" id="Value_1" value="6"
								class="radio" /></label></td>
						<td class="value"><label for="Value_2"><input
								type="radio" name="ratings[2]" id="Value_2" value="7"
								class="radio" /></label></td>
						<td class="value"><label for="Value_3"><input
								type="radio" name="ratings[2]" id="Value_3" value="8"
								class="radio" /></label></td>
						<td class="value"><label for="Value_4"><input
								type="radio" name="ratings[2]" id="Value_4" value="9"
								class="radio" /></label></td>
						<td class="value"><label for="Value_5"><input
								type="radio" name="ratings[2]" id="Value_5" value="10"
								class="radio" /></label></td>
					</tr>
				</tbody>
			</table>
			<input type="hidden" name="validate_rating" class="validate-rating"
				value="" />
			<script type="text/javascript">decorateTable('product-review-table')</script>
	</form>
</head>


<h1>Scrivi la tua recensione:</h1>

<body>


	<form name="invia_dati" action="Inserimento.jsp" method="get">

		<br> <br> <input type="text" name="titolo" class="campoform">
		<label> Titolo Recensione</label> <br> <br>
		<textarea name="recensione" id="review_field" cols="30" rows="5"
			class="required-entry"></textarea>
		<label>Facci sapere cosa ne pensi del prodotto qui!!!!!</label> <br>
		<br> <input type="submit" class="buttonform" value="INVIA">

	</form>
	<%@ include file="../WEB-INF/fragment/footer.jsp"%>

</body>
</html>