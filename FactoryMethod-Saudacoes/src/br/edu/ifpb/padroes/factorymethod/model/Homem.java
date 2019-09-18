package br.edu.ifpb.padroes.factorymethod.model;

public class Homem extends Pessoa{

	public Homem(String nome, String genero) {
		super(nome, genero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String greetPessoa() {
		return "Bem-vindo, Sr. " + this.getNome();
	}
}
