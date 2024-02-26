package controle.atividades;

public class Primo {
	
	public static void main(String[] args) {
		double valor = 8;
		int qtdDivisores = 0;
		
		for (int i = 2; i <= valor; i++) {
			if(valor % i == 0)
				qtdDivisores++;
		}
		
		if(qtdDivisores == 1)
			System.out.println("É um número primo");
		if(qtdDivisores > 1)
			System.out.println("Não é um número primo");
	}
}
