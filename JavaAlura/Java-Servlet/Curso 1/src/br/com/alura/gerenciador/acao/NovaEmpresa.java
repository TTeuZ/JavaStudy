package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class NovaEmpresa implements Acao{
	public String  executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa!");
		
		String nomeEmpresa = request.getParameter("nome");
		String aberturaEmpresa = request.getParameter("dataAbertura"); // pegou o parametro da data vindo do form
		aberturaEmpresa = aberturaEmpresa.split("-")[2] + "/" + aberturaEmpresa.split("-")[1] + "/" + aberturaEmpresa.split("-")[0]; // minha ideia, apenas para poder usar o tipo date no imput
		
		Date data; // cria uma nova data
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // utiliza essa classe para criar uma formatação de data
			data = sdf.parse(aberturaEmpresa); // adiciona na data que criamos posteriomente a data foramatada acima
		} catch (ParseException e) { // caso ocorra um erro joga uma exceção
			throw new ServletException(e); // a exceção e capturada e "rejogada" informando aonde exatamente ocorreu a exceção
		}
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(data);
		
		Banco banco = new Banco();  // para simular um armazenamento no banco de dados, nao é algo utilizavel
		banco.adiciona(empresa);
		
//		response.sendRedirect("/gerenciador/listaEmpresas");  modo para utilizar a requestUri, maneira simplificada, porem vou manter o estilo atual por conta do curso.
//		response.sendRedirect("entrada?acao=ListaEmpresas"); // diz que apos o processo feito, ele deve redirecionar para a pagina lista empresas
		
		return "redirect:entrada?acao=ListaEmpresas";
	}
}
