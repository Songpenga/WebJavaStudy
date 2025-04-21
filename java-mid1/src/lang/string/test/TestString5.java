package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "peng.txt";
        String ext = ".txt";

        int str1 = str.indexOf(ext);

        String str2 = str.substring(0, str1);

        System.out.println(str1);
        System.out.println(str2);

    }
}
