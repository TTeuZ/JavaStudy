<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.modelo.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- importação da biblioteca do core jstl -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> <!-- importação da biblioteca do fmt jstl, responsavel por formataçoes -->

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<c:if test="${not empty empresa }">
			Empresa ${empresa} cadastrada com sucesso! <!-- expression language -->
		</c:if>
	
		<h1>Lista de empresas</h1>
		
		<ul>
			<c:forEach items="${empresas}" var="empresa">
				<li>
				 	${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
				 	<a href="/gerenciador/mostraEmpresa?id=${empresa.id}">Editar</a>
				 	<a href="/gerenciador/removeEmpresa?id=${empresa.id}">Apagar</a>
				</li>
			</c:forEach>
		</ul>
<%-- 		<ul>
			<%
			 	List<Empresa> lista = (List<Empresa>) request.getAttribute("empresas");
				for (Empresa empresa : lista) {
			%>
			<li> <%= empresa.getNome() %> </li>
			<%
				}
			%>
		</ul>--%> <!-- toda essa parte foi substituida pelo seu equivalente em jstl, o que facilita demais a construção do codigo -->
	</body>
</html>