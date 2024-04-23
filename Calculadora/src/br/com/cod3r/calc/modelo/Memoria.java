package br.com.cod3r.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
    
    private enum TipoComando {
        ZERAR, SINAL, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRGULA;
    };

    private final List<MemoriaObservador> observadores = new ArrayList<>();
    private static final Memoria instacia = new Memoria();
    
    private TipoComando ultimaOperacao = null;
    private boolean substituir = false;
    private String textoAtual = "";
    private String textoBuffer = "";
    
    private Memoria() {
        
    }
    
    public void adicionarObservador(MemoriaObservador observador) {
        observadores.add(observador);
    }

    public static Memoria getInstacia() {
        return instacia;
    }

    public String getTextoAtual() {
        return textoAtual.isEmpty() ? "0" : textoAtual;
    }
    
    public void processarComando(String texto) {
        
        TipoComando tipoComando = detectarTipoComando(texto);

        if(tipoComando == null) {
            return;
        }
        
        if(tipoComando == TipoComando.ZERAR) {
            textoAtual = "";
            textoBuffer = "";
            substituir = false;
            ultimaOperacao = null;
        }else if(tipoComando == TipoComando.SINAL) {
            textoAtual =  textoAtual.contains("-") ? textoAtual.substring(1) :  "-" + textoAtual;
        }else if(tipoComando == TipoComando.NUMERO || tipoComando == TipoComando.VIRGULA){
            textoAtual = substituir ? texto : textoAtual + texto;
            substituir = false;
        } else {
            substituir = true;
            textoAtual = obterResultadoOperacao();
            textoBuffer = textoAtual;
            ultimaOperacao = tipoComando;
        }
        
        observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
    }

    private String obterResultadoOperacao() {
        if(ultimaOperacao == null || ultimaOperacao == TipoComando.IGUAL) {
            return textoAtual;
        }
        
        double numeroBuffer = Double.parseDouble(textoBuffer.replace(",", "."));
        double numeroAtual = Double.parseDouble(textoAtual.replace(",", "."));
        
        double resultado = 0;
        
        if(ultimaOperacao == TipoComando.SOMA) {
            resultado = numeroBuffer + numeroAtual;
        }else if(ultimaOperacao == TipoComando.SUB) {
            resultado = numeroBuffer - numeroAtual;
        }else if(ultimaOperacao == TipoComando.MULT) {
            resultado = numeroBuffer * numeroAtual;
        }else if(ultimaOperacao == TipoComando.DIV) {
            resultado = numeroBuffer / numeroAtual;
        }
        
        String resultadoString = Double.toString(resultado).replace(".", ",");
        boolean inteiro = resultadoString.endsWith(",0");
        return inteiro ? resultadoString.replace(",0", "") : resultadoString;
    }

    private TipoComando detectarTipoComando(String texto) {
        if(texto.isEmpty() && texto.equals("0")) {
            return null;
        }
        
        try {
            Integer.parseInt(texto);
            return TipoComando.NUMERO;
        } catch (NumberFormatException e) {
            
            switch (texto) {
            case "AC":
                return TipoComando.ZERAR;
            case "+":
                return TipoComando.SOMA;
            case "/":
                return TipoComando.DIV;
            case "*":
                return TipoComando.MULT;
            case "-":
                return TipoComando.SUB;
            case ",":
                 return !textoAtual.contains(",") ? TipoComando.VIRGULA : null;
            case "=":
                return TipoComando.IGUAL;
            case "±":
                return TipoComando.SINAL;
            default:
                return null;
            }
        }
    }
    
}
