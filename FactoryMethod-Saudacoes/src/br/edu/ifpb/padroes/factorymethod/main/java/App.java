package br.edu.ifpb.padroes.factorymethod.main.java;

import br.edu.ifpb.padroes.factorymethod.model.GreetingFactory;
import br.edu.ifpb.padroes.factorymethod.model.Pessoa;

public class App {

	public static void main(String[] args) {
		GreetingFactory fact = new GreetingFactory();
		Pessoa p = fact.getGreet("Samuel Cabral", "masculino");
		Pessoa p2 = fact.getGreet("Alana Morais", "feminino");
		Pessoa p3 = fact.getGreet("Taylor Manson", "naobinario");
		
		System.out.println(p.greetPessoa());
		System.out.println(p2.greetPessoa());
		System.out.println(p3.greetPessoa());
	}

}
 