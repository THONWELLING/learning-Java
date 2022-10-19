package arrays;


import java.util.Scanner;


/*
* Crie um programa que calcule a média das notas de um aluno onde:
* A quantidade de notas será determinada pelo usuario.
* Crie um array com a quantidade de posições especificamente do mesmo tamanho que a quantidade de
* notas digitado pelo usuario.
* Colete os valores das notas usando o Scanner.
* e calcule a média final do aluno.
*  */
public class Desafio {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Quantas notas: ");
    int quantNotas = entrada.nextInt();

    double[] notas = new double[quantNotas];

    for (int i = 0; i < notas.length; i++) {
      System.out.println("informe a nota " + (i + 1) + ": ");
      notas[i] = entrada.nextDouble();
    }
    double total = 0;
    for (double nota: notas) {
      total += nota;
    }
    double media = total / notas.length;
    System.out.println("A média do aluno é : " + media + "!!!");
  }
}
