package classe;

public class Jantar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa("Anderson", 90);
		
		Comida c1 = new Comida("Pizza", 0.200);
		Comida c2 = new Comida("Bolo", 0.250);
		
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Peso: " + p1.getPeso());
		p1.comer(c1);
		p1.comer(c2);
		System.out.println("Peso: " + p1.getPeso());
		
	}

}
