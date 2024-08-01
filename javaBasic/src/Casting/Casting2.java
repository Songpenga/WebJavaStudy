package Casting;

public class Casting2 {
    public static void main(String[] args) {
        //큰 범위에서 작은 범위 대입은 명시적 형변환이 필요하다
        double douvleValue = 1.5;
        int intValue = 10;

        //intValue = douvleValue; //컴파일 오류 발생
        //java: incompatible types: possible lossy conversion from double to int
        //java: 호환되지 않는 유형 : double에서 int로의 가능한손실 변환

        /*
        * 컴파일 오류는 문제를 가장 빨리발견할 수 있는 좋은 오류이다.
        */
        intValue = (int) douvleValue; //형변환
        System.out.println(intValue);

        /*
        * cast : 금속이나 다른 물질을 녹여서 특정한 형태나 모양으로 만드는 과정
        */
    }
}
