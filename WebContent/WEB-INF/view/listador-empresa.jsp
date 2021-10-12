<%@page import="br.com.alura.gerenciador.models.Empresa"%>
<%@page import="java.util.List"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
List<Empresa> list = (List<Empresa>) request.getAttribute("empresas");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresas listadas :)</title>
</head>
<body>
	
	


	<ul>
		
	
		
	
		 <c:forEach items="${empresas}" var="empresa">
			<li>${empresa.nome}
		 	<a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id}"> Editar</a>
			<a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id}">Remover</a>
		
			</li>
		</c:forEach>
	
		
		
		
	</ul>

	<br>
	<h1>
		<a href="/gerenciador"> Home </a>
	</h1>
</body>
</html>