package lang.wrapper.test;

//박싱, 언박싱 >> 이건 잘...
public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        System.out.println("str :: " + (str+1));

        //String -> Integer
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 :: " + integer1);
        System.out.println("integer1 :: " + (integer1+1));

        //Interger -> int
        int intVal = integer1.intValue();
        System.out.println("intVal :: " + intVal);
        System.out.println("intVal :: " + (intVal+2));


        //int => integer
        Integer integerVal = Integer.valueOf(intVal);
        System.out.println("integerVal :: " + integerVal);
        System.out.println("integerVal :: " + (integerVal+2));
    }
}
