package lang.Object.poly;

public class ObjectPolyExample2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object obj = new Object(); // Object 인스턴스도 만들 수 있따.

        Object[] objects = {dog, car, obj};

        Size(objects);
    }

    private static void Size(Object[] objects) {
        System.out.println("전달된 객체의 수는: " + objects.length);
    }

}
