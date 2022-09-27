package fundamentos.Operators.exerciciosDoModulo;

import java.util.Scanner;

public class TriangleArea {
  public static void main(String[] args) {

    /*
    * Criar um programa que leai os valores da base e da altura de um triângulo e calcule a área*/

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite a Base do triângulo ");
    double base = scan.nextDouble();

    System.out.println("Digite A Altura do Triângulo ");
    double height = scan.nextDouble();

    double area = (base * height) /2;

    System.out.println("A área do triangulo é => " + area);
  }
}
