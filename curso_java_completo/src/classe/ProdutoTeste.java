package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto p1 = new Produto("Arroz", 5);
		Produto p2 = new Produto("Feijão", 6);
		
		Produto.desconto = 0.5;
		
		System.out.println(p1.precoComDesconto());
		System.out.println(p2.precoComDesconto());
	}

}
