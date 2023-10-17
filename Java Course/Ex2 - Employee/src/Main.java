import entities.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Scanner sc = new Scanner(System.in);

        System.out.println("Name");
        employee.setName(sc.nextLine());
        System.out.println("Gross Salary");
        employee.setGrossSalary(sc.nextDouble());
        System.out.println("Tax");
        employee.setTax(sc.nextDouble());

        System.out.println("Employee: " + employee);

        System.out.println("Which percentage to increase salary?");
        employee.IncreaseSalary(sc.nextDouble());

        System.out.println("Updated data:");
        System.out.println("Employee: " + employee);

    }
}