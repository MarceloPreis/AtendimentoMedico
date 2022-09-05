package atendimentoMedico;

import java.time.LocalDateTime;

public class Atendimento extends Operacao {
	
	private int prioridade;
	private int estado;
	private Paciente paciente;
	private Medico medico;
	
	public Atendimento(String inicio, String fim, int estado, Medico medico, Paciente paciente) {
		super(inicio, fim);
		this.estado = estado;
		this.medico = medico;
		this.paciente = paciente;
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


	public String toString(Menu menu) {
		return menu.atendimentoToString(this);
	}
	
	
	
}
