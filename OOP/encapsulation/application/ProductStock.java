
package OOP.encapsulation.application;

import java.util.*;
import OOP.encapsulation.entities.ProductEntity;

public class ProductStock {

    public static void main(String[] args) {
        char resp;
        String field;
        String newNameInfo;
        Double newPriceInfo;
        int newQuantityInfo;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ProductEntity product = new ProductEntity("TV", 9.000, 5);
        System.out.println(" - - - - - - - - - - - - - - - - ");
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());
        System.out.println(" - - - - - - - - - - - - - - - - ");
        System.out.println(product.showProduct());
        System.out.println("Deseja fazer alguma alteracao? (s/n)");
        resp = sc.next().charAt(0);
        if (resp == 's') {
            System.out.println("Qual campo voce deseja alterar? (name/price/quantity/cancel)");
            field = sc.next();
            if (field.equals("name")) {
                System.err.printf("Digite o novo nome: ");
                newNameInfo = sc.next();
                product.setName(newNameInfo);
                System.out.println(product.showProduct());
            } else if (field.equals("price")) {
                System.out.printf("Digite o novo preco: ");
                newPriceInfo = sc.nextDouble();
                product.setPrice(newPriceInfo);
                System.out.println(product.showProduct());
            } else if (field.equals("quantity")) {
                System.out.printf("Digite a nova quantidade: ");
                newQuantityInfo = sc.nextInt();
                product.setQuantity(newQuantityInfo);
                System.out.println(product.showProduct());
            } else {
                sc.close();

            }
        }

    }
}
