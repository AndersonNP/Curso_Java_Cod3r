package controle;

import java.util.Scanner;

public class DesafioSemana {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o dia da semana: ");
		String valor = entrada.nextLine();
		valor = valor.toLowerCase();
		valor = valor.replace("-feira", "").replace(" feira", "");
		valor = valor.trim();
		if("domingo".equals(valor)) {
			System.out.println("1");
		}else if("segunda".equals(valor)) {
			System.out.println("2");
		}else if("ter�a".equals(valor)) {
			System.out.println("3");
		}else if("quarta".equals(valor)) {
			System.out.println("4");
		}else if("quinta".equals(valor)) {
			System.out.println("5");
		}else if("sexta".equals(valor)) {
			System.out.println("6");
		}else if("s�bado".equals(valor)) {
			System.out.println("7");
		}else {
			System.out.println("Dia invalido");
		}
		
		entrada.close();
	}

}
