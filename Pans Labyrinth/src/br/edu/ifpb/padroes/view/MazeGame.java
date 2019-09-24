package br.edu.ifpb.padroes.view;

import br.edu.ifpb.padroes.model.AbstractMazeFactory;
import br.edu.ifpb.padroes.model.EnchantedMazeFactory;
import br.edu.ifpb.padroes.model.Maze;
import br.edu.ifpb.padroes.model.MazeFactory;


public class MazeGame {
	
	private static Maze createMaze(String tipo){
		AbstractMazeFactory amf = null;
		
		if (tipo.compareTo("enchanted") == 0)
			amf = new EnchantedMazeFactory();
		
		else {
			amf = new MazeFactory();
		}
	
		Maze m = new Maze();
		m.setDoor(amf.makeDoor());
		m.setRoom(amf.makeRoom());
		m.setWall(amf.makeWall());
		
		return m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maze m1 = createMaze("enchanted");
		Maze m2 = createMaze("notEnchanted");
		
		System.out.println("enchanted: "+m1);
		System.out.println("notEnchanted: "+m2);

	}

}
