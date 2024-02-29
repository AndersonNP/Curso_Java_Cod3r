package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caixa<String> caixaA = new Caixa<>();
		
		caixaA.guardar("Segredo!");
		
		String coisaA = caixaA.abrir();
		
		System.out.println(coisaA);
		
		
		Caixa<Double> caixaB = new Caixa<>();
		
		caixaB.guardar(3.1415);
		
		Double coisaB = caixaB.abrir();
		
		System.out.println(coisaB);
	}

}
