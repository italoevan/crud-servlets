package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.data.Banco;


@WebServlet(urlPatterns = "/alteraEmpresa")
public class AlteraEmpresaServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String param = req.getParameter("nome");
			String paramId = req.getParameter("id");
			
			Integer id = Integer.parseInt(paramId);
			
			Banco.changeEmpresaName(id, param);
			resp.sendRedirect("/gerenciador");
			
	}
}
