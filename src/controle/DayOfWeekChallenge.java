package controle;

import java.util.Scanner;

public class DayOfWeekChallenge {
  public static void main(String[] args) {
    /*Crie um programa que leia um dia da semana digitado pelo usuário e retorne o múmero associado  à esse dia
    * ex: entrada: Domingo    saída: 1
    *     entrada: segunda    saída: 2
    * */

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite somente o primeiro nome do dia da semana ");
    String dia = entrada.next().toLowerCase();

    if(dia.equalsIgnoreCase("domingo")) {
      System.out.println(1);
    } else if (dia.equalsIgnoreCase("segunda")) {
      System.out.println(2);
    } else if (dia.equalsIgnoreCase("terça")) {
      System.out.println(3);
    } else if (dia.equalsIgnoreCase("quarta")) {
      System.out.println(4);
    } else if (dia.equalsIgnoreCase("quinta")) {
      System.out.println(5);
    } else if (dia.equalsIgnoreCase("sexta")) {
      System.out.println(6);
    } else {
      System.out.println(7);
    }
  }
}
