package streams;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Teste {

	public static void main(String[] args) throws ParseException {

		List<Integer> valores = Arrays.asList(1, 2, 3, 4);

		System.out.println(valores);

		valores = valores.stream().map(valor -> valor * 2).filter(valor -> valor > 2).collect(Collectors.toList());
		
		int total = valores.stream().reduce(0, (subtotal, elemento) -> subtotal + elemento);
		
		System.out.println(total);

		System.out.println(valores);

	}

}
