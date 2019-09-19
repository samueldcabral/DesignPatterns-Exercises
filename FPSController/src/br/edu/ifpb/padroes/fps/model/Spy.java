package br.edu.ifpb.padroes.fps.model;

public class Spy extends Enemy{

	public Spy() {
		super(10, 7, 10);
	}

	@Override
	public int killEnemy() {
		return 200;
	}

	@Override
	public String toString() {
		return "Spy Army with " + super.getInteligence() + " of inteligence, " + super.getStrength() + " of strength and " + super.getStrategy() + " of strategy]";
	}

}
