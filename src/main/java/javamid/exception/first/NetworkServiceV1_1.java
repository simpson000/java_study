package javamid.exception.first;


public class NetworkServiceV1_1 {
    public  void sendMessage(String msg){
        String address = "https:://example.com";

        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(msg);


        client.connect();
        client.send(msg);
        client.disconnect();
    }
}
