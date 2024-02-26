package fundamentos.atividades;

import java.util.Scanner;

public class IMC {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a sua altura: ");
		double altura = entrada.nextDouble();
		

		System.out.println("Insira a sua peso: ");
		double peso = entrada.nextDouble();
		
		
		double imc = peso/Math.pow(altura, 2);
		System.out.printf("O seu IMC é %.2f", imc);
		
		entrada.close();
	}
}
