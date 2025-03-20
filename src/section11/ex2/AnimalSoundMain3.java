package section11.ex2;

public class AnimalSoundMain3 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Caw(), new Duck()};

  /*      Animal animal = new
                Animal();
        animal.sound();*/

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    public static void soundAnimal(Animal animal){
        System.out.println("=============");
        System.out.println("sound Test start");
        animal.sound();
        System.out.println("sound Test End");
    }

}
