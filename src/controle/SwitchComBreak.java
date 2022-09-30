package controle;

import java.util.Scanner;

public class SwitchComBreak {
  public static void main(String[] args) {
    /*
    * Nesse case temos a palavra break depois de cada bloco de código. Isso quer dizer que
    * quando a variável satisfizer  um dos cases ela vai executar somente o bloco de código
    * relacionado à esse case Não executará os outros*/

    Scanner entry = new Scanner(System.in);

    System.out.print("Digite a Nota => ");
    int nota = entry.nextInt();

    String conceito = "";
    switch(nota) {
      case 10:
      case 9:
        conceito = "A";
        break;
      case 8:
      case 7:
        conceito = "B";
        break;
      case 6:
      case 5:
        conceito = "C";
        break;
      case 4:
      case 3:
        conceito = "D";
        break;
      case 2:
      case 1:
      case 0:
        conceito = "E";
    }
    System.out.println("Conceito é " + conceito);
  }
}
