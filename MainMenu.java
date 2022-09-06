package atendimentoMedico;

public class MainMenu {
	protected Menu menu;
	
	public MainMenu(Menu menu) {
		this.menu = menu;
	}
	
	public String options() {
		return this.menu.options();
	}
	
	public String perguntas(int op) {
		return this.menu.perguntas(op);
	}
	
	public String askNome() {
		return this.menu.askNome();
	}
	
	public String askDataNascimento() {
		return this.menu.askDataNascimento();
	}
	
	public String askEspecialidade() {
		return this.menu.askEspecialidade();
	}
	
	public String success() {
		return this.menu.success();
	}
	
	public String emitirRecibo(Atendimento atendimento) {
		return this.menu.emitirRecibo(atendimento);
	}
	
	public String medicoToString(Medico medico)
	{
		return this.menu.medicoToString(medico);
	}
	
	public String pacienteToString(Paciente paciente) {
		return this.pacienteToString(paciente);
	}
	
	public String atendimentoToString(Atendimento atendimento) {
		return this.menu.atendimentoToString(atendimento);
	}
	
	public String askMedico() {
		return "Informe o Medico: ";
	}

	public String askPaciente() {
		return this.menu.askPaciente();
	}

	public String askInicio() {
		return this.menu.askInicio();
	}

	public String askFim() {
		return this.menu.askFim();
	}
}
