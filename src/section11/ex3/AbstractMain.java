package section11.ex3;

public class AbstractMain {
    public static void main(String[] args) {
        //추상클래스 생성 불가
        //AbstractAnimal animal = new AbstractAnimal();
        //java: section11.ex3.AbstractAnimal is abstract; cannot be instantiated

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);
    }

    //변하지 않는 부분
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("Sound Testttttss 시작");
        animal.sound();
        System.out.println("Sound Testttttss 종료");
    }
}
