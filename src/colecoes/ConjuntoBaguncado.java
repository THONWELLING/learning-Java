package colecoes;

import java.util.HashSet;
import java.util.Set;

/*
Essa forma de implementar um conjunto não é uma boa prática por que estamos usando
um conjunto de dados Heterogeneo(vários tipos diferentes). A boa prática é usar um conjunto
de dados Homogeneo(do mesmo tipo)
*/

@SuppressWarnings("ALL")
public class ConjuntoBaguncado {
  public static void main(String[] args) {

    HashSet conjunto  = new HashSet();

    /*
     * O HashSet não aceita tipos primitivos. Logo, os tipos primitivos abaixo serão convertidos
     * automaticamente para o Wrapper/Classe
    */

    conjunto.add(1.2); //double para Double
    conjunto.add(true); // boolean para Boolean
    conjunto.add("Teste");
    conjunto.add(1);
    conjunto.add('x');

    //Para verificar o tamanho do conjunto usamos o size() ao invés do length
    System.out.println("Tamanho é => " + conjunto.size());

    //Para adicionar um elemento no conjunto utilizamos o add()
    conjunto.add("teste");
    System.out.println("Tamanho é => " + conjunto.size()); //o retorno é 6 porque teste é != Teste

    //Para remover um elemento do conjunto usamos o remove()
    System.out.println(conjunto.remove("teste"));//retorna true ou false se ele remover == true se não remover false
    System.out.println("Tamanho é => " + conjunto.size());

    //Para ver se temos um determinado elemento no conjunto usamos o contains()
    System.out.println(conjunto.contains("teste"));// false porque retiramos essa string acima
    System.out.println(conjunto.contains('x'));// true porque esse caractere existe no conjunto

    Set nums = new HashSet();
    nums.add(1);
    nums.add(2);
    nums.add(3);

    System.out.println("Valores da collection nums => " + nums);//Colection ja implementam a forma de mostram isso como string
    System.out.println("Valores da collection conjunto => " + conjunto);//Colection ja implementam a forma de mostram isso como string

    /*            Intersecção entre dois conjuntos usamos o retainAll()
     * Retem apenas os elementos que são comuns entre as 2 colections
    */
    conjunto.retainAll(nums);
    System.out.println("Intersecção entre as colections => " + conjunto);

       /*               Para unir os conjuntos usamos o addAll()
    * selecionamos a colection e mandamos adicionar a outra
    * colection dentro isso muda o valor da colection conjunto
    */
    conjunto.addAll(nums);
    System.out.println("Colection unida => " + conjunto);// mostrando o novo valor da colection conjunto

    /*                    Para limpar tudo usamos o clear()
    * Limpa totalmente a colection deixando-a vazia
    */
    conjunto.clear();
    System.out.println("Comando Clear => " + conjunto);
  }
}
