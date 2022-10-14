package arrays;

import java.util.Arrays;

public class Exercicio {
  public static void main(String[] args) {
    double[] notasAlunoA = new double[4];
    notasAlunoA[0] = 7.9;
    notasAlunoA[1] = 8;
    notasAlunoA[2] = 6.7;
    notasAlunoA[3] = 9.7;


    System.out.println("notas do aluno B \n" + Arrays.toString(notasAlunoA));// para exibir esse array

    //Para percorrer o array
    double totalAlunoA = 0;
    for (int i = 0; i < notasAlunoA.length; i++) {
      totalAlunoA += notasAlunoA[i];
    }
    System.out.println("Média do Aluno A => " + totalAlunoA / notasAlunoA.length);


    // Outra forma de declarar um array
    double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
    System.out.println("notas do aluno B \n" + Arrays.toString( notasAlunoB));

      double totalAlunoB = 0;

      for (int i = 0; i < notasAlunoB.length; i++) {
        totalAlunoB += notasAlunoB[i];
      }
    System.out.println("Média do Aluno B => " + totalAlunoB / notasAlunoB.length);
  }
}
