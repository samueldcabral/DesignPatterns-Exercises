public class Teste {

	public static void main(String[] args) {
	
		Fita f1 = new  Fita("Jogos Vorazes", Tipo.normal);
		Fita f2 = new  Fita("Bastardos inglorios", Tipo.infantil);
		Fita f3 = new  Fita("Babla", Tipo.lancamento);
		
		Aluguel a1 = new Aluguel(f1, 3);
		Aluguel a2 = new Aluguel(f2, 1);
		Aluguel a3 = new Aluguel(f3, 10);
		
		Cliente c1 = new Cliente("samuel");
		Cliente c2 = new Cliente("Machada Assis");
		
		c1.adicionaAluguel(a1);
		
		c2.adicionaAluguel(a3);
		
		System.out.println(c1.extrato());
		System.out.println("\n ----------------------------- \n");
		System.out.println(c2.extrato());
		
		c1.adicionaAluguel(a3);
		System.out.println("\n ----------------------------- \n");
		System.out.println(c1.extrato());
	}

}