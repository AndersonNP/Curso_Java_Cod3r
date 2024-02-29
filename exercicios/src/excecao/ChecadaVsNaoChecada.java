package excecao;

import javax.management.RuntimeErrorException;

public class ChecadaVsNaoChecada {

	public static void main(String[] args){
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			System.out.println("Erro gerarErro1: " + e.getMessage());
		}
		
		
		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
	}
	
	// Excecao não checada ou não verificada
	public static void geraErro1(){
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
		
	}

	// Excecao checada ou verificada
	public static void geraErro2() throws Exception{
			throw new Exception("Ocorreu um erro bem legal #02!");
		
	}
}
