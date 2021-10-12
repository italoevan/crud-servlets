package br.com.alura.gerenciador.acoes;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.models.AcoesInterface;
import br.com.alura.gerenciador.models.Banco;

public class AlteraEmpresa implements AcoesInterface {
	HttpServletRequest req;
	HttpServletResponse resp;
	
	
	
	
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String param = req.getParameter("nome");
		String paramId = req.getParameter("id");
		
		Integer id = Integer.parseInt(paramId);
		
		Banco.changeEmpresaName(id, param);
		
		return "redirect:/gerenciador";
		
	}
}
