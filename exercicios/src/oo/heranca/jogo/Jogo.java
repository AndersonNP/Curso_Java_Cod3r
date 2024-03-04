package oo.heranca.jogo;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		
		monstro.setX(10);
		monstro.setY(10);;

		Heroi heroi = new Heroi(10,11);
		
		//heroi.x = 10;
		//heroi.y = 11;
		
		System.out.println("O monstro tem: " + monstro.getVida());
		System.out.println("O heroi tem: " + heroi.getVida());
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);

		System.out.println("O monstro tem: " + monstro.getVida());
		System.out.println("O heroi tem: " + heroi.getVida());
		
	}

}
