package section12.ex5;


public class Dog implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("꽁꽁 얼어붙은 한강위로 멍멍이가 지나갑니다");
    }
}
