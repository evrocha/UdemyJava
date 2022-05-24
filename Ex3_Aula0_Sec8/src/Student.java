
public class Student {
	
	private String Name;
	private double N1, N2, N3;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getN1() {
		return N1;
	}
	public void setN1(double n1) {
		N1 = n1;
	}
	public double getN2() {
		return N2;
	}
	public void setN2(double n2) {
		N2 = n2;
	}
	public double getN3() {
		return N3;
	}
	public void setN3(double n3) {
		N3 = n3;
	}
	
	public double NotaFinal() {
		return getN1() + getN2() + getN3();
	}

	
	public double missingPoints() {
		if (NotaFinal()<60) {
			return 60.0 - NotaFinal();
		}
		else {
			return 0.0;
		}
	}
}
