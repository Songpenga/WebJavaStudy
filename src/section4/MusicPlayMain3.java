package section4;

//메서드 추출 -- 메모 2502130352
public class MusicPlayMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        //음악 풀레이어 켜기
        onVol(data);

        //볼륨 증가
        volUp(data);
        volUp(data);

        //볼륨 감소
        volDown(data);

        //음악 플레이어 상태
        showStatus(data);

        //플레이어 끄기
        offVol(data);

        //음악 플레이어 상태
        showStatus(data);
    }

    static void onVol(MusicPlayerData data){
        data.on = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void offVol(MusicPlayerData data){
        data.on = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volUp(MusicPlayerData data){
        data.vol++;
        System.out.println("음악 플레이어 볼륨 : " + data.vol);
    }

    static void volDown(MusicPlayerData data){
        data.vol--;
        System.out.println("음악 플레이어 볼륨 : " + data.vol);
    }

    static void showStatus(MusicPlayerData data){
        System.out.println("음악 플레이어 상태 확인");
        if(data.on){
            System.out.println("음악 플레이어 ON, 볼륨 : " + data.vol);
        }else {
            System.out.println("음악 플레이어 off");
        }
    }
}
