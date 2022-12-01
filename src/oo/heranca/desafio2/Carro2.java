package oo.heranca.desafio2;
/*
* O desafio consiste em recriar o desafio anterior
*  onde receberemos uma constante VELOCIDADE_MAXIMA e em cima da velocidade máxima  vamos fazer uma verificação
* onde a velocidade atual + 5 não poderá ultrapassar a velocidade máxima.
* */
public class Carro2 {

  final int VELOCIDADE_MAXIMA;
  int velocidadeAtual;
  private int delta = 5;

  Carro2(int velocidadeMaxima) {
    VELOCIDADE_MAXIMA = velocidadeMaxima;
  }

  void frear() {
    if (velocidadeAtual >= 5 ) {
    velocidadeAtual -= 5;
  } else {
    velocidadeAtual = 0;
    }
  }

  void acelerar() {
    if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
      velocidadeAtual = VELOCIDADE_MAXIMA;
    } else {
      velocidadeAtual += getDelta();
    }
  }

  public  String toString() {
    return "Velocidade atual é " + velocidadeAtual + "KM/h.";
  }

  public int getDelta() {
    return delta;
  }

  public void setDelta(int delta) {
    this.delta = delta;
  }
}
