package section7.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.defaultField = 2;

        //같은 패키지 default 호출 가능
        data.publicMethod();
        data.defaultMethod();

        //private 호출 불가
        //data.privateField = 3;
        //data.defaultMethod();

        data.innerAccess();
    }
}
