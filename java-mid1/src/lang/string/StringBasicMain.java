package lang.string;

/*
* String 은 불변 객체이다. 따라서 생성 이후에 절대로 내부의 문자열 값을 변경할 수 없다.
*/
public class StringBasicMain {
    public static void main(String[] args) {
        String str1 = "peng";
        String str2 = new String("hello peng");

        System.out.println("str1 ::: " + str1);
        System.out.println("str2 ::: " + str2);
    }
}
