package controle.xercicios;

import java.util.Scanner;

/**
 * Criar um programa que, enquanto receber números positivos,
 * imprime a soma dos números inseridos no console, caso receba um número
 * negativo, encerra o programa.
 * Tente utilizar a estrutura do while.
 */

public class SomandoPositivos {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int somaDosNumeros = 0;
    int numero = 0;

    while(numero >= 0) {
      System.out.println("Digite um número inteiro para continuar ou \n " +
          "um número negativo para sair: ");
      numero = entrada.nextInt();

      if(numero >= 0) {
        somaDosNumeros += numero;
        System.out.printf("\nTotal dos números somados até o momento: %d\n", somaDosNumeros);
        System.out.println();
      } else {
        System.out.println("Saindo...");
        System.out.println("Total somado: " +somaDosNumeros);
      }
    }
  }
}
