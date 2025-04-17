package lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int rslt = adder.add(1).add(2).add(3).getVal();

        System.out.println("result3 = " + rslt);
    }
}
