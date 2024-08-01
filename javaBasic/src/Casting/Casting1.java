package Casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longV;
        double doubleV;

        longV = intValue; // int -> long 가능
        System.out.println("longV = " + longV);

        doubleV = intValue; // int -> double 가능
        System.out.println("doubleV = " + doubleV);

        doubleV = 20L; // long -> double 가능
        System.out.println("doubleV2 = " + doubleV);

        //자바는 기본적으로 같은 타입에 값을 대입할 수 있다.
        // 정리하면 작은 범위에서 큰 범위로의 대입은 자바 언어에서 허용된다.
        // 큰 크릇은 작은 그릇에 담긴 내용물을 담을 수 있다.

        doubleV = intValue;
        doubleV = (double) intValue; // 형 맞추기
        doubleV = (double) 10; //변수 값 읽기
        /*
            이렇게 앞에 (double)과 같이 적어주면 int형이 double형으로 형이 변한다.
            이렇게 형이 변경되는 것을 형변환이라 한다.
            작은 범위 숫자타입에서 큰 범위 숫자 타입으로의 대입은 개발자가 이렇게 직접 형변환을
            하지 않아도 된다. 이런 과정이 자동으로 일어나기 때문에 '자동 형변환' 또는 '묵시적 형변환' 이라 한다.
        */
    }
}
