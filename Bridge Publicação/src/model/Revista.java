package model;

public class Revista extends Publicacao{
	private String artigo;

	public Revista() {
		super();
	}

	public String getArtigo() {
		return artigo;
	}

	public void setArtigo(String artigo) {
		this.artigo = artigo;
	}

	@Override
	public String toString() {
		return "Revista [artigo=" + artigo + "]";
	}
}
