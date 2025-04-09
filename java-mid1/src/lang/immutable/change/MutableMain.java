package lang.immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        MutableObj obj = new MutableObj(17);
        obj.add(33);
        //계산 이후 기존 값은 사라짐
        System.out.println("obj >>>>>> " + obj.getVal()); //String can be replaced with template

        /*
            MutableObj 을 17 이라는 값으로 생성한다.
            이후에 obj.add(33) 을 통해서 17 + 33 을 수행한다.
            계산 이후에 기존에 있던 17 이라는 값은 사라진다.
            MutableObj 의 상태(값)가 17 -> 50 으로 변경되었다.
            obj.getValue() 를 호출하면 50 이 출력된다.
        */
    }
}
