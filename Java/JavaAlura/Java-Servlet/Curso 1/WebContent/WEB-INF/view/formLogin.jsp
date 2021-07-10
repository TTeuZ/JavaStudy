<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- importação da biblioteca do jstl -->
<c:url value="/entrada" var="linkLogin"/> <!-- para deixar a criação do link de acesso ao servelet dinamico -->

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Form - Login</title>
	</head>
	<body>	
		<form action="${linkLogin}" method="post"> <!-- action define para qual url vai a requisiÃ§Ã£o desse form -->
			Login: <input type="text" name="login" />
			Senha: <input type="password" name="senha" />
			
			<input type="hidden" name="acao" value="Login" />
			<input type="submit" />
		</form>
	</body>
</html>