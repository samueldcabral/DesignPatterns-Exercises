package app;

import dao.AbstractDAO;
import dao.BdDAO;
import dao.XmlDAO;
import model.Livro;
import model.Revista;

public class App {

	public static void main(String[] args) {
		Livro l1 = new Livro();
		l1.setAutor("Samuel D Cabral");
		l1.setIsbn("978-81-333-0701-0");
		l1.setTitulo("A fabulosa história de um animal extraordinário");
		
		Livro l2 = new Livro();
		l2.setAutor("Samuel D Cabral");
		l2.setIsbn("978-81-333-0701-1");
		l2.setTitulo("Aonde foi parar minha caneta?");
		
		Revista r1 = new Revista();
		r1.setArtigo("Congresso nacional das tecnologias polemicas");
		r1.setAutor("Alguém inesquecível");
		r1.setTitulo("React x Angular x Vue - A história sem fim parte 49");
		
		Revista r2 = new Revista();
		r2.setArtigo("Congresso nacional das tecnologias polemicas na américa central");
		r2.setAutor("Alguém que já foi esquecido");
		r2.setTitulo("React x Angular x Vue - A história sem fim parte 58");
		
		AbstractDAO banco = new BdDAO(l1);
		banco.persistDatabase();
		
		AbstractDAO banco2 = new XmlDAO(l2);
		banco2.persistDatabase();
		
		AbstractDAO banco3 = new XmlDAO(r1);
		banco3.persistDatabase();
		
		AbstractDAO banco4 = new BdDAO(r2);
		banco4.persistDatabase();
		
	}

}
