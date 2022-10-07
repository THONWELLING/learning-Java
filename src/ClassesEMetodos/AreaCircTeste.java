package ClassesEMetodos;

public class AreaCircTeste {
  public static void main(String[] args) {

    AreaCirc a = new AreaCirc(10);
    System.out.println(a.area());

    AreaCirc b = new AreaCirc(10);
    b.raio = 100;
    System.out.println(b.area());
  }
}
