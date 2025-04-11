package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.setVal(10);;
        Integer integer = (Integer) integerBox.getVal();
        System.out.println("integer ::  " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.setVal("hello!");;
        String str = (String) stringBox.getVal();
        System.out.println("str ::  " + str);

        //잘못된 타입의 인수 전달시
        integerBox.setVal("문자100");
        Integer rslt = (Integer) integerBox.getVal(); //String -> integer 캐스팅 예외
        System.out.println("rslt >> " + rslt);
    }
}
