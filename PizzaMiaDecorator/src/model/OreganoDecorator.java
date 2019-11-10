package model;

public class OreganoDecorator extends CondimentDecorator{
	public OreganoDecorator(Pizza pizza) {
		super(pizza);
		nome = "Oregano Origiano";
		preco = 1.5;
	}
}
