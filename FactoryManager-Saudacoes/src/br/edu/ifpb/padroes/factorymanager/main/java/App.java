package br.edu.ifpb.padroes.factorymanager.main.java;

import br.edu.ifpb.padroes.factorymanager.model.GreetingFactory;
import br.edu.ifpb.padroes.factorymanager.model.Pessoa;

public class App {

	public static void main(String[] args) {
		GreetingFactory fact = new GreetingFactory();
		Pessoa p = fact.getGreet("samuel", "homem");
		Pessoa p2 = fact.getGreet("alana", "mulher");
		Pessoa p3 = fact.getGreet("taylor", "naobinario");
		
		System.out.println(p.greetPessoa());
		System.out.println(p2.greetPessoa());
		System.out.println(p3.greetPessoa());
	}

}
