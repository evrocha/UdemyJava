
public class Employee {
	
	private String Name;
	private double GrossSalary;
	private double Tax;
	
	// salario liq
	public double NetSalary() {
	return GrossSalary - Tax;
	}
	
	

	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public double getGrossSalary() {
		return GrossSalary;
	}



	public void setGrossSalary(double grossSalary) {
		GrossSalary = grossSalary;
	}



	public double getTax() {
		return Tax;
	}



	public void setTax(double tax) {
		Tax = tax;
	}



	public void IncreaseSalary(double percentage) {
		GrossSalary = GrossSalary + GrossSalary* percentage/100;
	}
	
	@Override
	public String toString() {
		return "Employee: " + getName() + " $ " + getGrossSalary();
	}
}
