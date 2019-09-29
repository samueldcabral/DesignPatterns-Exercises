package br.edu.ifpb.padroes.build;

import br.edu.ifpb.padroes.model.Door;
import br.edu.ifpb.padroes.model.Room;
import br.edu.ifpb.padroes.model.Wall;

public class MazeBuilder extends MazeGeneralBuilder {
	
	public MazeBuilder() {}

	@Override
	public void makeWall() {
		// TODO Auto-generated method stub
		maze.setWall(new Wall());
	}

	@Override
	public void makeRoom() {
		// TODO Auto-generated method stub
		maze.setRoom(new Room());
	}

	@Override
	public void makeDoor() {
		// TODO Auto-generated method stub
		maze.setDoor(new Door());
	}
}
