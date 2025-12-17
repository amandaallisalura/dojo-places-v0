package br.com.alura.dojoplaces.utils;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    public static String daysSinceLastUpdate(LocalDateTime lastUpdate) {
        long days = Duration.between(lastUpdate, LocalDateTime.now()).toDays();

        if (days == 0) {
            return "Atualizado hoje";

        } else if (days == 1) {
            return "1 dia atrás";
        } else {
            return days + " dias atrás";
        }
    }

    public static String formattedDate(LocalDateTime localDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return localDateTime.format(formatter);
    }
}
