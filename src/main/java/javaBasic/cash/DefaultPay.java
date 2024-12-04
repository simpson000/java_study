package javaBasic.cash;

public class DefaultPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("Default Pay");
        return false;
    }
}
