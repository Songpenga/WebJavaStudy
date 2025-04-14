package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("peng");
        String str2 = new String("peng");
        System.out.println("new String == 비교 :: " + (str1 == str2));
        System.out.println("new String equals 비교 :: " + (str1.equals(str2)));

        String str3 = "peng";
        String str4 = "peng";
        System.out.println("리터럴 == 비교 :: " + (str1 == str2));
        System.out.println("리터럴 비교 :: " + (str1.equals(str2)));
    }
}
