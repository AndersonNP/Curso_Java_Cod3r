package classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	Produto(){
		
	}
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	double precoComDeconto(double descontoDoGerente){
		return this.preco * (1 - this.desconto + descontoDoGerente);
	}
	
	
}
