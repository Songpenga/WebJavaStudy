package section11.ex4;

public class AbstractMain {
    public static void main(String[] args) {
        //추상클래스 생성 불가
        //AbstractAnimal animal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(caw);

    }

    //변하지 않는 부분
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("Sound Testttttss 시작");
        animal.sound();
        System.out.println("Sound Testttttss 종료");
    }

    //변하지 않는 부분
    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("Sound Testttttss 시작");
        animal.move();
        System.out.println("Sound Testttttss 종료");
    }
}
