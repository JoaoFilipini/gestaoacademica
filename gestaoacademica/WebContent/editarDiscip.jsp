<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Disciplina - Editar</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Editar Disciplina</h1>
	<form name="frmDiscip" action="updateDiscip">
		<table>
			<tr>
				<td><input type="text" name="iddisciplina" id="caixa3" readonly
					value="<%out.print(request.getAttribute("iddisciplina"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="nomedisciplina" class="Caixa1"
					value="<%out.print(request.getAttribute("nomedisciplina"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="cargahoraria" class="Caixa2"
					value="<%out.print(request.getAttribute("cargahoraria"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="ementa" class="Caixa1"
					value="<%out.print(request.getAttribute("ementa"));%>"></td>
			</tr>
		</table>
		<input type="button" value="Salvar" class="Botao1" onclick="validarDiscip()">
	</form>
	<script src="scripts/validador.js"></script>
</body>
</html>