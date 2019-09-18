package br.edu.ifpb.padroes.factorymanager.model;

public class Mulher extends Pessoa{
	public Mulher(String nome, String genero) {
		super(nome, genero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String greetPessoa() {
		return "Bem-vinda, Sra. " + this.getNome();
	}
}
