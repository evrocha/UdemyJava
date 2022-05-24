import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.setName(sc.nextLine());
		
		System.out.println("Gross Salary: ");
		employee.setGrossSalary(sc.nextDouble());
	
		System.out.println("Tax: ");
		employee.setTax(sc.nextDouble());
		
		System.out.println("Employee: " + employee.getName() +", $"+ employee.NetSalary());
	
		System.out.println("Which percentage to increase salary?");
		employee.IncreaseSalary(sc.nextDouble());
		
		System.out.println("Upadated data: " + employee.getName() +", $"+ employee.NetSalary());
		sc.close();
	}

}
