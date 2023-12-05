package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/oi") // informa que é um webservlet e que para acessalor é necessario possuir o '/oi' na url
public class OiMundoServlet extends HttpServlet{
	
	public OiMundoServlet() {
		System.out.println("Criando Oi Mundo Servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("oi mundo, parabens vc escreveu o primeiro servlet");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("O servlet foi iniciado");
	}
}


// o 'extends HttpServlet' nos dis que essa classe é um servlet que atened a protocolos http
// o 'HttpServletRequest' é a requisição http
// o 'HttpServletResponse' é a reposta da requiseção
// no mundo java, as requests e responses sao objetos.