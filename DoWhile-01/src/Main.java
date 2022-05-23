import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Transformador de temperatura: ");
		
		System.out.println();
		char op;
	do{
			System.out.println("Digite a temperatura em Celsius: ");
			Locale.setDefault(Locale.US);
			double C = scanner.nextDouble();
			
			
			double F = (9*C)/5 + 32;
			System.out.println("Calculando...");
			System.out.printf("Equivalente em Fahrenheint: %.2f%n" , F);
		
			System.out.println("Quer calcular novamente?");
			System.out.println("s/n");
			
			 op = scanner.next().charAt(0);
		} while(op == 's') ;
			System.out.println("OK");
		
		
		
		
		
		
	}

}
