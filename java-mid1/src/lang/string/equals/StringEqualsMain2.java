package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("peng");
        String str2 = new String("peng");
        System.out.println("메서드 호출 비교1 :: " + isSame(str1, str2));

        String str3 = "peng";
        String str4 = "peng";
        System.out.println("메서드 호출 비교2 :: " + isSame(str3, str4));
    }

    private static boolean isSame(String str1, String str2) {
        //return str1 == str2; //String values are compared using '==', not 'equals()'
        return str1.equals(str2);
    }
}
