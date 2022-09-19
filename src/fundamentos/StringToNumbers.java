package fundamentos;

import javax.swing.*;

public class StringToNumbers {
  public static void main(String[] args) {
    String value1 = JOptionPane.showInputDialog(
        "Tip The First Number");

    String value2 = JOptionPane.showInputDialog(
        "Tip The Second Number");
    System.out.println(value1 + value2);

    double number1 = Double.parseDouble(value1);
    double number2 = Double.parseDouble(value2);

    double sum = number1 + number2;
    System.out.println("A Soma é => " + sum);
    System.out.println("A Média é => " + sum / 2);
  }
}
