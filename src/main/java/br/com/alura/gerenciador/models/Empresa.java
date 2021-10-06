package br.com.alura.gerenciador.models;

public class Empresa {
	private String nome;
	private Integer id;
	
	public Empresa() {
		
	}
	
	public Empresa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
}
