package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		Produto p1 = new Produto("Mouse", 100);
		Produto p2 = new Produto("Teclado", 150);
		Produto p3 = new Produto("Monitor", 500);
		Produto p4 = new Produto("HD Externo", 300);
		
		Compra c1 = new Compra();
		c1.adicionarItem(p1, 1);
		c1.adicionarItem(p2, 2);
		Compra c2 = new Compra();
		c2.adicionarItem(p3, 3);
		c2.adicionarItem(p4, 4);
		
		Cliente cliente1 = new Cliente("Anderson");
		cliente1.adicionarCompra(c1);
		cliente1.adicionarCompra(c2);
		
		System.out.println("Total: " + cliente1.obterValorTotal());
		
	}

}
