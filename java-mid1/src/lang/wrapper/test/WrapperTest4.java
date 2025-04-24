package lang.wrapper.test;

//오토박싱, 오토언박싱
public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        //String -> Integer
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 :: " + integer1);
        System.out.println("integer1 :: " + (integer1+1));

        //Interger -> int
        int intVal = integer1;
        System.out.println("intVal :: " + intVal);
        System.out.println("intVal :: " + (intVal+2));


        //int => integer
        Integer integerVal = intVal;
        System.out.println("integerVal :: " + integerVal);
        System.out.println("integerVal :: " + (integerVal+2));
    }
}
