import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		System.out.println("Enter product data");
		
		System.out.print("Name: ");
		product.setName(sc.next());
		
		
		System.out.print("Price: ");
		product.setPrice(sc.nextDouble());
		
		System.out.print("Quantity in stock: ");
		product.setQuantity(sc.nextInt());
		
		System.out.println(product);
//		System.out.printf("Product data: %s, $%.2f, %d units, Total: $%.2f", product.getName(), product.getPrice(), product.getQuantity(), product.TotalValueInStock());
		
		System.out.println();
		
		System.out.println("Enter the number of products to be added in stock: ");
		product.AddProducts(sc.nextInt());
		
		System.out.printf("Updated data: " + product);
		
		System.out.println();
		
		System.out.println("Enter the number of products to be removed from stock: ");
		product.RemoveProducts(sc.nextInt());
		
//		System.out.println();
		
		System.out.printf("Updated data: " + product);		
		
		sc.close();
		
		
	}

}
