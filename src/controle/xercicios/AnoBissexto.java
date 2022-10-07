package controle.xercicios;

import java.util.Scanner;

public class AnoBissexto {
  /*
  * Criar um programa que informa se o ano informado é ano bissexto */
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Informe um ano => ");
    int ano = entrada.nextInt();

    boolean bissexto = ano % 4 == 0 &&((ano % 100) != 0 || ano % 400 == 0);
    if (bissexto == true) {
      System.out.println(ano + " é um ano bissexto");
    } else {
      System.out.println(ano + " não é bissexto");
    }

  }
}
