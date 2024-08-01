package Scanner;

import com.sun.java.swing.plaf.windows.WindowsDesktopPaneUI;

import java.util.Scanner;

public class ScannerSpring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCost = 0;

        while (true){
            System.out.println("1: 상품입력, 2: 결제, 3:프로그램 종료");
            int option = scanner.nextInt();

            if(option == 1){ // SWITCH로도 해도 괜찮음
                scanner.nextLine();
                System.out.println("상품명을 입력하세요");
                String product = scanner.nextLine();

                System.out.println("상품의 가격을 입력하세요");
                int price = scanner.nextInt();

                System.out.println("구매수량을 입력하세요");
                int count = scanner.nextInt();

                totalCost +=  (price * count);
                System.out.println("상품명 : " + product +" 가격: " + price + " 수량:" + count + "합계 : " + (price * count));

            } else if (option == 2) {

                System.out.println("총비용 : " + totalCost);
                totalCost = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;

            }else{
                System.out.println("올바른 옵션을 선택해주세요");
            }
        }


    }
}
