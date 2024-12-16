package javamid.object;

public class MyDate {

    private final int year;
    private final int month;
    private final int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public MyDate setYear(int year) {
        return new MyDate(year, month, day);
    }

    public MyDate setMonth(int month) {
        return new MyDate(year, month, day);
    }

    public MyDate setDay(int day) {

        return new MyDate(year, month, day);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }

    public void withYear(int i) {
        
    }
}