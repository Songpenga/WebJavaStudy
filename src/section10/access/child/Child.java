package section10.access.child;

import section10.access.parent.Parent;

public class Child extends Parent {

    public void call(){
        publicVal = 1;
        protectedVal = 1; //상속 관계 or 같은 패키지
        //defaultVal = 1; //다른 패키지 접근 불가, 컴파일 오류
        //privateVal = 1; //접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod(); //상속 관계 or 같은 패키지
        //defaultMethod(); //다른 패키지 접근 불가, 컴파일 오류
        //privateMethod(); //접근 불가, 컴파일 오류

        printParent();
    }
}
