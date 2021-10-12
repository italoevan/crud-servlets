package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acoes.AlteraEmpresa;
import br.com.alura.gerenciador.acoes.ListaEmpresas;
import br.com.alura.gerenciador.acoes.MostraEmpresa;
import br.com.alura.gerenciador.acoes.NovaEmpresa;
import br.com.alura.gerenciador.acoes.NovaEmpresaForm;
import br.com.alura.gerenciador.acoes.RemoveEmpresa;
import br.com.alura.gerenciador.models.AcoesInterface;

@WebServlet(urlPatterns = "/entrada")

public class UnicaEntradaServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest requester, HttpServletResponse response)
			throws ServletException, IOException {
		// Receive a parameter "acao", so we will to do action according to this
		String actionParameter = null;
		if(requester.getParameter("acao") != null) {
		 actionParameter = requester.getParameter("acao");
		}else {
			response.sendRedirect("/gerenciador/error.html");
			return;
		}
		String nomeJsp = null;
		
		
		String nomeDaClasse = "br.com.alura.gerenciador.acoes." + actionParameter;
		
		System.out.println(nomeDaClasse);
		
		Class myClass = null;
		
		try {
			myClass = Class.forName(nomeDaClasse); //Carrega a classe pelo pacote com uma String 
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Object objClass = null;
		
		try {
		objClass =  	myClass.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		AcoesInterface inter =  (AcoesInterface) objClass;
		 nomeJsp =  inter != null ? inter.executa(requester, response) : null;
		
		if (actionParameter != null) {
						
			String[] tipoEEndereco = nomeJsp.split(":");
				
			if(tipoEEndereco[0].equals("forward")) {
				System.out.print(tipoEEndereco[1] + " FORWARD");
			RequestDispatcher dis = requester.getRequestDispatcher( "WEB-INF/view" + tipoEEndereco[1]);
			dis.forward(requester, response);
			}else {
				response.sendRedirect(tipoEEndereco[1]);
				System.out.print(tipoEEndereco[1] + " REDIRECT");
			}
			
		} else {
			response.sendRedirect("/gerenciador/error.html");
		}

	}
}
