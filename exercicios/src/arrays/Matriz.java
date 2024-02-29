package arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos alunos? ");
		int qtdAlunos = entrada.nextInt();
		
		System.out.println("Quantas provas? ");
		int qtdProvas = entrada.nextInt();
		double[][] provas = new double[qtdAlunos][qtdProvas];
		
		for(int i = 0; i < provas.length; i++){
			for(int j = 0; j < provas[i].length; j++){
				System.out.println("Insira a nota " + (j+1) + " do aluno " + (i+1));
				provas[i][j] = entrada.nextDouble(); 
			}
		}
		double total = 0;
		for(double[] aluno : provas){
			for(double nota : aluno){
				total += nota;
			}
		}
		
		System.out.println(total/(qtdAlunos*qtdProvas));
	}
}
