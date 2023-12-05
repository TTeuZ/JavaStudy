/*
 * package br.com.alura.gerenciador.servlet;
 * 
 * // servlet que controla todas as entradas do serviço
 * 
 * import java.io.IOException;
 * 
 * import javax.servlet.RequestDispatcher; import
 * javax.servlet.ServletException; import javax.servlet.annotation.WebServlet;
 * import javax.servlet.http.HttpServlet; import
 * javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * import br.com.alura.gerenciador.acao.AlteraEmpresa; import
 * br.com.alura.gerenciador.acao.ListaEmpresas; import
 * br.com.alura.gerenciador.acao.MostraEmpresa; import
 * br.com.alura.gerenciador.acao.NovaEmpresa; import
 * br.com.alura.gerenciador.acao.NovaEmpresaForm; import
 * br.com.alura.gerenciador.acao.RemoveEmpresa;
 * 
 *//**
	 * Servlet implementation class UnicaEntradaServlet
	 *//*
		 * //@WebServlet("/entrada")
		 * 
		 * @WebServlet("/entrada") // mapeamento para tudo o que vier depois da '/'
		 * public class UnicaEntradaServlet extends HttpServlet { private static final
		 * long serialVersionUID = 1L;
		 * 
		 * protected void service(HttpServletRequest request, HttpServletResponse
		 * response) throws ServletException, IOException { String paramAcao =
		 * request.getParameter("acao"); // String paramAcao = request.getRequestURI();
		 * // maneira para acessar todos os servlets sem escrever entrada?acao=****,
		 * esse metodo pega a uri, ou seja o que esta escrito depois do '/'
		 * System.out.println(paramAcao);
		 * 
		 * String nome = null;
		 * 
		 * // if(paramAcao.equals("/gerenciador/listaEmpresas")) if
		 * (paramAcao.equals("ListaEmpresas")) {
		 * 
		 * ListaEmpresas acao = new ListaEmpresas(); nome = acao.executa(request,
		 * response);
		 * 
		 * } // } else if(paramAcao.equals("/gerenciador/removeEmpresa")) else if
		 * (paramAcao.equals("RemoveEmpresa")) {
		 * 
		 * RemoveEmpresa acao = new RemoveEmpresa(); nome = acao.executa(request,
		 * response);
		 * 
		 * } // } else if(paramAcao.equals("/gerenciador/alteraEmpresa")) else if
		 * (paramAcao.equals("AlteraEmpresa")) {
		 * 
		 * AlteraEmpresa acao = new AlteraEmpresa(); nome = acao.executa(request,
		 * response);
		 * 
		 * } // } else if(paramAcao.equals("/gerenciador/mostraEmpresa")) else if
		 * (paramAcao.equals("MostraEmpresa")) {
		 * 
		 * MostraEmpresa acao = new MostraEmpresa(); nome = acao.executa(request,
		 * response);
		 * 
		 * } // } else if(paramAcao.equals("/gerenciador/novaEmpresa")) else if
		 * (paramAcao.equals("NovaEmpresa")) {
		 * 
		 * NovaEmpresa acao = new NovaEmpresa(); nome = acao.executa(request, response);
		 * 
		 * } else if (paramAcao.equals("NovaEmpresaForm")) {
		 * 
		 * NovaEmpresaForm acao = new NovaEmpresaForm(); nome = acao.executa(request,
		 * response);
		 * 
		 * }
		 * 
		 * 
		 * String[] nomeFunçao = nome.split(":"); if (nomeFunçao[0].equals("forward")) {
		 * RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" +
		 * nomeFunçao[1]); rd.forward(request, response); } else {
		 * response.sendRedirect(nomeFunçao[1]); }
		 * 
		 * }
		 * 
		 * }
		 * 
		 * // vai ser um unico servlet que vai receber todas as requisições, e com isso
		 * ira chamar classes mais simples que efetuam os processos.
		 */