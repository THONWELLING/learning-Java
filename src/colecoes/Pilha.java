package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
  public static void main(String[] args) {

    Deque<String> livros  = new ArrayDeque<String>();

    livros.add("O Pequeno Príncipe");
    livros.push("Don Quixote");
    livros.push("O Hobbit");

    //OBS:Esse for vai retornar na sequência da estrutura de dados nesse caso do último p primeiro
    for (String livro : livros) {
      System.out.println(livro);
    }

    System.out.println("Pegando com peek ==> " + livros.peek());
    System.out.println("Pegando com element ==> " + livros.element());/*O resultado será O Hobbit porque a estrutura de dados
    do tipo pilha o último a entrar é o primeiro a sair*/

    System.out.println("Retirado com poll ==> " + livros.poll());
    System.out.println("Retirado com remove ==> " + livros.remove());//retorna erro em caso da fila estar vazia
    System.out.println("Retirado com pop ==> " + livros.pop());//retorna erro em caso da fila estar vazia


    // fila.size();//
    //fila.isEmpty();// verifica se está vazia
    //fila.clear();// limpa toda a fila
    //fila.contains();
  }
}
