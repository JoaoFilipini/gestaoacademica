<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="model.JavaBeans"%>
<%@ page import="java.util.ArrayList"%>
<%
	ArrayList<JavaBeans> lista = (ArrayList<JavaBeans>) request.getAttribute("cursos");
%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Cursos</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Cursos</h1>
	<a href="novo.html" class="Botao1">Novo Curso</a>
	<table id="tabela">
		<thead>
			<tr>
				<th>Id</th>
				<th>Nome</th>
				<th>Periodicidade</th>
				<th>Descricao</th>
				<th>Opções</th>
			</tr>
		</thead>
		<tbody>
			<%for (int i = 0; i < lista.size(); i++) { %>
				<tr>
					<td><%=lista.get(i).getIdcurso()%></td>
					<td><a href="disciplina?idcurso=<%=lista.get(i).getIdcurso()%>"><%=lista.get(i).getNomecurso()%></a></td>
					<td><%=lista.get(i).getPeriodicidade()%></td>
					<td><%=lista.get(i).getDescricao()%></td>
					<td>
					<a href="selectCurso?idcurso=<%=lista.get(i).getIdcurso()%>"
					class="Botao1">Editar</a>
					<a href="javascript: confirmar(<%=lista.get(i).getIdcurso()%>)"
					class="Botao2">Excluir</a>
					</td>
				</tr>
			<%} %>
		</tbody>
	</table>
	<script src="scripts/confirmador.js"></script>
</body>
</html>