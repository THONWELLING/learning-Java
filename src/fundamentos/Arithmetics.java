package fundamentos;

public class Arithmetics {
  public static void main(String[] args) {

    System.out.println(2 + 3 );//podemos fazer diretamente no console passando valores diretos

    //podemos tbm armazenar valores em variáveis

    var x = 34.56;
    double y  = 2.2;

    System.out.println(x + y);
    System.out.println(x - y);
    System.out.println(x * y);
    System.out.println(x / y);

    int a  = 8;
    int b = 3;

    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(a / (double) b);//aqui fazendo um casting para transformar o resultado em double

    System.out.println(a % b);// operador módulo mostar o resto de uma divisão.
  }
}
