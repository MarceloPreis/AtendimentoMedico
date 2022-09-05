package atendimentoMedico;

import java.time.LocalDateTime;

public class Atestado extends Operacao{
	public Atestado(String inicio, String fim) {
		super(inicio, fim);
	}

	private int cid;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atestado [cid=");
		builder.append(cid);
		builder.append("]");
		return builder.toString();
	}

	public String emitirAtestado(Atendimento atendimento, Menu menu) {
		return menu.emitirRecibo(atendimento);
	}

}
