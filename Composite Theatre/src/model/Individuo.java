package model;

public class Individuo extends Participante{
	private String nome;
	private String assento;
	
	public Individuo(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAssento() {
		return assento;
	}
	public void setAssento(String assento) {
		this.assento = assento;
	}

	@Override
	public String toString() {
		return "Individuo [nome=" + nome + ", assento=" + assento + "]";
	}

	@Override
	public int getTotalParticipantes() {
		return 1;
	}

	
}
