package atendimentoMedico;

import java.time.LocalDate;  
import java.time.Period;  

public class Pessoa {
	
	private LocalDate dataNascimento;
	private String nome;
	
	public Pessoa(String dataNascimento, String nome) {
		super();
		this.dataNascimento = LocalDate.parse(dataNascimento);
		this.nome = nome;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int calcularIdade() {
		LocalDate now = LocalDate.now();
		return Period.between(this.dataNascimento, now).getYears();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [Data de Nascimento=");
		builder.append(dataNascimento);
		builder.append(", Idade=");
		builder.append(this.calcularIdade());
		builder.append(", Nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
	
}
