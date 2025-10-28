import java.util.*;

public class Aula010_Do_While {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resp;
        do {
            System.out.print("Insira o valor em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("O valor equivalente em Fahrenheit: %.1f%n", F);
            System.out.println("Deseja repetir? (s/n)");
            resp = sc.next().charAt(0);
        } while (resp == 's');
        sc.close();
    }
}