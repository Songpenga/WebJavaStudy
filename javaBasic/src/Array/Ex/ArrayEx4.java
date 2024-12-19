package Array.Ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        double avg;

        System.out.println("5개의 정수를 입력하세요");
        for (int arg = 0; arg < numbers.length; arg++) {
            numbers[arg] = scanner.nextInt();
            sum += numbers[arg];
        }

        avg = (double) sum / 5;
        System.out.println("sum" + sum);
        System.out.println("avg" + avg);


    }
}
