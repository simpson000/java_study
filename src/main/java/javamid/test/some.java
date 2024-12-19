package javamid.test;

public class some {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        long sum = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000_000; i++) {
            sum += i;
        }
        endTime = System.currentTimeMillis();
    }
}
