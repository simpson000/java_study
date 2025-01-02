package javamid.exception.second;

public class ConnectException extends NetworkClientExceptionV2 {
    private final String address;

    public ConnectException(String message, String address) {
        super(message);
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
}
