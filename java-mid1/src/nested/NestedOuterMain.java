package com.example.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();

        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
    }

    /*
    * 정적 중첩 클래스는 사실 다른 클래스를 그냥 중첩해 둔것 뿐이다.
    * 쉽게 이야기해서 둘은 아무런 관계가 없다.
    *
    */

}
