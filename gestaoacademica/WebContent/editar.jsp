<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Cursos - Editar</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Editar curso</h1>
	<form name="frmCurso" action="updateCurso">
		<table>
			<tr>
				<td><input type="text" name="idcurso" id="caixa3" readonly
					value="<%out.print(request.getAttribute("idcurso"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="nomecurso" class="Caixa1"
					value="<%out.print(request.getAttribute("nomecurso"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="periodicidade" class="Caixa2"
					value="<%out.print(request.getAttribute("periodicidade"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="descricao" class="Caixa1"
					value="<%out.print(request.getAttribute("descricao"));%>"></td>
			</tr>
		</table>
		<input type="button" value="Salvar" class="Botao1" onclick="validar()">
	</form>
	<script src="scripts/validador.js"></script>
</body>
</html>