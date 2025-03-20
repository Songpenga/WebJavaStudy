package section11.ex4;

public class Cat extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("앩옹");
    }

    @Override
    public void move() {
        System.out.println("꽁꽁 얼어붙은 한강위로 고양이가 지나갑니다.");
    }
}
