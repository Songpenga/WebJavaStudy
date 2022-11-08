package j14_참조자료형캐스팅.동물;

public class AnimalArratMain {
    public static void main(String[] args) {

        Animal[] animals = new Animal[4];

        animals[0] = new Human(); //업캐스팅
        animals[1] = new Tiger();
        animals[2] = new Human();
        animals[3] = new Tiger();

        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Human) { //instanceof
                //Human h = (Human) .move(animals[i]);
                //h.readBook();

                ((Human) animals[i]).readBook(); //()로 우선순위 설정

            } else if (animals[i] instanceof Tiger) {
                ((Tiger) animals[i]).hunting();

            }
        }

    }
}
