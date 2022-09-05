package atendimentoMedico;

import java.time.LocalDate;

public class Paciente extends Pessoa {

	public Paciente(String dataNascimento, String nome) {
		super(dataNascimento, nome);
	}

	public String toString(Menu menu) {
		return menu.pacienteToString(this);
	}
	
}
