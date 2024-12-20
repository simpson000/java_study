package javamid.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        printCalender(year,month);
    }
    public static void printCalender(int year, int month) {
        LocalDate date = LocalDate.of(year, month, 1);
        int offset = date.getDayOfWeek().getValue() % 7;  // Get initial offset

        // Print header
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Print leading spaces
        for (int i = 0; i < offset; i++) {
            System.out.print("   ");
        }

        // Print all days of the month
        while (date.getMonthValue() == month) {
            System.out.printf("%2d ", date.getDayOfMonth());

            // Print newline if it's Saturday or last day of the month
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }

            date = date.plusDays(1);
        }

        // Print final newline if not already done
        if (date.minusDays(1).getDayOfWeek() != DayOfWeek.SATURDAY) {
            System.out.println();
        }
    }
}
