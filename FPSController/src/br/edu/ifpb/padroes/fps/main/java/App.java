package br.edu.ifpb.padroes.fps.main.java;

import br.edu.ifpb.padroes.fps.controller.PontuationController;
import br.edu.ifpb.padroes.fps.model.Enemy;
import br.edu.ifpb.padroes.fps.model.EnemyArmy;
import br.edu.ifpb.padroes.fps.model.GuerrillaSoldier;
import br.edu.ifpb.padroes.fps.model.Spy;

public class App {

	public static void main(String[] args) {
		Enemy e1 = new GuerrillaSoldier();
		Enemy e2 = new Spy();
		Enemy e3 = new EnemyArmy();
		
		PontuationController controller = new PontuationController();
		
		System.out.println(controller.killEnemyPontuation(e1));
		System.out.println(controller.killEnemyPontuation(e2));
		System.out.println(controller.killEnemyPontuation(e3));
	}

}
