package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
  public static void main(String[] args) {

    /*
    * O Map tem uma pequena diferença, dentro dos generics "<>" nós teremos 2 valores separados por
    * virgula por exemplo o código do usuário  e o nome do usuário*/

    Map<Integer, String> usuarios = new HashMap<>();
    usuarios.put(1, "Thonwelling");//put pode ser usado para adicionar e para alterar
    usuarios.put(1, "Danithon");// aqui foi alterado
    System.out.println(usuarios.size());//vai retornar 1

    usuarios.put(2, "Thonwelling");// aqui foi alterado
    usuarios.put(3, "ThonwellingDani");// aqui foi alterado
    usuarios.put(4, "DaniThon");// aqui foi alterado
    System.out.println(usuarios.size());//vai retornar 1

    System.out.println(usuarios.isEmpty());
    System.out.println(usuarios.keySet());//Retorna somente as chaves, não mantém em ordem
    System.out.println(usuarios.values());//retorna somente os valores
    System.out.println(usuarios.entrySet());//retorna chaves e valores

    System.out.println(usuarios.containsKey(5));//avalia se existe essa chave
    System.out.println(usuarios.containsValue("Thonwelling"));//avalia se existe esse valor

    System.out.println(usuarios.get(3));// retorna o elemento do valor da chave OBS: não é indice

    /*
    * Para percorrer um Map temos 3 formas :
    * percorrer só as chaves , só os valores e o s 2 ao mesmo tempo */

    // Percorrendo somente as chaves com forEach
    for (int chave: usuarios.keySet()) { System.out.println(chave); }

    // Percorrendo somente os valores com forEach
    for (String valor: usuarios.values()) { System.out.println(valor); }

    // Percorrendo chaves e valores com for e Entry ==>java.util.map
    //usamos a mesma estrutura de chave e valor declarada no objeto

    for (Map.Entry<Integer, String> regitro: usuarios.entrySet()) {
      System.out.print(regitro.getKey() + " ==> ");
      System.out.println(regitro.getValue());
    }
  }
}
