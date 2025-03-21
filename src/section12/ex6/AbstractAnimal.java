package section12.ex6;

//AbstractAnimal 은 추상 클래스다
//sound() : 동물의 소리를 내기 위한 추상 메서드를 제공한다.
//move() : 동물의 이동을 표현하기 위한 메서드이다. 이 메서드는 추상 메서드가 아니다
//         상속을 목적으로 한다.
//Fly는 인터페이스이다. 나는 동물은 이 인터페이스를 구현할 수 있다.
// - bird, chicken은 날 수 있는 동물이다. fly() 메서드를 구현해야한다.

public abstract class AbstractAnimal {
    public abstract void sound();
    public void move() {
        System.out.println("동물이 이동합니다.");
    }
}
