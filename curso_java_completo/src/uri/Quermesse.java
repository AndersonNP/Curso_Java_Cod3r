package uri;

import java.util.Scanner;

public class Quermesse {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int valor = entrada.nextInt();
		int count = 1;
		while(valor != 0) {
			int[] valores = new int[valor];
			int vencedor = 0;
			for (int i = 0; i < valores.length; i++) {
				valores[i] = entrada.nextInt();
				if(valores[i] == (i+1)) {
					vencedor = valores[i];
				}
			}
			
			System.out.println("Teste " + count);
			System.out.println(vencedor);
			System.out.println("");
			count++;
			valor = entrada.nextInt();
		}
		
		entrada.close();
	}

}
