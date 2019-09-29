package br.edu.ifpb.padroes.build;

import br.edu.ifpb.padroes.model.Maze;

public abstract class MazeGeneralBuilder {
	protected Maze maze;
	
	public MazeGeneralBuilder() {
		this.maze = new Maze();
	}
	
	public void makeMaze() {
		makeWall();
		makeRoom();
		makeDoor();
	}
	
	public abstract void makeWall();
	
	public abstract void makeRoom();
	
	public abstract void makeDoor();
	
	public Maze getMaze() {
		return this.maze;
	}
}
