package Array;

public class ArrayInfo {
    public static void main(String[] args) {
        int[] students;
        students = new  int[5]; //배열의 크기만큼 메모리를 확보

        System.out.println(students);
        System.out.println(students[5]);

        /*
        * 배열을 생성하고 나면 자바는 메모리 어딘가에 있는 이 배열에 접근할 수 있는 참조값(주소)을 반환한다.
        * 참조값을 통해 메모리에 있는 실제 배열에 접근하고 사용할 수 있다.
        */

        /*
        * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        	at Scanner.ScannerSpring.main(ScannerSpring.java:13)
          => 인덱스 허용 범위를 넘어설 때 발생하는 오류
        */

        /*
        *  자바의 변수 데이터 타입을 가장 크게 보면 기본형과 참조형으로 분류할 수 있따.
        * 사용하는 값을 직접 넣을 수 있는 기본형, 메모리의 참조값을 넣을 수 있는 참조형으로 분류할 수 있다.
        * 참조형 : 데이터에 접근하기 위함 참조(주소)를 저장하는 데이터 타입을 참조형이라한다.
        * 배열을 동적으로 메모리 사이즈를 변경할 수 있다.
        *
        */

        
    }
}
