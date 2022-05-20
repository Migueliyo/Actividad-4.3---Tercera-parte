package helpers;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Fechas {
    public static String convertirFormatoFechaEspannol(LocalDate localDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedString = localDate.format(formatter);
        return formattedString;
    }
}
