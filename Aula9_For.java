import java.util.*;

public class Aula9_For {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número:");
        int x = sc.nextInt();
        int soma = 0;
        for(int i = 0; i < x; i++){
            System.out.println("Insira um número:");
            int y = sc.nextInt();
            soma += y;
            
        }
        System.out.println("A soma dos números é = " + soma);
        sc.close();
    }
}