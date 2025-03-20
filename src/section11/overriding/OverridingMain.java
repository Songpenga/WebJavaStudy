package section11.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> child");
        System.out.println("value = " + child.val);
        child.Method();
        
        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.val);
        parent.Method();
        
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("Child -> child");
        System.out.println("value = " + poly.val);//변수는 오버라이딩x
        poly.Method(); //메서드 오버라이딩
        
    }
}
