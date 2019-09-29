package br.edu.ifpb.padroes.model;

public class Circle extends Shape{
	private String type;
	
	public Circle() {
		this.type = "Circle Ci";
	}
	
	protected Circle(Circle circle) {
		this.type = circle.getType();
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
		return new Circle(this);
	}

	@Override
	public String toString() {
		return "Circle [type=" + type + "]";
	}

}
