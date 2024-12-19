package javamid.test;

import java.util.Random;

public class Lotto {
    private final Random random = new Random();
    private int[] lotto;
    private int num;


    public int[] generate() {
        lotto = new int[6];
        num = 0;
        while (num < 6) {
            int number = random.nextInt(45) + 1;
            lotto[num] = number;
            num++;
        }
        return lotto;
    }
}
