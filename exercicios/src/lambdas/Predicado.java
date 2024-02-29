package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = Produto -> Produto.preco >= 750 ? true : false;
		
		Produto produto = new Produto("Notebook", 100, 0.15);
		System.out.println(isCaro.test(produto));
		
		Produto p1 = new Produto("Caneta", 2, 0.1);
		Produto p2 = new Produto("Caderno", 2, 0.1);
		Produto p3 = new Produto("Lapis", 2, 0.1);
		Produto p4 = new Produto("Cola", 2, 0.1);
		Produto p5 = new Produto("Lapizeira", 2000, 0.1);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach( p -> System.out.println(isCaro.test(p)));
		
	}
}
