package j05_Scanner;

import java.util.Scanner;

public class Input3 {

    /*
    * 이름 : 김준일                      name String.length
    * 나이 : 29                         age
    * 주소 : 부산 동래구 사직동            address
    *     * 연락처 : 010 9888 1694       phone
    *
    *
    *사용자의 이름은 김준일이고 나이는 29입니다
    * 주소는 부산 동래구 사직동이며 연락처는  010 9888 1694
     * */
//스트리밍 : 즉시 볼 수 있는 환경
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //변수먼저 선언
        /* String name = null
        * int age = 0;
        * string adress = null
        * string phone = null*/

        System.out.println("이름 : ");
        String name = scanner.next();

        System.out.println("나이 : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("주소 : ");
        String address = scanner.nextLine();
// 버퍼 문제로 생략됨
        System.out.println("연락처 : ");
        String phone = scanner.nextLine();



        System.out.println("사용자의 이름은 " + name + "이고 나이는 " + age + "입니다.");
        System.out.println("주소는" +address + "이며 연락처는 " + phone +"입니다.");

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + address);
        System.out.println("연락처 : " + phone);
    // 글자수 제한은??
// 스페이스를 버퍼에서 가져옴, ㄷ ㅂㅈ

    }
}
