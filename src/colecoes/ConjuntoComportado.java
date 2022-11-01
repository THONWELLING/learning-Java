package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
  public static void main(String[] args) {

    /*
    * O HashSet não respeita a ordem de inserção */
    Set<String> listaDeAprovados  = new HashSet<>();// aqui determinamo que a colection tem que ser do tipo Sting
    listaDeAprovados.add("Thonwelling");
    listaDeAprovados.add("Danithon");
    listaDeAprovados.add("Ramon");
    listaDeAprovados.add("Manu");

    for(String candidato: listaDeAprovados) {
      System.out.println(candidato);
    }

    /*Para manter a ordem de inserção podemo usar o TreeSet*/
    SortedSet<String> list = new TreeSet<>();
    list.add("Davi");
    list.add("Carlos");
    list.add("Dalva");
    list.add("Walisson");

    for(String candidatos: list) {
      System.out.println(candidatos);
    }

    Set<Integer> nums  = new HashSet<>();
    nums.add(12);
    nums.add(14);
    nums.add(6);
    nums.add(8);

    for(int n: nums) {
      System.out.println(n);
    }
  }
}
