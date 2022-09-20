package fundamentos.Operators;

public class Logical {
  public static void main(String[] args) {
    boolean condition1 = true;
    boolean condition2 = 3 > 7;
    System.out.println(condition1 && condition2);// operador lógico E
    System.out.println(condition1 && !condition2);// operador lógico E
    System.out.println(condition1 || condition2);// operador lógico OU
    System.out.println(condition1 ^ condition2);//operador lógico EExclusivo
    System.out.println(!condition1);//negação lógica
    System.out.println(!condition2);

    //tabela verdade E (&&)
    System.out.println("Tabela Verdade E(&&)");
    System.out.println(true && true);
    System.out.println(true && false);
    System.out.println(false && true);
    System.out.println(false && false);

    //tabela verdade OU (||)
    System.out.println("Tabela Verdade OU(||)");
    System.out.println(true || true);
    System.out.println(true || false);
    System.out.println(false || true);
    System.out.println(false || false);

    //tabela verdade OU Exclusivo (^)
    System.out.println("Tabela Verdade OU Exclusivo(^)");
    System.out.println(true ^ true);
    System.out.println(true ^ false);
    System.out.println(false ^ true);
    System.out.println(false ^ false);

    //tabela verdade Negação (!antes do operando) *Obs: operadoe unário
    System.out.println("Tabela Verdade Negação(!)");
    System.out.println(!true);
    System.out.println(!false);
  }
}
