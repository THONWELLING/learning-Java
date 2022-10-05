package ClassesEMetodos;

public class DataTeste {
  public static void main(String[] args) {
    Data d1 = new Data();
    d1.dia = 31;
    d1.mes = 12;
    d1.ano = 1985;

    System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);

    Data d2 = new Data();
    d2.dia = 02;
    d2.mes = 11;
    d2.ano = 1985;

    System.out.printf("%d/%d/%d\n", d2.dia, d2.mes, d2.ano);
  }
}
