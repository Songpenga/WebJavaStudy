package j05_Scanner;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        String name = "Peng";
        Scanner scanner = new Scanner(System.in); //Ctrl + space, 애만 여기에 대입 가능, 자료형 : 스캐너, 입력가능
// 대입으로 system.in 을 씀. system.out은 출력.  system.in은 입력
        String s = scanner.nextLine();
        String s2 = scanner.nextLine(); //<- 사용자의 입력을 기다림
        String s3 = scanner.nextLine(); //

        System.out.println("입력 받은 값1 : " +s);
        System.out.println("입력 받은 값2 : " +s2);
        System.out.println("입력 받은 값3 : " +s3);
        //java: non-static method next() cannot be referenced from a static context

/*
* 문자열 입력
* next()-> 띄어쓰기 포함 x
* nextLine() -> 띄어쓰기 포함 o
*
* */


    }
}
