package oo.composicao.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

  final String nome;
  final List<Vendedor> vendedores = new ArrayList<>();

  Cliente(String nome) {
    this.nome = nome;
  }

  void adicionarVendedor(Vendedor vendedor) {
    this.vendedores.add(vendedor);
    vendedor.clientes.add(this);
  }
}
