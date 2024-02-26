package controle;

import java.util.Iterator;

public class DesafioFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String valor = "#";
		for(int i = 1; i<= 5;i++) {
			System.out.println(valor);
			valor +="#";
		}
		
		
		for(String valor1 = "#"; !valor1.equals("######");valor1 += "#") {
			System.out.println(valor1);
		}
		
		
	}

}
