package model;

public class Publicacao {
	private String titulo;
	private String autor;
	
	public Publicacao() {}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		return "Publicação [titulo=" + titulo + ", autor=" + autor + "]";
	}

}
