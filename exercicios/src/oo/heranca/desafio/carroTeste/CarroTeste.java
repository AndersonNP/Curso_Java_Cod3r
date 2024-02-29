package oo.heranca.desafio.carroTeste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
	
	public static void main(String[] args) {
		Civic civic = new Civic(200);
		Ferrari ferrari = new Ferrari(300);
		
		civic.acelerar();
		ferrari.acelerar();
		civic.acelerar();
		ferrari.acelerar();
		
		System.out.println("A ferrari esta com a velocidade de " + ferrari.velocidadeAtual);
		System.out.println("A civic esta com a velocidade de " + civic.velocidadeAtual);
		
		civic.frear();
		ferrari.frear();
		
		System.out.println();
	
		System.out.println("A ferrari esta com a velocidade de " + ferrari.velocidadeAtual);
		System.out.println("A civic esta com a velocidade de " + civic.velocidadeAtual);
		
		System.out.println();
		
		ferrari.ligarTurbo();
		ferrari.acelerar();
		
		System.out.println("A ferrari esta com a velocidade de " + ferrari.velocidadeAtual);

		System.out.println();
		
		ferrari.desligarTurbo();
		ferrari.acelerar();
		
		System.out.println("A ferrari esta com a velocidade de " + ferrari.velocidadeAtual);

		
		
	}
}
