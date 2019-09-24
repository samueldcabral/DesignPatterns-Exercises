package br.edu.ifpb.padroes.model;

public class Door {
	private String name;

	public Door() {
		this.name = "Door louca";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Door [name=" + name + "]";
	}
	
}
