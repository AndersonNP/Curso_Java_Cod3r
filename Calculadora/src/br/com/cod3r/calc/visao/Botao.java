package br.com.cod3r.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton{

    public Botao(String label, Color cor) {
        setText(label);
        setBackground(cor);
        setOpaque(true);
        setFont(new Font("arial", Font.PLAIN, 20));
        setForeground(Color.white);
        setBorder(BorderFactory.createLineBorder(Color.black));
    }
}
