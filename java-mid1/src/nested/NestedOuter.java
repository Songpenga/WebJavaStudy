package com.example.nested;

public class NestedOuter {

    private static int outClassVal = 3;
    private int outInstanceVal = 2;

    static class Nested{

        private int nenstedInstanceVal = 1;

        public void print(){ //메서드

            //자신의 멤버에 접근
            System.out.println(nenstedInstanceVal);

            //바깥 클래스의 인스턴스 멤버에는 접근할 수 없다.
            //System.out.println(outInstanceVal);
            //비 static 필드 'outInstanceVal'은(는) static 컨텍스트에서 참조할 수 없습니다
            // ! static 은 당연히 인스턴스에 접근할 수 없다.

            //바깥 클래스의 인스턴스 멤버엔 접근할 수 있다. privase도 접근 가능
            System.out.println(NestedOuter.outClassVal);


        }
    }

}
