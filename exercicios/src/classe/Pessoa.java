package classe;

public class Pessoa {
	
	private String nome;
	private double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void comer(Comida comida){
		this.peso += comida.getPeso();
		System.out.println("Comendo...");
	}

}
