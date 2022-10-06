package ClassesEMetodos;

public class SmartTvUsuario {
  public static void main(String[] args) {

    SmartTv smartTv = new SmartTv();

    System.out.println("Tv ligada ? => " + smartTv.ligada);

    System.out.println("Volume Atual => " + smartTv.volume);
    System.out.println("Volume Atual => " + smartTv.volume);

    smartTv.definirCanal(13);
    System.out.println("Canal Atual => " + smartTv.canal);

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    System.out.println("Volume Atual => " + smartTv.volume);


  }
}
