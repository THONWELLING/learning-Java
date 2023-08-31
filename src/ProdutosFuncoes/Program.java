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

    System.out.println();
    System.out.println("Product Data: " + product);

    System.out.println();
    System.out.println("Enter The Number Of Products To  Be Added In Stock: ");
    int quantity = input.nextInt();
    product.addProduct(quantity);
    System.out.println();
    System.out.println("Product Updated: " + product);

    System.out.println();
    System.out.println("Enter The Number Of Products To  Be Removed In Stock: ");
    quantity = input.nextInt();
    product.removeProduct(quantity);
    System.out.println();
    System.out.println("Product Updated: " + product);
  }
}
