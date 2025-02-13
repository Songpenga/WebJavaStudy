package section4;

public class MusicPlayMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        //음악 풀레이어 켜기
        data.on = true;
        System.out.println("음악 플레이어 시작");

        //볼륨 증가
        data.vol++;
        System.out.println("음악 플레이어 볼륨 : " + data.vol);

        data.vol++;
        System.out.println("음악 플레이어 볼륨 : " + data.vol);

        //볼륨 감소
        data.vol--;
        System.out.println("음악 플레이어 볼륨 : " + data.vol);

        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if(data.on){
            System.out.println("음악 플레이어 ON, 볼륨 : " + data.vol);
        }else {
            System.out.println("음악 플레이어 off");
        }

        //플레이어 끄기
        data.on = false;
        System.out.println("음악 플레이어를 종료합니다.");


    }
}
