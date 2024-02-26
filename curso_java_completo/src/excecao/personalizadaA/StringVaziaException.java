package excecao.personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException{

	private String nomeDoAtribudo;
	
	public StringVaziaException(String nomeDoAtributo) {
		
		this.nomeDoAtribudo = nomeDoAtributo;
	}
	
	public String getMessage(){
		return String.format("O atributo '%s' está vazio", nomeDoAtribudo);
	}
}
