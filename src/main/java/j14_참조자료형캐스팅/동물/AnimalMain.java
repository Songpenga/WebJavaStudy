package j14_참조자료형캐스팅.동물;

public class AnimalMain {

    public static void main(String[] args) {

        Human human = new Human();
        Tiger tiger = new Tiger();
        Animal animal1 = null;
        Animal animal2 = null;

        human.move();
        human.readBook();
        tiger.hunting();
        tiger.move();

        System.out.println("[캐스팅]");
        animal1 = human;
        animal2 = tiger;
        System.out.println("<업캐스팅>");

        ((Human) animal1).move();
        ((Tiger) animal2).move();

        System.out.println("다운캐스팅");
        Human d_human = (Human) animal1;
        Tiger d_tiger = (Tiger) animal2;

        d_human.readBook();
        d_tiger.hunting();

        System.out.println("[ animalMain]");
        Animal a = new Animal();
        Human h = (Human) a; // downcasting되기전에 upcasting이 된적이 있어야한다. 저장소에 자료가 먼저 올라가야한다.

    }
}
