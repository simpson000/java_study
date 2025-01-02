package javamid.exception.third;


public class ConnectException4 extends NetworkClientExceptionV4 {
    private final String address;

    public ConnectException4(String message, String address) {
        super(message);
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
}
