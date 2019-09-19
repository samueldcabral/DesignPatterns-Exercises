package br.edu.ifpb.padroes.fps.model;

public class EnemyArmy extends Enemy {
	
	public EnemyArmy() {
		super(2, 7, 10);
	}

	@Override
	public int killEnemy() {
		return 50;
	}

	@Override
	public String toString() {
		return "Enemy Army with " + super.getInteligence() + " of inteligence, " + super.getStrength() + " of strength and " + super.getStrategy() + " of strategy]";
	}

}
