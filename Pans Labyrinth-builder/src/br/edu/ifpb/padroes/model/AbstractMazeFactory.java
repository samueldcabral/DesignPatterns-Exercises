package br.edu.ifpb.padroes.model;

public abstract class AbstractMazeFactory {
	
	public abstract Maze makeMaze();
	
	public abstract Wall makeWall();
	
	public abstract AbstractRoom makeRoom();
	
	public abstract Door makeDoor();
}
