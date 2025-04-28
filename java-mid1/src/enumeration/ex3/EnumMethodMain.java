package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {

        //모든 ENUM 반환
        Grade[] val = Grade.values();

        System.out.println("val :: " + Arrays.toString(val));
        for (Grade grade : val) {
            System.out.println("name : " + grade.name() + " // " + grade.ordinal()); //ordinal :: 순서를 받을 수 있음
        }

        //String -> ENUM 변환, 잘못된 문자면 IllegalArgumentException 발생
        String input = "gold";
        Grade gradeI = Grade.valueOf(input);
        System.out.println("gold :: " + gradeI);

/*        Exception in thread "main" java.lang.IllegalArgumentException: No enum constant enumeration.ex3.Grade.gold
        at java.base/java.lang.Enum.valueOf(Enum.java:293)
        at enumeration.ex3.Grade.valueOf(Grade.java:3)
        at enumeration.ex3.EnumMethodMain.main(EnumMethodMain.java:18)*/
    }
}
