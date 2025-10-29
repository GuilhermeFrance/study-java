package OOP.application;

import OOP.entities.ProductEntity;
import java.util.*;

public class ProductStock {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            int added;
            int removed;
            String resp;
            
            ProductEntity product = new ProductEntity();
            System.out.print("Enter the product name: ");
            product.name = sc.nextLine();
            System.out.print("Enter the product price: ");
            product.price = sc.nextDouble();
            System.out.print("Enter the product quantity: ");
            product.quantity = sc.nextInt();
            
            System.out.println(product);
            
            System.out.println("Do you want to add or remove product quantity in stock? (add/remove/n)");
            resp = sc.next();
            if("add".equals(resp)){
                System.out.print("Enter the number of products to be added in stock: ");
                added = sc.nextInt();
                product.addProducts(added);
                System.out.println("Added " + added + " "  + product.name + " in stock;");
                System.out.println(product);
            } else if ("remove".equals(resp)){
                System.out.print("Enter the number of products to be removed in stock: ");
                removed = sc.nextInt();
                product.removeProducts(removed);
                System.out.println("Removed " + removed + " "  + product.name + " in stock;");
                System.out.println(product);
            }
        }
    }
}
