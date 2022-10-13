package controle.xercicios;

import java.util.Scanner;

public class NumeroPrimo {
    /**
     * Criar um programa que receba um número e diga se ele é um número primo.
     */

  public static void main(String[] args) {

  int contDivisoes = 0;

    Scanner entrada = new Scanner(System.in);

    System.out.println("\nDigite um número para verificar se é primo");
    int numero =  entrada.nextInt();

    for (int i = 2; i < numero; i++) {
      if (numero % i == 0) {
        contDivisoes++;
      }
    }

    if (contDivisoes == 0) {
      System.out.println("\nO número " + numero + " é primo.");
    } else {
      System.out.println("\nO número " + numero + " não é primo.");
    }
  }
}
