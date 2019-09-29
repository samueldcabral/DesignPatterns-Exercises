package br.edu.ifpb.padroes.model;

public abstract class Shape {
	private String id;
	private String type;
	
	public abstract String getId();
	
	public abstract void setId(String id);
	
	public abstract String getType();
	
	public abstract Shape clone();
		
}
