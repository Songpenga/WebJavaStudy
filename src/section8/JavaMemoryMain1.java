package section8;

//static
public class JavaMemoryMain1 {
    public static void main(String[] args) {
        System.out.println("main start");
        methodOne(10);
        System.out.println("main end"); // ctrl + w
    }

    static void methodOne(int m1){
        System.out.println("method1 start");
        int cal = m1*2;
        methodTwo(cal);
        System.out.println("method1 end");
    }

    static void methodTwo(int m2){
        System.out.println("method2 start");
        System.out.println("m2 : " + m2);
        System.out.println("method2 end");
    }
}
