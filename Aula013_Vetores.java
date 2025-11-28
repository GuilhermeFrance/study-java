import java.util.*;

public class Aula013_Vetores {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;

        System.out.println("Quantas pessoas vão ser medidas?");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite a altura da pessoa " + i);
            vect[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;
        System.out.println("A média de altura é " + avg);

    }

}