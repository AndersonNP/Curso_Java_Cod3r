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
		// TODO Auto-generated method stub
		setDelta(35);
	}

	@Override
	public void desligarTurbo() {
		// TODO Auto-generated method stub
		setDelta(15);
	}

	@Override
	public void ligarAr() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desligarAr() {
		// TODO Auto-generated method stub
		
	}

}
