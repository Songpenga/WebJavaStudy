package section9;

public class ConstantMain2 {

    public static void main(String[] args) {
        System.out.println("최대 참여자 수 : " + Constant.MAX_USERS);
        int nowCnt = 1998;
        process(nowCnt++);
        process(nowCnt++);
        process(nowCnt+2);
    }

    private static void process(int howManyNowCnt) {
        System.out.println("참여자수 : " + howManyNowCnt);
        if(howManyNowCnt > Constant.MAX_USERS){
            System.out.println("대기자로 등록합니다.");
        }else {
            System.out.println("입장하겠습니다.");
        }
    }
}
