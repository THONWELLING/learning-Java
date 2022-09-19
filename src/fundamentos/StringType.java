package fundamentos;

import com.sun.security.jgss.GSSUtil;

public class StringType {
  public static void main(String[] args) {

    //Achar um caractere em uma posição determinada dentro do parênteses
    System.out.println("Heloo People".charAt(6));

    String greetings = "Hey Maaan";
    //concatenar strings
    System.out.println(greetings.concat("!!!"));
                  //ou
    System.out.println(greetings + "!!!");

    //Saber se inicia com uma palavra/caractere
    System.out.println(greetings.startsWith("Hello"));//false porque começa com Hey
    System.out.println(greetings.startsWith("hey"));//false porque a primeira letra é maiuscula
    System.out.println(greetings.toLowerCase().startsWith("hey"));// true porque passamos para minuscula antes de avaliar se começa com hey

    //saber se termina com uma palavra/caractere funciona exatamente como a anterior
    System.out.println(greetings.endsWith("Maaan"));

    //Quantos caracteres tem
    System.out.println(greetings.length());

    //comparar igualdade exata
    System.out.println(greetings.equals("hey Maaan"));//false porque aqui está em minuscula
    //Comparar igualdade ignorando maiusculas e minusculas
    System.out.println(greetings.equalsIgnoreCase("hey maaan"));//verdadeiro porque analisou os caracteres sem considerar maiúsculas e minusculas


  }
}
