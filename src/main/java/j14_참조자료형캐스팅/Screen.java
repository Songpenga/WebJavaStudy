package j14_참조자료형캐스팅;

public class Screen implements Power{
    @Override
    public void on() {
        System.out.println("Screen 전원을 켭니다.");

    }

    @Override
    public void off() {
        System.out.println("Screen 전원을 끕니다.");

    }
}
