import java.util.*;

public class Aula3_Scanners {
    public static void main(String[] args) {

        String x;
        int y;
        double z;
        char a;
        // Inputs de variaveis
        try (Scanner sc = new Scanner(System.in)) {
            System.err.println("Insira a string:");
            x = sc.next();
            System.err.println("Insira o inteiro:");
            y = sc.nextInt();
            System.err.println("Insira o double:");
            z = sc.nextDouble();
            System.err.println("Insira o caractere:");
            a = sc.next().charAt(0);
        }
        System.out.printf("Voce digitou: %s, %d, %.2f, %c %n", x, y, z, a);

    }
}
