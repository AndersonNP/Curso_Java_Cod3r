package controle.atividades;

public class AvaliacaoAluno {
	
	public static void main(String[] args) {
		double nota1 = 4;
		double nota2 = 0;
		
		double media = (nota1+nota2)/2;
		
		if(media >= 7.0)
			System.out.println("Aprovado");
		else if(media < 7.0 && media > 4.0)
			System.out.println("Recuperação");
		else
			System.out.println("Reprovado");
	}
}
