package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
  public static void main(String[] args) {

    Queue<String> fila = new LinkedList<>();
    /*
      * A diferença entre o add e o offer é, no caso de uma fila com tamanho determinado,
      * O .add vai retornar um erro NoSuchElementException caso tentemos adicionar um elemento em uma fila com tamanho determinado, que
      * não tem mais espaço.
      * Já o .offer somente retorna true ou false, logo, nomesmo caso ele retornaria false
    */
    fila.add("Vilma");
    fila.offer("Vivian");
    fila.add("Cristian");
    fila.offer("Matheus");
    fila.add("Benjamin");

    /*
    * Para pegar um elemento na fila podemos usar os métodos peek e element.
    * sendo que, ambos se cexecutados consecutivamente vão acessar e retornar sempre o próximo
    * item da fila sem  retirar o elemento da fila, apenas lêem.
    * A diferença ocorre quando a fila está vazia. o método peek retorna null.
    * O método element retorna um erro NoSuchElementException
    * */
    System.out.println(fila.peek());
    System.out.println(fila.peek());
    System.out.println(fila.element());
    System.out.println(fila.element());

    // Temo também o s métodos

//    fila.size();//
//    fila.isEmpty();// verifica se está vazia
//    fila.clear();// limpa toda a fila

    // O método poll retorna o próximo elemento da fila e retira ele da fila de modo que se
    // executarmos consecutivamente esse método ele vai eliminando os elementos da fila.
    //No caso da fila estar vazia ele não retorna erro.

    System.out.println(fila.poll());
    System.out.println(fila.poll());
    System.out.println(fila.poll());
    System.out.println(fila.poll());

    /*
      O método remove faz a mesma coisa que o poll porém, quando a fila está vazia ele retorna um
       erro NoSuchElementException
    */
    System.out.println(fila.remove());
  }
}
