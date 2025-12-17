package br.com.alura.dojoplaces.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

class DateUtilsTest {

    @Test
    void daysSinceLastUpdate__should_return_today_when_last_update_is_today() {
        LocalDateTime now = LocalDateTime.now().minusHours(2);

        String daysSinceLastUpdate = DateUtils.daysSinceLastUpdate(now);
        Assertions.assertEquals("Atualizado hoje", daysSinceLastUpdate);
    }

    @Test
    void daysSinceLastUpdate__should_return_1_dia_atras_when_last_update_is_yesterday() {
        LocalDateTime now = LocalDateTime.now().minusDays(1);
        String daysSinceLastUpdate = DateUtils.daysSinceLastUpdate(now);
        Assertions.assertEquals("1 dia atrás", daysSinceLastUpdate);
    }

    @Test
    void daysSinceLastUpdate__should_return_days_since_last_update() {
        LocalDateTime now = LocalDateTime.now().minusDays(2);
        String daysSinceLastUpdate = DateUtils.daysSinceLastUpdate(now);
        Assertions.assertEquals("2 dias atrás", daysSinceLastUpdate);

    }

    @Test
    void shouldFormatDateCorrectly() {
        LocalDateTime date = LocalDateTime.of(2025, 1, 15, 10, 30);
        String formatted = DateUtils.formattedDate(date);
        Assertions.assertEquals("15/01/2025", formatted);
    }
}