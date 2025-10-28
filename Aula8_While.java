import java.util.*;

public class Aula8_While {

    public static void main(String[] args) {
        System.out.println("Insira um número:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int acumulator = 0;
        while( x != 0){
            
            System.out.println("Insira mais um número:");
             acumulator += x;
             x = sc.nextInt();
        }
         sc.close();
         System.out.println("A soma dos números inseridos é = " + acumulator );
    }
}