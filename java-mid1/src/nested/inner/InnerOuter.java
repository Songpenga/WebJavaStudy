package com.example.nested.inner;

/*
* 정적 중첩 클래스
*   - static이 붙는다
*   - 바깥 클래스의 인스턴스에 소속되지 않는다.
*  내부클래스
*/
public class InnerOuter {

    private static int outClassVal = 3;
    private int outInstanceVal = 3;

    class Inner{
        private int innerInstanceVal = 7;

        public void print(){
            // 자기 자신에 접근
            System.out.println(innerInstanceVal);

            //외부 클래스의 인스턴스 멤버에 접근 가능, private도 접근 가능
            System.out.println(outInstanceVal);

            //외부 클래스의 클래스 멤버에 접근 가능, private도 접근 가능
            System.out.println(outClassVal);
        }

    }


}
