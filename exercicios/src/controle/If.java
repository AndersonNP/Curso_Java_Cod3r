package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a media: ");
		double media = entrada.nextDouble();
		
		if(media <= 10 && media >= 7) {
			System.out.println("Aprovado");
		}
		
		if(media < 7 && media >= 4.5) {
			System.out.println("recuperação");
		}
		
		if(media < 4.5 && media >= 0) {
			System.out.println("reprovado");
		}
		
		entrada.close();
	}

}
