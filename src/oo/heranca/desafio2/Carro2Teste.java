package oo.heranca.desafio2;

import oo.heranca.desafioheranca.Carro;

public class Carro2Teste {
  public static void main(String[] args) {

    Carro2 carro1 = new Civic2();

    carro1.acelerar();
    System.out.println(carro1);
    carro1.acelerar();
    System.out.println(carro1);
    carro1.acelerar();
    System.out.println(carro1);

    Ferrari2 carro2 = new Ferrari2(400);
    carro2.acelerar();
    System.out.println(carro2);
    carro2.acelerar();
    System.out.println(carro2);
    carro2.acelerar();
    System.out.println(carro2);
  }
}
