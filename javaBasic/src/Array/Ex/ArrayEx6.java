package Array.Ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int minNum = 0, maxNum = 0;

        System.out.println("입력 받을 숫자의 개수를 입력하세요.");
        int i = scanner.nextInt();

        System.out.println(i + "개의 정수를 입력하세요");
        for (int arg = 0; arg < i; arg++) {
            numbers[arg] = scanner.nextInt();
        }

        for (int count = 1; count < i; count++){
            if(numbers[count] < minNum){
                minNum = numbers[count];
            }

            if(numbers[count] > maxNum){
                maxNum = numbers[count];
            }

        }

        System.out.println("max : " + maxNum);
        System.out.println("min : " + minNum);

    }
}
