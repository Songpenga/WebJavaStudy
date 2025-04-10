package lang.immutable.address;

public class Address {
    private String val;

    public Address(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    @Override
    public String toString() { // 객체의 값을 편하게 확인하기 위해 재정의함
        return "Address{" +
                "val='" + val + '\'' +
                '}';
    }
}
