package fundamentos;

public class arithimeticChallenge {
  public static void main(String[] args) {
    /*Aqui está a operação  aritimética que vamos resolver usando java
    *
    * ([6 * (3 + 2)]² / 3 * 2  - ((1 - 5) * (2 - 7) / 2)² )³ / 10³
    * */

    double numA = Math.pow(6 * (3 + 2),2);
    double denA = 3 * 2;
    double numB = (1 - 5) * (2 - 7);
    double denB = 2;

    double supA = numA / denA;
    double supB = Math.pow(numB / denB, 2);

    double superior = Math.pow(supA - supB, 3);
    double inferior = Math.pow(10, 3);

    double result = superior / inferior;
    System.out.println("The Result is => " + result);
  }
}
