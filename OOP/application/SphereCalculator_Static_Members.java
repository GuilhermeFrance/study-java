
package OOP.application;


import java.util.*;
import OOP.entities.Sphere;

public class SphereCalculator_Static_Members {
    public static void main(String[] arg) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.printf("Insira o raio da esfera: ");
            double radius = sc.nextDouble();

            double c = Sphere.circumference(radius);

            double v = Sphere.volume(radius);

            System.out.printf("Circunference: %.2f%n", c);
            System.out.printf("Volume: %.2f%n", v);
            System.out.printf("PI value: %.2f%n", Sphere.PI);
        }
    }
}