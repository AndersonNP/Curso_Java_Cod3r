package controle.atividades;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int valor = random.nextInt(100);
		Scanner entrada = new Scanner(System.in);

		

		int  tentativas = 10;
		
		for (int i = tentativas; i > 0; i--) {
			System.out.println("Insira um valor:");
			int tentativa = entrada.nextInt();
			
			if(tentativa == valor) {
				System.out.println("Acertou o valor secreto ("+valor+")");
				break;
			}else {
				if(tentativa > valor)
					System.out.println("Tente novamente, o valor secreto é menor");
				if(tentativa < valor)
					System.out.println("Tente novamente, o valor secreto é maior");
				System.out.println("Restam "+i+" tentativas");
			}
		}
		entrada.close();
	}
}
