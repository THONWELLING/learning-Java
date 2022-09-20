package fundamentos.Operators;

public class LogicalChallenge {
  public static void main(String[] args) {
    /*
    * O desafio é  você tem a possibilidade de pegar 2 trabalhos durante a semana.
    * Você prometeu para a sua família que, se os 2 trabalhos derem certo  você vai levar a família
    * para comprar uma tv de 50" no shopping e tomar sorvete para comemorar.
    * e também prometeu que se apenas 1 der certo os levará ao shpping para comprar uma tv 32"
    * e tomar sorvete.
    * Escreva um código que determine se foi comprada alguma tv.
    *  qual tv foi comprada
    * se a familia tomou sorvete a saída deve conter uma frase afirmando que a família tomou o sorvete
    * caso não tenham tomado a saída deve ter uma frase afirmando que estão mais saudáveis por
    * não consumirem doce. */
    //Trabalho na Terça (V ou F)
    //Trabalho na Quinta (V ou F)

    boolean job1 = true;
    boolean job2 = true;

    boolean boughtBiggerTv = job1 && job2;
    boolean boughtSmallerTv = job1 ^ job2;
    boolean gotIceCream = job1 || job2;


    System.out.println("Family bought the Bigger TV 50\"? " + boughtBiggerTv);
    System.out.println("Family bought the Smaller TV 32\"? " + boughtSmallerTv);
    System.out.println("Family Got Ice Cream ? " + gotIceCream);
    System.out.println("Family Is Healty did not get Ice Cream!!! " + !gotIceCream);
  }
}
