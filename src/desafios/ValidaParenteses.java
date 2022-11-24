package desafios;

/*
* Desafio
* Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']' determine
* se uma determinada string é válida.

* Entrada
* Uma string é considerada válida se:

* Caracteres de abertura devem ser fechadas pelo mesmo tipo. Abertura devem ser fechados
* com uma chave correspondente. Uma string vazia é considerada válida.

* Saída
* A saída corresponde a um valor Booleano como no exemplo abaixo:

Entrada       	Saída
[ ]              true
( )              true
[ )              false
 */

import java.util.Scanner;

public class ValidaParenteses {
  public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);

    System.out.println("digite os caracteres!!");
    boolean caracter = ehValido(scanner.nextLine());

    System.out.println(caracter);
  }

  public static boolean ehValido(String s) {
    //TODO: implemente a lógica de caracteres válidos e retorne se a string é valida ou não.

    String[] caracteres = s.split("");
    String[] valorAceito = {"(",")","{","}","[","]"};
    boolean busca = false;

    for(int i = 0; i < valorAceito.length; i++){
      if(caracteres[0].equals(valorAceito[i]) && caracteres[caracteres.length-1].equals(valorAceito[i + 1])){
        busca = true ;
      }
    }
    return busca;

  }

}
