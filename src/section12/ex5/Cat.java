package section12.ex5;

public class Cat implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("앩옹");
    }

    @Override
    public void move() {
        System.out.println("꽁꽁 얼어붙은 한강위로 고양이가 지나갑니다.");
    }
}
