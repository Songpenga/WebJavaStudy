package Method;

/* 자동 형변환
* int < long < double
* 메서드를 호출할 떄 매개변수에 값을 전달하는 것도 결국 변수에 값을 대입하는 것이다.
* */

public class MethodCasting1 {
    public static void main(String[] args) {
        double num = 100.5;
        //printNumber(num); //double을 int에 대입하므로 컴파일 오류
        /* java : incompatible type : possible lossy conversion from double to int */
        printNumber((int) num); //명시적 형변환을 사용해 double을 int로 변환
    }

    public static void printNumber(int i){
        System.out.println("숫자 :" + i);
    }
}
