package lang.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, java!";

        //format 메서드
        String format1 = String.format("num : %d, bool : %b, str : %s", num, bool, str);
        System.out.println(format1);
        //Exception in thread "main" java.util.MissingFormatArgumentException: Format specifier '%d'

        String format2 = String.format("숫자 %.2f", 12.3456);
        System.out.println(format2);

        System.out.printf("숫자 : %.2f \n", 23.4567); // << 수정, 소수점 2째자리 까지
        //printf
        //System.out.printf("숫자 : %.2 \n", 23.4567);
        //Exception in thread "main" java.util.UnknownFormatConversionException: Conversion = '.'

        //matches 메서드
        String regex = "Hello, (Java!World)";
        System.out.println("str이 패턴과 일치하는가? " + str.matches(regex));


    }
}
