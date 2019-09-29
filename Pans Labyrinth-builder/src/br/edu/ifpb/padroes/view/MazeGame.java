package br.edu.ifpb.padroes.view;

import br.edu.ifpb.padroes.build.EnchantedMazeBuilder;
import br.edu.ifpb.padroes.build.MazeBuilder;
import br.edu.ifpb.padroes.model.Maze;
import br.edu.ifpb.padroes.model.MazeDirector;


public class MazeGame {

	public static void main(String[] args) {
		MazeDirector director = new MazeDirector(new EnchantedMazeBuilder());
		director.buildMaze();
		
		Maze m = director.getMagic();
		
		System.out.println(m);
		System.out.println(m.getRoom());
	
		MazeDirector director2 = new MazeDirector(new MazeBuilder());
		director2.buildMaze();
		
		Maze m2 = director2.getMagic();
		
		System.out.println(m2);
	}

}
