package fundamentos.atividades;

import java.util.Scanner;

public class ConverterFparaC {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a temperatura em Celsius: ");
		double temperaturaC = entrada.nextDouble();
		double temperaturaF = (temperaturaC * (9.0/5.0) ) + 32;
		
		System.out.printf("A temperatura em Fahrenheit � %.2f�", temperaturaF);
		entrada.close();
	}

}
