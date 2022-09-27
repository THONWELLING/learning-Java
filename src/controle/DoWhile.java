package controle;

import java.util.Scanner;

public class DoWhile {
  public static void main(String[] args) {
    /*
    * o Do While é executado pelo menos uma vez
    * é o laço de controle que tem o bloco de código antes do laço própriamente dito */

    Scanner entrada = new Scanner(System.in);

    String texto;
    do {
      System.out.println("Você precisa falar as palavras mágicas!!!");
      System.out.println("Quer sair??? ");
      texto = entrada.nextLine();
    } while (!texto.equalsIgnoreCase("Por Favor"));

    System.out.println("Obrigado");
  }
}







