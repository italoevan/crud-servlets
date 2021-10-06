package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.data.Banco;
import br.com.alura.gerenciador.models.Empresa;

@WebServlet(urlPatterns = "/lista-empresas")
public class ListaEmpresasServlet extends HttpServlet {

	private List<Empresa> getEmpresas() {
		return Banco.getEmpresas();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		
		List<Empresa> lista = this.getEmpresas();

		RequestDispatcher dis = req.getRequestDispatcher("/listador-empresa.jsp");
		req.setAttribute("empresas", lista);
		
		dis.forward(req, resp);
	}

}
