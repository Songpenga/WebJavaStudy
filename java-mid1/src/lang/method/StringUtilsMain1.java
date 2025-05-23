package lang.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, java!";

        //valueOf 메서드
        String numString = String.valueOf(num);
        System.out.println("숫자 문자열 값 : " + numString);

        String boolString = String.valueOf(bool);
        System.out.println("boolean 문자열 값 : " + boolString);

        String objString = String.valueOf(obj);
        System.out.println("객체 문자열 값 : " + numString);

        // 문자 + x = 문자
        String numString2 = "" + num;
        System.out.println("빈문자열 값 : " + numString2);

        char[] strCharArr = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환 : " + strCharArr);
        for (char c : strCharArr) {
            System.out.println(c);
        }
        System.out.println();
    }
}
