package fundamentos.Operators.exerciciosDoModulo;

import java.util.Scanner;

public class QuadradoECubo {
  public static void main(String[] args) {
    /*
    * Criar um programa que leia oum valor dgitado pelo usuário e retorne o valor ao quadrado e ao cubo */

    Scanner entry = new Scanner(System.in);

    System.out.println("Tip The Value ");
    double value = entry.nextDouble();

    double quadrado = Math.pow(value, 2);
    double cubo = Math.pow(value, 3);

    System.out.println("O Quadrado de " + value +  " é => " + quadrado +
        "\n O valor do cubo  de " + value + " é => " + cubo);
  }
}
