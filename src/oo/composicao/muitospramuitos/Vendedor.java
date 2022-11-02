package oo.composicao.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {

 final  String nome;
  final List<Cliente> clientes = new ArrayList<>();

  Vendedor(String nome) {
    this.nome = nome;
  }

  void adicionarCliente(Cliente cliente) {
    this.clientes.add(cliente);
    cliente.vendedores.add(this);
  }
}
