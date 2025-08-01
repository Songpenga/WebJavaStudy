package com.example.nested.test;

public class AnoymousMain {
    public static void main(String[] args) {
        //여기에서 Hello의 익명 클래스를 생성햐교 hello()를 호출하리
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("hello!!!!! peng!!");
            }
        };

        hello.hello();
    }
}
