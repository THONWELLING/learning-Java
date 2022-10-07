package ClassesEMetodos;

public class DataTeste {
  public static void main(String[] args) {
    Data d1 = new Data();
    d1.dia = 31;
    d1.mes = 12;
    d1.ano = 1985;

    System.out.println(d1.obterDataFormatada());

    Data d2 = new Data();
    d2.dia = 02;
    d2.mes = 11;
    d2.ano = 1985;

    String dataFormatada = d2.obterDataFormatada();
    System.out.printf(dataFormatada);


  }
}
