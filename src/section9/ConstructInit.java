package section9;

public class ConstructInit {
    final int value;

    public ConstructInit(int value) {
        this.value = value;
        //초기값이 없는경우에는 생성자를 통해서 초기값을 넣는걸 허용
    }
}
