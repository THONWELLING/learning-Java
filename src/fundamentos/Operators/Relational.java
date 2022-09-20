package fundamentos.Operators;

public class Relational {
  public static void main(String[] args) {
    System.out.println(3 > 4); // operador maior que
    System.out.println(3 >= 3);//operador maior ou igual a
    System.out.println(3 < 7);//operador menor que
    System.out.println(30 <= 7);//operador menor ou igual a
    System.out.println(30 != 7);// operador diferente

    /*CASE: Um aluno tem direito a um desconto de 15% na mensalidade da faculdade se ele tiver
    * bom comportamento e tirar notas acima da média
    * Escreva um código que avalie se ele passa por essas condições e imprima o resultado */

    double nota = 8.9;
    boolean bomComportamento = true;
    boolean acimaDaMedia = nota >= 7;

    boolean temDesconto = bomComportamento && acimaDaMedia;

    System.out.println("O aluno Tem Desconto? " + temDesconto);
  }
}
