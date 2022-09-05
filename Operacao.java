package atendimentoMedico;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Operacao {
	private LocalDateTime inicio;
	private LocalDateTime fim;
	
	public Operacao(String inicio, String fim) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		this.inicio = LocalDateTime.parse(inicio, formatter);
		this.fim = LocalDateTime.parse(fim, formatter);
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
