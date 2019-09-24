package br.edu.ifpb.padroes.model;

public class Room extends AbstractRoom{

	@Override
	public String paintRoom() {
		// TODO Auto-generated method stub
		return "The room was painted with a very bland color";
	}
	
	@Override
	public String toString() {
		return "Room... :" + paintRoom();
	}
}
