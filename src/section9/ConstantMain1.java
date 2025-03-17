package section9;

public class ConstantMain1 {

    public static void main(String[] args) {
        System.out.println("최대 참여자 수 : " + 1000);
        int nowCnt = 999;
        process(nowCnt++);
        process(nowCnt+2);
        process(nowCnt+2);
    }

    private static void process(int howManyNowCnt) {
        System.out.println("참여자수 : " + howManyNowCnt);
        if(howManyNowCnt > 1000){
            System.out.println("대기자로 등록합니다.");
        }else {
            System.out.println("입장하겠습니다.");
        }
    }
}
