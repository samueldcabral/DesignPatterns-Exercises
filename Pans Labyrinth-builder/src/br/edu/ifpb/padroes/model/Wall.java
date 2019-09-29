package br.edu.ifpb.padroes.model;

public class Wall {

	private String name;

	public Wall() {
		this.name = "Another brick in the wall";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Wall [name=" + name + "]";
	}
	
}
