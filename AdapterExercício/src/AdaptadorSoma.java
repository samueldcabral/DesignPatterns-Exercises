import java.util.ArrayList;
import java.util.List;

public class AdaptadorSoma extends SomadorExistente implements SomadorEsperado{

	public int somaVetor(int[] vetor) {
		List<Integer> integerArr = new ArrayList<Integer>(vetor.length);
		
		for(int integer : vetor) {
			integerArr.add(integer);
		}
		
		return somaLista(integerArr);
	}

	public int somaLista(ArrayList<Integer> lista) {
		// TODO Auto-generated method stub
		return somaLista(lista);
	}
	
}
