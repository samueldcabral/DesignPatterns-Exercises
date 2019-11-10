package model;

public class BaconDecorator extends CondimentDecorator{
	public BaconDecorator(Pizza pizza) {
		super(pizza);
		nome = "Baaaaaaaaaaaacon";
		preco = 6.5;
	}
}
