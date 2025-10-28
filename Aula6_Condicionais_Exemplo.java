import java.util.*;

public class Aula6_Condicionais_Exemplo {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutos;
        double conta = 50.0;
        System.out.println("Informe a quantidade de minutos (se for maior que 100 sera cobrado 2,00 reais por minuto ultrapassado)");
        minutos = sc.nextInt();
        sc.close();
        if(minutos > 100){
            conta = conta + (minutos - 100) * 2.0;
        }
        System.out.printf(" O valor a ser pago = R$ %.2f%n", conta);
    


    }
}
