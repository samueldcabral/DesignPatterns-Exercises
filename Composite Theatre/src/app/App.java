package app;

import model.Congresso;
import model.Individuo;
import model.Instituicao;
import model.Participante;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Congresso ifpbTech = new Congresso("XII Simposio da tecnologia");
		
		//Adicionar participantes
		Participante pessoa1 = new Individuo("Samuel Cabral");
		Participante pessoa2 = new Individuo("Alana Morais");
		Participante pessoa3 = new Individuo("Adriano Amaral");
		Participante pessoa4 = new Individuo("Renatha Victor");
		
		//Adicionar instituicao
		Instituicao grupoIfpb = new Instituicao("Grupo do Ifpb");
		grupoIfpb.addMembro(pessoa1);
		grupoIfpb.addMembro(pessoa2);
		grupoIfpb.addMembro(pessoa3);
		grupoIfpb.addMembro(pessoa4);
		
		//Adicionar participantes avulsos
		Participante pessoa5 = new Individuo("João do pão");
		Participante pessoa6 = new Individuo("Bella da nutella");
		
		//Adicionar ao congresso
		ifpbTech.addParticipante(grupoIfpb);
		ifpbTech.addParticipante(pessoa5);
		ifpbTech.addParticipante(pessoa6);
		
		//Totais
		ifpbTech.getTotalAssentos();
		ifpbTech.getParticipantes();
	}

}
