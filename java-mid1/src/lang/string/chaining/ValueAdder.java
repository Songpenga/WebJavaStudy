package lang.string.chaining;

public class ValueAdder {

    private int val;

    public ValueAdder add(int val) {
        this.val += val;
        return this;
    }

    public int getVal() {
        return val;
    }
}
