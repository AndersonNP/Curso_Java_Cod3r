package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana"); // se a fila está cheia retorna erro
		fila.offer("Bia"); // se a fila está cheia retorna falso
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		//System.out.println(fila.peek()); // quando a fila estiver vazia retorna null
		//System.out.println(fila.element()); // quando a fila estiver vazia retorna erro
		
		// fila.size()
		// fila.clear()
		// fila.isEmpty()
		
		System.out.println(fila.poll()); //se estiver vazio retorna false
		System.out.println(fila.remove()); //se estiver vazio retorna erro
		
		
		System.out.println(fila);
		

	}
}
