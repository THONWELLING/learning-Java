package cpf;

public class Validation {

  public static void main(String[] args) {
    String cpf = "32476197807"; // Insira o CPF que deseja validar
    boolean isValid = validarCPF(cpf);
    if (isValid) {
      System.out.println("CPF válido");
    } else {
      System.out.println("CPF inválido");
    }
  }

  public static boolean validarCPF(String documento) {
    if (documento.length() != 11) {
      return false;
    }

    int[] digitos = new int[11];
    for (int i = 0; i < 11; i++) {
      digitos[i] = documento.charAt(i) - '0';
    }

    int digitoVerificador1 = calcularDigitoVerificador(digitos, 10);
    int digitoVerificador2 = calcularDigitoVerificador(digitos, 11); // Correção aqui

    return digitos[9] == digitoVerificador1 && digitos[10] == digitoVerificador2;
  }

  private static int calcularDigitoVerificador(int[] digitos, int pesoInicial) {
    int soma = 0;
    for (int i = 0; i < 9; i++) {
      soma += digitos[i] * (pesoInicial - i);
    }

    int resto = soma % 11;
    int digitoVerificador = (resto < 2) ? 0 : 11 - resto;
    return digitoVerificador;
  }
}