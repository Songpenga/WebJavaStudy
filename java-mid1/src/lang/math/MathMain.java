package lang.math;

public class MathMain {
    public static void main(String[] args) {
        //기본 연산 메서드
        System.out.println(Math.max(10,20));
        System.out.println(Math.min(10,20));
        System.out.println(Math.abs(-20));  //절대값

        //반올림 및 정밀도 메서드
        System.out.println(Math.ceil(1.1)); //올림
        System.out.println(Math.floor(2.7)); //내림
        System.out.println(Math.round(2.5)); //반올림

        //기타 유용한 메서드
        System.out.println(Math.sqrt(4)); //제곱근
        System.out.println(Math.random());




    }
}
