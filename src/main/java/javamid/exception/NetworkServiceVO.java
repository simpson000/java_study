package javamid.exception;

public class NetworkServiceVO {
    public  void sendMessage(String msg){
        String address = "https:://example.com";

        NetworkClientVO client = new NetworkClientVO(address);
        client.connect();
        client.send(address);
        client.disconnect();
    }
}
