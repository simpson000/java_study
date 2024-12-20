package javamid.time;

import java.time.LocalDate;

public class Problem2 {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2018, 1, 1);
        for (int i = 0; i < 5; i++) {
            LocalDate date = startDate.plusWeeks(i*2);
            System.out.println("날짜"+i+":"+date);
        }
    }
}
