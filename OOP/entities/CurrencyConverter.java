// UTILIZAÇÃO DE MEMBROS ESTÁTICOS


package OOP.entities;

public class CurrencyConverter {
    public static double convert(double valor, double dolar){
        return valor * dolar;
    }
    public static double getIOF(double valor, double dolar){
        return (valor*dolar) + (0.06 * (valor*dolar));
    }

}
