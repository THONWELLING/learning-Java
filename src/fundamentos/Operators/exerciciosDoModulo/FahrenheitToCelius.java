package fundamentos.Operators.exerciciosDoModulo;

import java.util.Scanner;

public class FahrenheitToCelius {
  public static void main(String[] args) {
     /*transformando uma temperatura em Fahrenheit e converter a temperatura.
      para Celcius.
      Fórmula => (fahrenheit -32) * 5/9 = Celsius
    */

    Scanner entry = new Scanner(System.in);

    System.out.println("Tip The Temperature In Fahrenheit");
    double fahrenheit = entry.nextDouble();

    double pointFusion = 32;
    double fix = 5/9;

    double celsius = (fahrenheit - pointFusion)  * fix ;
    System.out.printf("Result In Celsius => %.3f ", celsius);

    entry.close();
  }
}
