
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomadorEsperado s = new AdaptadorSoma();
		Cliente c = new Cliente(s);
		c.executar();
		
		SomadorEsperado sLista = new AdaptadorSoma();
		Cliente c2 = new Cliente(sLista);
		c.executarLista();
	}

}
