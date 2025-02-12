package section3;

public class NullMain1 {

    //java: non-static variable data cannot be referenced from a static context

    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);

        data = new Data();
        System.out.println("2. data = " + data); //참조값

        data = null;
        System.out.println("3. data = " + data); //참조값
    }
}
