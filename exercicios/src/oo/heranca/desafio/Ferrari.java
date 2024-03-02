package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{
	
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(15);
	}
	
	public void acelerar(){
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA){
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else{
			velocidadeAtual += getDelta();
		}
		
	}

	@Override
	public void ligarTurbo() {
		setDelta(35);
	}

	@Override
	public void desligarTurbo() {
		setDelta(15);
	}

	@Override
	public void ligarAr() {
		
	}

	@Override
	public void desligarAr() {
		
	}

}
