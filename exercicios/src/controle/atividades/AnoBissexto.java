package controle.atividades;

import java.util.Scanner;

public class AnoBissexto {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o ano desejado:");
		int ano = entrada.nextInt();
		
		if(ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0)
			System.out.println("O ano � bissexto");
		else if(ano % 4 == 0 && ano % 100 != 0)
			System.out.println("O ano � bissexto");
		else
			System.out.println("O ano n�o � bissexto");
		
		entrada.close();
	}
}
