package lang.immutable.change;

public class ImmutableMain1 {
    public static void main(String[] args) {
        ImmutableObj objA = new ImmutableObj(10);
        ImmutableObj objB = objA.add(20); //new => Cannot resolve symbol 'add'

        //계산 이후에도 기존값과 신규값 모두 확인 가능
        System.out.println("objA >>> " + objA.getVal());
        System.out.println("objB >>> " + objB.getVal());
    }
}
