package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {

        Integer i = Integer.valueOf(100); //숫자, 래퍼, 객체 변환
        Integer ii = Integer.valueOf("10"); // 문자열, 래퍼 객체 변환
        int val = Integer.parseInt("10"); //문자열 전용, 기본형 변환

        //비교
        int compareRslt = i.compareTo(200);
        System.out.println("compareRslt ::: " + compareRslt);

        //산술 연산
        System.out.println("Sum :: " + Integer.sum(10, 200));
        System.out.println("Min :: " + Integer.min(10, 200));
        System.out.println("Max :: " + Integer.max(10, 200));
    }
}
