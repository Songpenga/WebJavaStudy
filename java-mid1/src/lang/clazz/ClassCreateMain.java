package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception { //왜 예외를 던지지?
        Class helloClass = Hello.class;
        Class helloClassA = Class.forName("lang.clazz.Hello"); // forName은 무조건 예외를 던져야한다.
        //Unhandled exception: java.lang.ClassNotFoundException

        Hello hello = (Hello) helloClassA.getDeclaredConstructor().newInstance();
        String rslt = hello.Hello();

        System.out.println("result :: " + rslt);
        System.out.println("helloClass :: " + helloClass);
        System.out.println("helloClassA :: " + helloClassA);
    }
}
