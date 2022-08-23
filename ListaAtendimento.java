package atendimentoMedico;

import java.util.ArrayList;
import java.util.List;

public class ListaAtendimento {
	
	private List<Atendimento> lista = new ArrayList<Atendimento>();

	public List<Atendimento> mostrarLista() {
		return lista;
	}

	public void addLista(Atendimento atendimento) {
		this.lista.add(atendimento);
	}
	
}
