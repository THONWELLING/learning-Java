package ClassesEMetodos;

/*
* Vamos criar esta classe para testar a classe Produto.
* Nessa classe teremos o método main
* Como as 2 classes estão dentro do mesmo pacote não há a necessidade de fazer um import */

public class ProdutoTeste {
  public static void main(String[] args) {

    Produto p1 = new Produto("Notebook", 4356.89);// Produto é o tipo, p1 é o nome davariável, new Chama po contrutor e Produto() é o construtor

    var p2 = new  Produto();
    p2.nome = "Caneta Preta";
    p2.preco = 12.56;

    Produto.desconto = 0.29;

    System.out.println(p1.nome + " " + p1.precoComDesconto());
    System.out.println(p2.nome + " " + p2.precoComDesconto());

    double precoFinal1 = p1.precoComDesconto();
    double precoFinal2 = p1.pecoComDesconto(0.1);
  }
}
