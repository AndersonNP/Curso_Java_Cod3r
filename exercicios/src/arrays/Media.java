package arrays;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas ser�o inseridas? ");
		int qtdNotas = entrada.nextInt();
		
		double notas[] = new double[qtdNotas];
		
		for(int i = 0; i< qtdNotas; i++){
			System.out.println("Insira a nota " + (i+1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for(double nota : notas){
			total += nota;
		}
		
		System.out.println("media do aluno � " + total/qtdNotas);
	}

}
