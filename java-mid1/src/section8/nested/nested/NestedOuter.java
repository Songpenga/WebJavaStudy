package section8.nested.nested;

public class NestedOuter {

    private static int outClassVal = 3;
    private static int outInstanceVal = 2;

    static class Nested{
        private int nestInstanceVal = 1;

        public void pring(){

            //자신의 멤버에 접근
            System.out.println(nestInstanceVal);

            //바깥클래스의 인스턴스 멤버에는 접근할 수 없다
            System.out.println(outInstanceVal);

            //바깥 클래스의 클래스 멤버에는 접근할 수 있다.
            System.out.println(NestedOuter.outClassVal);
        }
    }

}
