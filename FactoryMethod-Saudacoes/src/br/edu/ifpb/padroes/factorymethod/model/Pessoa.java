package br.edu.ifpb.padroes.factorymethod.model;

public abstract class Pessoa {
	private String nome;
	private String genero;
	
	public Pessoa(String nome, String genero) {
		super();
		this.nome = nome;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public abstract String greetPessoa();
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", genero=" + genero + "]";
	}
	
}
