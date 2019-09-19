package br.edu.ifpb.padroes.fps.model;

public abstract class Enemy {
	private int inteligence;
	private int strength;
	private int strategy;
	

	public Enemy(int inteligence, int strength,  int strategy) {
		this.inteligence = inteligence;
		this.strength = strength;
		this.strategy = strategy;
	}
	
	public int getInteligence() {
		return inteligence;
	}
	public void setInteligence(int inteligence) {
		this.inteligence = inteligence;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getStrategy() {
		return strategy;
	}
	public void setStrategy(int strategy) {
		this.strategy = strategy;
	}
	
	public abstract int killEnemy();
	
	@Override
	public abstract String toString();
	
}
