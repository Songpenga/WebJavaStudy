package section9;

public class FieldInit {
    //이렇게 초기값을 넣어버린 경우에는 생성자를 통해서 값을 넣을 수 없음
    static final int constValue = 10;
    final int val = 10;


    public FieldInit() {
        //this.val = val; // Cannot assign a value to final variable 'val'
    }
}
