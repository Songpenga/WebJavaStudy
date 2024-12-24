package Method;

public class MethodEx2_Ref {

    public static void main(String[] args) {
        String msg = "hello, msg!";

        pringMsg(msg, 3);

        pringMsg(msg, 5);

        pringMsg(msg, 7);

    }

    public static void pringMsg(String msg, int times){
        for(int i = 0; i < times; i++){
            System.out.println(msg + times);
        }
    }
}
