package oo.encapsulamento;

public class PessoaTeste {
  public static void main(String[] args) {

    Pessoa pessoa1 = new Pessoa();
    pessoa1.setIdade(30);

    System.out.println("A Idade é " + pessoa1.getIdade());
  }
}
