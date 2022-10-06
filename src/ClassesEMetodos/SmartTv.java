package ClassesEMetodos;


/*
* Vamos criar um exemplo de uma classe par representa uma SmartTv onde:
* Ela tenha caracteristicas: ligada(boolean), canal(int) e volume(int)
* Nossa Tv poderá ligar e desligar e assim mudar o estado ligada
* Nossa Tv aumenterá e diminuirá o volume  sempre em  +1 ou -1
* Nossa Tv poderá mudar de canal de 1 em 1 ou definindo o número correspondente
* */
public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void ligar() {
    ligada = true;
  }

  public void desligar() {
    ligada = false;
  }

  public void aumentarVolume() {
    volume++;
  }

  public void diminuirVolume() {
    volume--;
  }
  public void aumentarCanal() {
    canal++;
  }
  public void diminuirCanal() {
    canal--;
  }

  public void definirCanal(int novoCanal) {
    canal = novoCanal;
  }
}
