package AreaDeTriangulos;

import AreaDeTriangulos.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);
    Triangle x, y;
    x = new Triangle();
    y = new Triangle();


    System.out.println("Enter the meassures of triangle X: ");
    x.a = scanner.nextDouble();
    x.b = scanner.nextDouble();
    x.c = scanner.nextDouble();
    System.out.println("Enter the meassure of triangle Y: ");
    y.a = scanner.nextDouble();
    y.b = scanner.nextDouble();
    y.c = scanner.nextDouble();

    double areaX = x.calculateTriangleArea();

    double areaY = y.calculateTriangleArea();

    System.out.printf("Triangle X area: %.4f%n", areaX);
    System.out.printf("Triangle Y area: %.4f%n", areaY);

    if (areaX > areaY) {
      System.out.println("Area X it's greater than Area Y");
    } else {
      System.out.println("Area Y it's greater than Area X");

    }
  }
}
