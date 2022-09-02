package fundamentos.atividades;

public class SegundoGrau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1;
		double b = 12;
		double c = -13;
		
		double delta = (b * b) - (4 * a * c);

		System.out.printf("\nSua equação é: %.2fx² + %.2fx + %.2f = 0", a, b, c);
		
		System.out.println("\nO delta é: " + delta);

		double x1 = (-b + Math.sqrt(delta)) / (2 * a);

		System.out.printf("O x1 da equação é: %.2f", x1);

		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("\nO x2 da equação é: %.2f" ,x2);
		
		
		
	}

}
