package controle.xercicios;

import java.util.Scanner;

public class EntreZeroEDez {

  /*
  * Criar um programa que receba um número e verifique se está entre 0 e 10 e se é par*/

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite um número => ");
    int numero = entrada.nextInt();

    if (numero >= 0 && numero <= 10) {
      if (numero % 2 == 0) {
        System.out.println("O número " + numero + " está entre 0 e 10 e é par.");
      } else {
        System.out.println("O número " + numero + " não está entre 0 e 10 e é impar.");
      }
    } else {
      System.out.println("O número " + numero + " não está entre 0 e 10.");
    }
  }
}
