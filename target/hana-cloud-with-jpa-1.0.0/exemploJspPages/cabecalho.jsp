<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<nav class="navbar navbar-default navbar-static-top">
	<div class="container">
		<ul class="nav nav-pills col-sm-6">
			<li role="presentation" class="active"><a
				href="InicioController">Home</a></li>
			<li role="presentation" class="dropdown"><a
				class="dropdown-toggle" data-toggle="dropdown" href="#"
				role="button" aria-haspopup="true" aria-expanded="false"> Menu <span
					class="caret"></span>
			</a>
				<ul class="dropdown-menu">
					<li role="presentation" ><a
						href="UserController">Usuarios</a></li>
					<li role="presentation" ><a
						href="CategoriaController">Categorias</a></li>
					<li role="presentation" ><a
						href="BancoController">Bancos</a></li>
				</ul></li>

		</ul>
		<ul class="nav nav-pills navbar-right">
		<li role="presentation" class="active"><a
				href="InicioController">Sair</a></li>
		</ul>
	</div>
	</nav>
	<div>
		<h1 align="center">FinancTool</h1>
		<h2 align="center">O Seu Gerenciador Financeiro!</h2>
	</div>
</body>
</html>