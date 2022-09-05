package atendimentoMedico;

public class MenuIngles implements Menu {

	@Override
	public String options() {
		return "1 - Register Medic | 2 - Register Pacient | 3 - Register attendance | 4 - Show attendance list";

	}

	public String perguntas(int op) {
		if (op == 1)
			return "The pacient has feaver?";
		if (op == 2) 
			return "The pacient is bleeding?";
		if (op == 3)
			return "Pre-existing medical conditions?";
		return null;
	}

	@Override
	public String askNome() {
		return "Enter name:";
	}

	@Override
	public String askDataNascimento() {
		return "Enter date of birth (dd-mm-yyyy)";
	}

	@Override
	public String askEspecialidade() {
		return "Enter specialties:";
	}

	@Override
	public String success() {
		return "Operation performed successfully";
	}

	@Override
	public String emitirRecibo(Atendimento atendimento) {
		StringBuilder builder = new StringBuilder();
		builder.append("Certificate :");
		builder.append("\n");
		builder.append("Medic: ");
		builder.append(atendimento.getMedico().getNome());
		builder.append("\n");
		builder.append("Pacient: ");
		builder.append(atendimento.getPaciente().getNome());
		builder.append("\n");
		builder.append("Began At: ");
		builder.append(atendimento.getInicio().toString());
		builder.append("\n");
		builder.append("Ended At: ");
		builder.append(atendimento.getFim().toString());
		builder.append("\n");
		builder.append("Priority: ");
		builder.append(atendimento.getPrioridade());
		return builder.toString();
	}

	@Override
	public String medicoToString(Medico medico) {
		StringBuilder builder = new StringBuilder();
		builder.append("Medic :");
		builder.append("\n");
		builder.append("Name: ");
		builder.append(medico.getNome());
		builder.append("\n");
		builder.append("Birth Date: ");
		builder.append(medico.getDataNascimento());
		builder.append("\n");
		builder.append("Age: ");
		builder.append(medico.calcularIdade());
		builder.append("\n");
		builder.append("Specialties: ");
		builder.append(medico.getEspecialidades().toString());
		return builder.toString();
	}

	@Override
	public String pacienteToString(Paciente paciente) {
		StringBuilder builder = new StringBuilder();
		builder.append("Pacient :");
		builder.append("\n");
		builder.append("Name: ");
		builder.append(paciente.getNome());
		builder.append("\n");
		builder.append("Birth Date: ");
		builder.append(paciente.getDataNascimento());
		builder.append("\n");
		builder.append("Age: ");
		builder.append(paciente.calcularIdade());
		return builder.toString();
	}

	@Override
	public String atendimentoToString(Atendimento atendimento) {
		StringBuilder builder = new StringBuilder();
		builder.append("Attendance :");
		builder.append("\n");
		builder.append("Medic: ");
		builder.append(atendimento.getMedico().getNome());
		builder.append("\n");
		builder.append("Pacient: ");
		builder.append(atendimento.getPaciente().getNome());
		builder.append("\n");
		builder.append("Began At: ");
		builder.append(atendimento.getInicio().toString());
		builder.append("\n");
		builder.append("Ended At: ");
		builder.append(atendimento.getFim().toString());
		builder.append("\n");
		builder.append("Priority: ");
		builder.append(atendimento.getPrioridade());
		return builder.toString();
	}
	
	
	

}
