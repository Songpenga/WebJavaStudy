package com.example.nested.anoymous.ex;

import java.util.Random;

//람다사용

public class Ex1RefMainV5 {

    public static void hello(Process process){
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

public static void main(String[] args) {
        hello(() -> { // ALT + ENTER 람다로 바꾸기
            int randomVal = new Random().nextInt(6) + 1;
            System.out.println("주사위 :: " + randomVal);
        });

    hello(() -> {
        for(int i = 1; i <= 3; i++){
            System.out.println("i = " + i);
        }
    });
    }
    public void rundice(){
        int randomVal = new Random().nextInt() +1;
        System.out.println("주사위 :: " + randomVal);
    }

    public void runsum(){
        for(int i = 1; i <= 3; i++){
            System.out.println("i = " + i);
        }
    }
}