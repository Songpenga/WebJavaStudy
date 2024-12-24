package Method;

public class MethodEx2 {

    public static void main(String[] args) {
        String msg = "hello, msg!";

        for(int i = 0; i < 3; i++){
            System.out.println(msg + i);
        }

        for(int i = 0; i < 5; i++){
            System.out.println(msg + i);
        }

        for(int i = 0; i < 7; i++){
            System.out.println(msg + i);
        }

    }

    public static void pringMsg(String msg, int times){
        for(int i = 0; i < times; i++){
            System.out.println(msg);
        }
    }
}
