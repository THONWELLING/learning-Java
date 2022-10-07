package ClassesEMetodos;

public class ValorVsReferencia {
  public static void main(String[] args) {
    double a = 2;
    double b = a; //Aqui foi feita atribuição por valor(porque temos Tipos primitivos)

    a++;
    b--;
    System.out.println(a + " " + b);

    Data d1 = new Data(02, 11, 1985);
    Data d2 = d1; //Aqui foi feita uma atribuição por referência (porque temos Objetos)

    d1.dia = 31;
    d2.mes = 12;

    System.out.println(d1.obterDataFormatada());
    System.out.println(d2.obterDataFormatada());

    /*Notamos que as impressões acima serão exatamente iguais
    *Isso porque fizemos uma atribuição por referência dizendo que d2=d1 sendo assim quando mudamo
    * qualquer valor seja d1 ou d2 as duas variáveis mudam, pois, uma é referência da outra */
  }
}
