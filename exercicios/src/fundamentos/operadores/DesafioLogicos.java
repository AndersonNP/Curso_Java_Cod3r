package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		                    
		boolean trabalho2 = false;
		boolean trabalho1 = false;
		
		boolean tv50 = trabalho1 && trabalho2;
		boolean tv32 = trabalho1 ^ trabalho2;
		boolean sorvete = trabalho1 || trabalho2;
		
		System.out.println("TV 50 = " + tv50 + "\nTV 32 = " + tv32 + "\nSorvete = " + sorvete + "\nMais saudável? = " + !sorvete);
		
	}

}
