package lang.Object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Cat Cat1 = new Cat("고냠미", 2);
        Cat Cat2 = new Cat("얏통", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(Cat1.toString());
        System.out.println(Cat2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(Cat1);
        System.out.println(Cat2);

        System.out.println("3. Object 다형성 활용");

        ObjectPrinter.print(car);
        ObjectPrinter.print(Cat1);
        ObjectPrinter.print(Cat2);

        String refValue = Integer.toHexString(System.identityHashCode(Cat1));
        System.out.println("refValue = " + refValue);
    }

}
