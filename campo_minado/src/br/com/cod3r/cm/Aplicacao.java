package br.com.cod3r.cm;

import br.com.cod3r.cm.modelo.Tabuleiro;
import br.com.cod3r.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 1);
		
		new TabuleiroConsole(tabuleiro);
	}

}