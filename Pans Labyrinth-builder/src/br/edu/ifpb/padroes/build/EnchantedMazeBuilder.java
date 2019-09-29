package br.edu.ifpb.padroes.build;

import br.edu.ifpb.padroes.model.Door;
import br.edu.ifpb.padroes.model.EnchantedRoom;
import br.edu.ifpb.padroes.model.Wall;

public class EnchantedMazeBuilder extends MazeGeneralBuilder{
	
	public EnchantedMazeBuilder() {}

	@Override
	public void makeWall() {
		// TODO Auto-generated method stub
		this.maze.setWall(new Wall());
	}

	@Override
	public void makeRoom() {
		// TODO Auto-generated method stub
		this.maze.setRoom(new EnchantedRoom());
	}

	@Override
	public void makeDoor() {
		// TODO Auto-generated method stub
		this.maze.setDoor(new Door());
	}

}
