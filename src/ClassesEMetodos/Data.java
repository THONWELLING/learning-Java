package ClassesEMetodos;

/*            DESAFIO CLASSE DATA
* Crie uma classeque contenh 3 atributos (dia, mês e ano.
* Crie uma classe DataTeste que vai conter o método main e instâncie 2 datas
* ex: 31/12/1985  e  02/11/1985)*/

public class Data {
  int dia;
  int mes;
  int ano;

  /*Desafio construtor
  * Este desafio consiste em criar o contrutor padrão e também um constyrutor que recebe parâmetros
  * quando o construtor padrão for chamado ele vai retornar a data 01/01/1970.
  *
  * */

  Data() {
    dia = 1;
    mes = 1;
    ano = 1970;
  }

  Data(int diaInicial, int mesInicial, int anoInicial) {
    dia = diaInicial;
    mes = mesInicial;
    ano = anoInicial;
  }

  /*Desafio Método
  * Este desafio consiste em criar um método que retorne a data já formatada
  * */
  String obterDataFormatada() {
    return String.format("%d/%d/%d\n", dia, mes, ano);
  }
}
