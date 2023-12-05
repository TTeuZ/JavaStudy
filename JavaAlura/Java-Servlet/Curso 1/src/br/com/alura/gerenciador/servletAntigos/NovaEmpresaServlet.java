package br.com.alura.gerenciador.servletAntigos;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

//@WebServlet("/novaEmpresa") todos os servlet desabilidados para utilziar apenas a entrada unica redirecionando para as classes
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// alterando para doPost, essa requisição agora funcionara apenas para metodos to tipo post
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		
		response.sendRedirect("listaEmpresas"); // diz que apos o processo feito, ele deve redirecionar para a pagina lista empresas
		
		//chamar a jsp
//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas"); // despachador, apos o processo ele vai chamar o outr servelet, renderização serverside, causa o problema do F5.
//		request.setAttribute("empresa", empresa.getNome()); // estou pendurando na request o nome da empresa, o "empresa" do lado serve como apelido para acessar esse nome.
//		rd.forward(request, response); // manda nossas variaveis junto
	}
}

/**
 * para enviarmos um parametro para uma requisição, ele deve ser enviado na url
 * ou seja, apos a chamada do servlet temos que colocar(nesse caso):
 * 
 * 	localhost:8080/gerenciador/novaEmpresa?nome=alura
 * 
 * o que vier apos a '?' sao os parametros, e nesse caso estamos informando que enviamos o nome da empressa
 * caso voce queira enviar mais de um paramentro, voce pode concatenalos com o '&'
 * 
 * 	localhost:8080/gerenciador/novaEmpresa?nome=alura&cnpj=1231242421
 */
