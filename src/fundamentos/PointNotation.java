package fundamentos;

public class PointNotation {
  public static void main(String[] args) {

    String s =  "Bom dia Thon";
    s = s.replace("Thon", "DaniThon");
    s = s.toUpperCase();
    s = s.concat("!!!");
    //s.concat("!!!");// Decararmos diretamente não vaiapresentar o resultado esperado
    System.out.println(s);
    /*
    * Notamos que em JAVA não podemos atribuir diretamente um método com (.)
    * Precisamos declarar e a variável que está sendo implementada receberá o valor que ela
    * já tem ++ a notação (.) algum método*/
  }
}
