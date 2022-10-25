package j07_반복;

import java.util.Scanner;

public class Loop3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;


       System.out.println("몇번 반복할지 입력하세요");
       num = scanner.nextInt();

       for (int i = 0; i < num; i++) {
           System.out.println("i : " +(i+1));
           System.out.println("i : " +(num  -1));
        }

    }
}
