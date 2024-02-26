package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
	
	ArrayList<Item> itens = new ArrayList<>();
	
	double obterValorTotal(){
		double total = 0;
		for(Item item : itens){
			total += (item.quantidade * item.produto.preco);
		}
		return total;
	}
	
	
	void adicionarItem(Produto produto, int quantidade){
		adicionarItem(new Item(produto, quantidade));
	}
	
	void adicionarItem(Item item){
		itens.add(item);
	}
}
