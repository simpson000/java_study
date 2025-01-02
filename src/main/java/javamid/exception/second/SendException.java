package javamid.exception.second;

public class SendException extends NetworkClientExceptionV2{

    private final String sendData;

    public SendException(String sendData,String message) {
        super(message);
        this.sendData = sendData;
    }
    public String getSendData() {
        return sendData;
    }
}
