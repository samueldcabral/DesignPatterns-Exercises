package model;

public class CondimentDecorator extends Pizza{
	private Pizza pizza;
	
	public CondimentDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public String getNome() {
		return pizza.getNome() + " + " +  nome;
	}
	
	public double getPreco() {
		return pizza.getPreco() + preco;
	}
}
