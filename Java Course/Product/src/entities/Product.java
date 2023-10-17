package entities;
public class Product {
    private String name;
    private double price;
    private int quantity;

    public double TotalValueInStock(){
        return price * quantity;
    }

    public double AddProducts(int quantity){
        return this.quantity += quantity;
    }

    public double RemoveProducts(int quantity){
        return this.quantity -= quantity;

    }

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
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
