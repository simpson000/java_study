package javaBasic;

public class MusicPlayer {
    int volum =0;
    boolean isOn = false;

    void on(){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }
    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 끕니다");
    }
    void volumUp(){
        volum++;
        System.out.println("음악플레이어 볼륨:" + volum);
    }
    void volumDown(){
        volum--;
        System.out.println("음악 플레이어 볼륨:"+volum);
    }
    void showStatus(){
        System.out.println("음악 플레이어 상태 확인");
        if (isOn){
            System.out.println("음악 플레이어 on , 볼륨: "+volum);
        }
        else {
            System.out.println("음악 플레이어 off , 볼륨: "+volum);
        }
    }

}
