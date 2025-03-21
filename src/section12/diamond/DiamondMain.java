package section12.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        //InterfaceA a = new InterfaceA();
        //'InterfaceA' is abstract; cannot be instantiated

        InterfaceA a = new Child(); //부모는 자식을 담을 수 있다.
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();

        Child c = new Child();
        c.methodA();
        c.methodB();
        c.methodCommon();

        /*
        * 1. a.methodCommon()을 호출하면 면저 Child 인스턴스를 찾는다.
        * 2. 변수 a가 InterfaceA 타입이므로 해당 타입에서 methodCommon()을 찾는다.
        * 3. methodCommon()은 하위 타입인 Child에서 오버라이딩 되어 있다.
        *    따라서 Child의 methodCommon()이 호출된다
        * 4. b.methodCommon()을 호출하면 먼저 x001 child 인스턴스를 찾는다.
          5. 변수 b가 interface B 타입 이므로 해당 타입에서 methodCommon()을 찾는다.
          6. methodCommoon 은 하위 타입인 Child에서 오버라이딩 되어 있다. 따라서 Child의 `methodCommon`() 이 호출된다
        */
    }
}
