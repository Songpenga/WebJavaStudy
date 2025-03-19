package section11.poly.basic;

//upcasting vs downcasting
public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println(
                "parent1 호출"
        );
        call(parent1);

        Parent parent2 = new Child();
        System.out.println(
                "parent22 호출"
        );
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        //Child 인스턴스인 경우 childMethod() 실행
        if(parent instanceof Child child){
            System.out.println("child 인스턴스");
            child.childMethod();
        }
    }
}