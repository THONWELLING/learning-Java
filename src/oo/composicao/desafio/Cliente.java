package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

  final String nome;
  final List<Compra> compras = new ArrayList<Compra>(); //relação de cliente com compra  1 cliente pode ter várias compras

  public Cliente(String nome) {
    this.nome = nome;
  }

  double obterValotTotal() {
    double total = 0;
    for(Compra compra : compras) {
      total += compra.obterValotTotal();
    }
     return total;
  }
}
