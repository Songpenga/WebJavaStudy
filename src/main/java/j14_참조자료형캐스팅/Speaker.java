package j14_참조자료형캐스팅;

public class Speaker implements Power{
    @Override
    public void on() {
        System.out.println("Speaker 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("Speaker 전원을 끕니다.");

    }
}
