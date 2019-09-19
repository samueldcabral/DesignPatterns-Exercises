package br.edu.ifpb.padroes.fps.controller;

import br.edu.ifpb.padroes.fps.model.Enemy;
import br.edu.ifpb.padroes.fps.model.Pontuation;

public class PontuationController {

	public PontuationController() {}
	
	public String killEnemyPontuation(Enemy enemy) {
		Pontuation points = new Pontuation(enemy.killEnemy());
		
		return "You killed " + enemy + " and received a total of " + points;
		
	}
	
}
