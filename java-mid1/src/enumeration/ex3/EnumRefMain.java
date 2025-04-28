package enumeration.ex3;

import enumeration.ex2.ClassGrade;

import java.util.PropertyResourceBundle;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC :: " + ClassGrade.BASIC.getClass());
        System.out.println("class GOLD :: " + ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND :: " + ClassGrade.DIAMOND.getClass());


        System.out.println("ref BASIC :: " + ClassGrade.BASIC);
        System.out.println("ref BASIC :: " + ClassGrade.GOLD);
        System.out.println("ref BASIC :: " + ClassGrade.DIAMOND);
    }

    private static String refVal(Object grade){
        return Integer.toHexString(System.identityHashCode(grade));
    }

    /*
    * - 참고로 열거형은 toString() 을 재정의 하기 때문에 참조값을 직접 확인할 수 없다. 참조값을 구하기 위해 refValue() 를 만들었다.
      - System.identityHashCode(grade) : 자바가 관리하는 객체의 참조값을 숫자로 반환한다.
      - Integer.toHexString() : 숫자를 16진수로 변환, 우리가 일반적으로 확인하는 참조값은 16진수
    *
    */


}
