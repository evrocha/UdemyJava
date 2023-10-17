import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product  = new Product();
        System.out.println("Enter product data:");
        System.out.println("Name: ");
        product.setName(sc.nextLine());

        System.out.println("Price: ");
        product.setPrice(sc.nextDouble());

        System.out.println("Quantity in stock: ");
        product.setQuantity(sc.nextInt());

        System.out.printf("Product data:%n");
        System.out.printf("Name: %s%n", product.getName());
        System.out.printf("Price: $ %.2f%n", product.getPrice());
        System.out.printf("Quantity: %d units%n", product.getQuantity());
        System.out.printf("Total: $ %.2f%n", product.TotalValueInStock());

        System.out.println("Enter the number of products to be added in stock: ");
        product.AddProducts(sc.nextInt());

        System.out.printf("Updated data:%n");
        System.out.printf("Name: %s%n", product.getName());
        System.out.printf("Price: $ %.2f%n", product.getPrice());
        System.out.printf("Quantity: %d units%n", product.getQuantity());
        System.out.printf("Total: $ %.2f%n", product.TotalValueInStock());


        System.out.println("Enter the number of products to be removed from stock: ");
        product.RemoveProducts(sc.nextInt());

        System.out.printf("Updated data:%n");
        System.out.printf("Name: %s%n", product.getName());
        System.out.printf("Price: $ %.2f%n", product.getPrice());
        System.out.printf("Quantity: %d units%n", product.getQuantity());
        System.out.printf("Total: $ %.2f%n", product.TotalValueInStock());



    }
}