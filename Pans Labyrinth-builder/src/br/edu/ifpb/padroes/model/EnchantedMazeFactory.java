package br.edu.ifpb.padroes.model;

public class EnchantedMazeFactory extends AbstractMazeFactory {

	@Override
	public Maze makeMaze() {
		return new Maze();
		// TODO Auto-generated method stub
	}

	@Override
	public Wall makeWall() {
		// TODO Auto-generated method stub
		return new Wall();
		
	}

	@Override
	public AbstractRoom makeRoom() {
		// TODO Auto-generated method stub
		return new EnchantedRoom();
	}

	@Override
	public Door makeDoor() {
		// TODO Auto-generated method stub
		return new Door();
	}

}
