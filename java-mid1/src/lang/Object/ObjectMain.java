package lang.Object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parantMethod();

        //toString()은 Object 클래스의 매서드
        String string = child.toString();
        System.out.println(string);
    }
}
