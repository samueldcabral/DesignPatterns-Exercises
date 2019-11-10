package model;

public class CreamCheeseEdgeDecorator extends CondimentDecorator{
	public CreamCheeseEdgeDecorator(Pizza pizza) {
		super(pizza);
		nome = "Cream Cheeeeeese";
		preco = 5.5;
	}
}
