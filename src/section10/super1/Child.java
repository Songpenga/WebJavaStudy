package section10.super1;

public class Child extends Parent {

    //String val = "child val";
    @Override
    public void hello(){
        System.out.println("child hello");
    }

    public void call(){
        System.out.println("this val = " + this.val);
        System.out.println("super val = " + super.val);

        this.hello(); //this 생략가능
        super.hello();
    }
}
