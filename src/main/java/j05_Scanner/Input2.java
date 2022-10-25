package j05_Scanner;

import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

       // int num1 = s.nextInt();

        System.out.println("x입력 : ");
        int x = s.nextInt();

        System.out.println("y입력 : ");
        int y = s.nextInt();

        System.out.println( "x + y = " + ( x + y)); // 연신 우선순위 높여주기

    }
}
