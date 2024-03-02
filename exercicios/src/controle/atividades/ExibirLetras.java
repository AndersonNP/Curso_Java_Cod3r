package controle.atividades;

import java.util.Scanner;

public class ExibirLetras {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira a palavra desejada:");
		String palavra = entrada.next();
		
		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}

		entrada.close();
	}

}
