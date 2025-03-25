package lang.Object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        //obj.sound(); // 컴파일 오류. Object에는 Sound()가 없다.
        //obj.move(); // 컴파일 오류. Object에는 move()가 없다.
/*        java: cannot find symbol
        symbol:   method sound()
        location: variable obj of type java.lang.Object*/

        //객체에 맞는 다운캐스팅 필요
        if(obj instanceof Dog dog){
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }

}
