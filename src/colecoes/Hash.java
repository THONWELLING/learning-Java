package colecoes;

import java.util.HashSet;

public class Hash {
  public static void main(String[] args) {
    HashSet<Usuario> usuarios = new HashSet<>();
    usuarios.add(new Usuario("Pedro"));
    usuarios.add(new Usuario("PedroAna"));
    usuarios.add(new Usuario("PedroPedro"));
    usuarios.add(new Usuario("PedroEster"));

    boolean resultado = usuarios.contains(new Usuario("PedroAna"));
    System.out.println(resultado);
  }
}
