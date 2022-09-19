package fundamentos;

import java.util.Scanner;

public class Console {
  public static void main(String[] args) {
   //Imprimindo vlores no console

    System.out.print("Morning!!! ");// imprime o valor mais não quebra a linha
    System.out.print("What Are You Doing \n");//podemos usar \n para quebrar a linha nesse caso
    System.out.println("Good Morning");//imprime o valor e depois quebra a linha
    //imprimindo um texto manipulado direto no console onde cada simbolo equivale a uma variável
    System.out.printf("Megasena:  %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);

    //Pegando informações digitadas no console

    Scanner enter = new Scanner(System.in);//vai escanear oque digitarmos por padrão

    System.out.print("Tip Your Name ");
    String name = enter.nextLine();//salvando oque o usuário digitar no console nesta variável

    System.out.print("Tip Your Last Name ");
    String lastName = enter.nextLine();//salvando oque o usuário digitar no console nesta variável

    System.out.print("Tip Your Age ");
    int age = enter.nextInt();//salvando oque o usuário digitar no console nesta variável



   /* Passando para esclarecer uma particularidade dos métodos nextInt() e nextDouble().
   Ambos os métodos têm a mesma particularidade, mas vou explicá-la através do nextInt()
   com o exemplo abaixo.
    */


    Scanner keuboard = new Scanner(System.in);

    System.out.println("Tip Your Age ");
    int otherAge = keuboard.nextInt();
    System.out.println("Tip Your Name ");
    String otherName = keuboard.nextLine();
    System.out.println("Tip Your Last Name ");
    String otherLastName = keuboard.nextLine();

    /*
      À primeira vista, parece que está tudo bem com este código, mas quando o rodamos, o que é
       impresso no console (contendo os inputs) é o seguinte:

        Qual a sua idade? 25
        Qual o seu nome? Qual o seu sobrenome? Silva

      Isso acontece por causa da maneira como o nextInt() faz a leitura dos valores.

      Esse método faz a leitura de um único número, por exemplo, 58, ou 958. Mas quando digitamos
      os inputs, além do valor que deve ser lido, também apertamos enter, o que gera um caracter
      "\n" no buffer de entrada (fila de coisas que devem ser lidas), que é uma representação do
      Enter.

      Então, o que acontece é:
      "Qual a sua idade?" é impresso, digitamos o valor e apertamos enter. Quando fazemos isso,
      o buffer de entrada fica com o conteúdo "25\n", e quando o nextInt() faz a leitura,
      ele lê apenas o 25, deixando o "\n" para trás. Depois disso, "Qual o seu nome?" é impresso,
      e o método nextLine() vai ler tudo que estiver no buffer de entrada até encontrar um "\n".
      Como o nextInt() deixou um "\n" para trás, é esse o valor que o nextLine() lê. Isso conclui
      a leitura e a próxima linha de código, que é "Qual o seu sobrenome?", é impressa.

      Para resolver esse problema, precisamos "pegar" o "\n" que o nextInt() não lê.
      Isso pode ser feito colocando um comando nextLine() depois do nextInt(), de modo que
      o código abaixo vai funcionar da maneira como queríamos.
    */
    Scanner keyboard2 = new Scanner(System.in);

    System.out.println("Tip Some New Age ");
    int age2 = keyboard2.nextInt();

    keyboard2.nextLine();//lê o "\\n" que o teclado.nextInt() deixa para trás.

    System.out.println("Tip Another Name ");
    String anotherName = keyboard2.nextLine();

    System.out.println("Tip Another LastName");
    String anotherLastName = keyboard2.nextLine();

    System.out.printf("\nYour Full Name Is => %s %s And You Are %d Years Old ",
        name, lastName, age);


  }
}