import java.util.Locale;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de n");
		 int n = sc.nextInt();
		 // os colchetes indicam o vetor
		 						// tamanho doo vetor de n eklementos
		 double [] vect = new double[n];
		 
		 // laço que enquanto o contador i for menor q n rodará
		 for (int i = 0; i<n; i++) {
			 vect[i] = sc.nextDouble();
		 }
		
		 double sum =0d;
		 for (int i =0; i<n; i++) {
			 sum += vect[i];
		 }
		 double avg = sum/n;
		 System.out.printf("A média é %.2f\n", avg );
		 sc.close();
	}

}
