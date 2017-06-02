<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


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


<title>FinancTool - Cadastro de Usuários</title>

</head>

<body class="well">


	<div>
		<%@include file="../exemploJspPages/cabecalho.jsp"%>
	</div>

	<form method="post" action="UserController">
		<div class="input-group">

			<p>
				Código: <input type="text" name="f_userid" readonly="true"
					value="${usuarioBean.id}" class="form-control" />
			</p>

			<p>
				Nome Completo:<input type="text" name="f_completeusername"
					value="${usuarioBean.nomeCompleto}" class="form-control" />
			</p>

			<p>
				Usuario:<input type="text" name="f_username"
					value="${usuarioBean.nomeUsuario}" class="form-control" />
			</p>

			<p>
				Senha:<input type="password" name="f_senha"
					value="${usuarioBean.senha}" class="form-control" />
			</p>

			<input type="submit" name="action" value="Salvar"
				class="btn btn-default" />

		</div>

		<hr>

		<div class="panel panel-default">

			<table class="table">

				<tr>

					<td>Código</td>

					<td>Nome Completo</td>

					<td>Usuario</td>

					<td></td>

					<td></td>

				</tr>


				<c:forEach items="${usuarioBeanList.usuariosBeanList}" var="usuario">

					<tr>

						<td>${usuario.id}</td>

						<td>${usuario.nomeCompleto}</td>

						<td>${usuario.nomeUsuario}</td>

						<td><a
							href=UserController?action=Editar&f_userid=${usuario.id}>Editar</a></td>

						<td><a
							href=UserController?action=Excluir&f_userid=${usuario.id}>Excluir</a></td>
				</c:forEach>
				</tr>
			</table>

		</div>

	</form>
	<div>
		<%@include file="../exemploJspPages/rodape.jsp"%>
	</div>
</body>

</html>