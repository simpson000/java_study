package javamid.exception.first;


public class NetworkServiceV1_3 {
    public  void sendMessage(String msg){
        String address = "https:://example.com";

        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(msg);

        String connectResult = client.connect();
        if (isSuccess(connectResult)) {
            System.out.println("네트워크 오류 발생 오류 코드: " + connectResult);
        }
        else {
            String sendResult = client.send(msg);
            if (isSuccess(sendResult)) {
                System.out.println("네트워크 오류 발생" + sendResult);
                return;
            }
        }
        client.disconnect();
    }

    private static boolean isSuccess(String connectResult) {
        return !connectResult.equals("success");
    }
}
