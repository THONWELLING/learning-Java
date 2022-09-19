package fundamentos;

public class PrimitivesTypes {
  public static void main(String[] args) {
    //Informações do fincionário

    //Tipos Numéricos inteiros

    byte yearsInInterprise = 23;  // o byte cabe um número entre -128 e 127
    short flyts = 542;  // o short cabem números até 32767
    int id = 56789; //o int cabem números até 2.147.483.647
    long flytPoints = 3_234_845_223L; //o long serve para guardar valores acima de 2.147.483.647 e
    // precisa ter a letra L ao final do número para explicitar que se trata de um long


    //Tipos numéricos reais
    float salary = 11455.44F;//o float precisa ter a letra F no final do valor
    double accumulatedSales = 2_991_797_103.01;// o double ja é padrão do java quando vamos trabalhar
    // com números reais então não necessita de declarar nenhuma letra ao final do valor

    //Tipo Booleano
    boolean areOnVacation = false; //o boolean no java somente aceita true ou false não aceita 0 1

    //Tipo Caractere
    char status = 'A';//Só aceita 1 letra

    //Dias de empresa
    System.out.println(yearsInInterprise * 365);

    //Número de Viagens
    System.out.println(flyts / 2);

    //Pontos por Real
    System.out.println(flytPoints / accumulatedSales);

    System.out.println(id + ": ganha=> " + salary);
    System.out.println("Férias? " + areOnVacation);
    System.out.println("Status do Funcionário => " + status);
  }
}
