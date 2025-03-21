package section12.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(cat);
        soundAnimal(bird);
        soundAnimal(chicken);

        flyAnimal(bird);
        flyAnimal(chicken);
    }

    //AbstractAnimal 사용 가능
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("sound 테스트 시작");
        animal.sound();
        System.out.println("sound 테스트 종료");
    }

    //Fly 인터페이스가 있으면 사용 가능
    private static void flyAnimal(Fly fly) {
        System.out.println("fly 테스트 시작");
        fly.fly();
        System.out.println("fly 테스트 종료");
    }

}
