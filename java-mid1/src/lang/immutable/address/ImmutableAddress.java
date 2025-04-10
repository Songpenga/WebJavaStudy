package lang.immutable.address;

public class ImmutableAddress {
    private final String val;

    public ImmutableAddress(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "val='" + val + '\'' +
                '}';
    }
}
