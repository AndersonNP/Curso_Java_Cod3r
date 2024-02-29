package oo.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual = 0;
	private int delta = 5;
	
	

	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar(){
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA){
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else{
			velocidadeAtual += delta;
		}
		
	}
	
	public void frear(){
		int novaVelocidade = velocidadeAtual -= 5;
		if(novaVelocidade < 0){
			velocidadeAtual = 0;
		}else{
			velocidadeAtual = novaVelocidade;
		}
	}

	public int getDelta() {
		return delta;
	}
	
	public void setDelta(int delta) {
		this.delta = delta;
	}
}
