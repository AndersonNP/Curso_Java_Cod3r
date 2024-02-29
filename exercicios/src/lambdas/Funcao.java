package lambdas;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		
		
		String resultadoFinal = parOuImpar
								.andThen(oResultoE)
								.andThen(empolgado)
								.apply(32);
		
		System.out.println(resultadoFinal);
		
	}
	
	
	
	static Function<Integer, String> parOuImpar = 
			numero -> numero % 2 == 0 ? "Par" : "Impar";
			
	
	static Function<String, String> oResultoE = 
			valor -> "O resultado é: " + valor;
			
	static Function<String, String> empolgado =
			valor -> valor + "!!!";
	
}
