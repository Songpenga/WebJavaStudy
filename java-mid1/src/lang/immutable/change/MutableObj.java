package lang.immutable.change;

public class MutableObj {
    private int val;

    public int getVal() {
        return val;
    }

    public void add(int addVal){
        val = val + addVal;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public MutableObj(int val) {
        this.val = val;

    }
}
