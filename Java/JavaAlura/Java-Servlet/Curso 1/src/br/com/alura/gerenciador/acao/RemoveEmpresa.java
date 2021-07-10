package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;

public class RemoveEmpresa implements Acao{
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String StringId = request.getParameter("id");
		int id = Integer.parseInt(StringId);
		Banco banco = new Banco();
		banco.removeEmpresa(id);
		
//		response.sendRedirect("/gerenciador/listaEmpresas"); modo para utilizar a requestUri, maneira simplificada, porem vou manter o estilo atual por conta do curso.
//		response.sendRedirect("entrada?acao=ListaEmpresas"); responsabilidade passada para o controlador
		
		return "redirect:entrada?acao=ListaEmpresas";
	}
}
