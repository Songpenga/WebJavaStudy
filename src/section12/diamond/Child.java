package section12.diamond;

public class Child implements InterfaceA, InterfaceB{
    @Override
    public void methodA() {
        System.out.println("Child methodA 호출");
    }

    @Override
    public void methodB() {
        System.out.println("Child methodB 호출");
    }

    @Override
    public void methodCommon() {
        System.out.println("Child methodCommon 호출");
    }
}
