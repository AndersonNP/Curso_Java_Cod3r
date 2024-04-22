package br.com.cod3r.cm;

import br.com.cod3r.cm.modelo.Tabuleiro;
import br.com.cod3r.cm.visao.TabuleiroConsole;

public class Aplicacao {
    /**
     * teste.
     *
     * @param args teste
     */
    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 1);

        int valor = 1;

        if (valor > 0) {
            if (valor == 1) {
                System.out.println();
            }
        }

        new TabuleiroConsole(tabuleiro);
    }

}
