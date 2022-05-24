import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangle X: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();
		
		double p1 = (a+b+c)/2;
		double p2 = (d+e+f)/2;

		double area1 = Math.sqrt(p1 * (p1-a)*(p1-b)*(p1-c));
		
		double area2 = Math.sqrt(p2 * (p2-d)*(p2-e)*(p2-f));
	
		System.out.printf("Triangle X area: %.4f   ",  area1);
		System.out.println();
		System.out.printf("Triangle Y area: %.4f" , area2);

		if (area1 > area2) {
			System.out.println("Larger area: X ");
		}
		else {
			System.out.println("Larger area: Y ");
		}
	}

}
