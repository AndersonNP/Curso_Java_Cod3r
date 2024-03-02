package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int nota = 0;
		int total = 0;
		int count = 0;
		
		while(nota != -1) {
			System.out.println("Insira a pr�xima nota ou -1 para sair:");
			nota = entrada.nextInt();
			if(nota >= 0 && nota <= 10) {
				total += nota;
				count++;
			}
		}
		
		System.out.println("O total de notas v�lidas � " + count + " e a m�dia � " + total/count);

		entrada.close();
	}

}
