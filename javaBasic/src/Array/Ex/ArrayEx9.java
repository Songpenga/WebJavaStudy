package Array.Ex;

import java.util.Scanner;

public class ArrayEx9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = 10;
        String[] ProNames = new String[max];
        String[] ProPrice = new String[max];
        int ProCount = 0;

        while (true){
            System.out.print("1. 등록 | 2. 목록 | 3. 종료 \n 메뉴선택바람");
            int menu = scanner.nextInt(); // \n
            scanner.nextLine(); // \n

            if (menu == 1){

                if(ProCount >= max){
                    
                }
                System.out.println("상품이름 입력");
                ProNames[ProCount] = scanner.nextLine();

                System.out.println("상품가격 입력");
                ProPrice[ProCount] = scanner.nextLine();

                ProCount++;
            } else if (menu == 2) {
                if ((ProCount == 0)) {
                    System.out.println("등록된 상품이 없습니다");
                    continue;
                }
                for (int i = 0; i < ProCount; i++) {
                    System.out.println(ProNames[i] + " : " + ProPrice[i] + "원");
                }
            } else if (menu == 3) {
                System.out.println("종료함");
                break;
            }else{
                System.out.println("없는 메뉴 번호");
            }
        }
    }
}