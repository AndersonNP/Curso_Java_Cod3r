package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Compra compra1 = new Compra();
		compra1.cliente = "João Pedro";
		compra1.adicionarItem("Caneta", 20, 7.45);
		compra1.adicionarItem("Borracha", 12, 3.89);
		compra1.adicionarItem("Caderno", 3, 18.79);
		
		
		System.out.println(compra1.itens.size());
		
		System.out.println("Total da compra eh " + compra1.obterValorTotal());
	}

}
