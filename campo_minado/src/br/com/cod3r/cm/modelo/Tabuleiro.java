package br.com.cod3r.cm.modelo;

import br.com.cod3r.cm.excecao.ExplosaoException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


/**
 * Classe que representa o tabuleiro do campo minado.
 */
public class Tabuleiro {

  private int linhas;
  private int colunas;
  private int minas;

  private final List<Campo> campos = new ArrayList<>();

  /**
   * Construtor para iniciar o tabuleiro com o número especifico de linhas,
   * colunas e minas.
   *
   * @param linhas  o número de linhas do tabuleiro
   * @param colunas o número de colunas do tabuleiro
   * @param minas   o número de minas no tabuleiro
   */
  public Tabuleiro(int linhas, int colunas, int minas) {
    this.linhas = linhas;
    this.colunas = colunas;
    this.minas = minas;

    gerarCampos();
    associarVizinhos();
    sortearMinas();
  }

  /**
   * Método para associnar a abertura do campo.
   *
   * @param linha  linha do campo selecionado
   * @param coluna coluna do campo selecionado
   */
  public void abrir(int linha, int coluna) {

    try {
      campos.stream().filter(c -> c.getLinha() == linha && c.getColuna() == coluna).findFirst()
          .ifPresent(c -> c.abrir());
    } catch (ExplosaoException e) {
      campos.forEach(c -> c.setAberto(true));
      throw e;
    }

  }

  /**
   * Método para alternar a marcação de um campo selecionado.
   *
   * @param linha linha de um campo selecionado
   * @param coluna coluna de um campo selecionado
   */
  public void alternarMarcacao(int linha, int coluna) {

    campos.stream().filter(c -> c.getLinha() == linha && c.getColuna() == coluna).findFirst()
        .ifPresent(c -> c.alternarMarcacao());

  }

  private void gerarCampos() {
    for (int linha = 0; linha < linhas; linha++) {
      for (int coluna = 0; coluna < colunas; coluna++) {
        campos.add(new Campo(linha, coluna));
      }
    }
  }

  private void associarVizinhos() {
    for (Campo c1 : campos) {
      for (Campo c2 : campos) {
        c1.adicionarVizinho(c2);
      }
    }
  }

  private void sortearMinas() {
    long minasArmadas = 0;
    Predicate<Campo> minado = c -> c.isMinado();

    do {

      int aleatorio = (int) (Math.random() * campos.size());
      campos.get(aleatorio).minar();
      minasArmadas = campos.stream().filter(minado).count();

    } while (minasArmadas < minas);

  }

  public boolean objetivoAlcancado() {
    return campos.stream().allMatch(c -> c.objetivoAlcancado());
  }

  public void reiniciar() {
    campos.stream().forEach(c -> c.reinicar());
    sortearMinas();
  }
  
  /**
   * Exibe o tabuleiro.
   */
  public String toString() {
    StringBuilder sb = new StringBuilder();

    int i = 0;
    sb.append("   ");
    for (int c = 0; c < colunas; c++) {
      sb.append(" ");
      sb.append(c);
      sb.append(" ");
    }
    sb.append("\n");
    for (int l = 0; l < linhas; l++) {

      sb.append(" ");
      sb.append(l);
      sb.append(" ");

      for (int c = 0; c < colunas; c++) {
        sb.append(" ");
        sb.append(campos.get(i));
        sb.append(" ");
        i++;
      }
      sb.append("\n");
    }

    return sb.toString();
  }

}
