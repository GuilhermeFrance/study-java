import java.util.*;
import OOP.entities.ProductVector;

public class ProductVectorProgram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sum = 0.0;

        System.out.println("Quantos produtos vão ser inseridos?");
        int n = sc.nextInt();
       
        ProductVector[] vect = new ProductVector[n];

        for (int i = 0; i < n; i++) {
            
            System.out.println("Digite o nome do produto: ");
            String name = sc.next();
            System.out.println("Digite o preço do produto: ");
            double price = sc.nextDouble();
            vect[i] = new ProductVector(name, price);
        }

        for (int i = 0; i < n; i++) {
            sum += vect[i].getPrice();
        }
         double avg = sum / n;
        System.out.printf("A soma dos preços é R$%.2f \n", sum);
        System.out.printf("A média dos preços é R$%.2f", avg);
    }
}
