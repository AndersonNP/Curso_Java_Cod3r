package fundamentos.atividades;

import java.util.Scanner;

public class AreaTriangulo {
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a altura do triangulo: ");
		double altura = entrada.nextDouble();
		

		System.out.println("Insira a base do triangulo: ");
		double base = entrada.nextDouble();
		
		
		double area = (base*altura)/2;
		System.out.printf("A area do triangulo é %.2f m²", area);
		
		entrada.close();
	}
}
