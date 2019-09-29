package br.edu.ifpb.padroes.model;

public class Maze {
	
	private Door door;
	private AbstractRoom room;
	private Wall wall;
	
	public Maze() {}

	public Door getDoor() {
		return door;
	}

	public void setDoor(Door door) {
		this.door = door;
	}

	public AbstractRoom getRoom() {
		return room;
	}

	public void setRoom(AbstractRoom abstractRoom) {
		this.room = abstractRoom;
	}

	public Wall getWall() {
		return wall;
	}

	public void setWall(Wall wall) {
		this.wall = wall;
	}

	@Override
	public String toString() {
		return "Maze [door=" + door + ", room=" + room + ", wall=" + wall + "]";
	}
 
}
