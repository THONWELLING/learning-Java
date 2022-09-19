package fundamentos;

public class CircleArea {
  public static void main(String[] args) {
    double radius = 3.4;
    final double PI = 3.14159; // criando uma constante usando a palavra reservada final antes do tipo

    double area = PI * radius * radius;

    System.out.println("The Circle Area is =>" + " " + area + "m2" );

  }
}
