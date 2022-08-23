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

	public void setEspecialidades(List<Especialidade> especialidades) {
		this.especialidades = especialidades;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Medico [especialidades=");
		builder.append(especialidades.toString());
		builder.append("]");
		return builder.toString();
	}
}
