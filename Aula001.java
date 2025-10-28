import java.util.Locale;

public class Aula001 {
    public static void main(String[] args){
        System.out.println("O numero normal:");
        double x = 10.55445;
        System.out.println(x);
        System.out.println("O numero formatado:");
        System.out.printf("%.2f%n", x);
        System.out.println("A classe formata com base nos Estados Unidos:");
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
    }
}
