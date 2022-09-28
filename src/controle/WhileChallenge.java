package controle;

import java.util.Scanner;

public class WhileChallenge {
  public static void main(String[] args) {
    /*Crie um código que calcule a nota média de uma turma.
    * não importa quantos alunos teremos nessa turma
    * o usuário vai digitar uma nota válida entre 0 e 10  e o valor dessa nota vai ser armazenado na variável
    * total. Toda vez que for digitado uma nova nota esse valor será adicionado a essa variável
    * Use uma outra variável para contar quantas notas válidas foram digitadas
    * e para sair o usuário deve digitar -1
    * então calculamos a média e mostramos o resultado */

    Scanner entrada = new Scanner(System.in);

    int quantity = 0;
    double nota = 0;
    double total = 0;

    while(nota != -1) {
      System.out.print("Informe a nota ou digite -1 para sair: ");
      nota = entrada.nextDouble();

      if (nota <= 10 && nota >= 0) {
        total += nota;
        quantity++;
      } else if (nota > 10){
        System.out.println("Nota inválida");
      }

    }
    double media = total / quantity;
    System.out.println("Média = " + media);

  }
}
