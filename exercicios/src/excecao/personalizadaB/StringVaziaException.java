package excecao.personalizadaB;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception{

	private String nomeDoAtribudo;
	
	public StringVaziaException(String nomeDoAtributo) {
		
		this.nomeDoAtribudo = nomeDoAtributo;
	}
	
	public String getMessage(){
		return String.format("O atributo '%s' está vazio", nomeDoAtribudo);
	}
}
