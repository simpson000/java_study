package javaBasic.cashupdate;

public class PayOption {

    public Pay PayOption(String option){
        if (option.equals("kakao")) {
            KakaoPay kakaoPay = new KakaoPay();
            return kakaoPay;
        } else if (option.equals("naver")) {
            NaverPay naverPay = new NaverPay();
            return naverPay;
        } else {
            DefaultPay defaultPay = new DefaultPay();
            return defaultPay;
        }
    }

}
