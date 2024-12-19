package Method;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
        checkAge(1);
        checkAge(100);
        checkAge(25);
    }

    public static void checkAge(int i){
        if(i < 18 ){
            System.out.println(i + "살 미성년자는 출입이 불가능 합니다.");
            return;
        }

        System.out.println(i + "살, 입장하세요.");
    }

}
