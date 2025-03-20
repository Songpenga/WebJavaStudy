package section11.ex5;

public class Caw implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("음머");
    }

    @Override
    public void move() {
        System.out.println("꽁꽁 얼어붙은 한강위로 소가 지나갑니다");
    }
}
