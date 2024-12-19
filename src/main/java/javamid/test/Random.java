package javamid.test;

public class Random {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        int[] generate = lotto.generate();

        System.out.println("lotto: " );
        for (int i : generate) {
            System.out.print(i+" ");
        }
    }
}
