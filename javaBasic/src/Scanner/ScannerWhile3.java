package Scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true){
            System.out.println("정수를 입력하세요 (0을 입력시 종료)");
            int num = scanner.nextInt();

            if(num == 0){
                sum = sum + num;
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            sum += num;
        }

        System.out.println("입력한 모든 정수의 합 : " + sum); // 빠져나왔을떄

    }
}
