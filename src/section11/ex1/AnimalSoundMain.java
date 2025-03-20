package section11.ex1;

//좋지 않은 코드
public class AnimalSoundMain {
    public static void main(String[] args) {
/*        배열과 for문을 사용해서 중복을 제거하려고 해도 배열의 타입을
        Dog, Cat, Caw 중에 하나로 지정해야 한다. 같은 Caw들을 담아서
        처리하는 것은 가능하지만 타입이 서로 다른 Dog, Cat, Caw을 하나의
        배열에 담는것은 불가능 하다. 결과적으로 지금 상황에서는 해결방법이 없다.
        새로운 동물이 추가될 때 마다 더 많은 중복 코드를 작성해야한다.

        모든 중복 제거 시도가 Dog, Cat, Caw 타입이 서로 다르기 때문에 불가능하다.
        문제의 핵심은 바로 타입이 다르다는 점이다. 반대로 이야기하면 Dog, Cat. Caw가
        모두 같은 타입을 사용할 수 있는 방법이 있다면 메서드와 배열을 활용해서
        코드의 중복을 제거할 수 있다는 것이다.

        다형성의 핵심은 다형적 참조와 메서드 오버라이딩이다. 이 둘을 활용하면 Dog, Cat, Caw가
        모두 같은 타입을 사용하고, 각자 자신의 메서드도 호출할 수 있다.*/
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        System.out.println("=============");
        System.out.println("소리 testtt");
        dog.sound();
        System.out.println("test end");

        soundCat(cat);
        soundCaw(caw);
    }

    public static void soundCat(Cat cat){
        System.out.println("=============");
        System.out.println("냐오옹앙 testtt");
        cat.sound();
        System.out.println("냥 소리 test end");
    }

    public static void soundCaw(Caw caw){
        System.out.println("=============");
        System.out.println("caw 소리 testtt");
        caw.sound();
        System.out.println("caw sound test end");
    }
}
