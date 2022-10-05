package ClassesEMetodos;

/*
* Vamos criar esta classe para testar a classe Produto.
* Nessa classe teremos o método main
* Como as 2 classes estão dentro do mesmo pacote não há a necessidade de fazer um import */

public class ProdutoTeste {
  public static void main(String[] args) {

    Produto p1 = new Produto();// Produto é o tipo, p1 é o nome davariável, new Chama po contrutor e Produto() é o construtor
    p1.nome = "Notebook";
    p1.preco = 4356.89;
    p1.desconto = 0.25;// 25%

    var p2 = new  Produto();
    p2.nome = "Caneta Preta";
    p2.preco = 12.56;
    p2.desconto = 0.29;

    double precoFinal1 = p1.precoComDesconto();
    double precoFinal2 = p2.precoComDesconto();
  }
}
