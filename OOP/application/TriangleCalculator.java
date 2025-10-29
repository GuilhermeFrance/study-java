package OOP.application;

import OOP.entities.TriangleEntity;
import java.util.*;

public class TriangleCalculator {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        TriangleEntity x, y;

        x = new TriangleEntity();
        y = new TriangleEntity();

        System.out.println("Insira o lado A do triangulo X");
        x.sideA = sc.nextDouble();
        System.out.println("Insira o lado B do triangulo X");
        x.sideB = sc.nextDouble();
        System.out.println("Insira o lado C do triangulo X");
        x.sideC = sc.nextDouble();

        System.out.println("Insira o lado A do triangulo Y");
        y.sideA = sc.nextDouble();
        System.out.println("Insira o lado B do triangulo Y");
        y.sideB = sc.nextDouble();
        System.out.println("Insira o lado C do triangulo Y");
        y.sideC = sc.nextDouble();

        sc.close();

        double p = (x.sideA + x.sideB + x.sideC) / 2;
        double AreaX = Math.sqrt(p * (p - x.sideA) * (p - x.sideB) * (p - x.sideC));

        p = (y.sideA + y.sideB + y.sideC) / 2;
        double AreaY = Math.sqrt(p * (p - y.sideA) * (p - y.sideB) * (p - y.sideC));

        System.out.println("Area do trinagulo X: " + AreaX);
        System.out.println("Area do trinagulo Y: " + AreaY);

        if (AreaX > AreaY) {
            System.out.println("A area do triangulo X e maior");
        } else {
            System.out.println("A area do triangulo Y e maior");
        }
    }
}
