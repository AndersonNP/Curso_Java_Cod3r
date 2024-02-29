package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException{

	private String nomeDoAtribudo;
	
	public NumeroForaIntervaloException(String nomeDoAtributo) {
		
		this.nomeDoAtribudo = nomeDoAtributo;
	}
	
	public String getMessage(){
		return String.format("O atributo '%s' est� fora do intervalo", nomeDoAtribudo);
	}
}
