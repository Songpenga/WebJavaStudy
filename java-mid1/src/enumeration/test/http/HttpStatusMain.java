package enumeration.test.http;

import java.util.Scanner;

public class HttpStatusMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); System.out.print("HTTP CODE: ");
        int httpCodeInput = scanner.nextInt();
        HttpStatus status = HttpStatus.findCode(httpCodeInput);
        if (status == null) {
            System.out.println("정의되지 않은 코드");
        } else {
            System.out.println(status.getCode() + " " + status.getMsg());
            System.out.println("isSuccess = " + status.isSuccess());
        }
    }
}
