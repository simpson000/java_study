package javamid.exception;

public class NetworkClientVO {

    private final String address;

    public NetworkClientVO(String address) {
        this.address = address;

    }

    public String connect(){
        System.out.println(address+"서버에 연결 성공");

        return "success";
    }
    public String send(String msg){
        System.out.println(address + "서버에 데이터 전송: " + msg);
        return "success";

    }

    public void disconnect(){
        System.out.println(address + "서버 해제");
    }
}
