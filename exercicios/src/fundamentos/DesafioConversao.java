package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o primeiro sal�rio: ");
		String valor1 = entrada.next();
		
		System.out.print("Insira o segundo sal�rio: ");
		String valor2 = entrada.next();

		System.out.print("Insira o terceiro sal�rio: ");
		String valor3 = entrada.next();
		
		double salario1 = Double.parseDouble(valor1.replace(",", "."));
		double salario2 = Double.parseDouble(valor2.replace(",", "."));
		double salario3 = Double.parseDouble(valor3.replace(",", "."));
		
		double soma = salario1 + salario2 + salario3;
		
		System.out.println("\n\nA soma � " + soma);
		System.out.println("A m�dia � " + soma/3);
		
		
	}
}
