package br.com.alura.gerenciador.servletAntigos;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

/**
 * Servlet implementation class ListaEmpresasServlet
 */
//@WebServlet("/listaEmpresas") todos os servlet desabilidados para utilziar apenas a entrada unica redirecionando para as classes
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas.jsp");
		request.setAttribute("empresas", lista);
		rd.forward(request, response);
	}
}
