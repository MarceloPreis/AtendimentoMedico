package atendimentoMedico;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		Scanner in = new Scanner(System.in);

		int op1 = 0;
		int op2 = 0;
		System.out.println("1 - Cadastrar Medico  |  2 - Cadastrar "
				+ "Pacientes  |  3 - Atendimentos  |  4 - Emitir Atestado");
		op1 = in.nextInt();
	}

}
