<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="model.JavaBeansDiscip"%>
<%@ page import="java.util.ArrayList"%>
<%
	ArrayList<JavaBeansDiscip> lista = (ArrayList<JavaBeansDiscip>) request.getAttribute("disciplinas");
%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Disciplinas</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Disciplinas</h1>
	<a href="novoDiscip.html" class="Botao1">Nova Disciplina</a>
	<table id="tabela">
		<thead>
			<tr>
				<th>Id</th>
				<th>Disciplina</th>
				<th>Carga Horária</th>
				<th>Ementa</th>
				<th>Opções</th>
			</tr>
		</thead>
		<tbody>
			<%for (int i = 0; i < lista.size(); i++) { %>
				<tr>
					<td><%=lista.get(i).getIddisciplina()%></td>
					<td><%=lista.get(i).getNomedisciplina()%></td>
					<td><%=lista.get(i).getCargahoraria()%></td>
					<td><%=lista.get(i).getEmenta()%></td>
					<td>
					<a
					class="Botao1">Editar</a>
					<a
					class="Botao2">Excluir</a>
					</td>
				</tr>
			<%} %>
		</tbody>
	</table>
</body>
</html>