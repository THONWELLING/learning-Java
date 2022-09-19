package fundamentos;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class ChallengeConversion {
  public static void main(String[] args) {
    Scanner conversion = new Scanner(System.in);

    System.out.println("Enter Your Current Salary");
    String number1 = conversion.nextLine().replace(",", ".");

    System.out.println("Enter Your Last Salary");
    String number2 = conversion.nextLine().replace(",", ".");

    System.out.println("Enter The Salary Before The Last One");
    String number3 = conversion.nextLine().replace(",", ".");

   double currentSalary = Double.parseDouble(number1);
   double lastSalary = Double.parseDouble(number2);
   double thirdSalary = Double.parseDouble(number3);

   double amount = currentSalary + lastSalary + thirdSalary;
   double middle = amount / 3;

    System.out.println("Your Average Salary Is => " + middle);
  }
}
