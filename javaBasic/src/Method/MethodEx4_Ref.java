package Method;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class MethodEx4_Ref {
    public static void main(String[] args) {
        int bal = 0;

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액확인 | 4. ");
            System.out.println("------------------");
            System.out.println("선택 : ");

            int choice = scanner.nextInt();
            int amount;

            switch (choice){
                case 1:
                    System.out.println("입금액을 입력하세요 : ");
                    amount = scanner.nextInt();
                    bal = deposit(bal, amount);
                    break;
                case 2:
                    System.out.println("출금액을 입력하세요 : ");
                    amount = scanner.nextInt();
                    bal = withdraw(bal, amount);
                case 3:
                    System.out.println("현재 잔액 : " + bal + "원");
                case 4:
                    System.out.println("시스템을 종료합니다");
                    return;
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요");


            }


        }

    }

    public static int deposit(int bal, int amt){
        bal += amt;

        String Str2 = NumberFormat.getInstance().format(bal);
        String Str3 = NumberFormat.getInstance().format(amt);

        System.out.println(Str3 + "원을 입금하였습니다. " +
                "현재잔액 : " + Str2 + "원");

        return bal;

    }

    public static int withdraw(int bal, int amt) {
        DecimalFormat str1 = new DecimalFormat("###,###");
        String format1 = str1.format(bal);
        String format2 = str1.format(amt);

        if (bal >= amt) {
            bal -= amt;

            System.out.println(format2 + "원을 출금하였습니다." +
                    "현재 잔액 : " + format1 + "원"
            );
        } else {
            System.out.println(format2 + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        System.out.println("최종잔액 : " + format1 + "원");

        return bal;
    }

}
