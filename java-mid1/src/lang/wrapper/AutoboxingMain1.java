package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        //Primi -> Wrapper
        int val = 77;
        Integer boxVal = Integer.valueOf(val);

        //Wrapper -> Primitive
        int unboxVal = boxVal.intValue();

        System.out.println("boxVal ::: " + boxVal);
        System.out.println("unboxVal :: " + unboxVal);
    }
}
