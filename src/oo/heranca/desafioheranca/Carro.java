package oo.heranca.desafioheranca;
/*
* O desafio consiste em cria uma classe genérica Carro
* e crie 2 carros específico que vai herdar de carro
* dentro da classe genérica vai ter velocidade atual, o método acelerar e o metodo freiar
* a velocidade do carro nunca poderá ser menor que 0
* o método acelerar vai acrescentar de 5 em 5 km/h
* o método freiar decrementa de 5 em 5 km/hora
* na classe específica Ferrari ela não vai acelerar de 5 em 5 mais sim de 15 em 15km/h*/
public class Carro {
  int velocidadeAtual;


  void frear() {
    if (velocidadeAtual >= 5 ) {
    velocidadeAtual -= 5;
  } else {
    velocidadeAtual = 0;
    }
  }

  void acelerar() {
    velocidadeAtual += 5;
  }

  public  String toString() {
    return "Velocidade atual é " + velocidadeAtual + "KM/h.";
  }
}
