
import java.util.*;

public class Aula7_Condicionais {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String dia;
        int x;

        System.out.println("Qual o numero do dia da semana?");
        x = sc.nextInt();

        dia = switch (x) {
            case 1 -> "domingo";
            case 2 -> "segunda";
            case 3 -> "terca";
            case 4 -> "quarta";
            case 5 -> "quinta";
            case 6 -> "sexta";
            case 7 -> "sabado";
            default -> "valor invalido";
        };
        System.out.println("Hoje e " + dia);
        // forma efetiva
        switch (x) {
            case 1:
                dia = "domingo";
            break;
              case 2:
                dia = "segunda";
            break;
              case 3:
                dia = "terca";
            break;
              case 4:
                dia = "quarta";
            break;
              case 5:
                dia = "quinta";
            break;
              case 6:
                dia = "sexta";
            break;
              case 7:
                dia = "sabado";
            break;
            default:
                dia = "valor invalido";
        }
        System.out.println("Hoje e " + dia);
        sc.close();
    }
}
