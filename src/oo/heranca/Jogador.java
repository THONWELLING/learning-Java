package oo.heranca;

public class Jogador {
  int vida = 100;
  int x;
  int y;

  boolean atacar(Jogador oponente) {

    int diferencaX = Math.abs(x - oponente.x);
    int diferencaY = Math.abs(y - oponente.y);

    if (diferencaX == 0 && diferencaY ==1) {
      oponente.vida -= 10;
      return true;
    } else if (diferencaX == 1 && diferencaY == 0) {
      oponente.vida -= 10;
      return true;
    } else {
        return false;
    }
  }
  boolean andar(Direcao direcao) {

    switch(direcao) {
      case NORTE :
        y--;
        break;
      case LESTE:
        x++;
        break;
      case SUL:
        y++;
        break;
      case OESTE:
        x--;
        break;
    }

    return true;
  };
}
