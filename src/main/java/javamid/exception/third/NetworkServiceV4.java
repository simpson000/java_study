package javamid.exception.third;



public class NetworkServiceV4 {
    public  void sendMessage(String msg) {
        String address = "https:://example.com";




        try (NetworkClientV4 client = new NetworkClientV4(address)){
            client.initError(msg);
            client.connect();
            client.send(msg);
        }

    }
}
