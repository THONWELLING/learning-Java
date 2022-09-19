package fundamentos;

public class Inference {
  public static void main(String[] args) {

    /*
    * É possível declarar variáveis sem declarar o seu tipo usando a palavra reservada var
    * ou seja é uma variável declarada por inferência.
    * o java vai inferir o tipo de variável baseado no valor da atribuição
    * Obs: usando a variável por inferência  NÂO podemos declarar a variável sem atribuir o valor na MESMA linha!!!
    * Veja Abaixo */

    double a = 4.5;
    System.out.println(a);// result 4.5

    var b = 4.5;
    System.out.println(b);// result 4.5

    var c = "Some Text";
    System.out.println(c);// result Some Text

    //É possível modificar essa variável normalmente porém não é
    // permitido atribuir um número por exemplo
    c = "Another Text";
    System.out.println(c);

  }
}
