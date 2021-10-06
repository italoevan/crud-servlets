package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.data.Banco;
import br.com.alura.gerenciador.models.Empresa;
import br.com.alura.gerenciador.utils.Consts;

/**
 * Servlet implementation class NovEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public NovaEmpresaServlet() {
		super();
		System.out.println("Constructor");

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nomeValue = request.getParameter("nome") == null ? "" : request.getParameter("nome");
		Empresa empresa = new Empresa(nomeValue);
		Banco banco = new Banco();
		banco.adiciona(empresa);

		request.setAttribute("empresa", empresa.getNome());
		response.sendRedirect(Consts.LISTAEMPRESAS);

		// Chamar o jsp
//		
//		 RequestDispatcher dispatcher =  request.getRequestDispatcher("/lista-empresas");
//		 request.setAttribute("empresa", empresa.getNome()	);
//		 dispatcher.forward(request, response);
	}

}
