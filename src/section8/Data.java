package section8;

//스택영역과 힙 영역이 함께 사용되는 경우 - JavaMemoryMain2
public class Data {
    private int value;

    public Data(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
