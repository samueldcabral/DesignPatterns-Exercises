package app;

import model.BaconDecorator;
import model.CreamCheeseEdgeDecorator;
import model.OreganoDecorator;
import model.Pepperoni;
import model.Pizza;

public class AppTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza miaPizza = new Pepperoni(); 
		miaPizza = new OreganoDecorator(miaPizza);
		miaPizza = new CreamCheeseEdgeDecorator(miaPizza);
		miaPizza = new CreamCheeseEdgeDecorator(miaPizza); //Dobro de cream cheeeese
		miaPizza = new BaconDecorator(miaPizza);
        
        System.out.println(miaPizza.getNome() + " = R$"
                + String.format("%.2f", miaPizza.getPreco()));
	}

}
