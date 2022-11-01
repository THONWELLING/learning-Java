package colecoes;

import java.util.Objects;

public class Usuario {
  String nome;

  Usuario(String nome) {
    this.nome = nome;
  }

  public String toString() {
    return "Meu nome é " + this.nome + ".";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Usuario usuario)) return false;
    return nome.equals(usuario.nome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome);
  }
}
