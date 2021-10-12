package br.com.alura.gerenciador.acoes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.models.AcoesInterface;

public class NovaEmpresaForm  implements AcoesInterface {

	 
	public String executa(HttpServletRequest request,HttpServletResponse response) {
		
		return "forward:/form-nova-empresa.html";
	}
	
}
