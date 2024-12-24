package Method;


/*
 * 오버로딩 : 이름이 같고 매개변수가 다른 메서드를 여러개 정의하는 것, 메서드 오버로딩
 * 오버로딩 -> 과적, 과하게 물건을 담았다. 따라서 같은 이름의 메서드를 여러개 정희했다.
 * */
public class Overloading1 {
    public static void main(String[] args) {
        System.out.println("2:" + add(1,2));
        System.out.println("3:" + add(1,2,3));
    }

    public static int add(int a, int b){
        System.out.println("1번호출");
        return a + b;
    }

    public static int add(int a, int b, int c){
        System.out.println("2번호출");
        return a + b + c;
    }


}
