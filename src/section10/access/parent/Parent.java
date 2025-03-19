package section10.access.parent;

public class Parent {
    public int publicVal;
    protected int protectedVal;
    int defaultVal;
    private int privateVal;

    public void publicMethod(){
        System.out.println("parent publicMethod");
    }
    protected void protectedMethod(){
        System.out.println("parent protectedMethod");
    }
    void defaultMethod(){
        System.out.println("parent defaultMethod");
    }
    private void privateMethod(){
        System.out.println("private publicMethod");
    }
    public void printParent(){
        System.out.println("===Parent 메서드 안===");
        System.out.println("publicVal" + publicVal);
        System.out.println("protectedVal" + protectedVal);
        System.out.println("defaultVal" + defaultVal);
        System.out.println("privateVal" + publicVal);

        //부모 메서드 안에서 모두 접근 가능
        defaultMethod();
        privateMethod();
    }
}
