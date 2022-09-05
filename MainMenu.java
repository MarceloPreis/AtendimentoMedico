package atendimentoMedico;

public class MainMenu {
	protected Menu menu;
	
	public MainMenu(Menu menu) {
		this.menu = menu;
	}
	
	public String create() {
		return this.menu.options();
	}
	
	public String perguntas(Menu menu, int op) {
		return this.menu.perguntas(op);
	}
	
}
