package OOP.entities;

public class ProductVector {
    private String name;
    private double price;

    public ProductVector(String name, double price) {
        this.name = name;
        this.price = price;
    }
     public ProductVector() {
        
    }
    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setPrice(double newName) {
        this.price = newName; 
    }
}
