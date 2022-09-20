package fundamentos.Operators;

public class Unary {
  public static void main(String[] args) {

    //Oeradores de atribuição unários
    int x = 1;
    int y = 2;

    //Operadores unários pós-fixados (vem depois da variável/valor)
    x++;
    System.out.println(x);// é igual a x = x + 1 logo ==> 2
    x--;
    System.out.println(x);// é igual a x = x - 1 logo ==> 1

    //Operadores unários pré-fixados(vem antes da variável/valor)
    ++y;
    System.out.println(y);// é igual a y = y + 1 logo ==> 3
    --y;
    System.out.println(y);// é igual a y = y - 1 logo ==> 2



  }
}
