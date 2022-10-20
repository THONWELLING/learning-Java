package ClassesEMetodos;

public class Equals {
  public static void main(String[] args) {

    Usuario u1 = new Usuario();
    u1.nome = "Thonwelling";
    u1.email = "test@example.com";
    Usuario u2 = new Usuario();
    u2.nome = "Thonwelling";
    u2.email = "test@example.com";

    System.out.println(u1 == u2);// saida é false porque == compara espaços de memória ou tipos primitivos
    System.out.println(u1.equals(u2));// saida é false porque equals tem o comportamento padrão igual à ==
    System.out.println(u2.equals(u1));

  }
}
