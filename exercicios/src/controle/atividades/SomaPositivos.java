package controle.atividades;

import java.util.Scanner;

public class SomaPositivos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int valor = 0;
		int total = 0;
		
		do {
			System.out.println("A soma dos valores até o momento é " + total);
			System.out.println("Insira o próximo valor:");
			valor = entrada.nextInt();	
			total += valor;
		}while(valor>=0);

		entrada.close();
	}
}
