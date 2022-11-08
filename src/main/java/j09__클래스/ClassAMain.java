package j09__클래스;

public class ClassAMain {

    public static void main(String[] args) {
        System.out.println(new ClassA());
        System.out.println(new ClassA());
        System.out.println(new ClassA());
        System.out.println(new ClassA());

        ClassA a1 = new ClassA();
        ClassA a2 = new ClassA();
//다른 생성자가 오버로딩되면 기존 생성자는 비활성화 된다.

        a1.name = "김준일";

        System.out.println(a1.name);

        a2.name = "김준이";

        System.out.println(a1.name);
        System.out.println(a2.name);

        a1.callName();

        a2.callName();

    }
}
