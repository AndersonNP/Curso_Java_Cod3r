package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o primeiro valor: ");
		double valor1 = entrada.nextDouble();

		System.out.println("Insira o segundo valor: ");
		double valor2 = entrada.nextDouble();

		System.out.println("Insira qual opera��o deseja realizar (+, -, *, /, %): ");
		String operacao = entrada.next();
		
		boolean soma = "+".equals(operacao);
		boolean subtracao = "-".equals(operacao);
		boolean divisao = "/".equals(operacao);
		boolean multiplicacao = "*".equals(operacao);		
		boolean modulo = "%".equals(operacao);
		
		double resultado = soma ? valor1 + valor2 : 
						   subtracao ? valor1 - valor2 :
						   divisao ? valor1 / valor2 :
						   multiplicacao ? valor1 * valor2 :
						   valor1 % valor2;
		
		System.out.println("Resultado � " + resultado);
		
		entrada.close();
	}

}
