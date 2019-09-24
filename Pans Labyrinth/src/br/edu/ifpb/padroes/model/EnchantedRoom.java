package br.edu.ifpb.padroes.model;

public class EnchantedRoom extends AbstractRoom{

	@Override
	public String paintRoom() {
		// TODO Auto-generated method stub
		return "The room was painted with magic colors";
	}

	@Override
	public String toString() {
		return "EnchantedRoom... :" + paintRoom();
	}

}
