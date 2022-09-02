package controle;

import java.util.Iterator;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 10; i++) {
			
			if(i == 5) {
				break;
			}
			
			System.out.println(i);
		}
		
		System.out.println("Fim");
	}

}
