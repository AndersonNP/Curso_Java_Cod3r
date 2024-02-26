package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {

	public final static UnaryOperator<String> maiuscula = m -> m.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
	public final static UnaryOperator<String> grito = n -> n + "!!! ";
	
	public final static String grito2(String n){
		return n + "!!! ";
	}
}
