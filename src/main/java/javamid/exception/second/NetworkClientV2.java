package javamid.exception.second;


public class NetworkClientV2 {

    private final String address;
    public boolean connectError;
    public boolean sendError;


    public NetworkClientV2(String address) {
        this.address = address;

    }

    public void connect()throws ConnectException {
        if (connectError){
            throw new ConnectException(address,address+"서버연결실패");
        }
        System.out.println(address+"서버에 연결 성공");
    }
    public void send (String msg) throws SendException {
        if (sendError){
            throw new SendException(msg,address+ "서버 전송 실패"+msg);
        }
        System.out.println(address + "서버에 데이터 전송: " + msg);
    }

    public void disconnect(){
        System.out.println(address + "서버 해제");
    }

    public void initError(String msg){
        if (msg.contains("error1")) {
            connectError = true;
        }
        if (msg.contains("error2")) {
            sendError = true;
        }
    }
}
