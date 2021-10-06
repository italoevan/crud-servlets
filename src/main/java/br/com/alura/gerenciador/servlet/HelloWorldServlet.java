package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/oi") //Mapeamento
public class HelloWorldServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException  {
		PrintWriter  out = response.getWriter();
		
		
		out.println("<html>"
				+ "<head>"
				+ "<title>"
				+ "Servlet"
				+ "</title>"
				+ "</head>"
				+ "<body>"
				+ "Primeiro Servlet"
				+ "<br>"
				+ "<a href=\"./\">Home</a>"
				+ "<body>"
				+ ""
				+ "</html>");
		
		
		imprimir();
	
		
		
	}
	public void imprimir() {
		System.out.println("Chamando Servidor");
	}

}
