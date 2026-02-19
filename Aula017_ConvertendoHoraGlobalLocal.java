import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Aula017_ConvertendoHoraGlobalLocal{
    public static void main(String[] args){

        LocalDate d01 = LocalDate.parse("2022-07-22");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-22T01:30:26");
        Instant d03 = Instant.parse("2022-07-22T02:40:32Z");


        //Timezone Local
        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());

        //Timezone Portugal
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

//        Função que trás timezones disponíveis ->
//        for (String s: ZoneId.getAvailableZoneIds()){
//            System.out.println(s);
//        }

        //Getters
        System.out.println("d01 dia = "+ d01.getDayOfMonth());
        System.out.println("d01 mês = "+ d01.getMonth());
        System.out.println("d01 ano = "+ d01.getYear());

        System.out.println("d02 hora = "+ d02.getHour());
        System.out.println("d02 minuto = "+ d02.getMinute());
    }
}