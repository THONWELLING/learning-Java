package ClassesEMetodos;

public class DesafioPrimeiroTrauma {

  int a = 3;
  static int w  = 36;

  public static void main(String[] args) {
    /*O método mais é um método estático, ou seja, pertence à classe.
    * Porém, a variável a, é um membro que pertence à Instância. Sendo assim, eu só consigo acessar
    * um atributo de instância(variável a) a partir de um método de classe(main), se, antes eu criar
    * uma instância.(mesmo se eu estiver dentro da própria classe)
    * Outra forma de acessar essa variável é transforma-la em membro de classe através da palavra
    * static. Vamos fazer isso usando outra variável ex w
    * */

    DesafioPrimeiroTrauma p = new DesafioPrimeiroTrauma();
    System.out.println(p.a);// agora eu uso a minha instância para ter acesso à variável
    System.out.println(w);
  }
}
