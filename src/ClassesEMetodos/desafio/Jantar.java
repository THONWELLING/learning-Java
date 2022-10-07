package ClassesEMetodos.desafio;
  /*     Desafio Jantar
  * Nesse desafio vamos criar uma classe(Pessoa) que terá 2 atributos: (nome e peso).
  * Depois vamos criar outra classe(Comida) que também terá 2 atributos: (comidaNome e comidaPeso)
  * O objetivo é fazer com que uma pessoa se apresente(com o peso atual) e coma 1 tipo de comida,
  *  depois de comer, se apresente novamente(agora com o peso dela somado ao peso da comida que
  * ingeriu) e coma outro tipo de comida. Apresente-se novamente(com o peso final)
  * */

  /*              RESOLUÇÃO
  *Vamos criar na classe(Pessoa) um método(apresentar) que vai retornar uma frase de apresentação
  * contendo o seu nome e peso atual.
  * Vamos criar ainda na classe(Pessoa) um método(comer) que vai receber como parâmetro o objeto(Comida),
  * esse método vai pegar o peso da pessoa e somar o peso da comida ingerida.*/
public class Jantar {

  public static void main(String[] args) {

    //instanciamos aqui 2 Comidas
    Comida comida1 = new Comida("arroz", 0.223);
    Comida comida2 = new Comida("feijão", 0.300);

    //instanciamos aqui 1 Pessoa
    Pessoa pessoa1 = new Pessoa("João", 79.8);

    System.out.println(pessoa1.apresentar());
    pessoa1.comer(comida1);

    System.out.println(pessoa1.apresentar());
    pessoa1.comer(comida2);

    System.out.println(pessoa1.apresentar());
  }
}
