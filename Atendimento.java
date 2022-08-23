package atendimentoMedico;

import java.time.LocalDateTime;

public class Atendimento extends Operacao {
	
	private int prioridade;
	private int estado;
	private Paciente paciente;
	private Medico medico;
	
	public Atendimento(LocalDateTime inicio, LocalDateTime fim, int estado) {
		super(inicio, fim);
		this.estado = estado;
	}
	
	
	public void calcularPrioridade (boolean[] respostas) {
		this.prioridade = 0;
		for (Boolean resposta : respostas) {
			if(resposta)
				this.prioridade ++;
		}
	}
	
	//Getters and Setters
	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


	public Medico getMedico() {
		return medico;
	}


	public void setMedico(Medico medico) {
		this.medico = medico;
	}


	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atendimento [prioridade=");
		builder.append(prioridade);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", paciente=");
		builder.append(paciente.getNome());
		builder.append(", medico=");
		builder.append(medico.getNome());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
