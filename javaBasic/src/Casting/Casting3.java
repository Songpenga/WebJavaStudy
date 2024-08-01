package Casting;

public class Casting3 {
    public static void main(String[] args) {
        /*
        * 형변환과 오버플로우
        * 형변환을 할 떄 만약 작은 숫자가 표현할 수 있는 범위를 넘어서면?
        */

        long maxint = 2147483647; //int 최고값
        long maxintover = 2147483648L; //int 최고값 +1 (초과)

        int intValue = 0;

        intValue = (int) maxint;
        System.out.println("max int casting + " + intValue); //출력 : 2147483647

        intValue = (int) maxintover;
        System.out.println("max int casting + " + intValue); // 출력 : -2147483648
    }
}
