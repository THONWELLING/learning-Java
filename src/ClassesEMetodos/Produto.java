package ClassesEMetodos;


/*Vamos criar essa primeira classe sem o método main.
* Vou definir que  o produto vai ter 3 atributos, note que eu vou criar os attributos diretamente
*  dentro da classe */

public class Produto {
  String nome;
  double preco;
  double desconto;// O desconto estará entre 0 e 1 por exemplo: {0.1 =>10%, 0.2 =>20%, 0.3 => 30% ...}

  //Vamos criar um método que vai nos retornar o preço já com desconto
  //esse método não recebe parâmetros porquê já temos todas as informações no objeto Produto
  Double precoComDesconto () {
    return preco * (1 - desconto);
  }
}
