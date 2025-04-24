package lang.wrapper.test;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.2"};

        Double str = 0.0;

        for (String string : array) {
            str += Double.parseDouble(string);
        }

        System.out.println("str :: " + str);
    }
}
