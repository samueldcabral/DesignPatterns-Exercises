package br.edu.ifpb.padroes.model;

public class MazeFactory extends AbstractMazeFactory{

	@Override
	public Maze makeMaze() {
		// TODO Auto-generated method stub
		return new Maze();
	}

	@Override
	public Wall makeWall() {
		// TODO Auto-generated method stub
		return new Wall();
	}

	@Override
	public AbstractRoom makeRoom() {
		// TODO Auto-generated method stub
		return new Room();
	}

	@Override
	public Door makeDoor() {
		// TODO Auto-generated method stub
		return new Door();
	}

}
