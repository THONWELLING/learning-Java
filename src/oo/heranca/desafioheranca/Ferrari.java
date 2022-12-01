package oo.heranca.desafioheranca;

import oo.heranca.desafio2.Esportivo;

public class Ferrari extends Carro {

  @Override
  void acelerar() {
    velocidadeAtual += 15;
  }

}
