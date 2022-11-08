package j07_반복;

import java.util.Scanner;

public class Loop5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 2; i < 10; i++) { // 지역, 전역
               for (int j  = 1; j <= 9; j++) {
                System.out.println(i + "x" + j + " = " + (i * j));
            }

        }
    }

}
