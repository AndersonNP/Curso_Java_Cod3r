package fundamentos.atividades;

import java.util.Scanner;

public class QuadradoCubo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o valor desejado: ");
		double valor = entrada.nextDouble();
				
		
		double quadrado = Math.pow(valor, 2);
		double cubo = Math.pow(valor, 3);
		System.out.printf("O quadrado e o cubo do valor %.2f são, respectivamente, %.2f e %.2f", valor, quadrado, cubo);
		
		entrada.close();
		
	}
}
