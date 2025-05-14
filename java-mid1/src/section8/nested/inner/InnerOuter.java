package section8.nested.inner;

import section8.nested.nested.NestedOuter;

/*
    정적 중첩 클래스는 바깥 클래스와 서로 관계가 없다. 하지만 내부 클래스는 바깥 클래스의 인스턴스를 이루는 요소가된다.
    쉽게 이야기해서 내부 클래스는 바깥 클래스의 인스턴스에 소속된다.
     - 정적 중첩 클래스
        static 이 붙는다.
        바깥 클래스의 인스턴스에 소속되지 않는다.
     - 내부 클래스
        static 이 붙지 않는다.
        바깥 클래스의 인스턴스에 소속된다.
*/
public class InnerOuter {
    private static int outClassVal = 7;
    private int outInstanceVal = 2;

    class Inner {
        private int innerInstanceVal = 11;
        public void print() {

            //자신의 멤버에 접근
            System.out.println(innerInstanceVal);

            //외부 클래스의 인스턴스 멤버에 접근 가능, private 도 접근 가능
            System.out.println(outInstanceVal);

            //외부 클래스의 클래스 멤버에는 접근 가능, private도 접근 가능
            System.out.println(InnerOuter.outClassVal);
        }
    }
//    내부 클래스는 앞에 static 이 붙지 않는다. 쉽게 이야기해서 인스턴스 멤버가 된다.
//    > 내부 클래스는
//     - 자신의 멤버에는 당연히 접근할 수 있다.
//     - 바깥 클래스의 인스턴스 멤버에 접근할 수 있다.
//     - 바깥 클래스의 클래스 멤버에 접근할 수 있다.

}
