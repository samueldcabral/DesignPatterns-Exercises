package model;

public class TomatoDecorator extends CondimentDecorator{
	public TomatoDecorator(Pizza pizza) {
		super(pizza);
		nome = "Tomato";
		preco = 0.5;
	}
}
