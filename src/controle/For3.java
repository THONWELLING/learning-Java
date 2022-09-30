package controle;

public class For3 {
  public static void main(String[] args) {

    //Veja o exemplo abaixo de um laço for

    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }
    /*É importante frizar que a variável "i" não estará acessível fora do bloco de código
    * assossiado ao for ela não será acessível fora do escopo.
    * Tem uma forma de acessar a variável fora do escopo que seria declarando-a fora do laço for
    * */
    int j = 0;
    for (; j < 10; j++) {
      System.out.println("contagem j  " + j);
    }
    System.out.println("saiu do for...");
      System.out.println(j);

      // Usando Um for dentro do outro
    /*
    * Importante saber que ele vai executar o laço interno antes de incrementar no laço externo
    * ex: nosso código vai retornar[k=0 l=0][k=0 l=1] [0 2] [0 3] [0 4][0 5][0 6][0 7][0 8][0 9]
    * depois que ele rodar o laço interno todas as x que determinamos ele incrementa 1 no laço externo
    * [1 0][1 2][1 3][1 4][1 5][1 6][1 7][1 8][1 9] e assim sucessivamente
    * */
    for (int k = 0; k < 10; k++) {
      for (int l = 0; l < 10; l++) {
        System.out.printf("[%d %d]", k, l);
      }
      System.out.println();
    }
  }
}
