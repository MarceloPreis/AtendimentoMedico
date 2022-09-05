package atendimentoMedico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa {
	
	private List<Especialidade> especialidades = new ArrayList<Especialidade>();
	
	public Medico(String dataNascimento, String nome) {
		super(dataNascimento, nome);
	}

	public List<Especialidade> getEspecialidades() {
		return especialidades;
	}

	public void addEspecialidades(Especialidade especialidade) {
		this.especialidades.add(especialidade);
	}

	public String toString(Menu menu) {
		return menu.medicoToString(this);
	}
}
