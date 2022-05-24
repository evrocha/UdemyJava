import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Student student = new Student();
	System.out.println("Name:");
	student.setName(sc.nextLine());
	
	System.out.println("Digite a nota do primeiro trimestre");
	student.setN1(sc.nextDouble());
	
	System.out.println("Digite a nota do segundo trimestre");
	student.setN2(sc.nextDouble());
	
	System.out.println("Digite a nota do terceiro trimestre");
	student.setN3(sc.nextDouble());
	
	
	System.out.printf("FINAL GRADE = %.2f%n", student.NotaFinal());
	
	if (student.NotaFinal() < 60) {
		System.out.println("Failed");
		System.out.printf("MISSING %.2f POINTS %n", student.missingPoints());
	}
	else {
		System.out.println("PASS");
	}
	}
	
}
