package atendimentoMedico;

import java.time.LocalDateTime;

public class Atestado extends Operacao{
	public Atestado(LocalDateTime inicio, LocalDateTime fim) {
		super(inicio, fim);
	}

	private int cid;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public void emitirAtestado(Atendimento atendimento) {
		System.out.println("Atestado emitido");
	}

}
