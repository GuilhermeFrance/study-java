import java.util.*;

public class Aula5_Condicionais {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // if, else, else if
        
        Scanner sc = new Scanner(System.in);
        int horas;  
        
        System.err.println("Quantas horas?");
        horas = sc.nextInt();
        sc.close();
        if (horas < 12 ){
            System.out.println("Bom dia!");
        } 
        else if ( horas < 18 ) {
            System.out.println("Boa tarde!");
        }
        else System.out.println("Boa noite!");

    }
}
