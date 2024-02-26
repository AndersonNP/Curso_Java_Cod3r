package controle.atividades;

public class PrimoRefatorado {
	
	public static void main(String[] args) {
		double valor = 5;
		int qtdDivisores = 0;
		
		for (int i = 2; i <= valor; i++) {
			if(valor % i == 0)
				qtdDivisores++;
		}
		
		switch (qtdDivisores) {
		case 1:
			System.out.println("É um número primo");
			break;
		default:
			System.out.println("Não é um número primo");
			break;
		}
		
	}
}
