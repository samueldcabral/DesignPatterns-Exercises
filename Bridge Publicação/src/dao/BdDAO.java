package dao;

import model.Publicacao;

public class BdDAO extends AbstractDAO {

	public BdDAO(Publicacao publicacao) {
		super(publicacao);
	}

	@Override
	public void persistDatabase() {
		System.out.println("Persisted  " + this.getPublicacao().getClass() + " authored by " + this.getPublicacao().getAutor() + " with title " + this.getPublicacao().getTitulo() + " to the BD");
	}
}
