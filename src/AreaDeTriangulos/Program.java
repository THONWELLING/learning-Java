package AreaDeTriangulos;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);
    double xA, xB,xC,yA, yB, yC;

    System.out.println("Enter the meassures of triangle X: ");
    xA = scanner.nextDouble();
    xB = scanner.nextDouble();
    xC = scanner.nextDouble();
    System.out.println("Enter the meassure of triangle Y: ");
    yA = scanner.nextDouble();
    yB = scanner.nextDouble();
    yC = scanner.nextDouble();

    double p = (xA + xB + xC) / 2;
    double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

    p = (yA + yB + yC) / 2;
    double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

    System.out.printf("Triangle X area: %.4f%n", areaX);
    System.out.printf("Triangle Y area: %.4f%n", areaY);

    if (areaX > areaY) {
      System.out.println("Area X it's greater than Area Y");
    } else {
      System.out.println("Area Y it's greater than Area X");

    }
  }
}
