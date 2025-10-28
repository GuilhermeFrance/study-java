

public class Aula4_Funcoes {
    public static void main(String[] args) {
        // Funcoes: sqrt,pow,abs 
        double x = 3.5;
        double y = 4.0;
        double z = 5.0;
        double A,B,C;

        System.err.println("RAIZ QUADRADA");
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25);
        System.err.println(" A raiz quadrada de " + x + " = " + A);
        System.err.println(" A raiz quadrada de " + y + " = " + B);
        System.err.println(" A raiz quadrada de " + 25 + " = " + C);

        System.err.println("POTENCIACAO");
        A = Math.pow(x,y);
        B = Math.pow(y, 2);
        C = Math.pow(z, 3);   
        System.err.println(x + " elevado a " + y + " = " + A);
        System.err.println(y + " elevado a " + 2 + " = " + B);
        System.err.println(z + " elevado a " + 3 + " = " + C);

        System.err.println("NUMERO ABSOLUTO");
        A = Math.abs(x);
        B = Math.abs(-5.0);
        System.err.println("O numero absoluto de " + x + " = " + A);
        System.err.println("O numero absoluto de " + -5.0 + " = " + B);

 
     
    }
}
