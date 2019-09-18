
public class Aluguel {
	private Fita fita;
    private int diasAlugada;

    public Aluguel(Fita fita, int diasAlugada) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
    }

    public Fita getFita() {
        return fita;
    }

    public int getDiasAlugada() {
        return diasAlugada;
    }
    
    public double getValorCorrente() {
    	double valorCorrente = 0.0;
    	
        switch (this.getFita().getCodigoDePreco()) {
        case normal:
            valorCorrente += 2;
            if (this.getDiasAlugada() > 2) {
                valorCorrente += (this.getDiasAlugada() - 2) * 1.5;
            }
            break;
        case lancamento:
            valorCorrente += this.getDiasAlugada() * 3;
            break;
        case infantil:
            valorCorrente += 1.5;
            if (this.getDiasAlugada() > 3) {
                valorCorrente += (this.getDiasAlugada() - 3) * 1.5;
            }
            break;
        }
        
        return valorCorrente;
    }

	public int getBonusFrequente() {
		   if (this.getFita().getCodigoDePreco() == Tipo.lancamento
	                && this.getDiasAlugada() > 1) {
	               return 2;
	            }

		return 1;
	}

}
