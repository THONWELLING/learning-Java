package ClassesEMetodos;

import java.util.Objects;

public class Usuario {
  String nome;
  String email;

  //implementando o iequals e o hashcode
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Usuario usuario = (Usuario) o;
    return Objects.equals(nome, usuario.nome) && Objects.equals(email, usuario.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, email);
  }
}
