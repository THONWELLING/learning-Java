package oo.composicao.muitospramuitos;

public class ClienteTeste {
  public static void main(String[] args) {

    Vendedor vendedor1 = new Vendedor("Joe Girard");
    Vendedor vendedor2 = new Vendedor("Steve Jobs");
    Vendedor vendedor3 = new Vendedor("Jordan Belfort");
    Vendedor vendedor4 = new Vendedor(" Alexandre Costa");
    Vendedor vendedor5 = new Vendedor("John Davison Rockefeller");

    Cliente cliente1 = new Cliente("Comprador de carros Chevrollet");
    Cliente cliente2 = new Cliente("Comprador de Iphones");
    Cliente cliente3 = new Cliente("Comprador de Ações WallStreet");
    Cliente cliente4 = new Cliente("Comprador de Chocolate CacauShow");
    Cliente cliente5 = new Cliente("Comprador de Petróleo");


    vendedor1.adicionarCliente(cliente1);
    vendedor1.adicionarCliente(cliente2);

    vendedor2.adicionarCliente(cliente1);
    vendedor2.adicionarCliente(cliente3);

    cliente5.adicionarVendedor(vendedor4);
    cliente5.adicionarVendedor(vendedor5);

    cliente4.adicionarVendedor(vendedor3);
    cliente4.adicionarVendedor(vendedor4);
    cliente4.adicionarVendedor(vendedor1);

    for (Cliente cliente: vendedor1.clientes){
      System.out.println("Sou Cliente do vendedor(a) " + vendedor1.nome + " e o meu nome é " + cliente.nome);
    }
  }
}
