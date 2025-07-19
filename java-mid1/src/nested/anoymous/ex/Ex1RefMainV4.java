package com.example.nested.anoymous.ex;

import java.util.Random;

//section9.익명클래스 활용3, 지역클래스 사용
public class Ex1RefMainV4 {

    public static void hello(Process process){
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

public static void main(String[] args) {
        hello(new Process(){

            @Override
            public void run() {
                int randomVal = new Random().nextInt(6)+1;
                //코드 조각 시작
                for(int i = 1; i <= 3; i++){
                    System.out.println("i = " + i);
                }
                //코드조각 종료
            }
        });
    }
}
