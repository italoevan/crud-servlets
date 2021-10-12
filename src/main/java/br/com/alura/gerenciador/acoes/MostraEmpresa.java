package br.com.alura.gerenciador.acoes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.models.AcoesInterface;
import br.com.alura.gerenciador.models.Banco;
import br.com.alura.gerenciador.models.Empresa;

public class MostraEmpresa implements AcoesInterface {

	public String executa(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
		final String param = req.getParameter("id");
		 
		 final int id = Integer.parseInt(param);
		 
		 Banco banco = new Banco();
		 
		 Empresa empresa = Banco.getEmpresa(id);
		
		 //RequestDispatcher dp = req.getRequestDispatcher("/formAlteraEmpresa.jsp");
		 req.setAttribute("empresa", empresa);
		 
		 return "forward:/formAlteraEmpresa.jsp";
		 //dp.forward(req, resp);
	}
}
