package javaBasic;

public class MusicplayerMain {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        mp.on();
        mp.volumUp();
        mp.volumDown();
        mp.volumDown();
        mp.showStatus();
        mp.off();
    }
}
