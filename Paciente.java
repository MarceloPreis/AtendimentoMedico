package atendimentoMedico;

import java.time.LocalDate;

public class Paciente extends Pessoa {

	public Paciente(String dataNascimento, String nome) {
		super(dataNascimento, nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [Data de Nascimento=");
		builder.append(this.getDataNascimento());
		builder.append(", Idade=");
		builder.append(this.calcularIdade());
		builder.append(", Nome=");
		builder.append(this.getNome());
		builder.append("]");
		return builder.toString();
	}
	

}
