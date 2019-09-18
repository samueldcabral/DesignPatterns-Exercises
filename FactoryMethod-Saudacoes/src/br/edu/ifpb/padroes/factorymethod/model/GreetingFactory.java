package br.edu.ifpb.padroes.factorymethod.model;

public class GreetingFactory {

	public GreetingFactory() {}
	
	public Pessoa getGreet(String nome, String genero){
		if (genero.equals("masculino"))
			return new Homem(nome, genero);
		
		else if (genero.equals("feminino"))
			return new Mulher(nome, genero);
		
		else if (genero.equals("naobinario"))
			return new NaoBinario(nome, genero);
		
		else return null;
			
	}
}
