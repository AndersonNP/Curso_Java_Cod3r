package generics;

public class ParesTeste {
	
	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConsurso = new Pares<>();
		
		resultadoConsurso.adicionar(1, "Maria");
		resultadoConsurso.adicionar(2, "Pedro");
		resultadoConsurso.adicionar(3, "Gui");
		resultadoConsurso.adicionar(4, "Ana");
		resultadoConsurso.adicionar(2, "Rebeca");

	    System.out.println(resultadoConsurso.getValor(1));
	    System.out.println(resultadoConsurso.getValor(2));
	}

}
