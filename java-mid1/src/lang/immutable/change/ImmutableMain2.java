package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj objA = new ImmutableObj(10);
        ImmutableObj objB = new ImmutableObj(10);
        objB = objA.add(20);
        //val 값이 바뀌는게 아니라 return으로 결과가 나옴,
        //기존 값은 유지가 되고 return 값이 변경이됨,
        //그래서 return 값을 받아주는 변수가 따로 존재해야함

        //계산 이후에도 기존값과 신규값 모두 확인 가능
        System.out.println("objA >>> " + objA.getVal());
        System.out.println("objB >>> " + objB.getVal());
    }
}
