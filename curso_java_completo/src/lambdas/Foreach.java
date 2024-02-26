package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Formata tradicional...");
		for(String nome : aprovados){
			System.out.println(nome);
		}
		
		
		System.out.println("\nLambada #01...");
		
		aprovados.forEach((nome) -> {System.out.println(nome + "!!!");});
		
		
		System.out.println("\nMethod Reference 1...");
		aprovados.forEach(System.out::println);
		
		
		System.out.println("\nLambada #02...");
		
		aprovados.forEach((nome) -> meuImprimir(nome));
		
		System.out.println("\nMethod Reference 2...");
		aprovados.forEach(Foreach::meuImprimir);
	}
	
	public static void meuImprimir(String nome){
		System.out.println("Oi! Meu nome � " + nome);
	}
	
		
	
}