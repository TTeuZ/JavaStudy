package br.com.alura.gerenciador.servletAntigos;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

/**
 * Servlet implementation class MostraEmpresaServlet
 */
//@WebServlet("/mostraEmpresa") todos os servlet desabilidados para utilziar apenas a entrada unica redirecionando para as classes
public class MostraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String StringId = request.getParameter("id");
		int id = Integer.parseInt(StringId);
		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresa(id);
		
		request.setAttribute("empresa", empresa);
		RequestDispatcher rd = request.getRequestDispatcher("/formAlteraEmpresa.jsp");
		rd.forward(request, response);
	}

}
