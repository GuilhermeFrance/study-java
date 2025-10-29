package OOP.entities;

public class ProductEntity {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString(){
        return "Name: "+ name + " - Price: "+ String.format("%.2f", price) + " - Quantity: "+ quantity +" - Total Value: " + String.format("%.2f", totalValueInStock());
    }
}
