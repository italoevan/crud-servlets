package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.data.Banco;

@WebServlet(urlPatterns = "/removeEmpresa")
public class RemoveEmpresaServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		System.out.println(id);
		
		Banco.removeEmpresa(Integer.valueOf(id));
		
		
		
		response.sendRedirect("/gerenciador");
	}
}
