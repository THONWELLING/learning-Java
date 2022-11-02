package oo.composicao.umxmuitos;

public class Item {

  String nome;
  int quantidade;
  double preco;
  /*
  * Relação bi-direcional
  *
  * Primeiro dizemos que um Objeto Item pode ter uma compra associada.
  * Compra compra;
  * */

  Item(String nome, int quantidade, double preco) {
    this.nome = nome;
    this.quantidade = quantidade;
    this.preco = preco;
  }
}
