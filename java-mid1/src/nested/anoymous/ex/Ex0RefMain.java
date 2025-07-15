package com.example.nested.anoymous.ex;

//section9.익명클래스 활용1
public class Ex0RefMain {
    public static void helloSpring(String hello) {
        System.out.println("프로그램 시작");
        System.out.println(hello);
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        helloSpring("helloSpring");
        helloSpring("hello Java");
        helloSpring("hello Peng!");
    }
}
