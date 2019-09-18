import java.util.ArrayList;
import java.util.Collection;

public class Cliente {
    private String nome;
    private int pontosDeAlugadorFrequente = 0;

    private Collection<Aluguel> fitasAlugadas = new ArrayList<Aluguel>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getPontosDeAlugadorFrequente() {
		return pontosDeAlugadorFrequente;
	}

	public void setPontosDeAlugadorFrequente(int pontosDeAlugadorFrequente) {
		this.pontosDeAlugadorFrequente = pontosDeAlugadorFrequente;
	}
	
	public void incrementaAlugadorFrequente(int incremento) {
		this.pontosDeAlugadorFrequente += incremento;
	}
	
	public void adicionaAluguel(Aluguel aluguel) {
        fitasAlugadas.add(aluguel);
    }

    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;
        

        for (Aluguel aluguel : fitasAlugadas) {
        	double valorCorrente = 0.0;
        	
            this.incrementaAlugadorFrequente(aluguel.getBonusFrequente());
            
            valorCorrente += aluguel.getValorCorrente();
    
            resultado += "\t" + aluguel.getFita().getTitulo() + "\t"
                         + valorCorrente + fimDeLinha;
            
            valorTotal += valorCorrente;
        }
        
       
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Voce acumulou " + this.getPontosDeAlugadorFrequente()
                     + " pontos de alugador frequente";
        return resultado;
    }
}