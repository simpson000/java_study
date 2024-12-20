package javamid.time;

import java.time.LocalDateTime;

public class Problem1 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime future = now.plusYears(1).plusMonths(2).plusDays(1).minusHours(4);
        System.out.println("future = " + future);
    }
}
