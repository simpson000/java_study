package javaBasic.cashupdate;

public class PayService {

    public void processPay(String option,int amount) {
        System.out.println("옵션: " + option + "amount:" + amount);
        PayOption payOption = new PayOption();
        Pay pay = payOption.PayOption(option);




    }

}
