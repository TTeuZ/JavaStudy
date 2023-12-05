<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- importação da biblioteca do jstl -->
<c:url value="/entrada" var="linkServletNovaEmpresa"/> <!-- para deixar a criação do link de acesso ao servelet dinamico -->

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Form - Cadastre uma empresa</title>
	</head>
	<body>	
		<c:import url="logout-parcial.jsp" />
		<form action="${linkServletNovaEmpresa}" method="post"> <!-- action define para qual url vai a requisiÃ§Ã£o desse form -->
			nome: <input type="text" name="nome" />
			Data Abertura: <input type="date" name="dataAbertura" />
			<input type="hidden" name="acao" value="NovaEmpresa" />
			<input type="submit" />
		</form>
	</body>
</html>