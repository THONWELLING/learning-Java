package controle;

import java.util.Scanner;

public class If {
  public static void main(String[] args) {
    Scanner entry = new Scanner(System.in);

    System.out.println("Informe a média");
    double media = entry.nextDouble();

    if (media <= 10 && media >= 7.0) {
      System.out.println("Aprovado ");
      System.out.println("Parabéns ");
    } else if (media < 7 && media >= 4.5){
      System.out.println("Ficou de Recuperação ");
      System.out.println("Não desista ");
    } else if(media < 4.5 && media >= 0) {
      System.out.println("Reprovado ");
      System.out.println("Tente denovo");
    } else {
      System.out.println("Nota inválida");
    }
  }
}
