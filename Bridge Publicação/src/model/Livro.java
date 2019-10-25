package model;

public class Livro extends Publicacao{
	private String isbn;

	public Livro() {
		super();
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Livro [isbn=" + isbn + "]";
	}
	
}
