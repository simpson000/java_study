package javamid.time;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Problem3 {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2018, 1, 1);
        LocalDate endDate = LocalDate.of(2018, 12, 31);

        System.out.println("startDate = " + startDate);
        System.out.println("endDate = " + endDate);

        Period period = Period.between(startDate, endDate);
        Long dayBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("Period = " + period);

        System.out.println("period.getDays() = " + dayBetween);
    }
}
