package dao;

import model.Publicacao;

public class XmlDAO extends AbstractDAO{

	public XmlDAO(Publicacao publicacao) {
		super(publicacao);
	}

	@Override
	public void persistDatabase() {
		System.out.println("Persisted  " + this.getPublicacao().getClass() + " authored by  " + this.getPublicacao().getAutor() + " with title " + this.getPublicacao().getTitulo() + " in a XML file in the server");
	}
}
