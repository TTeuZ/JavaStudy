package br.com.alura.gerenciador.servlet;

// Reescrita do UnicaEntradaServlet so que de maneira profissional.

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.acao.Acao;

@WebServlet("/entrada")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramAcao = request.getParameter("acao");
		
		HttpSession sessao = request.getSession();
		
		boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado") == null);
		boolean eUmaAcaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm"));
		
		if(usuarioNaoEstaLogado && eUmaAcaoProtegida) {
			response.sendRedirect("entrada?acao=LoginForm");
			return;
		}
		
		String nomeDaClasse = "br.com.alura.gerenciador.acao." + request.getParameter("acao");
		String nome = null;
		
		try {
			Class classe = Class.forName(nomeDaClasse); // carrega a classe com o nome que tu passou;
			Acao acao = (Acao) classe.newInstance();	
			nome = acao.executa(request, response);
		} catch(ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}

	
		String[] nomeFunçao = nome.split(":");
		if (nomeFunçao[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + nomeFunçao[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(nomeFunçao[1]);
		}

	}

}

// vai ser um unico servlet que vai receber todas as requisições, e com isso ira chamar classes mais simples que efetuam os processos.