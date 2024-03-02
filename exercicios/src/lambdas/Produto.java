package lambdas;

import java.text.DecimalFormat;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Produto {
	
	 String nome;
	 double preco;
	 double desconto;
	
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	
	public String getPrecoFinal(){
		return precoComDesconto.andThen(impostoMunicipal).andThen(frete).andThen(duasCasas).andThen(formatar).apply(preco);
	}
	
	UnaryOperator<Double> precoComDesconto = 
			p -> p*(1-desconto);
			
	UnaryOperator<Double> impostoMunicipal =
			preco -> preco >= 2500 ? preco * 1.085 : preco;
	
	UnaryOperator<Double> frete =
					preco -> preco >= 3000 ? preco + 100 : preco + 50;
					
	Function<Double, String> duasCasas =
							preco -> new DecimalFormat("#####.00").format(preco);
	
	UnaryOperator<String> formatar =
									preco -> ("R$ "+preco).replace(".", ",");
									
	
					
			
}
