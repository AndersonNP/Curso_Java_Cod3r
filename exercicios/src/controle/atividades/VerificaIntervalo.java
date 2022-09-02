package controle.atividades;

import java.util.Scanner;

public class VerificaIntervalo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o valor entre 0 e 10(incluindo eles):");
		int valor = entrada.nextInt();
		
		if(valor >= 0 && valor <= 10)
			System.out.println("Está dentro do intervalo");
		else
			System.out.println("Está fora do intervalo");
		entrada.close();
	}
}
