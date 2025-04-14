package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello";
        String b = "peng";

        String rslt1 = a.concat(b);
        String rslt2 = a  + b;

        System.out.println("rslt1 ::: " + rslt1);
        System.out.println("rslt2 ::: " + rslt2);
    }
}
