package br.com.alura.gerenciador.acoes;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.models.AcoesInterface;
import br.com.alura.gerenciador.models.Banco;

public class RemoveEmpresa  implements AcoesInterface {


	public String executa(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String id = req.getParameter("id");

		System.out.println(id);

		Banco.removeEmpresa(Integer.valueOf(id));

		return "redirect:/gerenciador";
	}
}
