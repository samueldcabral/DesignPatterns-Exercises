package br.edu.ifpb.padroes.factorymanager.model;

public class GreetingFactory {

	public GreetingFactory() {}
	
	public Pessoa getGreet(String nome, String genero){
		if (genero.equals("homem"))
			return new Homem(nome, genero);
		
		else if (genero.equals("mulher"))
			return new Mulher(nome, genero);
		
		else if (genero.equals("naobinario"))
			return new NaoBinario(nome, genero);
		
		else return null;
			
	}
}
