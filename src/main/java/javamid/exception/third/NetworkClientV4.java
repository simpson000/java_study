package javamid.exception.third;



public class NetworkClientV4 implements AutoCloseable{

    private final String address;
    public boolean connectError;
    public boolean sendError;


    public NetworkClientV4(String address) {
        this.address = address;

    }

    public void connect() {
        if (connectError){
            throw new ConnectException4(address,address+"서버연결실패");
        }
        System.out.println(address+"서버에 연결 성공");
    }
    public void send (String msg)  {
        if (sendError){
            throw new SendExceptionV4(msg,address+ "서버 전송 실패"+msg);
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

    @Override
    public void close()  {
        System.out.println("NetworkClient");
        disconnect();
    }
}
