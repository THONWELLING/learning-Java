package fundamentos;

public class FahrenheitToCelsius {
  public static void main(String[] args) {
    /*transformando uma temperatura em Fahrenheit e converter a temperatura.
      para Celcius.
      Fórmula => (fahrenheit - 32) X 5/9 = Celsius
    */

    double fahrenheit = 78.9;
    final int FUSION = 32;
    final double FACTOR = 5.0 / 9.0;

    double celsius = (fahrenheit - FUSION) * FACTOR;
    System.out.println("Result In Celsius => " + celsius);
  }

}
