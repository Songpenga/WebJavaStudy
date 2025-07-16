package com.example.nested.anoymous.ex;

import java.util.Random;

    //section9.익명클래스 활용2
    public class Ex1RefMainV1 {
        public static void hello(Process process){
            System.out.println("프로그램 시작");
            process.run();
            System.out.println("프로그램 종료");
        }
    static class Dice implements Process{

        @Override
        public void run() {
            //코드 조각 시작
            int randomVal = new Random().nextInt(6)+1;
            System.out.println("주사위  = " + randomVal);
            //코드조각 종료
        }
    }

    static class Sum implements Process{

        @Override
        public void run() {
            //코드 조각 시작
            for(int i = 1; i <= 3; i++){
                System.out.println("i = " + i);
            }
            //코드조각 종료
        }
    }

    public static void main(String[] args) {
            hello(new Dice());
            hello(new Sum());
        }
    }
