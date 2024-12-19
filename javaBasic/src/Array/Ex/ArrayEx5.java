package Array.Ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        double avg;

        System.out.println("입력 받을 숫자의 개수를 입력하세요.");
        int i = scanner.nextInt();

        System.out.println(i + "개의 정수를 입력하세요");
        for (int arg = 0; arg < i; arg++) {
            numbers[arg] = scanner.nextInt();
            sum += numbers[arg];
        }

        avg = (double) sum / i;
        System.out.println("sum" + sum);
        System.out.println("avg" + avg);


    }
}
