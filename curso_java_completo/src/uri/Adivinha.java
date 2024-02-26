package uri;

import java.util.Scanner;

public class Adivinha {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int qtdTestes = entrada.nextInt();
		
		for (int i = 0; i < qtdTestes; i++) {
			int alunos = entrada.nextInt();
			int valorSecreto = entrada.nextInt();
			int[] tentativas = new int[alunos];
			int menor = 0;
			int alunoVencedor = 0;
			for(int j = 0; j < tentativas.length; j++) {
				tentativas[j] = entrada.nextInt();
			}
			
			for(int j = 0; j < tentativas.length; j++) {
				if(tentativas[j] == valorSecreto) {
					alunoVencedor = j+1;
					break;
				}
				menor = tentativas[j] < menor ? tentativas[j] : menor;
			}
			
			alunoVencedor = alunoVencedor == 0 ? menor : alunoVencedor;
			
			System.out.println(alunoVencedor);
			
			
		}
		
		entrada.close();
	}

}
