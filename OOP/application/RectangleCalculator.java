package OOP.application;

import OOP.entities.RectangleEntity;
import java.util.*;

public class RectangleCalculator {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        RectangleEntity rectangle;
        try (Scanner sc = new Scanner(System.in)) {
            rectangle = new RectangleEntity();
            System.out.print("Enter the high of rectangle: ");
            rectangle.high = sc.nextDouble();
            System.out.print("Enter the width of rectangle: ");
            rectangle.width = sc.nextDouble();
        }
        System.out.println("- - -  RECTANGLE - - -");
        System.out.println("Width: " + rectangle.width + " - High: " + rectangle.high);
        System.out.println("AREA: " + rectangle.Area());
        System.out.println("PERIMETER: " + rectangle.Perimeter());
        System.out.println("DIAGONAL: " + String.format("%.2f" ,rectangle.Diagonal()));
        System.out.println(" - - - - - - - - - - - ");

    }

}
