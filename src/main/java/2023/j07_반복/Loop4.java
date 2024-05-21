package j07_반복;

import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     //   int dan = 0;
/*
        System.out.println("단 입력 : ");
        dan = scanner.nextInt();
*/
        for (int i = 2; i < 10; i++) {
               for (int j  = 1; j <= 9; j++) {
                System.out.println(i + "x" + j + " = " + (i * j));
            }

        }
    }

}
