
package OOP.encapsulation.entities;


public class ProductEntity {

    private String name;
    private double price;
    private int  quantity;

    public ProductEntity() {

    }

    public ProductEntity(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public String getName(){
        return name;
    }

    public String setName(String newName){
        this.name = newName;
        return this.name;
    }

    public Double getPrice(){
        return price;
    }

    public Double setPrice(Double newPrice){
        this.price = newPrice;
        return this.price;
    }

    public int getQuantity(){
        return quantity;
    }
    public int setQuantity(int quantity){
        this.quantity = quantity;
        return this.quantity;
    }

     public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
     public String showProduct(){
        return "Name: "+ name + " - Price: "+ String.format("%.2f", price) + " - Quantity: "+ quantity +" - Total Value: " + String.format("%.2f", totalValueInStock());
    }
}
