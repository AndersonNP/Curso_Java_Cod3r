package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		BinaryOperator<Integer> somatorio = (acum, valor) -> acum + valor;
		
		System.out.println(nums.stream().reduce(somatorio).get());
		System.out.println(nums.stream().reduce(0,somatorio));
		
		nums.stream()
		.filter(v -> v > 5)
		.reduce(somatorio)
		.ifPresent(System.out::println); // verifica se existe valor e executa um consumer
	}
}
