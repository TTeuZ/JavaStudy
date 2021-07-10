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

public class AlteraEmpresa implements Acao{
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("atualizando a empresa!");
		
		String StringId = request.getParameter("id");
		int id = Integer.parseInt(StringId);
		String nomeEmpresa = request.getParameter("nome");
		String aberturaEmpresa = request.getParameter("dataAbertura");
		aberturaEmpresa = aberturaEmpresa.split("-")[2] + "/" + aberturaEmpresa.split("-")[1] + "/" + aberturaEmpresa.split("-")[0];
		
		Date data;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			data = sdf.parse(aberturaEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresa(id);
		empresa.setDataAbertura(data);
		empresa.setNome(nomeEmpresa);
		
//		response.sendRedirect("/gerenciador/listaEmpresas"); modo para utilizar a requestUri, maneira simplificada, porem vou manter o estilo atual por conta do curso.
//		response.sendRedirect("entrada?acao=ListaEmpresas"); responsabilidade no controlador
		
		return "redirect:entrada?acao=ListaEmpresas";
	}
}
