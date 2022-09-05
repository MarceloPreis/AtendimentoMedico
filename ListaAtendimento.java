package atendimentoMedico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListaAtendimento {
	
	private List<Atendimento> lista = new ArrayList<Atendimento>();

	public List<Atendimento> getLista() {
		return lista;
	}

	public void addLista(Atendimento atendimento) {
		lista.add(atendimento);
		Collections.sort(lista, Comparator.comparing(Atendimento::getPrioridade));
	}
	
}
