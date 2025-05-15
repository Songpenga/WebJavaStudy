package section8.nested.ex2;

public class CarMain {
//    ** 내부 클래스의 생성 **
//    바깥 클래스에서 내부 클래스의 인스턴스를 생성할 때는 바깥 클래스 이름을 생략할 수 있다.
//            예) new Engine()
//    바깥 클래스에서 내부 클래스의 인스턴스를 생성할 때 내부 클래스의 인스턴스는 자신을 생성한 바깥 클래스의 인
//    스턴스를 자동으로 참조한다. 여기서 new Engine() 로 생성된 Engine 인스턴스는 자신을 생성한 바깥의
//    Car 인스턴스를 자동으로 참조한다.
    public static void main(String[] args) {
        Car mycar = new Car("TEslA PEng", 1014);
        mycar.start();
    }

}
