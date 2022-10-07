package ClassesEMetodos;

/*            DESAFIO CLASSE DATA
* Crie uma classeque contenh 3 atributos (dia, mês e ano.
* Crie uma classe DataTeste que vai conter o método main e instâncie 2 datas
* ex: 31/12/1985  e  02/11/1985)*/

public class Data {
  int dia;
  int mes;
  int ano;

  /*Desafio Método
  * Este desafio consiste em criar um método que retorne a data já formatada
  * */
  String obterDataFormatada() {
    return String.format("%d/%d/%d\n", dia, mes, ano);
  }
}
