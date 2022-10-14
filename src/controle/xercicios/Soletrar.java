package controle.xercicios;


import java.util.Scanner;

/*Crie um programa que receba uma palavra e imprime no console letra por letra*/
public class Soletrar {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite uma palavra");
    String palavra = entrada.nextLine(); //recebendo a palavra pelo console

    char[] letras = palavra.toCharArray(); // tranformando a palavra em um array de letras

    for(int i = 0; i < letras.length ; i++) {
      System.out.println(letras[i]);
    }

  }
}
