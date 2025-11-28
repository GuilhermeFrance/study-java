// UTILIZAÇÃO DE MEMBROS ESTÁTICOS



import java.util.*;
import OOP.entities.CurrencyConverter;

public class ConverterDollarRS {
    
    public static void main(String[] args) {
        double dolar;
        double valor;
        try(Scanner sc = new Scanner(System.in)){
            System.out.printf("Qual o valor do dólar atualmente? ");
            valor = sc.nextDouble();
            System.out.printf("Quantos dólares você deseja comprar?");
            dolar = sc.nextDouble();
            double t = CurrencyConverter.convert(valor, dolar);
            System.out.printf("Sem taxas você pagaria: R$ %.2f%n", t);
            double s = CurrencyConverter.getIOF(valor, dolar);
            System.out.printf("Incluindo 6%% de IOF que é adicionado: R$ %.2f%n", s);
        }

    }
}
