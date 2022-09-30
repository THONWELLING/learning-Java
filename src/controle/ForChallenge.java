package controle;

public class ForChallenge {
  public static void main(String[] args) {
     /* O desafio consiste em escrever um código que vai imprimir uma sequência de # que vai sair de # e vai
     * até ##### sem utilizar valor numérico para controlar o laço de repetição
     *  */

    String value = "#";
    for (String i = "#"; !i.equals("######")  ; i += "#") {
      System.out.println(i);

    }
  }
}
