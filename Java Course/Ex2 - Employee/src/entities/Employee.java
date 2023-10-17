package entities;

public class Employee {
    private String Name;
    private double GrossSalary;
    private double Tax;

    public double NetSalary(){
        // Salário liquido
       return this.getGrossSalary() - this.getTax();
    }

    public double IncreaseSalary(double percentage){
        // Salário liquido
        return GrossSalary += (GrossSalary * (percentage/100));
    }


    @Override
    public String toString() {
        return getName() + " , $ " + String.format("%.2f", NetSalary());
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
}
