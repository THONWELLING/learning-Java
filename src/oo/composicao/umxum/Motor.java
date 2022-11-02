package oo.composicao.umxum;

public class Motor {

  /*
  * Relacionamento Bidirecinal
  *
  * Carro carro;
  * */
  boolean ligado = false;
  double fatorInjecao = 1;

  /*
      Bidirecional
    * Motor(Carro carro) {
    * this.carro = carro;}
  * */

  int giros() {
    if(!ligado){
      return 0;
    } else {
      return (int) Math.round(fatorInjecao * 3000);
    }
  }
}


