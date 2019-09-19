package br.edu.ifpb.padroes.fps.model;

public class GuerrillaSoldier extends Enemy{
	
	public GuerrillaSoldier() {
		super(8, 5, 5);
	}

	@Override
	public int killEnemy() {
		return 100;
	}

	@Override
	public String toString() {
		return "GuerrillaSoldier with " + super.getInteligence() + " of inteligence, " + super.getStrength() + " of strength and " + super.getStrategy() + " of strategy]";
	}
	

}
