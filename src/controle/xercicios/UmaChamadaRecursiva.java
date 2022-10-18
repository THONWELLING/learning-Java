package controle.xercicios;

/*
* Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números
* de N até 0.
* A Entrada será composta por um número inteiro, N.
* Será impresso o somatório de N até 0, como no exemplo a baixo:

EXEMPLO DE ENTRADA      EXEMPLO DE SAÍDA

       10	                   55
       4                   	 10
       15	                   120
 */

import java.util.Scanner;

public class UmaChamadaRecursiva {
  public static void main(String[] args) {

    Scanner numero = new Scanner(System.in);

    /* TODO: Imprima o somatório de N (utilize o método "somatorio").*/

    int N = numero.nextInt();
    System.out.println(somatorio(N));
  }

  /**
   * Método útil que calcula o somatório de um número usando recursividade.
   */
  static int somatorio(int numero) {
    if (numero == 0) {
      return 0;
    } else {
      return numero + somatorio(numero - 1);
    }
  }
}
