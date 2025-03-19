package section10.ex2;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fill();

        //전기차와 가솔린차의 공통점은 move
        //이 두개를 분리하는것 보다
        //상속관계를 사용하는것이 효과적 이다.
    }
}
