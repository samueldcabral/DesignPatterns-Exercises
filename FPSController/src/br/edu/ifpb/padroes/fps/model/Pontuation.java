package br.edu.ifpb.padroes.fps.model;

public class Pontuation {
	private int damage;

	public Pontuation(int damage) {
		this.damage = damage;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	@Override
	public String toString() {
		return this.getDamage() + " points";
	}
	
}
