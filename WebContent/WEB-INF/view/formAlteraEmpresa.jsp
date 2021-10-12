<%
	System.out.println(request.getParameter("empresa"));
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Altere a empresa</title>
</head>
<body>
	<form action="/gerenciador/entrada?acao=AlteraEmpresa"  method="post" >
		Nome: <input type="text" name="nome" value=${empresa.nome}>
		<input type="hidden" name="id" value="${empresa.id}">
		<input type="submit">
	</form>
	
	
</body>
</html>