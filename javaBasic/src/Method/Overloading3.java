package Method;


/*
 * 오버로딩 : 이름이 같고 매개변수가 다른 메서드를 여러개 정의하는 것, 메서드 오버로딩
 * 오버로딩 -> 과적, 과하게 물건을 담았다. 따라서 같은 이름의 메서드를 여러개 정희했다.
 * */
public class Overloading3 {
    public static void main(String[] args) {

        System.out.println("2:" + myMethod(1,2));
        System.out.println("3:" + myMethod(1.2,2.1));

    }

/*    public static int myMethod(int a, int b){
        System.out.println("int a, int b");
        return a + b;
    }*/

    public static double myMethod(double a, double b){
        System.out.println("double a, int b");
        return a + b;
    }
    // => 먼저 본인의 타입에 맞는 메서드를 찾아서 실행하고, 기래도 없으면 형 변환 가능한 타입의 메서드를
    // 찾아서 실행한다.


}
