package controle.atividades;

import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {
		int valor;
		int maior = 0;
		Scanner entrada = new Scanner(System.in);

		

		for (int i = 0; i < 10; i++) {
			System.out.println("Insira o novo valor:");
			valor = entrada.nextInt();
			if(valor>maior)
				maior = valor;
		}
		System.out.println("O maior valor é " + maior);
		entrada.close();
	}
}
