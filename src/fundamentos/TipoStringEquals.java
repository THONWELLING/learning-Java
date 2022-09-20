package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
  public static void main(String[] args) {
    /*
    * Se compararmos 2 strings diretamente escritas exatamente iguais elas usando o operador lógico ==
    * o resultado da coparação será verdadeiro  */

    System.out.println("2" == "2");
    /*
    * Porém o aso de comprararmos uma variável s que tenha um valor do tipo string "2" com o valor
    * diretamente decalarado usando o operador == o resultado será false.*/

    String s = new String("2");
    System.out.println("2" == s);//false
    /*Para comparar o valor dentro de s precisaremos usar o método .equals*/
    System.out.println("2".equals(s));// aqui temos o resultado verdadeiro


    /*Vejamos outro exemplo, agora com um valor capturado no console*/

    Scanner value = new Scanner(System.in);

    System.out.println("O valor vai Aqui ");
    /*Um detalhe aqui é que poderiamos usar o next() para pegar o valor do console
    * pois o next() já tira todos os espaços em branco por padrão
    * Já o nextLine() pega o valor exatamente como foi escrito.
    * e usamos o método .trim() para fazer a limpeza dos espaços em branco.*/
    String s1 = value.nextLine();

    System.out.println("2" == s1.trim());//false
    System.out.println("2".equals(s1.trim()));
  }
}
