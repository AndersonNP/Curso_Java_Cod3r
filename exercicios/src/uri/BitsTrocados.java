package uri;

import java.util.Scanner;

public class BitsTrocados {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int valor = entrada.nextInt();
		int count = 1;
		while(valor != 0) {
			int total50 = valor/50;
			int total10 = (valor-(total50*50))/10;
			int total5 = (valor-(total50*50)-(total10*10))/5;
			int total1 = (valor-(total50*50)-(total10*10)-(total5*5));
			System.out.println("Teste " + count);
			System.out.println(total50 + " " + total10 + " " + total5 + " " + total1);
			System.out.println("");
			count++;
			valor = entrada.nextInt();
		}
		
		entrada.close();
	}

}
