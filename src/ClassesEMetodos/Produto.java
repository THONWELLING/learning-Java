package ClassesEMetodos;


/*Vamos criar essa primeira classe sem o método main.
* Vou definir que  o produto vai ter 3 atributos, note que eu vou criar os attributos diretamente
*  dentro da classe */


/*Desafio de Membros de classe e Instância
* Supondo que essa classe produto faça parte de um sistema de loja onde o nome da loja é 25%
* e todos os produto dessa loja tem por padrão 25% de desconto podendo ser mudada em datas especiais
* porém o desconto sempre será para todos os produtos se for 27% é para todos
* Modifique a classe produto para refletir esse senário */
public class Produto {
  String nome;
  double preco;
  static double desconto = 0.25;// O desconto estará entre 0 e 1 por exemplo: {0.1 =>10%, 0.2 =>20%, 0.3 => 30% ...}

  Produto() {

  }
  Produto(String nomeInicial, double precaInicial) {
    nome = nomeInicial;
    preco = precaInicial;
  }

  //Vamos criar um método que vai nos retornar o preço já com desconto
  //esse método não recebe parâmetros porquê já temos todas as informações no objeto Produto
  double precoComDesconto() {
    return preco * (1 - desconto);
  }

  double pecoComDesconto(double descontoGerente) {
    return preco * (1 - desconto + descontoGerente);
  }
}
