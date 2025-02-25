package section4;

//메서드 추출 -- 메모 2502130352
public class MusicPlayMain4 {
    public static void main(String[] args) {
        MusicPlayer data = new MusicPlayer();

        //음악 풀레이어 켜기
        data.onVol();;

        //볼륨 증가
        data.volUp();
        data.volUp();

        //볼륨 감소
        data.volDown();

        //음악 플레이어 상태
        data.showStatus();

        //플레이어 끄기
        data.offVol();

        //음악 플레이어 상태
        data.showStatus();
        
    }

}
