<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body class="well">
	<ul class="nav nav-pills">
		<li role="presentation" class="active"><a href="LogoutController">Sair</a></li>
	</ul>
	<div class="panel-body" align="center">
		<h1>Gerenciador Financeiro</h1>
		<h3>O Seu Gerenciador Financeiro!</h3>
		<h3>Bem Vindo ${usuarioLogado.nomeCompleto}</h3>
	</div>
	<h2>Op��es</h2>
	<div class="btn-group-vertical">
		<a href="UserController" class="btn btn-info">Cadastro de
			Usu�rios</a><a href="CategoriaController" class="btn btn-info">Cadastro
			de Categorias</a><a href="BancoController" class="btn btn-info">Cadastro
			de Bancos</a>
	</div>
</body>
</html>