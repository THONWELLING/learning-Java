package arrays;

import java.util.Arrays;
import java.util.Scanner;


/*
 * Crie um programa que calcule a média das notas de um aluno onde:
 * A quantidade de Alunos será determinada pelo usuario.
 * Crie um array com a quantidade de posições especificamente do mesmo tamanho que a quantidade de
 * Alunos digitado pelo usuario.
 * A quantidade de Notas por aluno será determinada pelo usuario.
 * Crie um array com a quantidade de posições especificamente do mesmo tamanho que a quantidade de
 * Notas por Aluno digitado pelo usuario.
 * Colete os valores das notas usando o Scanner.
 * Calcule a média final do aluno.
 *  */

public class Matriz {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("quantos alunos tem na turma?? ");
    int quantAlunos = scanner.nextInt();

    System.out.println("quantas notas por aluno?? ");
    int quantNotas = scanner.nextInt();

    //Criando a Matriz onde o array mais externo é a quantidade de alunos e o interno é a quantidade de notas
    double[][] notasDaTurma = new double[quantAlunos][quantNotas];
    double total = 0;

    /*Para percorrer a Matriz colocando as notas
    * Vamo usar o for aninhado onde o for externo vai percorrer o array de alunos
    * e o for mais interno vai percorrer as notas de cada aluno */

    for (int aluno = 0; aluno < notasDaTurma.length; aluno++) {
      for (int nota = 0; nota < notasDaTurma[aluno].length; nota++) {

        System.out.printf("Informe a nota %d do aluno %d: ",
            nota + 1, aluno + 1);
        notasDaTurma[aluno][nota] = scanner.nextDouble();
        total += notasDaTurma[aluno][nota];
      }
    }

    double media = total / (quantAlunos * quantNotas);
    System.out.println("Média da turma é " + media);

    //Para exibir as notas de cada aluno
    for (double[] notasDoAluno: notasDaTurma) {
      System.out.println(Arrays.toString(notasDoAluno));
    }
  }
}
