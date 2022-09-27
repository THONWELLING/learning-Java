package fundamentos.Operators;

import java.util.Scanner;

public class desafioCalculadora {
  public static void main(String[] args) {
    /*
    * Este desafio consiste em  ler 2 números  a ser digitados pelo usuário
    * ler o símbolo da operação que ele quer exectar
    * e fazer o calculo
    * */

    //PEGANDO VALOR DAS VARIÁVEIS NO CONSOLE
    Scanner entry = new Scanner(System.in);

    System.out.println("Tip The First Number => ");
    double firstNumber = entry.nextDouble();

    System.out.println("Tip The Arithimetic Operator => ");
    String operator = entry.next();

    System.out.println("Tip TheSecond Number => ");
    double secondNumber = entry.nextDouble();


    /*LÓGICA VAMOS ATRIBUIR O RESULTADO A UMA VARIÁVEL
    * UTILIZANDO O OPERADOR TERNÁRIO VAMOS VERIFICAR QUAL FOI O OPERADOR DIGITADO PELO USUÁRIO
    * CASO O OPERADOR SEJA O DE SOMA ELE SOMARÁ OS NÚMERO E MOSTRARÁ O RESULTADO  CASO NAÕ SEJA
    * RETORNAMOS 0 E ELE PASSARÁ PARA A PROXIMA VERIFICAÇÃO COM A VARIÁVEL result INALTERADA PARA
    * QUE ELE POSSA FAZER AS PRÓXIMAS VERIFICAÇÕES.
    * NAS VERIFICAÇÕES SEGUINTES NO ULTIMO OPERANDO UTILIZAMOS A PRÓPRIA VARIÁVEL PARA QUE SE CASO
    * A VERIFICAÇÃO ANTERIOR FOR VERDADEIRA ELE JA RETORNE DIRETO O VALOR DA VARIÁVEL SEM EXECUTAR O
    * PRÓXIMO CALCULO */

    double result = "+".equals(operator) ? firstNumber + secondNumber : 0;
    result = "-".equals(operator) ? firstNumber - secondNumber : result;
    result = "*".equals(operator) ? firstNumber * secondNumber : result;
    result = "/".equals(operator) ? firstNumber / secondNumber : result;
    result = "%".equals(operator) ? firstNumber % secondNumber : result;

    //IMPRIMINDO O RESULTADO NO CONSOLE
    System.out.printf("%.3f %s %.3f = %.3f", firstNumber, operator, secondNumber, result);
  }
}
