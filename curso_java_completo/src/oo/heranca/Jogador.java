package oo.heranca;

public class Jogador {

	protected int vida = 100;
	protected int x;
	protected int y;
	
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	Jogador(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public boolean atacar(Jogador oponente){
		
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1){
			oponente.vida -= 10;
			return true;
		}else if(deltaX == 1 && deltaY == 0){
			oponente.vida -= 10;
			return true;
		}else{
			return false;
		}
		
	}
	
	public boolean andar(Direcao direcao){
		
		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		
		return true;
	}
}
