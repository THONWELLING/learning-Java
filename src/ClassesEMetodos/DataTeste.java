package ClassesEMetodos;

public class DataTeste {
  public static void main(String[] args) {

    Data d1 = new Data(); // aqui retorna a data setada no método do arquivo Data
    //Para modificar algum valor  podemos declarar aqui abaixo ex vamos mudar o ano para 2024

    d1.ano = 2024;

    System.out.println(d1.obterDataFormatada());

    Data d2 = new Data(31, 12, 1985);


    String dataFormatada = d2.obterDataFormatada();
    System.out.printf(dataFormatada);


  }
}
