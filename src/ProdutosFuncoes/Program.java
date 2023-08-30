package ProdutosFuncoes;

import ProdutosFuncoes.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    Product product = new Product();
    System.out.println("Enter Product Data:");
    System.out.println("Name: ");
    product.name = input.nextLine();
    System.out.println("Price: ");
    product.price = input.nextDouble();
    System.out.println("Quantity In Stock: ");
    product.quantity = input.nextInt();

    System.out.println(product.name + "," + product.price + "," + product.quantity);
  }
}
