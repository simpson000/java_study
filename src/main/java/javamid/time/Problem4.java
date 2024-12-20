package javamid.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Problem4 {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;
        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(dayOfWeek);
        DayOfWeek lastDayOfWeek = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        System.out.println(lastDayOfWeek);

    }
}