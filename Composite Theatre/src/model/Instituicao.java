package model;

import java.util.ArrayList;
import java.util.List;

public class Instituicao extends Participante{
	private String nomeFicticio;
	private List<Participante> membros = new ArrayList<>();

	public Instituicao(String nome) {
		this.nomeFicticio = nome;
	}

	public List<Participante> getMembros() {
		return membros;
	}

	public void setMembros(List<Participante> membros) {
		this.membros = membros;
	}
	
	public void addMembro(Participante pessoa1) {
		this.membros.add(pessoa1);
	}

	@Override
	public int getTotalParticipantes() {
		int soma = 0;
		
		for(Participante membro : this.membros) {
			soma += membro.getTotalParticipantes();
		}
		
		return soma;
	}

	public String getNomeFicticio() {
		return nomeFicticio;
	}

	public void setNomeFicticio(String nomeFicticio) {
		this.nomeFicticio = nomeFicticio;
	}

	@Override
	public String toString() {
		return "Instituicao [nomeFicticio=" + nomeFicticio + ", membros=" + membros + "]";
	}

	@Override
	public void setAssento(String assento) {
		int index = 1;
		
		for(Participante membro : this.membros) {
			membro.setAssento(assento + " " + this.getNomeFicticio() + " " + index);
			index++;
		}
	}
	
	
}
