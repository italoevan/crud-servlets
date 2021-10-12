package br.com.alura.gerenciador.acoes;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.models.AcoesInterface;
import br.com.alura.gerenciador.models.Banco;
import br.com.alura.gerenciador.models.Empresa;
import br.com.alura.gerenciador.utils.Consts;

public class NovaEmpresa   implements AcoesInterface {
	
	


	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String nomeValue = request.getParameter("nome") == null ? null : request.getParameter("nome");
		
		if(nomeValue == null || nomeValue.isEmpty()) {
			response.sendRedirect("/gerenciador/error.html");
			return null;
		}
		
		Empresa empresa = new Empresa(nomeValue);
		Banco banco = new Banco();
		banco.adiciona(empresa);

		request.setAttribute("empresa", empresa.getNome());
		
		return "redirect:/gerenciador/entrada?acao=ListaEmpresas";
		

	}
}
