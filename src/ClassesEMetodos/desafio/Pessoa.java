package ClassesEMetodos.desafio;

public class Pessoa {
  String nome;
  double peso;

  //Criando o contrutor do objeto Pessoa
  public Pessoa(String nome, double peso) {
    this.nome = nome;
    this.peso = peso;
  }

  //Criando o método comer que vai receber como parâmetro um objeto(Comida)
  void comer(Comida comida){

    //Usando condicional para testar se comida não é null
    if (comida != null) {
      this.peso += comida.comidaPeso; // pegando o peso da pessoa e adicionando o peso da comida
    }
  }

  //Criando um método de apresentação
  String apresentar() {
    return "Olá, eu sou o " + nome + " e tenho " + peso + "Klgs.";
  }
}
