<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!--para usar o forEach-->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> <!--Para exibir na tela as mensagem de erros de envio do form-->
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %> <!--Para podermos configurar melhor as urls-->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Livros de java, android ...</title>
	</head>
	<body>
		<form:form action="${s:mvcUrl('PC#grava').build() }" method="post" commandName="produto" enctype="multipart/form-data">
			<div>
				<label> Titulo </label>
				<!-- <input type="text" name="titulo"> -->
				<form:input path="titulo" />
				<form:errors path="titulo" />
			</div>
			<div>
				<label> Descrição </label>
				<!-- <textarea rows="10" cols="20" name="descricao"></textarea> -->
				<form:textarea rows="10" cols="20" path="descricao" />
				<form:errors path="descricao" />
			</div>
			<div>
				<label> Páginas </label>
				<!-- <input type="text" name="paginas"> -->
				<form:input path="paginas" />
				<form:errors path="paginas" />
			</div>
			<div>
				<label>Data de lançamento</label>
				<!-- <input name="dataLancamento"> -->
				<form:input path="dataLancamento" />
				<form:errors path="dataLancamento" />
			</div>
			<c:forEach items="${tipos }" var="tipoPreco" varStatus="status">
				<div>
					<label>${tipoPreco}</label>
					<%-- <input type="text" name="precos[${status.index }].valor">
					<input type="hidden" name="precos[${status.index }].tipo" value="${tipoPreco }"> --%>
					<form:input path="precos[${status.index }].valor" />
					<form:hidden path="precos[${status.index }].tipo" value="${tipoPreco }" />
				</div>
			</c:forEach>
			<div>
				<label>Arquivo</label>
				<input type="file" name="arquivo"/>
			</div>
			<button type="submit"> Cadastrar </button>
		</form:form>
	</body>
</html>


<!--  A taglib tags nos ajuda a melhorar as urls e requisiçoes
	  quando voce a chama, pelo 'mvcUrl' voce ira passar as inicias do controller que voce quer chamar
	  no caso 'PC' de ProdutoController e após a '#' voce informa o metodo que voce ira chamar, no caso 'grava'
	  e o build esta ali so para finalizar e informar que ele tera que buildar a url.
 -->
 
 <!--Ignore o erro do getBuild(), ta tudo funcionando-->
 
 <!--Os fom:imput e form:textarea do spring sao melhores utilizados pois eles podem guardar as informaçoes mesmo se houver erro de validação, nao apagando os dados dos inputs-->
 
 <!--O enctype esta ali para informar que podemos enviar arquivos pelo form-->
 
 