package javamid.exception.first;

public class NetworkClientV1 {

    private final String address;
    public boolean connectError;
    public boolean sendError;


    public NetworkClientV1(String address) {
        this.address = address;

    }

    public String connect(){
        if (connectError){
            System.out.println( address+"서버 연결 실패");
            return "connectError";
        }
        System.out.println(address+"서버에 연결 성공");

        return "success";
    }
    public String send(String msg){
        if (sendError){
            System.out.println(address+ "서버 전송 실패"+msg);
            return "sendError";
        }
        System.out.println(address + "서버에 데이터 전송: " + msg);
        return "success";

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
