package section4;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

     void onVol(){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

     void offVol(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

     void volUp(){
         volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);
    }

     void volDown(){
         volume--;
        System.out.println("음악 플레이어 볼륨 : " + volume);
    }

     void showStatus(){
        System.out.println("음악 플레이어 상태 확인");
        if(isOn){
            System.out.println("음악 플레이어 ON, 볼륨 : " + volume);
        }else {
            System.out.println("음악 플레이어 off");
        }
    }
}
