package controle;

import java.util.Scanner;

public class WhileIndeterminado {
  public static void main(String[] args) {

    /*
    * Crie um programa que leia uma string no console e se repita até o usuário digitar a palavra sair
    * */
    Scanner entrada = new Scanner(System.in);

    String valor = "";
    while(!valor.equalsIgnoreCase("sair")) {
      System.out.print("Você diz: ");
      valor = entrada.nextLine();
    }
  }
}
