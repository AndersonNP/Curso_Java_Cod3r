package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

		int nota = 0;
		int total = 0;
		int count = 0;
		
		while(nota != -1) {
			System.out.println("Insira a próxima nota ou -1 para sair:");
			nota = entrada.nextInt();
			if(nota >= 0 && nota <= 10) {
				total += nota;
				count++;
			}
		}
		
		System.out.println("O total de notas válidas é " + count + " e a média é " + total/count);

		entrada.close();
	}

}
