package br.edu.ifpb.padroes.model;

public class Square extends Shape{
	private String type;
	
	public Square() {
		this.type = "Squared off";
	}
	
	protected Square(Square sqr) {
		this.type = sqr.getType();
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
		return new Square(this);
	}

	@Override
	public String toString() {
		return "Square [type=" + type + "]";
	}

}
