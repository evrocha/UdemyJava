
public class Product {
	private String name;
	private double price;
	private int quantity;
	
	/////
	public double TotalValueInStock() {
		return quantity*price;	
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;   
	}
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
		// PARA REFERENCIAR O ATRIBUTO DA CLASSE, USA-SE O THIS. REFEFRENCIA O OBJETO
		
	}
	
	///////////
	public String getName() {
		return name;	
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
	return "Product data: " + getName() + ", $" + String.format("%.2f", getPrice()) +" , " + getQuantity() + " units," + " Total: $" + String.format("%.2f", TotalValueInStock()) ; 
	}
	
	
	
	
	
}
