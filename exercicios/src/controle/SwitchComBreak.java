package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
		
		String conceito ="";
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira a nota:");
		int nota = entrada.nextInt();
		
		switch (nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1: case 0:
			conceito = "D";
			break;
		default:
			conceito = "N�o informado";
		}
		
		System.out.println("Conceito � " + conceito);
		entrada.close();
	}

}
