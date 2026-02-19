import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Aula016_ManipulandoDataHora {

    public static void main(String[] args){

        //Formatando data-hora

        LocalDate d01 = LocalDate.parse("2022-07-22");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-22T01:30:26");
        Instant d03 = Instant.parse("2022-07-22T02:40:32Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;

        System.out.println("d01 = " + d01.format(fmt1));
        System.out.println("d01 = " + fmt1.format(d01));
        System.out.println("d02 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d02 = " + d02.format(fmt2));
        System.out.println("d02 = " + fmt4.format(d02));

        System.out.println("d03 = " + fmt3.format(d03));
    }
}