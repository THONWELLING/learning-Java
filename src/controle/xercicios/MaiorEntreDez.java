package controle.xercicios;


import java.util.Scanner;

/**
 * Crie um programa que recebe 10 valores e ao final imprima o maior número.
 */

public class MaiorEntreDez {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int maiorValor = 0;
    int count = 0;

    do {
      System.out.println("\nDigite um Número... ");
      int valor = entrada.nextInt();

      if (valor > maiorValor) {
        maiorValor = valor;
      }
        count++;
    } while (count != 10);

    System.out.println("O Maior Valor Foi :" + maiorValor);
  }
}
