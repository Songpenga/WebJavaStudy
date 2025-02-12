package section3;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 : a = " + a);
        changePrimitve1(a);
        System.out.println("메서드 호출 후 : a = " + a);

        a = changePrimitve2(a);
        System.out.println("메서드 호출 후 : a = " + a);
    }

    public static void changePrimitve1(int cnt){
        cnt = 5555;
    }

    public static int changePrimitve2(int cnt){
        cnt = 87878;
        return cnt;
    }
}
