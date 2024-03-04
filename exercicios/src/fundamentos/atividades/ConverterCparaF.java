package fundamentos.atividades;

import java.util.Scanner;

public class ConverterCparaF {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a temperatura em Fahrenheit: ");
		double temperaturaF = entrada.nextDouble();
		double temperaturaC = (temperaturaF - 32)*(5.0/9.0);
		
		System.out.printf("A temperatura em Celsius � %.2f C�", temperaturaC);
		entrada.close();
	}

}
