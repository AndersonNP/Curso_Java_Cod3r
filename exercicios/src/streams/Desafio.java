package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Desafio {

	public static void main(String[] args) {
		
		Lancamento l1 = new Lancamento(1, 2000, "01/01/2023");
		Lancamento l2 = new Lancamento(1, 2000, "21/02/2023");
		Lancamento l3 = new Lancamento(1, 200, "15/01/2023");
		Lancamento l4 = new Lancamento(-1, 2000, "25/01/2023");
		
		
		List<Lancamento> lancamentos = Arrays.asList(l1, l2, l3, l4);
		
		Predicate<Lancamento> validarValor =
				l -> l.valor >= 1000;
				
		Predicate<Lancamento> validarTipo =
						l -> l.recdesp == -1;
		
		Consumer<Lancamento> print = System.out::println;
		
		
		lancamentos.stream().filter(validarTipo).filter(validarValor).forEach(print);
	}
}
