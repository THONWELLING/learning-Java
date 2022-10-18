package controle;

/*
* Desafio
* Dado o número A e o seu limite N, encontre a soma de todos os múltiplos de A até o seu
* limite N.
* A entrada deverá ser composta pelo valor A na primeira linha, seguido do valor N na segunda.
* A saída deverá retornar o valor da soma de todos os múltiplos A até o seu limite N.
* */

  import java.util.Scanner;
public class SomandoMultiplos {
    public static void main(String[] args) {
      int A, N;

      Scanner input = new Scanner(System.in);
      A = input.nextInt();
      N = input.nextInt();


      //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".

      int soma = 0;

      for(int i = A; i <= N; i++) {
        if(i %  A == 0) {
          soma += i;
        }
      }
      System.out.println(soma);
    }
  }

