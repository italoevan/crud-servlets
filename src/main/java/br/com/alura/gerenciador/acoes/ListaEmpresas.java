package br.com.alura.gerenciador.acoes;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.models.AcoesInterface;
import br.com.alura.gerenciador.models.Banco;
import br.com.alura.gerenciador.models.Empresa;

public class ListaEmpresas implements AcoesInterface {

	

	
	public String executa(HttpServletRequest req, HttpServletResponse res) throws IOException {
		List<Empresa> lista = Banco.getEmpresas();
		
		req.setAttribute("empresas", lista);
		
		
		return "forward:/listador-empresa.jsp";
		

		
	
	}
}
