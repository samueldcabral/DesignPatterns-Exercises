package br.edu.ifpb.padroes.model;

public class Rectangle extends Shape{
	private String type;
	
	public Rectangle() {
		this.type = "Rectangle Ci";
	}
	
	protected Rectangle(Rectangle rect) {
		this.type = rect.getType();
	}
	
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return this.getId();
	}

	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		this.setId(id);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

	@Override
	public Shape clone() {
		// TODO Auto-generated method stub
		return new Rectangle(this);
	}

	@Override
	public String toString() {
		return "Rectangle [type=" + type + "]";
	}

}
