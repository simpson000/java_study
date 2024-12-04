package javaBasic.cashupdate;

public class KakaoPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("Kakao Pay");
        System.out.println(amount + "원 결제 시도합니다");
        return true;
    }
}
