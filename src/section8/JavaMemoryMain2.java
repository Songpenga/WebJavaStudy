package section8;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        methodOne();
        System.out.println("main end");
    }

    static void methodOne(){
        System.out.println("methodOne start");
        Data data1 = new Data(10);
        methodTwo(data1);
        System.out.println("methodOne end");
    }

    static void methodTwo(Data data2){
        System.out.println("methodTwo start");
        System.out.println("data.value=" + data2.getValue());
        System.out.println("methodTwo end");
    }
}
