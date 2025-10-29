
public class Aula011_String_Functions {

    public static void main(String[] args) {

        String original = "Essa string foi feita para testar as funcoes para string   ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(0, 21);
        String s06 = original.replace('a', 'x');
        int s07 = original.indexOf("string");
        int s08 = original.lastIndexOf("string");

        String[] vect = original.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];
        String word4 = vect[3];
        String word5 = vect[4];
        String word6 = vect[5];
        String word7 = vect[6];
        String word8 = vect[7];
        String word9 = vect[8];
        String word10 = vect[9];

        System.out.println("toLowerCase:" + "(" + s01 + ")");
        System.out.println("toUpperCase:" + "(" + s02 + ")");
        System.out.println("Trim:" + "(" + s03 + ")");
        System.out.println("substring (um parametros):" + "(" + s04 + ")");
        System.out.println("substring (dois parametros):" + "(" + s05 + ")");
        System.out.println("replace:" + "(" + s06 + ")");
        System.out.println("indexOf ( indice do primeiro registro):" + "(" + s07 + ")");
        System.out.println("indexOf ( indice do ultimo registro):" + "(" + s08 + ")");
        System.out.println("Primeira palavra: " + word1);
        System.out.println("Segunda palavra: " + word2);
        System.out.println("Terceira palavra: " + word3);
        System.out.println("Quarta palavra: " + word4);
        System.out.println("Quinta palavra: " + word5);
        System.out.println("Sexta palavra: " + word6);
        System.out.println("Setima palavra: " + word7);
        System.out.println("Oitava palavra: " + word8);
        System.out.println("Nona palavra: " + word9);
        System.out.println("Decima palavra: " + word10);
    }
}