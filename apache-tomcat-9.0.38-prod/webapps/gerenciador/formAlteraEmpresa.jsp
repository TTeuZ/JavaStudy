<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- importação da biblioteca do jstl -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> <!-- importação da biblioteca do fmt jstl, responsavel por formataçoes -->
<c:url value="/alteraEmpresa" var="linkServletNovaEmpresa"/> <!-- para deixar a criação do link de acesso ao servelet dinamico -->


<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Form - Atualize uma empresa</title>
	</head>
	<body>	
		<form action="${linkServletNovaEmpresa}" method="post"> <!-- action define para qual url vai a requisiÃ§Ã£o desse form -->
			nome: <input type="text" name="nome" value="${empresa.nome }" />
			<div style="display:flex; flex-flow:column">
				<span>antiga data: <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/></span>
				<div>
					Data Abertura: <input type="date" name="dataAbertura"/>
				</div>
			</div>
			<input type="text" name="id" value="${empresa.id}" hidden="true" />
			<input type="submit" />
		</form>
	</body>
</html>