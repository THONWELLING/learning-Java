package controle.xercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *                    Jogo da adivinhação.
 * Tente adivinhar um número entre 0 e 100. Armazene
 * um número aleatório em uma variável. O Jogador tem 10 tentativas para
 * adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade
 * de tentativas feitas, e imprima se o número inserido é maior ou menor do
 * que o número armazenado.
 */

public class AdivinheONumero {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int continuar;
    int numeroSorteado;
    int tentativas;
    int numeroDigitado;

    do {
      System.out.println("Sorteando o número... ");
      Random numAleatorio = new Random(); // gerando um número aleatório
      numeroSorteado = numAleatorio.nextInt(101); // aqui é o limite de números como começa do 0 preciso por 101.

      System.out.println("Começou !!! Tente Adivinhar o Número Sorteado...");
      tentativas = 0;

      do {
        tentativas++;
        System.out.printf("Tentativa %d: ", tentativas);
        numeroDigitado = entrada.nextInt();

        if (numeroDigitado < numeroSorteado) {
          System.out.printf("\nO número sorteado é maior que %d\n\n", numeroDigitado);
        } else if (numeroDigitado > numeroSorteado) {
          System.out.printf("\nO número sorteado é menor que %d\n\n", numeroDigitado);
        } else {
          System.out.printf("\nParabéns você acertou o número sorteado em %d tentativas!!\n\n", tentativas);

        }
      } while (numeroDigitado != numeroSorteado);
      System.out.println("Digite 0 para sair, ou qualquer outro número para continura: ");
      continuar = entrada.nextInt();
    } while (continuar != 0);
  }
}
