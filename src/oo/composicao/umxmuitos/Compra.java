package oo.composicao.umxmuitos;

import java.util.ArrayList;

public class Compra {

  String cliente;
  ArrayList<Item> items = new ArrayList<Item>();//Relação 1 para muitos uni-direcional

  /*
  * Relação bi-direcional
  *
  * Dentro da compra ao invés de adicionar um item dento da compra usando o ArrayList, eu posso criar um método
  * que vai retornar void chamado adicionarItem e passar o Item item como parâmetro.
  * Uma vez que estamos controlando a adição do item e temos mais controle dentro do Objeto Compra podemos adicionar
  * os itens pasando um item.
  * e informando quem é a compra associada ao item?? exatamente a minha classe atual ou seja,
  * no momento em que adicionamos o item na lista também adicionamos a compra associada ao item.
  *
  *
  *         void adicionarItem(Item item) {
  *              items.add(item);
  *              item.compra = this;
  *         }
  *
  * */

  double obterValorTotal() {

    double valorTotal = 0;

    for(Item item : items) {
      valorTotal += item.quantidade * item.preco;
    }

    return valorTotal;
  }
}
