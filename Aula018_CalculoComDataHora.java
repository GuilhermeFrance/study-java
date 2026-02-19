import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Aula018_CalculoComDataHora {
    public static void main(String[] args){
        LocalDate d01 = LocalDate.parse("2022-07-22");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-22T01:30:26");
        Instant d03 = Instant.parse("2022-07-22T02:40:32Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);


        System.out.println("Original local date = "+ d01);
        System.out.println("pastWeekLocalDate = "+ pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = "+ nextWeekLocalDate);

        //LocalDateTime segue mesma lógica

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("Original instant date = "+ d01);
        System.out.println("pastWeekInstant = "+ pastWeekInstant);
        System.out.println("nextWeekInstant = "+ nextWeekInstant);

        Duration t1 = Duration.between(pastWeekInstant, nextWeekInstant);
        System.out.println("Duration between: "+ pastWeekInstant + " and " + nextWeekInstant + " = " + t1.toDays());

        Duration t2 = Duration.between(pastWeekInstant, nextWeekInstant);
    }
}