package fundamentos.Operators.exerciciosDoModulo;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ImcCalc {
  public static void main(String[] args) {
    /*
    * Criar um código que leia os valores de peso e altura e armazene seus valores em variáveis
    * e de pois calcule  o IMC(indice de massa corporea) do usuário*/

    Scanner entry = new Scanner(System.in);

    System.out.println("Tip Your Weight");
    double weight = entry.nextDouble();

    System.out.println("Tip Your Height");
    double height = entry.nextDouble();

    double imc = weight / (height * height);

    System.out.println("Your IMC Is => " + imc);
  }
}
