package atendimentoMedico;

public interface Menu {
	public String options();
	public String perguntas(int op);
	public String askNome();
	public String askDataNascimento();
	public String askEspecialidade();
	public String success();
	public String emitirRecibo(Atendimento atendimento);
	public String medicoToString(Medico Medico);
	public String pacienteToString(Paciente Paciente);
	public String atendimentoToString(Atendimento Atendimento);
}
