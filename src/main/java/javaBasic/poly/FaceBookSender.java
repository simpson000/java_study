package javaBasic.poly;

public class FaceBookSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("FaceBookSender: " + message);
    }
}
