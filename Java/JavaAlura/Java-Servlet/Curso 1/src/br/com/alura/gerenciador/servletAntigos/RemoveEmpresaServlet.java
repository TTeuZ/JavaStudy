package br.com.alura.gerenciador.servletAntigos;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;

/**
 * Servlet implementation class RemoveEmpresaServlet
 */
//@WebServlet("/removeEmpresa") todos os servlet desabilidados para utilziar apenas a entrada unica redirecionando para as classes
public class RemoveEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String StringId = request.getParameter("id");
		int id = Integer.parseInt(StringId);
		Banco banco = new Banco();
		banco.removeEmpresa(id);
		
		response.sendRedirect("listaEmpresas");
	}

}
