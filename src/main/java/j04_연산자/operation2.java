package j04_연산자;

public class operation2 {
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = false;

        boolean result1 = flag1 && flag1;
        System.out.println("T x T =>" + result1);

        boolean result2 = flag1 && flag2;
        System.out.println("T x F =>" + result2);

        boolean result3 = flag2 && flag2;
        System.out.println("F x F =>" + result3);

        boolean result4 = flag1 || flag1;
        System.out.println("T + T =>" + result4);

        System.out.println("");

        boolean result5 = flag1 || flag2;
        System.out.println("T + F =>" + result5);

        boolean result6 = flag2 || flag2;
        System.out.println("F + F =>" + result6);

        boolean result7 = flag1 || flag2 && flag2;
        System.out.println("T + F x T =>" + result7);

        boolean result8 = 10 % 3 != 0;
        System.out.println(result8);

        int year = 2022;
        boolean result9 = year % 2 == 0 && year % 20 != 0 || year % 100 == 0;
        System.out.println(result9);
    }
}


// *  <<<<<<<<<<<< 논리연산자
// *      TRUE(1), FALSE(0)
// *      AND && -> 곱     T X T => T, T X F => F, F X F => F 하나라도 거짓이면 무조건 거짓
//*      OR ||  -> 합     T + T => T, T + F => T, F X F => F 하나라도 참이면 무조건 참
//*      NOT ! -> 부정