package atendimentoMedico;

import java.time.Duration;
import java.time.LocalDateTime;

public class Operacao {
	private LocalDateTime inicio;
	private LocalDateTime fim;
	
	public Operacao(LocalDateTime inicio, LocalDateTime fim) {
		super();
		this.inicio = inicio;
		this.fim = fim;
	}

	public long tempoTotal() {
		return Duration.between(this.inicio, this.fim).toMinutes();
	}
	
	public LocalDateTime getInicio() {
		return inicio;
	}
	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}
	public LocalDateTime getFim() {
		return fim;
	}
	public void setFim(LocalDateTime fim) {
		this.fim = fim;
	}
	
	
	
	

}
