<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- importação da biblioteca do jstl -->
<%-- <%
/* essa é a maneira de introduzir codigo java numa jsp, que sao as paginas html que podem utilizar java. */
// scriptlet
	String nomeEmpresa = (String) request.getAttribute("empresa"); // pegando o atibuto que foi linkado a request
	System.out.println(nomeEmpresa);
%> --%> <!-- utilizando a nova nomenclatura la de baixo, toda essa parte se torna desnecessaria. -->
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
			<c:import url="logout-parcial.jsp" />
			<%-- Empresa <% out.println(nomeEmpresa); %> cadastrada com sucesso!! --%>
			<!-- ouu -->
			<%-- Empresa <%= nomeEmpresa %> cadastrada com sucesso!! --%>  <!-- ScriptLets sao indesejaveis, entao inventaram uma nova nomenclaruta para essa interação. -->
			
			<c:if test="${not empty empresa }">
				Empresa ${empresa} cadastrada com sucesso! <!-- expression language -->
			</c:if>
			<c:if test="${empty empresa }">
				Nao houve cadastro de empresa
			</c:if>
	</body>
</html>

