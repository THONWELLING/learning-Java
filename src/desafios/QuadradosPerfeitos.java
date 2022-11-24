package desafios;

/*
*                      Desafio
* Dado um inteiro n, retorne o menor número de números quadrados perfeitos cuja soma seja n.
* Um quadrado perfeito é um inteiro que é o quadrado de um inteiro.
* Em outras palavras, é o produto de algum inteiro consigo mesmo.
* Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos, enquanto 3 e 11 não são.

* Entrada
*A entrada consiste em um número inteiro n, representando o valor total.

* Saída
* A saída consiste em retornar o menor número de números quadrados perfeitos.
* */
import java.util.Scanner;

public class QuadradosPerfeitos {
  public static void main(String[] args) {
    int n = Integer.parseInt(new Scanner(System.in).nextLine());
    int referencia, contador, quadradosDentroDeN;
    int[] d = new int[n + 1];

    for(int i = 1; i < d.length; i++) {
      if(i * i <= n) {
        d[i] = i * i;
      } else {
        i = d.length - 1;
      }
    }
    quadradosDentroDeN = 1000;
    for(int i = d.length - 1; i > 0 && i <= n; i--) {
      if(i > 0 && d[i] > 0) {
        referencia = n;
        contador = 0;

        for(int j = i; j > 0; j--) {
          while(referencia > 0) {
            if (referencia >= d[j]) {
              referencia = referencia - d[j];
              contador++;
            } else {
              j--;
            }
          }
        }
        if(quadradosDentroDeN > contador) {
          quadradosDentroDeN = contador;
        }
      }
    }
    System.out.println(quadradosDentroDeN);
  }
}
