import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        // 1.
        LocalDate data = LocalDate.of(2024, 1, 2);
        System.out.println("Data: " + data);

        // 2.
        LocalTime ora = LocalTime.of(13, 20);
        System.out.println("Ora: " + ora);

        // 3.
        LocalDateTime dataOra = LocalDateTime.of(2024, 1, 2, 13, 20);
        System.out.println("Data și ora: " + dataOra);

        // 4.
        ZonedDateTime dataOraZona = ZonedDateTime.of(dataOra, ZoneId.of("America/New_York"));
        System.out.println("Data, ora și zona: " + dataOraZona);

        // 5.
        ZonedDateTime dataModificata = dataOraZona.plusMinutes(1)
                .plusHours(1)
                .plusDays(1)
                .plusYears(1);
        System.out.println("Data modificată: " + dataModificata);
    }
}

