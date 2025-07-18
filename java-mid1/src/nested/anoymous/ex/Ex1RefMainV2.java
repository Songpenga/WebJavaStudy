package com.example.nested.anoymous.ex;

import java.util.Random;

//section9.익명클래스 활용3, 지역클래스 사용
public class Ex1RefMainV2 {

    public static void hello(Process process){
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

public static void main(String[] args) {
    class Dice implements Process{

        @Override
        public void run() {
            //코드 조각 시작
            int randomVal = new Random().nextInt(6)+1;
            System.out.println("주사위  = " + randomVal);
            //코드조각 종료
        }
    }

    // 제어자 'static'은(는) 허용되지 않습니다
    class Sum implements Process{

        @Override
        public void run() {
            int randomVal = new Random().nextInt(6)+1;
            //코드 조각 시작
            for(int i = 1; i <= 3; i++){
                System.out.println("i = " + i);
            }
            //코드조각 종료
        }
    }
        hello(new Dice());
        hello(new Sum());
    }
}
