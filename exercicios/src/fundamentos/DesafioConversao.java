package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o primeiro salário: ");
		String valor1 = entrada.next();
		
		System.out.print("Insira o segundo salário: ");
		String valor2 = entrada.next();

		System.out.print("Insira o terceiro salário: ");
		String valor3 = entrada.next();
		
		double salario1 = Double.parseDouble(valor1.replace(",", "."));
		double salario2 = Double.parseDouble(valor2.replace(",", "."));
		double salario3 = Double.parseDouble(valor3.replace(",", "."));
		
		double soma = salario1 + salario2 + salario3;
		
		System.out.println("\n\nA soma é " + soma);
		System.out.println("A média é " + soma/3);
		
		
	}
}
