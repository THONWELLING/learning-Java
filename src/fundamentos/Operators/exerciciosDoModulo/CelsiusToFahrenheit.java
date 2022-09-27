package fundamentos.Operators.exerciciosDoModulo;

import java.util.Scanner;

public class CelsiusToFahrenheit {
  public static void main(String[] args) {
     /*transformando uma temperatura em Fahrenheit e converter a temperatura.
      para Celcius.
      Fórmula => (celsius * 3/9) + 32 = fahrenheit
    */

    Scanner entry = new Scanner(System.in);

    System.out.println("Tip The Temperature In Celsius");
    double celsius = entry.nextDouble();

    double pointFusion = 32;
    double fix = 9 / 5;

    double fahrenheit = (celsius * fix) + pointFusion ;
    System.out.printf("Result In fahrenheit => %.3f ", fahrenheit);

    entry.close();
  }
}
