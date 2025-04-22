package lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(11)};
        System.out.println(findVal(intArr, -1));
        System.out.println(findVal(intArr, 0));
        System.out.println(findVal(intArr, 11));
        System.out.println(findVal(intArr, 1000));

    }

    private static MyInteger findVal(MyInteger[] intArr, int i) {// a, b 값 비교
        for (MyInteger myInteger : intArr) {
            if(myInteger.getVal() == i){
                return myInteger;
            }
        }
        return null;
    }
}
