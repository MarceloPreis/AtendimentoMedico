package atendimentoMedico;
import atendimentoMedico.Menu;

public class MenuPortugues implements Menu {

	@Override
	public String options() {
		return "1 - Cadastrar Médico | 2 - Cadastrar Paciente | 3 - Cadastrar atedimento |4 - Ver lista de Atendimento";
	}

	@Override
	public String perguntas(int op) {
		if (op == 1)
			return "O paciente está com febre?";
		if (op == 2) 
			return "O paciente tem sangramento?";
		if (op == 3)
			return "O paciente tem codições médicas pré-existentes?";
		return null;
	}

	@Override
	public String askNome() {
		return "Informe o nome:";
	}

	@Override
	public String askDataNascimento() {
		return "Informe a Data de Nascimento (dd-mm-yyyy)";
	}

	@Override
	public String askEspecialidade() {
		return "Informe as especialidades:";
	}

	@Override
	public String success() {
		return "Operação realizada com sucesso";
	}

	@Override
	public String emitirRecibo(Atendimento atendimento) {
		StringBuilder builder = new StringBuilder();
		builder.append("Atestado :");
		builder.append("\n");
		builder.append("Medico: ");
		builder.append(atendimento.getMedico().getNome());
		builder.append("\n");
		builder.append("Paciente: ");
		builder.append(atendimento.getPaciente().getNome());
		builder.append("\n");
		builder.append("Inicio: ");
		builder.append(atendimento.getInicio().toString());
		builder.append("\n");
		builder.append("Fim: ");
		builder.append(atendimento.getFim().toString());
		builder.append("\n");
		builder.append("Prioridade: ");
		builder.append(atendimento.getPrioridade());
		return builder.toString();
	}

	@Override
	public String medicoToString(Medico medico) {
		StringBuilder builder = new StringBuilder();
		builder.append("Medico :");
		builder.append("\n");
		builder.append("Nome: ");
		builder.append(medico.getNome());
		builder.append("\n");
		builder.append("Data de Nascimento: ");
		builder.append(medico.getDataNascimento());
		builder.append("\n");
		builder.append("Idade: ");
		builder.append(medico.calcularIdade());
		builder.append("\n");
		builder.append("Especialidades: ");
		builder.append(medico.getEspecialidades().toString());
		return builder.toString();
	}

	@Override
	public String pacienteToString(Paciente paciente) {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente :");
		builder.append("\n");
		builder.append("Nome: ");
		builder.append(paciente.getNome());
		builder.append("\n");
		builder.append("Data de Nascimento: ");
		builder.append(paciente.getDataNascimento());
		builder.append("\n");
		builder.append("Idade: ");
		builder.append(paciente.calcularIdade());
		return builder.toString();
	}

	@Override
	public String atendimentoToString(Atendimento atendimento) {
		StringBuilder builder = new StringBuilder();
		builder.append("Atendimento :");
		builder.append("\n");
		builder.append("Medico: ");
		builder.append(atendimento.getMedico().getNome());
		builder.append("\n");
		builder.append("Paciente: ");
		builder.append(atendimento.getPaciente().getNome());
		builder.append("\n");
		builder.append("Inicio: ");
		builder.append(atendimento.getInicio().toString());
		builder.append("\n");
		builder.append("Fim: ");
		builder.append(atendimento.getFim().toString());
		builder.append("\n");
		builder.append("Prioridade: ");
		builder.append(atendimento.getPrioridade());
		return builder.toString();
	}

	
	
}
