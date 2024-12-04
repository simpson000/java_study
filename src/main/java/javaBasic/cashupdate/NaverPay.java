package javaBasic.cashupdate;

public class NaverPay implements Pay {


    @Override
    public boolean pay(int amount) {
        System.out.println("NaverPay");
        System.out.println(amount + "원 결제 시도합니다");
        return true;
    }
}
