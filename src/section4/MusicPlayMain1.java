package section4;

public class MusicPlayMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean on = false;

        //음악 풀레이어 켜기
        on = true;
        System.out.println("음악 플레이어 시작");

        //볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);

        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);

        //볼륨 감소
        volume--;
        System.out.println("음악 플레이어 볼륨 : " + volume);

        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if(on){
            System.out.println("음악 플레이어 ON, 볼륨 : " + volume);
        }else {
            System.out.println("음악 플레이어 off");
        }

        //플레이어 끄기
        on = false;
        System.out.println("음악 플레이어를 종료합니다.");



    }
}
