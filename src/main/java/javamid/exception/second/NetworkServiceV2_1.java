package javamid.exception.second;



public class NetworkServiceV2_1 {
    public  void sendMessage(String msg) {
        String address = "https:://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(msg);


        try {
            client.connect();
            client.send(msg);
        } catch (ConnectException e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " +
                    e.getMessage());
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[네트워크오류] 전송 데이터: " + ", 메시 지: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("[알수 없는 메시지]"+e.getMessage());
        }
        finally {
            client.disconnect();
        }

    }
}
