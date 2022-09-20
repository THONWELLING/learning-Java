package fundamentos.Operators;

public class Ternary {
  public static void main(String[] args) {

    /*
    * O operador ternário é dividido em 3 partes por isso o nome ternário
    * 1º=> a condição a ser avaliada (pode ser uma variável ou expressão )
    * 2º=> o resultado caso a avaliação for verdadeira.
    * 3º=> o resultado caso a avaliação for falsa.*/

    double media = 7.6;
    String result = media>= 7 ? "Aprovado" : "Recuperação";
    System.out.println("O aluno está " + result);
  }
}
