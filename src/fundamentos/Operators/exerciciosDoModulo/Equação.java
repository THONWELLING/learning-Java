package fundamentos.Operators.exerciciosDoModulo;

import java.util.Scanner;

public class Equação {
  public static void main(String[] args) {
    Scanner acan = new Scanner(System.in);

    System.out.println("Equação => ax² + bx + c = 0");
    System.out.println("Digite o valor de A ");
    int a = acan.nextInt();

    System.out.println("Digite o valor de B ");
    int b = acan.nextInt();

    System.out.println("Digite o valor de C ");
    int c = acan.nextInt();

    double delta = (Math.pow(b,2)) - (4 * a * c);
    System.out.printf("\nSua equação é: %dx² + %dx + %d = 0", a, b, c);
    System.out.println("O valor de Delta é " + delta);

    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
    System.out.println("O valor do X1 é " + x1);

    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
    System.out.println("O valor do X2 é " + x2);
  }
}
