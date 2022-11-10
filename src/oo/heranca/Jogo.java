package oo.heranca;

public class Jogo {
  public static void main(String[] args) {

    Vilao vilao = new Vilao();
      vilao.x = 10;
      vilao.y = 20;

    Heroi heroi = new Heroi();
      heroi.x = 10;
      heroi.y = 21;

    System.out.println("Vida Vilão => " + vilao.vida);
    System.out.println("Vida Herói => " + heroi.vida);

    System.out.println("Jogador 1 ataca heroi");
    vilao.atacar(heroi);
    heroi.atacar(vilao);

    vilao.atacar(heroi);
    heroi.atacar(vilao);

    vilao.andar(Direcao.NORTE);

    System.out.println("Vida do Vilão após o ataque => " + vilao.vida);
    System.out.println("Vida do Herói após o ataque => " + heroi.vida);
  }
}
