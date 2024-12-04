package javaBasic.poly;

public class SmsSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS: " + message);
    }
}
