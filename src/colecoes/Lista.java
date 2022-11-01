package colecoes;

import java.util.ArrayList;

public class Lista {
  public static void main(String[] args) {
    ArrayList<Usuario> lista = new ArrayList<>();

    lista.add(new Usuario("Marcos"));
    lista.add(new Usuario("Marta"));
    lista.add(new Usuario("Ingrid"));
    lista.add(new Usuario("Washington"));

    for (Usuario u : lista) {
      System.out.println(u);
    }

    System.out.println(lista.get(3));// acessar pelo indice
    /*
      * Quando removemos pelo indice ele recebe um inteiro indicando o indice e retorna um Usuário.
    */
    System.out.println("Quem foi removido? ==> " + lista.remove( 1));

    /*
      * Esse remove de baixo recebe um objeto e retorna verdadeiro ou falso
    */
    System.out.println(lista.remove(new Usuario("Washington")));

    //verificando se está contido ou não
    System.out.println("Tem?? " + lista.contains(new Usuario("Marcos")));
  }
}
