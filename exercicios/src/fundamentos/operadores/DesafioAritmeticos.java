package fundamentos.operadores;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		double Esquerda = Math.pow(6*(3+2), 2)/(3*2);
		double direita = Math.pow(((1-5)*(2-7))/2, 2);
		double cima = Math.pow(Esquerda - direita, 3);
		double baixo = Math.pow(10, 3);
		
		double resultado = cima/baixo;
		
		System.out.println(resultado);
	}
}
