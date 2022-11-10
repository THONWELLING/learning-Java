package oo.heranca.desafioheranca;

public class CarroTeste {
  public static void main(String[] args) {

    Carro carro1 = new Civic();

    carro1.acelerar();
    System.out.println(carro1);
    carro1.acelerar();
    System.out.println(carro1);
    carro1.acelerar();
    System.out.println(carro1);

    Ferrari carro2 = new Ferrari();
    carro2.acelerar();
    System.out.println(carro2);
    carro2.acelerar();
    System.out.println(carro2);
    carro2.acelerar();
    System.out.println(carro2);
  }
}
