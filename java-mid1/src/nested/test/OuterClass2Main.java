package com.example.nested.test;

// section9.문제와풀이 내부클래스 완성
public class OuterClass2Main {
    public static void main(String[] args) {
        //OuterClass2.InnerClass test = new OuterClass2.InnerClass();
        //'com.example.nested.test.OuterClass2'은(는) 둘러싸는 클래스가 아닙니다

        OuterClass2 test = new OuterClass2();
        OuterClass2.InnerClass inner = test.new InnerClass();
        inner.hello();

    }
}
