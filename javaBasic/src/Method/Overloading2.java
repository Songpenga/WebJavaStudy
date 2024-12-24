package Method;


/*
 * 오버로딩 : 이름이 같고 매개변수가 다른 메서드를 여러개 정의하는 것, 메서드 오버로딩
 * 오버로딩 -> 과적, 과하게 물건을 담았다. 따라서 같은 이름의 메서드를 여러개 정희했다.
 * */
public class Overloading2 {
    public static void main(String[] args) {
        myMethod(1,1.2);
        myMethod(1.2,1);
    }

    public static void myMethod(int a, double b){
        System.out.println("int a, double b");
        //return a + b;
    }

    public static void myMethod(double a, int b){
        System.out.println("double a, int b");
        //return a + b + c;
    }


}
