package section11.ex2;

public class AnimalSoundMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();
        Animal[] animals = {dog, cat, caw, duck};

        /*
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal caw = new Caw();

        Animal index1 = dog;
        Animal index2 = cat;
        Animal index3 = caw;
        */

        for (Animal animal : animals) {
            System.out.println("=============");
            System.out.println("sound Test start");
            animal.sound();
            System.out.println("sound Test End");

        }

    }

}
