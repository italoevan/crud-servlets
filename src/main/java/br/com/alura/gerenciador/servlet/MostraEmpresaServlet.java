package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.data.Banco;
import br.com.alura.gerenciador.models.Empresa;

@WebServlet(urlPatterns = "/mostraEmpresa")
public class MostraEmpresaServlet extends HttpServlet {

		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			 final String param = req.getParameter("id");
			 
			 final int id = Integer.parseInt(param);
			 
			 Banco banco = new Banco();
			 
			 Empresa empresa = Banco.getEmpresa(id);
			
			 RequestDispatcher dp = req.getRequestDispatcher("/formAlteraEmpresa.jsp");
			 req.setAttribute("empresa", empresa);
			 dp.forward(req, resp);
		}
        	
}
