package dao;

import model.Publicacao;

public abstract class AbstractDAO {
	private Publicacao publicacao;
	
	
	public AbstractDAO(Publicacao publicacao) {
		this.publicacao = publicacao;
	}

	public abstract void persistDatabase();

	public Publicacao getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(Publicacao publicacao) {
		this.publicacao = publicacao;
	}
	
}
