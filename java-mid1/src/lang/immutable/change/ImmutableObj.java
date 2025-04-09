package lang.immutable.change;

public class ImmutableObj {
    /*
        여기서 핵심은 add() 메서드이다.
        불변 객체는 값을 변경하면 안된다! 그러면 이미 불변 객체가 아니다!
        하지만 여기서는 기존 값에 새로운 값을 더해야 한다.
        불변 객체는 기존 값은 변경하지 않고 대신에 계산 결과를 바탕으로
        새로운 객체를 만들어서 반환한다.
        이렇게 하면 불변도 유지하면서 새로운 결과도 만들 수 있다.

        불변 객체를 설계할 때 기존 값을 변경해야 하는 메서드가 필요할 수 있다.
        이때는 기존 객체의 값을 그대로 두고 대신에
        변경된 결과를 새로운 객체에 담아서 반환하면 된다.
        결과를 보면 기존 값이 그대로 유지되는 것을 확인할 수 있다.
    */
    private final int val;

    public ImmutableObj(int val) {
        this.val = val;
    }

    public ImmutableObj add(int addVal){
        int result = val + addVal;
        return new ImmutableObj(result);
    }

    public int getVal() {
        return val;
    }
}
