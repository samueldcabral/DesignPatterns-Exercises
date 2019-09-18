package br.edu.ifpb.padroes.factorymanager.model;

public class NaoBinario extends Pessoa{
	public NaoBinario(String nome, String genero) {
		super(nome, genero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String greetPessoa() {
		return "Bem-vindo, " + this.getNome();
	}
}
