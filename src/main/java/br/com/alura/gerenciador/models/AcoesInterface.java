package br.com.alura.gerenciador.models;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract interface AcoesInterface {

	public abstract String executa (HttpServletRequest request, HttpServletResponse response) throws IOException ;
	
}
