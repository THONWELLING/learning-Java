package controle;

public class SwitchSemBreak {
  public static void main(String[] args) {
    /*Nesse case vamos usar faixas de karatê e seus repectivos katas
    * não usaremos a palavra break .Isso quer dizer que quando a variável satisfizer um case ela não
    * vai sair do laço ela vai executar os outros cases.
    * no caso de a faixa ser preta  o karateca vai saber todos os katas
    * no caso de ser laranja vai saber  só da faixa laranja para baixo*/

    String faixa = "roxa";

    switch (faixa.toLowerCase()) {
      case "preta":
        System.out.println("Sabe o kata Bassai-Dai...");
      case"marrom":
        System.out.println("Sei o Tekki Shodan");
      case"roxa":
        System.out.println("Sei o Heian Godan");
      case"verde":
        System.out.println("Sei o Heian Yondan");
      case"laranja":
        System.out.println("Sei o Heian Sandan");
      case"vermelha":
        System.out.println("Sei o Heian Nidan");
      case"amarela":
        System.out.println("Sei o Heian Shodan");
    }
  }
}
