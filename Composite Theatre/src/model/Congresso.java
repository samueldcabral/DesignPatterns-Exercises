package model;

import java.util.ArrayList;
import java.util.List;

public class Congresso {
	private String nomeCongresso;
	private List<Participante> participantes = new ArrayList<>();
	private int assentos = 100;
	
	public Congresso(String nome) {
		this.nomeCongresso = nome;
	}

	public List<Participante> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(List<Participante> participantes) {
		this.participantes = participantes;
	}
	
	public String getNomeCongresso() {
		return nomeCongresso;
	}

	public void setNomeCongresso(String nomeCongresso) {
		this.nomeCongresso = nomeCongresso;
	}

	public void addParticipante(Participante participante) {
		int totalAssentosAnteriores = this.getTotalAssentos();
		
		if(this.getTotalAssentos() > 0) {
			this.participantes.add(participante);
			participante.setAssento(this.getNomeCongresso() + "-bancadaInferior #" + totalAssentosAnteriores + "-#" + this.getTotalAssentos());
			System.out.println("Participante: " + participante + " adicionado! \nRestam " + this.getTotalAssentos() + " assentos livres!");
		}else {
			System.out.println("Total de assentos totalmente preenchido!");
		}
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	
	public int getTotalAssentos() {
		return this.assentos - this.totalParticipantes();
	}

	public int totalParticipantes() {
		int total = 0;
		
		for(Participante p : participantes) {
			total += p.getTotalParticipantes();
		}
		
		return total;
	}
}
