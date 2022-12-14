package atendimentoMedico;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static MainMenu menu;
	public static ListaAtendimento atendimentoList = new ListaAtendimento();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1- ProtuguÍs 2- English");
		int op = in.nextInt();
		setMenu(op);

		op = 0;
		while (op != 9) {
			System.out.println(menu.options());
			op = in.nextInt();
			switch (op) {
			case 1:
				cadastrarMedico();
				System.out.println(menu.options());
				op = in.nextInt();
			case 2:
				cadastrarPaciente();
				System.out.println(menu.options());
				op = in.nextInt();
			case 3:
				cadastrarAtedimento();
				System.out.println(menu.options());
				op = in.nextInt();
			case 4:
				mostrarAtendimentos();
				System.out.println(menu.options());
				op = in.nextInt();
			case 5:
				emitirAtestado();
				System.out.println(menu.options());
				op = in.nextInt();
			case 9:
				break;
			}
			
		}

	}

	public static void emitirAtestado() {
		System.out.println("Implementar");
	}

	public static void setMenu(int op) {
		if (op == 2) {
			MenuIngles en  = new MenuIngles();
			menu = new MainMenu(en);
		}else {
			MenuPortugues pt = new MenuPortugues();
			menu = new MainMenu(pt);
		}
			
	}

	public static void mostrarAtendimentos() {
		if (atendimentoList.getLista().size() > 0) System.out.println("0");
		for (Atendimento atendimento : atendimentoList.getLista()) {
			System.out.println(menu.atendimentoToString(atendimento));
		}
	}

	public static Medico cadastrarMedico() {
		Scanner in = new Scanner(System.in);
		System.out.println(menu.askNome());
		String nome = in.next();
		System.out.println(menu.askDataNascimento());
		String dataNascimento = in.next();
		System.out.println(menu.askEspecialidade());

		Medico medico = new Medico(dataNascimento, nome);

		String[] especialidades = in.next().split(",");

		for (String esp : especialidades) {
			Especialidade especialidade = new Especialidade(esp);
			medico.addEspecialidades(especialidade);
		}
		System.out.println(menu.medicoToString(medico));

		return medico;
	}

	public static Paciente cadastrarPaciente() {
		Scanner in = new Scanner(System.in);
		System.out.println(menu.askNome());
		String nome = in.next();
		System.out.println(menu.askDataNascimento());
		String dataNascimento = in.next();

		Paciente paciente = new Paciente(dataNascimento, nome);
		System.out.println(menu.success());
		System.out.println(menu.pacienteToString(paciente));

		return paciente;
	}

	public static void cadastrarAtedimento() {
		Scanner in = new Scanner(System.in);

		System.out.println(menu.askMedico());
		Medico medico = cadastrarMedico();

		System.out.println(menu.askPaciente());
		Paciente paciente = cadastrarPaciente();

		System.out.println(menu.askInicio());
		String inicio = in.next();

		System.out.println(menu.askFim());
		String fim = in.next();

		Atendimento atendimento = new Atendimento(inicio, fim, 1, medico, paciente);

		boolean[] respostas = new boolean[3];
		System.out.println(menu.perguntas(1));
		respostas[0] = in.nextBoolean();

		System.out.println(menu.perguntas(2));
		respostas[1] = in.nextBoolean();

		System.out.println(menu.perguntas(3));
		respostas[2] = in.nextBoolean();

		atendimento.calcularPrioridade(respostas);

		atendimentoList.addLista(atendimento);
		System.out.println(menu.success());
		System.out.println(menu.atendimentoToString(atendimento));

	}

}
