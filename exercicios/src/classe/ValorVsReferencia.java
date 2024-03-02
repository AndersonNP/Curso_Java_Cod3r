package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		double a = 2;
		double b = a; //atribui��o por valor
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Produto p1 = new Produto();
		
		p1.nome = "Teste";
		
		Produto p2 = p1; // atribui��o por referencia
		
		p2.nome = "Arroz";
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
	}

}
