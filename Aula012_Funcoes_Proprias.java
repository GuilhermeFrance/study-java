
public class Aula012_Funcoes_Proprias {

    public static void main(String[] args) {

        int a = 10;
        int b = 9;
        int c = 11;

        int higher = max(a, b, c);
        showResult(higher);
    }

    public static int max(int x, int y, int z){
        int aux;
        if( x > y  && x > z){
            aux = x;
        } 
        else if( y > z ){
            aux = y;
        }
        else  { aux = z; }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("O maior valor e = " + value);
    }
}