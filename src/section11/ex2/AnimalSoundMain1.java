package section11.ex2;

public class AnimalSoundMain1 {
    public static void main(String[] args) {

        Animal animal = new
                Animal();
        animal.sound();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        //부모는 자식을 담을 수 있다.
        Animal dog1 = new Dog();
        Animal cat2 = new Cat();
        Animal caw3 = new Caw();
        Animal duck4 = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);

    }

    public static void soundAnimal(Animal animal){//부모는 자식을 담을 수 있다.
        //오버라이딩 된게 있으면 오버라이딩 된거를 우선으로 가져온다
        System.out.println("=============");
        System.out.println("sound Test start");
        animal.sound();
        System.out.println("sound Test End");
    }

}
